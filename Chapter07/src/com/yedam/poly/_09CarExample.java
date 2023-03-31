package com.yedam.poly;

public class _09CarExample {
	public static void main(String[] args) {
		_05Car car = new _05Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new _07HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new _08KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.backLeftTire = new _07HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new _08KumhoTire("뒤오른쪽",17);
				break;			
			}
			
			System.out.println("--------------------");
			
			
		}
		
			
		
		
		
	}

}
