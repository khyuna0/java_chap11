package com.khyuna0.ch11.part01.stringTest;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "KOREA";
		String str2 = "japan";
		String str3 = "JAPAN";
		
		System.out.println(str1.toLowerCase()); // 원본을 수정하지 않음
		System.out.println(str1);
		System.out.println(str2.toUpperCase()); // (원본을 수정하지 않고 모두 대문자로 바꿈)
		str2 = str2.toUpperCase(); // 대문자로 변환 후 오버라이트(덮어쓰기)
		
		if (str2.equals(str3)) {
			
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		
	}	

}
