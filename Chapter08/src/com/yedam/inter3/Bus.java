package com.yedam.inter3;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 vehicle 인터페이스 받음");
		
	}

	
	public void checkFare() {
		System.out.println("버스요금");
		
	}
	

}
