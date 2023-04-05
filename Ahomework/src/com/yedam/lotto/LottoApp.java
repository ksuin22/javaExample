package com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LottoApp {

	
	private Scanner sc =  new Scanner(System.in);
	int menu = 0;
	
	int[] lotto = new int[6];
	
	List<int[]> list = new ArrayList<>();
	
	
	
	public LottoApp() {
		//list.add(lotto);
		run();
	
	}
	
	

	
	

	private void makeNumber() {
		//로또 번호 6개 만드는거
		//단, 중복은 발생하면 안된다.
		//정렬 안해도 됩니다.
		//잘 되었는지 출력
		lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			int num = (int) (Math.random()*45+1);
			lotto[i] = num; 
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]){
					i -=1;
				}
			}
			
		}
		for(int i=0; i<6; i++) {
		System.out.print(lotto[i]+ " ");
		}
		
	}
	
	int coin ;
	private void makeLotto() {
		// 1.입력한 금액만큼 로또번호 생성
		// 예시> 10,000원 -> 6개짜리 로또가 10개 나오기
		// list 에 저장
	
		System.out.println("금액투입 > ");
		coin = Integer.parseInt(sc.next());
		
		System.out.println("구매한 금액 > " + coin +"원");
		for(int i=0;i<(coin/1000);i++) {
			System.out.print((i+1)+"번> ");	
			makeNumber();
			System.out.println();
			list.add(lotto);			
		}
		System.out.println("------");	
		

	
	}
	
	
	private void showInfo(){
		
		System.out.println("구매한 금액 > "+ coin+ "원");
		for(int i=0;i<list.size();i++ ) {			
			System.out.print((i+1)+"번> ");	
			for(int j=0;j<6; j++) {
				System.out.print(list.get(i)[j]+ " ");
			}
			System.out.println();
		}	
		
	}
	
	

	
	//메뉴 선택 로또프로그램
	private void run() {
		
		while(menu!=99) {
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1.로또생성  2.로또조회  99.종료 ");
		menu = Integer.parseInt(sc.next());
		
		switch (menu) {
		case 1:
			makeLotto();

			break;
		case 2:
			showInfo();
			

			break;
		case 99:
		
			break;

		}
		
		}
	}
	
	
	
	
	
	
}
