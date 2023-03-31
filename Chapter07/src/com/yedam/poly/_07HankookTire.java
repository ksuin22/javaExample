package com.yedam.poly;

public class _07HankookTire extends _06Tire {
	
	//필드
	
	//생성자
	public _07HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "HankookTire 수명:" +(maxRotation-accumulatedRotation) +"회");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	
	}
	
	
}
