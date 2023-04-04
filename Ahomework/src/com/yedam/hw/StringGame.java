package com.yedam.hw;

public interface StringGame {
	
	/*
	 문제) Orange, Game, Phone, Smart 중 랜덤으로 선택한 단어를 맞추는 프로그램을 구현하세요.
	 메뉴 구성은 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 로
	 각 메뉴의 기능은 아래와 같습니다. 
	 1. 문자하나 : 문자 단위로 입력을 받으며 정답에 포함된 문자인지 확인
	 2. 단어    : 단어 단위로 입력을 받으며 정답인지 확인
	 3. 입력내역 : 게임이 진행되는 동안 입력된 문자를 입력 순으로 출력
	 4. 새 게임  : 기존에 선택한 단어 대신 랜덤으로 새 단어를 선택하며 입력내역을 초기화
	 5. 종료     : 프로그램을 종료
	 
	 현재 실행코드와 실행결과를 참고하여 StringGame 클래스를 완성하세요.
	 */
	
	
	String Ary[]= {"Orange", "Game", "Phone", "Smart"};

	
	
	
	
	
	
	
	
	
	void setCharData();

	void setStrData();

	void showCharData();

	void init();
	

}
