package com.yedam.hw;

import java.util.Scanner;

public class Hw0330 {

	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		int proNum = 0;		
		
		Product[] proArr =null;
		
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 		1.상품 수 | 2.상품 및 가격 입력 | 3.상품별 가격 조회 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//		출력예시, "상품명 : 가격" 
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격 입력 | 3.상품별 가격 조회 | 4.분석 | 5.종료");
			System.out.println("메뉴 입력> ");
			String selectNo = sc.nextLine();
			
			if(selectNo.equals("1")) {
				System.out.println("상품 수 입력>");
				proNum = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo.equals("2")) {
				proArr = new Product[proNum];
				for(int i=0; i<proArr.length; i++) {
					proArr[i] = new Product();
					System.out.println("상품명>");

				}
				
				
				
		
			}
		}
	}

}
