package com.yedam.inter2;

public class CarExam2 {
	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		
		myCar.run();
		//초기화 값을 한국타이어로 해놔서 한국타이어로 결과나옴.
		
		System.out.println("-----");
		
		//앞바퀴를 둘다 금호로 바꿔준다.
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		//앞바퀴는 금호타이어로 출력됨.
		
		
		
		
		
	}

}
