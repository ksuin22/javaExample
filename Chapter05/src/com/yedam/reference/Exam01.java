package com.yedam.reference;

public class Exam01 {

	public static void main(String[] args) {
		
		int intVal = 10;
		//stack영역에 intVal가 생성되어 10이라는 데이터가 저장
		
		//참조타입
		//stack 영역에 array가 생성되고(참조: [I@182decdb 라는 주소가 저장되어있다. 
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3=null;
		
		System.out.println(array); //참조된 주소값이 출력
		System.out.println(array2); //array와 내용은 같지만 참조 주소가 다름.
		System.out.println(array == array2); //False
		System.out.println(array3); //null
		
		
		
		
		
		
		
	}

}
