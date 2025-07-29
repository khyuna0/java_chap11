package com.khyuna0.ch11.part01;

public class WrapperTest {

	public static void main(String[] args) {
		// 변경 타입의 첫 글자를 대문자로 작성해야 함
		
		Integer integer1 = new Integer("1000"); // 추천하지 않는 방법
		System.out.println(integer1.intValue());
		
		Integer int2 = 100;
		
		int a = Integer.parseInt("1234"); // 문자열 숫자를 진짜 숫자로 바꾸기 "1000" -> 1000
		
		
		
	}

}
