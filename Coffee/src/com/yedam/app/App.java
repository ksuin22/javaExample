package com.yedam.app;

import java.util.Scanner;

import com.yedam.coffee.CoffeeService;



public class App {

	Scanner sc = new Scanner(System.in);
	int menuNo = 0;
	
	CoffeeService cs = new CoffeeService();
	
	public App() {
		run();
	}

	
	private void run() {
		while(true) {
			System.out.println("1. 메뉴조회 2.메뉴 상세조회 3.메뉴등록 4.판매 5.메뉴삭제 6.매출 7.종료");
			System.out.println("번호입력 > ");
			menuNo = Integer.parseInt(sc.nextLine());
			
			if(menuNo==1) {
				cs.getCoffeeList();

			}else if(menuNo==2) {
				cs.getCoffee();
			}else if(menuNo==3) {
				cs.getcoffeeAdd();
				
			}else if(menuNo==4) {
				
			}else if(menuNo==5) {
				cs.getcoffeeDel();
			}else if(menuNo==6) {

			}else if(menuNo==7) {
				System.out.println("종료");
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
