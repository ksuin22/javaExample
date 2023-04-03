package com.yedam.inter4;


public class D {
	
	public static void main(String[] args) {
		
		//   A    <-(상속)-    B    <-(상속)-   C 
		
		
		A a = new B();
		a.info();
		
		
		a = new C(); 
		a.info();
	
	
	}

}
