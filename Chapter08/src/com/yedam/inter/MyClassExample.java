package com.yedam.inter;

public class MyClassExample {
	public static void main(String[] args) {
		
		System.out.println("1)-----");
		//클래스 내부에 인터페이스를 활용해서 필드로 선언
		MyClass myClass1 = new MyClass();
		
		myClass1.rc.turnOn(); //MyClass클래스가 가진 TV가 가진 인터페이스를 가져옴
		myClass1.rc.turnOff();
				
		
		
		System.out.println("2)-----");
		
		MyClass myClass2 = new MyClass(new Audio());
		//MyClass생성자 중에 매개변수가 있는 두번째 생성자를 활용하여서 
		//public MyClass(RemoteControl rc)
		//괄호안 rc 부분에 new Audio()를 넣음.	
				

		
		System.out.println("3)-----");
		//메소드로 (매개변수 없을때)
				
		MyClass myClass3 = new MyClass();
		//메소드 호출
		myClass3.methodA();
			
		
		

		System.out.println("4)-----");
		//메소드로 (매개변수 있을때)
				
		MyClass myClass4 = new MyClass();
		myClass4.methodA();
		myClass4.methodB(new Audio());
		
		
		
	}

}
