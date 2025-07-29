package com.khyuna0.ch11.part01.stringTest;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("좋아하는 위인을 입력하세요 : ");
		String string = scanner.nextLine();
		 
		// trim -> 스페이스바로 생긴 공백만 제거 / strip -> 스페이스바 공백 제거, 특수문자로 만들어진 공백도 제거. trim 보다 넓은 범위.
		
		System.out.println(string.strip()); // 문자열 양쪽의 공백 제거 -> 원본은 수정되지 않음
		string = string.strip();
		System.out.println(string.length());
		
		
		
		

	}

}
