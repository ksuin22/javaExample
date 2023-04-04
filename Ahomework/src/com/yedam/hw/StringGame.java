package com.yedam.hw;

import java.util.Scanner;

public class StringGame {
	
	/*
	 문제) Orange, Game, Phone, Smart 중 랜덤으로 선택한 단어를 맞추는 프로그램을 구현하세요.
	 메뉴 구성은 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 로
	 각 메뉴의 기능은 아래와 같습니다. 




//	 5. 종료     : 프로그램을 종료
//	 
	 현재 실행코드와 실행결과를 참고하여 StringGame 클래스를 완성하세요.
	 */


    
	String ary[]= {"Orange", "Game", "Phone", "Smart"};
	int x = (int)(Math.random()*(ary.length-1));
	String random = ary[x];
	
	
	

	//생성자
//	public StringGame(String a){
//
//		
//				
//	}

	Scanner sc = new Scanner(System.in);
	
	
	String ary2[] = new String[5];
	String ox = "xxxxx";
	
	String b = "";
	String str;
	
//	 1. 문자하나 : 문자 단위로 입력을 받으며 정답에 포함된 문자인지 확인
	void setCharData() {
		System.out.println("문자 입력>");
		
		for(int i=0;i<5; i++) {
			str = sc.nextLine();
			if(random.contains(str)) {
				System.out.println("문자열을 구성하는 문자입니다.");
				ary2[i]=str;
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				System.out.println(b+=ary2[i]);
			}else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
			
		}
		System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		System.out.println(b);
		System.out.println("메뉴 입력 > ");
		
		
	
		
	}
	
	
//	 2. 단어    : 단어 단위로 입력을 받으며 정답인지 확인
	void setStrData() {
		
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		System.out.println(b);
		String abc =sc.nextLine();
		
		for(int i=0;i<5;i++) {
			if(abc.indexOf(0)==random.indexOf(0)) {
				String a1 = ox.substring(1);
				System.out.println("o"+a1);
				
			}
			
		}
	}
	
	
//	 3. 입력내역 : 게임이 진행되는 동안 입력된 문자를 입력 순으로 출력
	void showCharData() {
		
	}
	
	
//	 4. 새 게임  : 기존에 선택한 단어 대신 랜덤으로 새 단어를 선택하며 입력내역을 초기화
	void init() {
		
		
	}
	

}
