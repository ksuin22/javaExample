package com.yedam.array;

public class Exam01 {
	public static void main(String[] args) {
		
		//배열선언 방법
		// 1.데이터가 6개 들어갈수 있는 공간을 만들고 1~6 데이터를 넣어주는 방법
		// int[] intArray = {1,2,3,4,5,6};
		
		// 2.new 연산자를 활용해서 배열 만드는 방법
//		int[] intArry = new int[6];
//		intArry[0] =1;
//		intArry[1] =2;
//		intArry[2] =3;
		
		//문자열을 10개의 공간에 입력하는 배열 방법
		String[] strArry = new String[10];
		
		int[] intArry2;
		//intArry2 = {1,2,3,4,5} //"x"
		intArry2 = new int[5];
		
		int[] scores = {83,90,87};
		
		System.out.println("scores 첫번째값 :"+ scores[0]);
		System.out.println("scores 마지막값 :"+ scores[2]);
		
		//반복문을 활용한 배열 사용
		//총합
		int sum =0;
		for(int i=0; i<3; i++) {
			System.out.println(scores[i] +"- i값 :" + i );
			sum=sum+ scores[i];
		}
		System.out.println("총합계: " + sum);
	
		
		//new 연산자를 활용해서 배열 생성
		//1) 
		int[] point;
		point = new int[] {83,90,87};
		
		//2)
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" +i+ "] : " +arr1[i]); 
		} //데이터가 없기 때문에 초기값 0이 들어가있음.
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" +i+ "] : " +arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" +i+ "] : " +arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" +i+ "] : " +arr3[i]);
		}
		
		
		arr3[0] = "3월";
		arr3[1] = "4월";
		arr3[2] = "5월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" +i+ "] : " +arr3[i]);
		}
		

		
		
		
		
		
		
		
		
		
	}

}
