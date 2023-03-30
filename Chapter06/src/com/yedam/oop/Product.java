package com.yedam.oop;

public class Product {

	String proName;
	int proPrice;
	
	Product(){
		
	}
	
	Product(String proName, int proPrice){
		this.proName = proName;
		this.proPrice = proPrice;
		
	}
	
	int sum () {
		return proPrice;
	}
	
}
