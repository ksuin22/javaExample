package com.yedam.inheri;

public class _13SuperSonicAirPlane extends _12AirPlane {

	//필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 모드");
			
		}else {
			super.fly();
		}
		
	}
	
	//생성자
	
	//메소드
	
	
}
