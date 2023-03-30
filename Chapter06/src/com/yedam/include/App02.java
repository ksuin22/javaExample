package com.yedam.include;

import java.util.Scanner;

import com.yedam.access.Access;

public class App02 {

	public static void main(String[] args) {
		Access ac = new Access();
//		Scanner sc = new Scanner(System.in);
		
		//public
		ac.free="public";
		
		//protected - 오류. 다른 패키지.
		ac.parent = "protected";
		
		//default - 오류. 다른 패키지라서
		ac.basic ="default";
				
		//private
		
		ac.privacy="private";
		
		
		
		
	}

}
