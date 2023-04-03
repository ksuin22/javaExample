package com.yedam.inter3;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}else {
			System.out.println("버스랑같은 타입이아니야");
		}
	}

	
}
