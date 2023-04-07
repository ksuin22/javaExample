package com.yedam.exception;

public class App {
	public static void main(String[] args) {
		
		
		/*
		 
		try {  
			//예외가 발생할 것 같은 실행코드
			 
		}catch(예외) {  
			//예외 발생후 처리하는 코드
			 
		}finally {  
			//옵션
			//try문 또는 catch문 실행하고 나서 무.조.건!! 실행해야하는 코드
		}
		
		
		*/
		
		String data1 = null;
		String data2 = null;
		

//		//예외1.
//		try {
//			data1 = args[0];
//			data2 = args[1];
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
//		}
//		
//		
//		
//
//		//예외2.
//		try {
//			double avg =1/0;
//		}catch(ArithmeticException e) {
//		System.out.println("문자열 변환 에러");
//		}
//			
//
//			
//		//예외3.
//		try {
//			String str = "자바";
//			int a = Integer.parseInt(str);
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		
//
//		
//		//예외4.
//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		}catch(ClassNotFoundException e){
//			System.out.println("클래스를 찾을수 없다");
//		}			
//		
		
		
		//예외5. (1~4번 합쳐놓은 예외)
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(Exception e){
			System.out.println("위에서 처리못하면 내가 처리한다.");
		}	
		finally {
			System.out.println("finally 항상 실행");
		}
			
		
		
		
		
		
		
		
		
	}

}
