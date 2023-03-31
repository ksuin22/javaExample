package com.yedam.inheri;

public class _11App03 {
	public static void main(String[] args) {
		
		_08Compute com = new _08Compute ();
		com.areaCircle(10.1);//결과: 자식클래스 메소드 실행됨.
	
		
		_10Exam exam = new _10Exam();
		exam.method1();
		exam.method2();
	}
}
