package com.yedam.loop;

public class For문2 {

	public static void main(String[] args) {
		//중첩 반복문
		//2단~9단 구구단 출력
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i +"*" +j+ "=" + (i*j));
//			}
//		}
		
		//공포의 별찍기..........
		
		for(int i=1; i<=5; i++) { 		//줄바꿈 용도
			for(int j=1; j<=5; j++) { 		//별찍기 용도
				System.out.print("*");
			}
			System.out.println();
		}		
		
		for(int i = 1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		for(int i=5; i>0; i--) {
			System.out.println();
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}