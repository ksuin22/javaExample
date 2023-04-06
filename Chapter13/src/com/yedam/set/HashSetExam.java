package com.yedam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //중복이라 삭제됨
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : " +size); //4
		
		// 반복자를 활용한 HashSet 객체 출력
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+ element);
		
		}
		
		
		set.remove("java");
		set.remove("JDBC");
		System.out.println("=============");
		
		//향상된 for문
		
		for(String temp : set) {
			System.out.println("\t" + temp);
		}
		
		set.clear();
		System.out.println("총 객체수 : "	+set.size());//0
		
		if(set.isEmpty()) {
			System.out.println("객체가 존재하지 않음.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
