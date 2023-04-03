package com.yedam.abs;

public abstract class Animal {

	//추상클래스가 되었다.
	
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰다");
		
	}
	
	//추상 메소드
	public abstract void sound();
	
	
	
	
}
