package com.yedam.loop;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		sum = sum + 1; //0+1 1
//		System.out.println(sum);
//		sum = sum + 2; //1+2 3
//		System.out.println(sum);
//		sum = sum + 3; //3+3 6
//		System.out.println(sum);
//		sum = sum + 4; //6+4 10
//		System.out.println(sum);
//		sum = sum + 5; //10+5 15
//		System.out.println(sum); //1~5까지의 합
//		
//		for(int i=1; i<=5; i++) {
//			sum = sum + i ;
//		}
//		
//		//1~100사이의 짝수 구하기
//		//짝수 2n
//		
//		
//		for(int i=1; i<=100; i++ ) {
//			if(i%2 ==0) {
//				System.out.println(i+ ":     짝수");
//			}else {
//				System.out.println(i+ ": 홀수");
//			}
//		}
//		
//		//구구단 출력
//		//구구단만 출력 > 입력 구구단 출력
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println("2 x " + i + "=" + (2*i));
//		}
//			
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 입력 >");
//		int gugu = sc.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(gugu+ "x"+i + "=" + (gugu*i));
//		}
//		
//		/*입력한 값에 대한 총합, 평균, 최대값, 데이터 받을 갯수(반복문횟수)를
//		스캐너 활용해서 데이터 입력*/
//		
//		//총합: 입력받자마자 총합이라는 변수에 누적합계
//		//평균: 총합 / 데이터 입력개수
//		//최대값 : 입력한 데이터와 기존에 들어있는 데이터 비교해서 더큰거		
//		//최소값 : 입력한 데이터와 기존에 들어있는 데이터 비교해서 더작은거
//
//		int total = 0;
//		double avg = 0;
//		int max = 0;
//		int min = 0;
//				
//		//데이터입력
//		System.out.println("데이터 입력 갯수>");
//		
//		//입력할 데이터 갯수 입력받음		
//		int count = sc.nextInt();
//		
//		for(int i=0; i<count; i++) {
//			System.out.println("데이터입력 >");
//			int data = sc.nextInt();
//			//총합 : total
//			total = total + data;
//			total +=data;
//			
//			//최대값, 최소값 초기값 설정
//			if(i==0) {
//				max =data;
//				min =data;
//			} else {
//				if(max < data) {
//					max = data;
//				}
//				if(min > data) {
//					min = data;
//				}
//			}
//				
//		}
//		
//		//반복문 결과 출력
//		System.out.println("총합 : " + total);
//		System.out.println("평균 : " + (total/(double)count));
//		System.out.println("최대값:" + max +"최소값 : "+min);
//		
		
		
		// <up & down>
		/*임의 랜덤값 (1~100)사이의 하나의 정수를 추출해서
		5번 기회안에 해당하는 랜던값을 맞추는 프로그램 구현.*/
			
		/*예시
		 랜덤값 50
		 입력값 30 => up
		 입력값 70 => down
		 정답일경우 => 정답, 3번 기회만에 맞추셨습니다.
		 실패하였습니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int randomNo = (int)(Math.random()*100)+1;
				
		
		for(int i=1; i<=5; i++) {
			System.out.println("랜덤값 맞추기 >");
			int num = sc.nextInt();
			
			if(num<randomNo) {
				System.out.println("up");	
			}else if(num>randomNo){
				System.out.println("down");
			}else if(num==randomNo) {
				System.out.println("정답입니다!");
				break;	
			}
			
			if(i==5) {
				System.out.println("실패");
				System.out.println("5번의 기회를 소진하였습니다.");
			}
			
		}
		
		
		
		
		
		
		
			
			
			
			
			
			
	}

}
