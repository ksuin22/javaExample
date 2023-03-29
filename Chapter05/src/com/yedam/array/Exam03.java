package com.yedam.array;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		//한 학생의 국영수 점수를 배열에 담아 성적관리하기
		// {국어,영어,수학}
		
		Scanner sc = new Scanner(System.in);
		
		int [] point = new int[3];
		
		int sum =0;
		double avg = 0;
		
		//학생의 성적 입력
		//국,영,수 차례로입력
		String [] sub = {"국어","영어","수학"};
		
		for(int i=0; i<point.length ; i++) {
			System.out.println(sub[i]+"점수 입력");
			point[i]=sc.nextInt();			
		}
		
		//총합계		
		System.out.println("총합: "+(point[0]+point[1]+point[2]));
		
		//평균
		avg = (point[0]+point[1]+point[2])/point.length;
		System.out.println("평균: "+avg);
		


	}

}
