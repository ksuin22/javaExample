package com.yedam.API;

import java.util.HashMap;

public class ObjExam {
	public static void main(String[] args) {
		Member member = new Member("123");
		Member member2 = new Member("123");
		Member member3 = new Member("321");
		
		
		System.out.println(member.equals(member2));
		System.out.println(member.equals(member3));
		
		
		
		//해쉬코드
		
		HashMap<Key, String> hashMap = new HashMap<>();
				
		hashMap.put(new Key(1), "홍길동");
		String value = hashMap.get(new Key(1));		
		System.out.println(value);
		
	
		HashMap<Member, String> hashMap2 = new HashMap<>();
		
		hashMap2.put(new Member("열쇠"), "또치");
		String value2 = hashMap2.get(new Member("열쇠"));		
		System.out.println(value2);
		
		
		System.out.println("=========================");
		
		//toString()메소드
		
		Object obj =new Object();
		
		System.out.println(obj.toString());
		
		System.out.println(member.id);
		System.out.println(member2);
		System.out.println(member.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
