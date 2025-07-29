package com.khyuna0.ch11.part01.stringTest;

public class ByteToStringTest {
	// 아스키 코드 값 때문에
	public static void main(String[] args) {
		
		byte[] bytes = {72,101,108,108,111}; // Hello 아스키 코드 값 배열 
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String("Hello"); // 위처럼 자동으로 아스키코드 바이트 값으로 바꿔 저장됨
		System.out.println(str2); // 결과동일
		
		
	}
}
