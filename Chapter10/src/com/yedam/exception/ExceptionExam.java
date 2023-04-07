package com.yedam.exception;

public class ExceptionExam {
	public static void main(String[] args) {
		
		//NullPointException
//		String data = null;
//		System.out.println(data.toString());
		
		//Example example = null;
		//System.out.println(example.toString());
		
		
		
		
		//ArrayIndexOutOfBoundsException 
		//배열에서 인덱스가 배열의 길이를 초과하는 오류
		
//		int[] intAry = new int[3];
//		
//		intAry[2] = 3;
//		//intAry[4] = 3;
//		
//		for(int i=0; i<intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
//		
//		
//		//NumberFormatException
//		String str = "123";
//		int val = Integer.parseInt(str);
//		System.out.println(val);
//		
//		
//		//예외
//		//자바를 숫자로 바꿀수 없음-오류
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
//		System.out.println(str2);
		
		
		//ClassCastException
		//자동타입변환 된 객체를 강제타입변환 시킬때 발생
		
		//정상
		Example exam = new Exam();
		Exam exam02 = (Exam) exam;
		
		//예외
		Example exam2 = new Exam();
		Exam02 exam03 = (Exam02) exam2;
		
		
	
		//ClassNotFoundException -> Class파일 찾지 못할때
		//실행메소드(main) 못찾을때 주로 발생
		
		
		
		//ArithmeticException -> 분모가 0일때
		//double a = 1/0;
		
		
		
		//반복문을 종료하지 못하고 무한루프 등등
		//OutofMemberError -> 메모리가 부족할때
		//메모리 누수, memory leak
		
		
		
		//IOException -> 입출력 오류
		//file reading/write
		
		
		
		//FileNotFoundException
		//Java -> file reading -> 경로가 안맞아서 파일을 못찾음.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
