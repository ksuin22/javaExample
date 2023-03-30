package com.yedam.oop;

public class App02Car {

	public static void main(String[] args) {
		Car sonata = new Car("소나타",10000);
		
		System.out.println(sonata.company);
		System.out.println(sonata.name);
		System.out.println(sonata.price);
		
		
		Car k5 = new Car("K5", 9000, "기아자동차");
		
		System.out.println(k5.company);
		System.out.println(k5.name);
		System.out.println(k5.price);
		
		
		
//		sonata.name = "소나타";
//		sonata.price = 10000;
//		
//		System.out.println(sonata.company);
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);
//		System.out.println();
//		
//		sonata.company = "기아자동차"; 	//필드값 바꿀수 있음.
//		
//		System.out.println(sonata.company);
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);
//		System.out.println();
//		
//		Car kona = new Car();
//		
//		System.out.println("==코나==");
//		System.out.println(kona.company);
//		System.out.println(kona.name);
//		System.out.println(kona.price);
//		
//		kona.name = "코나";
//		kona.price = 100;
//		
//		System.out.println();
//		System.out.println(kona.company);
//		System.out.println(kona.name);
//		System.out.println(kona.price);
		
		
		
		

	}

}
