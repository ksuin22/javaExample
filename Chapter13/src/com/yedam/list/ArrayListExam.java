package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		
		//String 문자열을 넣을 수 있는 ArrayList
		List<String> list = new ArrayList<String>();
		//<>안 : 넣을 객체 타입
		
		//list 데이터 추가
		
		list.add("Java");//인덱스 0인곳에 객체 추가
		list.add("JDBC");//인덱스 1인곳에 객체 추가
		list.add("Servlet/JSP"); //인덱스 2인곳에 객체 추가
		
		list.add(2,"DataBase"); //인덱스2에 끼워넣기
		list.add("iBatis");
		
		//list.size() => list의 크기, 객체의 수 (배열의 length와 비슷)
		for(int i=0;i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : ㄷ" +str);
		}
		
		//향상된 for 문
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("---------------------");
		
		//list에있는 인덱스2번 객체 삭제
		list.remove(2);
		
		for(String str : list) {
			System.out.println(str);
		}
		
		//list에 저장된 객체를 활용해서 삭제
		list.remove("JDBC");
		for(int i=0;i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : " +str);
		}
		
		
		
		System.out.println("---------------------");
		
		
		list.clear();
		System.out.println("list사이즈 : "+list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
