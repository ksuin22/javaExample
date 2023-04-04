package com.yedam.API;

import java.io.UnsupportedEncodingException;

public class StringAPIExam {
	public static void main(String[] args) {
		
		//byte[] -> String 변환
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(bytes);
		System.out.println("1번 " +str1);
		
		//내가원하는 위치를 선정하(6)고 그갯수만큼 출력(4)
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		//charAt()
		//인덱스 값(문자위치)를 입력해서 해당위치에 있는 문자를 가져오기
		String ssn= "010452-1885146";
		char gender = ssn.charAt(7);
		System.out.println(gender);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
						
		}
		
		
		//문자열 비교
		//equals()
		
		String str3 = "김또치";
		String str4 = "김또치";
		String str5 = new String("김또치");
		
		if(str3.equals(str4)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if(str3.equals(str5)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
		// String > byte 로 변환
		String str6 = "helloWorld";
		byte[] byte1 = str6.getBytes();
		for(byte temp : byte1) {
			System.out.println(temp);
		}
				
		
		//byte -> String 
		String str7 = new String(byte1);
		System.out.println("byte>> " + str7);
		
		
		//byte <-> String + encoding type
		try {
			//string -> byte + EUC-KR			
			//UTF-8, MS949....
			byte[] byte2 = str6.getBytes("EUC-KR");
			System.out.println("byte2.length : " + byte2.length);
			
			for(byte temp : byte2) {
				System.out.println(temp);
			}
			
			//byte -> String
			String str8 = new String(byte2, "MS949");
			System.out.println(str8);
			
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		//문자열 찾기
		//indexOf
		//찾는 문자열의 시작되는 위치찾기
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("그래밍");
		System.out.println(index);
		
		
		//문자열 길이
		System.out.println(subject.length());
		
		String ssn2 = "000012-393939";
		if(ssn2.length()==14) {
			System.out.println("주민번호 자리수 맞음");
		}else {
			System.out.println("주민번호 자리수 틀림");
		}
		
		
		//문자열 대치(바꾸기)
		//replace
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(newStr);
		
		//문자열 자르기
		//subString
		//매개변수에 따라서 자르는 방법이 다름.
		
		//1.매개변수가 1개일때 -> 해당 위치로부터 뒤로 다 자름.
		String ssn3 = "012345-678901234";
		String firstNum = ssn3.substring(7);//7번부터 뒤에꺼 다 가져오기
		System.out.println(firstNum);
		
		//2.매개변수가 2개일때 -> 시작위치~끝나는위치 앞까지 자름
		String secondNum = ssn3.substring(0,6);
		System.out.println(secondNum);
		
		//대문자 ->소문자
		String dae = "ADDBNsesgE";
		System.out.println(dae.toLowerCase()); //대문자>소문자로
		System.out.println(dae.toUpperCase()); //소문자>대문자로
		
		//양쪽 공백 제거 Trim
		String name = "    gieh wbdj     ";
		System.out.println(name.trim());
		
		//기본타입 ->문자열 변환
		//String.valueOf
		String temp = String.valueOf(123);
		temp = String.valueOf(true);
		System.out.println(temp);
		System.out.println();
		
		
		//문자열 분리하기
		//split() -조건문자(구분자)를 통한 문자열 분리
		
		String value = "1,2,3,4,5,6,7,8,9";
		String[] strAry = value.split(",");
		
		for(String data : strAry) {
			System.out.println(data);
		}
		
		//contains - 포함하고있는 문자열 확인
		
		String var = "또치 11";
		if(var.contains("cl"))
		System.out.println("또 포함됨");
		else
		System.out.println("또 포함 안됨");
		
		
		//isEmpty
		String empty = "";
		if(empty.isEmpty()) {
			System.out.println("비었다");
		}else {
			System.out.println("안비었다");
		}
		
		
		
		
		//String의 단점을 보완해줄 수 있는 API
		//StringBuffer
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("ye");
		sb.append("dam");
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
	}

}
