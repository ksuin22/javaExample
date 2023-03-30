package com.yedam.oop;

public class App03Cal {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//메소드 호출
		cal.sum(10, 20);
		
		
		int result = cal.sum3(new int[]{1,2,3,4,5,234,2,4,45,3});
		System.out.println("sum3 :" +result);
		
		result = cal.sum4(1,2,3,4,0,6,3,2,3);
		System.out.println("sum4 :" +result);
		
		Bycle bycle = new Bycle();
		bycle.setGas(5);
		
		boolean gasState = bycle.isLeftGas();
		
		if(gasState) {
			System.out.println("출발");
			bycle.run();
		}
		
		if(bycle.isLeftGas()) {
			System.out.println("gas주입 필요없음.");
		}else {
			System.out.println("gas주입 필요");
		}
		
		
		double result2 = cal.avg();
		System.out.println("평균: "+result2);
		
		
		double result3 = cal.areaRectangle(10);
		
		double result4 = cal.areaRectangle(10,20);
		
		System.out.println(result3);
		System.out.println(result4);
		
		

	}

}
