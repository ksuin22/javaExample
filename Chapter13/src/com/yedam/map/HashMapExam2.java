package com.yedam.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam2 {
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1,"김또치"), 95);
		map.put(new Student(1,"김또치"), 95);
		
		System.out.println("총 entry 수 "+ map.size());
		
	}

}
