package com.yedam.oop;

public class Book {

	/*book이라는 클래스는 아래의 정보를 가집니다.
	 */
	//책이름, 책종류, 가격, 도서번호, 출판사
	String name;
	String type ="학습서";
	int price;
	int num;
	String company;
	
	//생성자는 3개정도 생성
	
	//1.기본생성자
	public Book() {
		
	}
	//2.모든 데이터를 초기화할수 있는 생성자
	public Book(String name, String type, int price, int num, String company) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.num = num;
		this.company =company;
		
		
	}
	
	//3.책이름, 가격, 도서번호를 받아오는 생성자
	public Book(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}

		
	
	//메소드는 getInfo() 메소드 가짐.
	void getInfo() {
		System.out.println("책이름:" +name);
		System.out.println("종류:" +type);
		System.out.println("가격:" +price);
		System.out.println("도서번호:" +num);
		System.out.println("출판사:" +company);
	}
	
	
	//getInfo() 메소드를 클래스 외부에서 실행하였을때 다음과 같은 출력물이 나오도록 구현.
	//객체.getInfo()
	
	
	//# 책이름 : 혼자 공부하는 자바
	//# 내용
	//1)종류 : 학습서
	//2)가격 : 24000원
	//3)출판사 : 한빛미디어
	//4)도서번호 : yedam001
	
	//# 책이름 : HTML
		//# 내용
		//1)종류 : 학습서
		//2)가격 : 15000원
		//3)출판사 : 길벗
		//4)도서번호 : yedam002
	
	//# 책이름 : JavaScript
		//# 내용
		//1)종류 : 학습서
		//2)가격 : 20000원
		//3)출판사 : 길벗
		//4)도서번호 : yedam003
		
	
	
	
}
