package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	
	public static Coffee coffeeInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	
	//1. 메뉴조회
	public void getCoffeeList() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffeeList();
		
		for(Coffee coffee : list) {
			System.out.println("메뉴: "+ coffee.getCoffeeMenu()+ " 가격: " + coffee.getCoffeePrice());
		}
		
	}
	
	
	
	//2.메뉴 상세조회
	public void getCoffee() {
		System.out.println("메뉴입력 > ");
		String coffeeMenu = sc.nextLine();
		Coffee cof = CoffeeDAO.getInstance().getCoffee(coffeeMenu);
				
		if(cof==null) {
			System.out.println("존재하지 않는 메뉴입니다.");
		}else {
			System.out.println("메뉴 : "+cof.getCoffeeMenu());
			System.out.println("가격 : "+cof.getCoffeePrice());
			System.out.println("설명 : "+cof.getCoffeeExp());
		}
	}
	
	
	
	//3.등록
	public void getcoffeeAdd() {
		Coffee cof = new Coffee();
		System.out.println("메뉴입력 >");
		String cofName = sc.nextLine();
		
		System.out.println("가격입력 >");
		int cofPrice = Integer.parseInt(sc.nextLine());
		
		System.out.println("설명입력 >");
		String cofExp = sc.nextLine();
		
		cof.setCoffeeMenu(cofName);
		cof.setCoffeePrice(cofPrice);
		cof.setCoffeeExp(cofExp);
		
		int result = CoffeeDAO.getInstance().getcoffeeAdd(cof);
		if(result ==1) {
			System.out.println("메뉴등록 완료");
		}else{
			System.out.println("메뉴등록 실패");
		}		
	}
	

	//4.판매
	
	
	//5.메뉴삭제
	public void getcoffeeDel() {
		System.out.println("삭제할 메뉴 >");
		String cofName = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().getcoffeeDel(cofName);
		if(result>0) {
			if(cofName.equals(coffeeInfo.getCoffeeMenu())) {
				coffeeInfo= null;
			}
		}else{
			System.out.println("삭제 완료");
		}
	}
	
	
	//6.매출
	
	
	//7.종료
	
	
	
	
	
	
	
	
	
	
	
	
}
