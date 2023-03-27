package com.yedam.variable;

public class Example01 {
	public static void main(String[] args) {
		//int
		int var1 = 0b1011; //2진수(0b)
		int var2 = 0206; //8진수(0)
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수(0x)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//byte 127 (127까지만 담을수 있음)
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		int bVal4 = 500; //127보다 커서 int 사용
		
		System.out.println(bVal);
		System.out.println(bVal2);
		System.out.println(bVal3);
		System.out.println(bVal4);
		
		//long
		//정수 -> 기준 int
				long lVal = 10; 
		long lVal2 = 20;
		long lVal3 = 1000000000000L; //int의 기준데이터 범위를 벗어나서, L을 붙인다.
		
		//char(유니코드)
		//문자 => 문자한개만 들어감. ex)'A','B'
		//문자열 => 하나이상의 문자가 모이는 경우 ex)"apple"
		
		char charVal1 = 'A';
		char charVal2 = '가';
		char charVal3 = 67;
		char charVal4 = 0x0041;
		
		System.out.println(charVal1);
		System.out.println(charVal2);
		System.out.println(charVal3);
		System.out.println(charVal4);
		
		
		//문자열
		//String
		char charVal5 = '홍';
		String str1 = "홍길동";
		String str2 = "프로그래머";
		System.out.println(charVal5);
		System.out.println(str1);
		System.out.println(str2);
		
		//이스케이프
		//탭 만큼 띄우기
		System.out.println("번호\t이름\t직업");
		
		//엔터키
		System.out.println("행 단위 \n출력");
		
		//특수문자 사용
		System.out.println("우리는 \"개발자\" 입니다.");
		//특수문자 2
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수 타입
		//float쓸때는 뒤에 f붙이기
		float fVal = 3.14f; 
		//double
		double dVal = 3.14;
		
		//e사용하기
		double dVal2 = 3e6; //3.0* 10의 6승
		float fVal2 = 3e6f; //3.0* 10의 6승
		double dVal3 = 2e-3; //2.0* 10의 -3승 => 2/1000
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		//논리타입 - T/F
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		
		
		
	}
	

}
