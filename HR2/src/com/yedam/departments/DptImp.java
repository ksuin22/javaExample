package com.yedam.departments;

import java.util.List;
import java.util.Scanner;

public class DptImp {

	
	
Scanner sc = new Scanner(System.in);
	
	
	//EmpDAO에서 실행한 쿼리문을 자바에서 활용하는 부분.
	
	
	//1.전체조회
	public void getDepartmentList() {
		//싱글톤을 활용해서 getEmployeesList 사용
		List<DptDTO> list = DptDAO.getInstance().getDptList();
		
		for(int i=0; i<list.size();i++) {
			System.out.println("부서id:" + list.get(i).getDptId());
			System.out.println("부서이름:" + list.get(i).getDptName());
			System.out.println("매니저:" + list.get(i).getManager());
			System.out.println("위치:" + list.get(i).getLocation());
		}
	}
	
	
	//2.단건조회
	public void getDpt() {
		System.out.println("조회할 부서> ");
		int dptId = Integer.parseInt(sc.nextLine());
		DptDTO dpt =DptDAO.getInstance().getDpt(dptId);
		
		
		if(dpt ==null) {
			System.out.println("해당 부서는 존재하지 않습니다.");
			
		}else {
		System.out.println("부서id : " + dpt.getDptId());
		System.out.println("부서이름 : " + dpt.getDptName());
		System.out.println("매니저 : " + dpt.getManager());
		System.out.println("위치 : " + dpt.getLocation());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
