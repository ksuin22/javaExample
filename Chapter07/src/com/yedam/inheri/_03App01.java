package com.yedam.inheri;

public class _03App01 {
	public static void main(String[] args) {
		
		_02Child child = new _02Child();
		
		child.lastName = "이";
		child.getInfo();
		child.money = 1000; //private 이라서 안됨
		
		
	}

}
