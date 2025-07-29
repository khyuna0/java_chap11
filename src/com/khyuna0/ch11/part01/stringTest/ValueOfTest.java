package com.khyuna0.ch11.part01.stringTest;

public class ValueOfTest {
	
	public static void main(String[] args) {
		
		String str1 = String.valueOf(100);
		String str2 = String.valueOf(false);
		String str3 = String.valueOf(3.14);
		
		System.out.println(str1.substring(2)); // 문자열로 변경되어 문자열 메소드 적용 가능해짐
		System.out.println(str2);
		System.out.println(str3.toUpperCase());
	}
	
	

}
