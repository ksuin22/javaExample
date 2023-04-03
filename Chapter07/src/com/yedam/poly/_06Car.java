package com.yedam.poly;


public class _06Car {

	//필드
	_05Tire frontLeftTire = new _05Tire("앞 왼쪽", 6);
	_05Tire frontRightTire = new _05Tire("앞 오른쪽", 2);
	_05Tire backLeftTire = new _05Tire("뒤 왼쪽", 3);
	_05Tire backRightTire = new _05Tire("뒤 오른쪽", 4);
	
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
