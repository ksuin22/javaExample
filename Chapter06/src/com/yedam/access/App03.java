package com.yedam.access;

public class App03 {

	public static void main(String[] args) {
		Member obj1 = Member.getInstance();
		Member obj2 = Member.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
			//주소값이 같음. getInstance 통해 만든건 단하나의 객체라는뜻.
		
		obj1.getInfo();
		
		System.out.println(obj2.age);
		
	}

}
