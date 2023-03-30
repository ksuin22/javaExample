package com.yedam.oop;

import java.util.Scanner;

public class App05 {
	public static void main(String[] args) {
		//int + 배열 
		// 	=> int[] ary = new int[10]; ->10개 공간에 정수 저장
		
		//클래스 + 배열 
		//	=> Student[] ary = new Student[10] ->10개 공간에 학생객체를 저장
		
		
		//1.학생수 |2.학생정보입력 |3.학생들의 총점, 평균 |4. 종료
		Scanner sc = new Scanner(System.in);
		int stdCount = 0;
		
		//학생 객체를 담는 배열
		Student[] stdAry = null;
		
		while(true){
			System.out.println("1.학생수 |2.학생정보입력 |3.학생들의 총점, 평균 |4. 종료");
			System.out.println("메뉴 입력> ");
			String selectNo = sc.nextLine();
			
			if(selectNo.equals("1")) {
				System.out.println("학생 수 입력> ");
				stdCount = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo.equals("2")) {
				//입력받은 학생수만큼의 배열 생성하기
				stdAry = new Student[stdCount];
				for(int i=0; i<stdAry.length; i++) {
					//i번째 배열에 학생클래스를 활용한 객체생성
					stdAry[i] = new Student();
					//학생들의 정보를 입력하는 공간
					//객체를 생성하고 객체에 정보를 저장한 다음> 배열에 보관
					System.out.println("학생 이름>");
					String name = sc.nextLine();
					//s1이라고 가정
					//i=0
					//stdAry[0] =s1
					//stdAry[0].name =s1.stdName
					stdAry[i].name = name; //
					
					System.out.println("국어 성적>");
					int kor = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = kor;
					
					System.out.println("수학 성적>");
					int math = Integer.parseInt(sc.nextLine());
					stdAry[i].math = math;
					
					System.out.println("영어 성적>");
					int eng = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = eng;
				}
			} else if(selectNo.equals("3")) {
				//학생들 총점, 평균
				for(int i=0; i<stdAry.length; i++) {
					System.out.println(stdAry[i].name + "의 학생 성적");
					//(stdAry[i].kor +stdAry[i].math +stdAry[i].eng)
					System.out.println("총 점 : " + stdAry[i].sum());
					System.out.println("평 균 : " + stdAry[i].avg());
				}
			} else if(selectNo.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("없는 메뉴입니다. 다시 입력하세요.");
			}

			
		}
		
				
	}

}
