package com.yedam.oop;

public class App04 {
	
	static int a = 1;
	
	static void info() {
		System.out.println("info 출력");
	}
	
	int field1;
	
	//static! 메소드 영역에 포함되어있는 정적 메소드.main문
	public static void main(String[] args) {
		
		System.out.println(a); //a 인식 못함. static으로 바꾸ㅓ야 함.	
		
		info();
		
		App04 temp = new App04();
		temp.field1 = 1;
		
		System.out.println(StaticCal.PI);
		System.out.println(StaticCal.earthRadius);
		
		
		int result = StaticCal.plus(10,20);
		StaticCal cal = new StaticCal();
	}
	
}
