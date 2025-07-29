package com.khyuna0.ch11.part01.stringTest;

public class IndexTest {

	public static void main(String[] args) {
		
		// 1. indexOf() -> 찾는 문자열이 시작되는 인덱스 반환
		
		// TODO Auto-generated method stub
		String str = "대한민국 일본";
		int indexNum = str.indexOf("일본"); // int 타입으로 반환. "일본"문자열이 시작되는 인덱스 번호 출력
		System.out.println(indexNum); // 5 출력
		// '대' '한' '민' '국' '(공백)' '일' '본' -> 공백은 null 문자 저장
		// 찾는 문자열이 시작되는 인덱스 반환
		
		// 일치하는 문자열을 찾지 못하면 -1반환
		
		if(str.indexOf("민국") != -1) {  
			System.out.println("민국 포함");
		} else { 
			System.out.println("민국 포함되지 않음");
		}
		
		System.out.println(str.length());
		
		
		
	}

}
