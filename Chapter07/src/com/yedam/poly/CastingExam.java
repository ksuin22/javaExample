package com.yedam.poly;

public class CastingExam {
	
	public static void main(String[] args) {
		//강제 타입변환(캐스팅)
		//부모 타입으로 만들어진 다형성(부모가 가진 내용만 사용하되 자식 클래스에서
		//오버라이딩 된 내용은 자식 클래스의 것을 사용)
		//자식이 가진 내용도 쓰고 싶다.> 강제타입변환
		
		//자동타입변환
		
		_01Parent parent = new Child();
		parent.field ="부모필드";
		parent.method1();
		parent.method2();

		
		//parent.method3();
		//parent.field2 = "자식필드";
		
		
		//강제타입변환(캐스팅)
		//조건: 클래스간의 자동타입변환이 발생 후 사용가능
		Child child = (Child) parent;
		child.field = "부모필드";
		child.method1();
		child.method2();
		child.field2 = "자식필드";
		child.method3();
		
		
		
		//instanceof
		//같은 인스턴스 인지 확인
		// == : 주소비교
		//instanceof : 같은 타입의 객체인지 확인
		
		_01Parent p1 = new _01Parent();
		_01Parent p2 = new _01Parent();
		
		if(p1==p2) {
			System.out.println("주소가 같음");
		}else {
			System.out.println("주소가 다름");
			
		}
		
		if(p1 instanceof _01Parent) {
			System.out.println("p1은 Parent 타입입니다.");
		}else {
			System.out.println("p1은 Parent 타입이 아닙니다..");
		}
		
		if(parent instanceof _01Parent) {
			System.out.println("부모타입");
		}
		
		if(parent instanceof Child) {
			System.out.println("자식타입");
		}
		
	
	
}
