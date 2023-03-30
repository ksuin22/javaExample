package com.yedam.array;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		//교재 201쪽 6번 문제
		
		boolean run = true;
		int studentNum = 0;
		int[] scores =null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
					
			if(selectNo ==1) {
				//학생수 입력
				System.out.println("학생수 입력 > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum]; //
			}else if(selectNo ==2) {
				//점수입력
				for(int j=0; j<scores.length; j++) {
					System.out.println("scores["+j+"] > ");
					scores[j] = Integer.parseInt(sc.nextLine());
				}		
						
			}else if(selectNo ==3) {
				//점수리스트
				for(int j=0; j<scores.length; j++) {
					System.out.println("scores[" +j+ "] > " +scores[j]);
				}
				
			}else if(selectNo ==4) {
				//최고점수
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max =scores[i];
					}
				}
				System.out.println("최고점수 = "+ max);
				
				//평균점수
				int sum =0;
				int avg = scores[0];
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];				
					}
				System.out.println((double)sum/scores.length);
							
			}else if(selectNo ==5) {
				//종료
				run = false; 
			}
						
		}
		
		System.out.println("프로그램 종료");
	}

}
