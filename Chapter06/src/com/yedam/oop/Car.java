package com.yedam.oop;

public class Car {

	//필드 -> 객체의 정보
	String name;
	int price;
	String company = "현대자동차";
	
	//생성자
	
	//기본생성자
	public Car() {
		
	}	
			
	//매개변수를 가지는 생성자

	
	//생성자 오버로딩
	public Car(String name) {
		this.name = name;
	}
	
	public Car(int price) {
		this.price = price;
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Car(int price, String name) { //순서바꾼거- 오버로딩 가능
		this.name = name;
		this.price = price;
	}
	
	public Car(String name, int price, String company) { //갯수다른거- 오버로딩가능
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	
	
	
	
	
	//메소드


	

}
