package com.yedam.poly;


public class _05Car {

	//필드
	_06Tire frontLeftTire = new _06Tire("앞 왼쪽", 6);
	_06Tire frontRightTire = new _06Tire("앞 오른쪽", 2);
	_06Tire backLeftTire = new _06Tire("뒤 왼쪽", 3);
	_06Tire backRightTire = new _06Tire("뒤 오른쪽", 4);
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
	
	
}
