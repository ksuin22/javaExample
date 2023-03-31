package com.yedam.inheri;

public class _08Compute extends _07Calculator {
	
	//자식 클래스
	//메소드 재정의(오버라이딩)하기
	
	@Override 
	//@>어노테이션: 소스를 컴파일할때 오버라이딩된 메소드가 있다라고
	//		      컴파일러에게 알려주기 위한 용도
	
	
	double areaCircle(double r) {
		System.out.println("자식클래스의 메소드 실행");
		return Math.PI *r*r;
	}
	
	
	
	
}
