package com.yedam.API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExam {
	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		
		SimpleDateFormat nowFoam = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(nowFoam.format(now));
		
		
		
		//Calendar 클래스
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		//sun : 1, mon: 2
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
		strWeek = "화";
		break;
		case Calendar.WEDNESDAY:
		strWeek = "수";
		break;
		case Calendar.THURSDAY:
		strWeek = "목";
		break;
		case Calendar.FRIDAY:
		strWeek = "금";
		break;
		case Calendar.SATURDAY:
		strWeek = "토";
		break;
			
		
		}
		
		
		int amPm= cal.get(Calendar.AM_PM);
		String strAmpm = null;
		if(amPm == Calendar.AM) {
			strAmpm = "오전";
			
		}else {
			strAmpm = "오후";
		}
		
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println();
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day+ "일 ");
		System.out.println(strWeek + "요일 ");
		System.out.println(strAmpm + hour + "시 ");
		System.out.println(minute + "분 ");
		System.out.println(second + "초");
		

		
	}

}
