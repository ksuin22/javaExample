package com.yedam.poly;

public class CastingExam2 {
	
	//매개변수를 활용한 다형성
	public static void method1(_01Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("캐스팅 성공");
			
		}else {
			System.out.println("캐스팅 실패");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		_01Parent p1 = new Child(); //child타입으로 만들어진 p1.강제타입변환
		method1(p1);
		
		_01Parent p2 = new _03Child02();
		method1(p2);
		
		
		//Child child = (Child)p1;
		
		
	}

}
