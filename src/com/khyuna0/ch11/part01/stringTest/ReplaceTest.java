package com.khyuna0.ch11.part01.stringTest;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. replace() -> 문자열 대치 (문자열 바꾸기)
		
		String string = "길동이는 순신이보다 키가 크다. 하지만 순신이 길동이보다 말을 잘한다"; // 길동 -> 유신으로 변경하려면?
//		string.replace("길동", "유신"); // 원본을 수정하지 않는다
//		System.out.println(string);
		
		String reString = string.replace("길동", "유신");
		System.out.println(reString);
		
		
	}

}
