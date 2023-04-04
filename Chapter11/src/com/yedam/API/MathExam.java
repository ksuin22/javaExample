package com.yedam.API;

import java.util.Random;

public class MathExam {
	
	public static void main(String[] args) {
		
		int v1 =Math.abs(-5);
		System.out.println(v1); //절대값
		
		double v2 =Math.abs(-3.1);
		System.out.println(v2); //절대값
		
		double v3 = Math.ceil(5.3);
		System.out.println(v3); //올림
		
		double v4 = Math.ceil(-5.3);
		System.out.println(v4); //올림
		
		double v5 = Math.floor(5.3);
		System.out.println(v5); //내림
		
		double v6 = Math.floor(-5.3);
		System.out.println(v6); //내림
		
		int v7 =Math.max(5,9);
		System.out.println(v7); //최대값
		
		int v8 =Math.min(5,9);
		System.out.println(v8); //최소값
		
		double v9= Math.random();
		System.out.println(v9); //0~1사이 랜덤값
		
		double v10= Math.rint(10.5);
		System.out.println(v10); //소숫점 0.5이고 정수부분 짝수일때> 내림처리 
		
		double v11= Math.rint(7.5);
		System.out.println(v11); //소숫점 0.5이고 정수부분 홀수일때> 올림처리
		
		double v12= Math.round(5.4);
		System.out.println(v12); //반올림
		
		
		//Random()
		
		Random random = new Random(System.currentTimeMillis());
		System.out.println(random.nextDouble());
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
