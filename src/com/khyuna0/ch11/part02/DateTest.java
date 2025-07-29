package com.khyuna0.ch11.part02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		Date nowTime = new Date();
		System.out.println(nowTime.toString()); //문자열로 저장하기
		
		System.out.println("======================");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		String date1 = sdf1.format(nowTime);
		
		System.out.println(date1);
		
		System.out.println("======================");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); 
		String date2 = sdf2.format(nowTime);
		
		System.out.println(date2);
		
		System.out.println("======================");
		
		System.out.println(nowTime.getTime()+(2*60*60*1000)); // 현재시각 기준으로 2시간 후 
		
		long NewTime = nowTime.getTime() + (2*60*60*1000);
		nowTime.setTime(NewTime);
		System.out.println("지금부터 2시간 후 : " + nowTime);
		
	}
}
