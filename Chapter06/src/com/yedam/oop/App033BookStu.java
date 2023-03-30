package com.yedam.oop;

public class App033BookStu {

	public static void main(String[] args) {
		
		Book java = new Book("혼자 공부하는 자바","학습서",24000,001,"한빛");
		java.getInfo();
		
		System.out.println();
		System.out.println(java.name);
		System.out.println(java.type);
		

		Book html = new Book("HTML","학습서",240000,002,"한빛");
		System.out.println(html.name);
		System.out.println(html.type);
		

		Book JS = new Book("Javascript","학습서",240000,001,"길벗");
		System.out.println(JS.name);
		System.out.println(JS.type);
		
		//-----------Student
		
		System.out.println();
		Student stu1 = new Student("김또치",20230330,50,40,80);
		stu1.getInfo();
		System.out.println();
		stu1.getInfo2();

	}

}
