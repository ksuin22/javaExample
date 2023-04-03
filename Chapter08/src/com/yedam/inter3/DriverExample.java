package com.yedam.inter3;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //실행됨
		driver.drive(taxi); //실행안됨. 버스랑 같은 타입이 아니라서
		
	}

}
