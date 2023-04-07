package com.yedam.operator;

public class Example01 {

	public static void main(String[] args) {
		//부호 연산자
		int x = -100;
		int result1 = -x;
		int result2 = +x;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		byte b= 100;
		//강제 타입 변환
		//byte result3 = (byte) -b;
		//자동 타입 변환
		int result3 = -b;
		
		//증감 연산자 ++,--
		//위치에 따라서 연산 타이밍이 다르다.
		int value = 100;
		
		//출력문 실행하고 나서 value 1증가
		System.out.println(value++); //100
		//출력문 실행하기 전에 value 1증가
		System.out.println(++value); //102
		
		//논리부정 연산자(not), !
		//not(!) + true = false
		//not(!) + F = T
		
		boolean flag = false;
		
		if(!flag) {
			System.out.println("false");
		}if(!(value < 100)) {  
			System.out.println("true");
		}
		
		//이항연산자(사칙연산)
		int v1 = 10;
		int v2 = 4;
		System.out.println(v1+v2);		
		System.out.println(v1-v2);
		System.out.println(v1*v2);
		
		//나누기가 2개존재  /:몫,,, %:나머지	
		System.out.println("/ : " +(v1/v2));
		System.out.println("% : " +(v1%v2));
		
		//문자열 결합 연산자(+)
		System.out.println("자바"+"JDK" +11);
		
		//비교연산자
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 == num2); //F
		System.out.println(num1 != num2); //T
		System.out.println(num1 >= num2); //F
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		System.out.println(char1 > char2); //F
		
		//문자열 비교 => ==아니고 equals 
		
		//논리 연산자 : &&, &, ||, |
		
		int charCode = 'A'; //자동타입변환으로 숫자대입
		
		//'A'(65) ~ 'Z'(90) 포함되는지 확인
		if(charCode>=65 && charCode <=90 ) {
			System.out.println("대문자");
		}
		
		//'0'(48) ~ '9'(57)
		//charCode >= 48 && charCode <=57
		
		if(!(charCode<48) && !(charCode >57)) {
			System.out.println("0~9사이의 숫자");
		}
		
		//대입 연산자 =,+=,-= ..
		int result5 = 0;
		result5 += 1; //result5 = result5 +1
		result5 -= 1; //result5 = result5 -1
		result5 *= 3; //result5 = result5 *3
		result5 /= 10; //result5 = result5 /10
		System.out.println("result5 : " +result5);
		
		//삼항연산자
		int score = 95;
		
		//90점보다 높으면 A, 낮으면 B
		if(score > 90) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
		
		char grade = (score >90) ? 'A' : 'B' ;
		System.out.println(grade);
		System.out.println(((score >90) ? 'A' : 'B'));
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
