package com.yedam.API;

public class BoxingExam {
	
	public static void main(String[] args) {
		//Boxing : 기본타입 -> 객체로 포장
		
		//가운데줄처리: 사용은 할수 있지만 되도록 권장하지 않는다.
		Integer obj1= new Integer(100); 
		Integer obj2 = new Integer("100");
		
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
		
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
		//자동 박싱
		Integer obj5 = 100;
		System.out.println("value : " + obj5.intValue());

		//대입시 자동 언박싱
		int value5 = obj5;
		System.out.println("value5 : " + value5);
		
		//연산시 자동 언박싱
		int value6 = obj5+500;
		System.out.println("value6 : " + value6);
		
		
		//포장값 비교 (포장된 박스가 같은지 비교)
		Integer obj6 = 200;
		Integer obj7 = 200;
		
		
		System.out.println(obj6==obj7); //false. (범위 -128~127까지) 
		System.out.println(obj6.intValue()==obj7.intValue()); //true.언박싱후 비교해서 같음
		
		
		//형변환 (타입 변환)
		double value7 = Double.parseDouble("3.014");
		System.out.println(value7);
			
		
		
		
		
		
		
		
		
		
		
	}

}
