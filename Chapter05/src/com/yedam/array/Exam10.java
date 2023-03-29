package com.yedam.array;

public class Exam10 {

	public static void main(String[] args) {
		
		// 참조 배열
		String[] strArry = new String[3];
		strArry [0]= "yedam";
		strArry [1]= "yedam";
		strArry [2]= new String("yedam");
		
		System.out.println(strArry[1]==strArry[2]); //F
		System.out.println(strArry[0]==strArry[1]); //T
		System.out.println(strArry[0].equals(strArry[2])); //T
		
		//배열 복사
		int[] oldArray = {1,2,3};
		
		int[] newArray = new int[5];
		
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
		for(int i =0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		int[] oldArray2 = {1,2,3,4,5,6,7,8};
		int[] newArray2 = new int[10];
		
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		System.out.println("----------------------");
		for(int i=0; i<newArray2.length; i++) {
			System.out.println(newArray2[i]);
		}
		
		
		///향상된 for문
		System.out.println();
		
		for(int temp : newArray2) {
			System.out.println(temp+"\t");
		}
		
		
		
		
	}

}
