package com.yedam.test;

import java.util.Scanner;

public class test0330 {
	public static void main(String[] args) {
		
		//1.
		int val1= 10;
		double val2= 2.0;
		
		int result1 = val1 + (int)val2;
		int result2 = val1 - (int)val2;
		int result3 = val1 * (int)val2;
		int result4 = val1 / (int)val2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println();
		//2.
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result=((num1 >10) && (num2>10));
		System.out.println(result);
	
		result=((num1 >10) || (num2>10));
		System.out.println(result);
		System.out.println(!result);
		
		System.out.println();		
		
		
		//3.
//		int[] coinUnit = {500,100,50,10};
//		int money = 2680;
//		System.out.println("money = " +money);
//		for(int i=0; i<coinUnit.length; i++) {
//			if(money/500>=1) {
//				System.out.println("500원 :"+(money/500)+"개");
//				money=money-(money/500*500);
//			}if(money/100>=1){
//				System.out.println("100원 :"+(money/100)+"개");		
//				money=money-(money/100*100);
//			}if(money/50>=1){
//				System.out.println("50원 :"+(money/50)+"개");		
//				money=money-(money/50*50);
//			}if(money/10>=1) {
//				System.out.println("10원 :"+(money/10)+"개");	
//				money=money-(money/10*10);							
//			
//				}
//
//		}
//		System.out.println();
//		
		
		
		
		//3번  풀이
		
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money = " +money);
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i] +"개");
			money= money % coinUnit[i];
		}
		
		
		
		
		

		
		
		//4.
		
		for(int i=2;i<10;i++) {
			System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		
		
		
		//5.

		
		
//		Scanner sc = new Scanner(System.in);
		
//		boolean run = true;
//		int gameNum=0; //주사위 크기
//		int[] gameArr=null;
//		
//		
//		while(run) {
//			System.out.println("==1.주사위 크기 2.주사위 굴리기 3.결과보기 4.가장 많이 나온 수 5.종료==");
//			System.out.println("메뉴 >");
//			int num = sc.nextInt();
//			
//			if(num==1) {
//				System.out.println("주사위 크기 >");
//				gameNum = sc.nextInt();
//				if(gameNum>10 || gameNum<5) {
//					System.out.println("주사위의 크기는 5~10사이로 입력하세요.");
//					System.out.println("주사위 크기 >");
//					gameNum = sc.nextInt();
//				}
//				gameArr = new int[gameNum];
//								
//			}else if(num==2) {
//				System.out.println("주사위 굴리기>");
//				
//				for(int i=0; i<=gameArr.length; i++) {
//					int j = (int) ((Math.random()) * gameArr.length);
//					int tmp = 0;
//					tmp= gameArr[i];
//					gameArr[i]=gameArr[j];
//					gameArr[j]=tmp;
//					System.out.print(gameArr[i]+ " ");					
//				}
//				
//				
//			}else if(num==3) {
//			
//				
//			}else if(num==4) {
//				
//				
//			}else if(num==5) {
//				run = false;
//			}
//			
//			
//			
//		}
		
		
		
		
		
		
		
		//5번풀이
		
		Scanner sc = new Scanner(System.in);
		int size = 0; // 주사위 크기
		int[] dice = null;
		boolean run = true;

		while (run) {
			System.out.println("1.주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료");
			System.out.println("메뉴 >");

			String selectNo = sc.nextLine();

			switch (selectNo) {
			case "1":
				System.out.println("주사위 크기>");
				size = Integer.parseInt(sc.nextLine());
				if(size < 5 || size > 10) {
					System.out.println("5~10사이의 수를 입력하세요.");
					size = 0;
				}
				break;
			case "2":
				//주사위 크기 설정
				dice = new int[size];
				//몇 번 반복했는지
				int count = 0;
				//5가 언제 나올지 모르기때문에, while 나올때까지 반복문을 사용하기위함.
				while(true) {
					int random = (int)(Math.random()* size) + 1;
					System.out.println(random);
					
					//각 주사위 숫자> 배열저장하기
					//주사위 숫자 1,2,3,4,5 나오면
					//배  열  에 0,1,2,3,4 매칭!
					dice[random-1] = dice[random-1]+1;
					count++;
					if(random ==5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를 "+count+"번 굴렸습니다.");
				break;
				
			case "3":
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1)+"은 " + dice[i]+"번 나왔습니다.");
				}
				break;
			
			case "4":
				int max = dice[0];
				int index = 0;
				for(int i=0; i<dice.length; i++) {
					if(max < dice[i]) {
						max = dice[i];
						index =i;
					}
				}
				System.out.println("가장 많이 나온 수는 "+ (index+1)+"입니다.");
				break;
				
			case "5":
				System.out.println("종료");
				run=false;
				break;
			}
		}
		
		
		
		
		
		
		
	}
	
}
