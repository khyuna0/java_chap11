// 주민번호 출력 프로그램
package com.khyuna0.ch11.part01.stringTest;

public class JuminNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "990725-4234567";
		
		char gender = jumin.charAt(7); // 성별 판별
		switch (gender) {
		case '1': // char 타입 문자와 비교
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
		
		default : System.out.println("잘못된 번호");
			break;
		}
		
		
		
	}

}
