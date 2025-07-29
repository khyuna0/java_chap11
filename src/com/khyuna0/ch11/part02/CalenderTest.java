package com.khyuna0.ch11.part02;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calendar = 추상 클래스. 싱클턴으로 객체 생성
		
		Calendar calNow = Calendar.getInstance();
		
		int year = calNow.get(Calendar.YEAR); // 2025
		int month = calNow.get(Calendar.MONTH)+ 1; // 7  month 는 0부터 시작, + 1 하기 
		int day = calNow.get(Calendar.DAY_OF_MONTH); // 29
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		int hour = calNow.get(Calendar.HOUR);
		int minute = calNow.get(Calendar.MINUTE);  
		int second = calNow.get(Calendar.SECOND);  
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		int week = calNow.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("오늘의 요일 : " + week);
		System.out.println("오늘의 요일 : " + Calendar.TUESDAY);
		
		if ( week == Calendar.TUESDAY ) {
			System.out.println("화요일");
		} else {
			System.out.println("화요일이 아님");
		}
		
		
		
		
	}

}
