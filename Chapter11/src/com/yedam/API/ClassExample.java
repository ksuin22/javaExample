package com.yedam.API;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//class 클래스
		//class에서 정보얻기
		
		Class clazz= Member.class;
		System.out.println("Member Class 정보 :" +clazz);
		
		//클래스 경로 입력해서 정보얻기
		clazz = Class.forName("com.yedam.API.Member");
		System.out.println(clazz);
		
		//객체를 통한 정보 얻기
		Member member = new Member("또치");
		clazz = member.getClass();
		System.out.println("1>>  "+clazz);
		
		System.out.println("2>>  "+clazz.getName());
		System.out.println("3>>  "+clazz.getSimpleName());
		System.out.println("4>>  "+clazz.getPackageName());
		System.out.println("4>>  "+clazz.getPackage().getName());
		
		//절대경로
		String photoPath = clazz.getResource("1.jpg").getPath();
		System.out.println(photoPath);
		
	}


}
