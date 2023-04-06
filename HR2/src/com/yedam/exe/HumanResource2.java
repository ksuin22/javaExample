package com.yedam.exe;

import java.util.Scanner;

import com.yedam.departments.DptImp;

public class HumanResource2 {

	Scanner sc = new Scanner(System.in);
	DptImp di = new DptImp();
	
	public HumanResource2() {
		run();
	}
	
	private void run() {
		
		//1.전체조회
		//2.부서정보 조회(단건)
		//3.부서생성(id,name)
		//4.부서수정(mgr)
		//5.부서삭제
		while(true) {
			System.out.println("1.전체조회 2.부서조회 3.부서생성 4.부서수정 5.삭제 99.종료");
			System.out.println("메뉴 >");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				di.getDepartmentList();				
			}else if(menu ==2) {
				di.getDpt();
			}else if(menu ==99) {
				System.out.println("end");
				break;
			}
		
		
		
		
		}
	}
	
}
