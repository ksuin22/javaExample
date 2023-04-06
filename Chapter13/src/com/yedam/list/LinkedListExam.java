package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		
		//ArrayList 와 LinkedList 처리속도 비교하기
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		//ArrayList
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList걸린시간 : " +		
		(endTime - startTime) + "ns");
		
		//LinkedList
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList걸린시간 : " +		
		(endTime - startTime) + "ns");
		
		
		
		
	}
	

}
