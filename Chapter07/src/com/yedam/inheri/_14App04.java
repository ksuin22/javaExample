package com.yedam.inheri;

public class _14App04 {

	public static void main(String[] args) {
		//
		_13SuperSonicAirPlane sa = new _13SuperSonicAirPlane();
		//sa > flymode가 Normal 상태로 객체 생성됨.
		
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode = _13SuperSonicAirPlane.SUPERSONIC;
		
		sa.fly(); //초음속모드로 출력
		
		sa.flyMode = _13SuperSonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
		

	}

}
