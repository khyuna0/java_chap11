package com.khyuna0.ch11.part01.stringTest;

public class CharAtTest01 {
	// 문자열 중 원하는 문자 1글자만 반환해주는 메소드
	public static void main(String[] args) {
		String str = "Korea oop program";
		String str2 = "우리나라";
		// 문자열은 문자 char 배열 형태로 저장됨 {K, o, r, e, a}
		// str.charAt(n); 문자열 배열의 n 번째 인덱스 반환
		System.out.println(str.charAt(0)); 
		
		int count = 0;
		for (int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
			if(str.charAt(i) == 'o') {
				count++;
			}
		}
		System.out.println("문자열 내에 소문자 o가 " + count + "번 포함되어 있습니다.");
	}
}
