package com.yedam.poly;

public class _04App01 {

	public static void main(String[] args) {
		//자동타입 변환
		
		//다형성이란
		/*부모클래스에 있는 내용을 사용을 하되,
		 * 만약 자식 클래스에 부모메소드가 오버라이딩 되어있다면
		 * 부모클래스에 메소드를 사용하지 않고!!! 자식클래스의 메소드를 사용한다.
		 * - 위에 성질(자동타입변환)을 활용해서 하나의 타입(부모)으로 다양한 형태, 객체를 만든다.
		 * - 많은 자식들이 있다면, 그 숫자만큼 다양한 형태, 객체의 모습을 만들수가 있다.
		 * */
		
		
		
		
		_02Child01 child = new _02Child01();
		_01Parent parent = child; //parent타입으로 변환
		//위에 두줄을 한줄로 표현하기
		//Parent parent = new Child01(); 
		
		

		
		parent.field = "A";
		parent.method1(); //parent 꺼
		parent.method2(); //child 01꺼

		
		System.out.println("-----");
		parent = new _03Child02(); //chil02를 부모타입으로 변환 
		
		parent.method1(); //child02꺼
		parent.method2(); //parent꺼
		
		
		
		
		
		
		
		
	}

}
