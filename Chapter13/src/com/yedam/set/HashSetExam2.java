package com.yedam.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam2 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("또치", 10));
		set.add(new Member("또치", 100));
		
		System.out.println("총 객체수: " + set.size());
		
		
	}

}
