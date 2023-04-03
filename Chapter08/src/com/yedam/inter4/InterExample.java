package com.yedam.inter4;

public class InterExample {
	public static void main(String[] args) {
		
		
		InterC ic = new ImplementsC() ;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
		InterB bc = new ImplementsC();
		bc.methodB();
		
		
		InterA ac = new ImplementsC();
		ac.methodA();
			
			
			
			
			
			
			
			
			
	}

}
