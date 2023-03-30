package com.yedam.oop;

public class Student {
	
	//학생이름, 학번, 국영수 점수를 가지는 학생
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	//기본생성자
	Student(){
		
	}
	
	//데이터 초기화하는 생성자
	Student(String name,int no,int kor,int eng,int math){ //괄호안에 매개변수
		this.name = name; 
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//학생의 정보를 출력하는 getInfo()
	//정보추가: 총점, 평균
	
	void getInfo() {
		System.out.println("이름:" +name);
		System.out.println("학번:" +no);
		System.out.println("국어:" +kor);
		System.out.println("영어:" +eng);
		System.out.println("수학:" +math);
		System.out.println("총점:" +(kor+eng+math));
		System.out.println("평균:" +(double)(kor+eng+math)/3);
	}
	
	//총점평균 다른방법
	int sum() {
		return kor+eng+math;
	}
	
	double avg() {
		return (double)sum()/3;
	}
	
	void getInfo2() {
		System.out.println("이름:" +name);
		System.out.println("총점:" +sum());
		System.out.println("평균:" +avg());
	}
	
	//getInfo()출력결과
	//--------
	//이름:김또치
	//학번: 20230330
	//총점 : 200
	//평균 :67.--
	
	
	
	
	
}
