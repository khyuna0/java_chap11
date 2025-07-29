package com.khyuna0.ch11.part01.stringTest;

public class SubStringTest {
	
	// substring(n, m)필요한 문자열만 반환하기
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String addr = "서울특별시 종로구 숭인동 111번지 302호 2층";
		
		// 각 주어진 시작과 끝 사이의 인덱스를 추출
		String firstAddr = addr.substring(6, 9); // end 인덱스에 해당하는 문자는 추출되는 문자열에 포함 안됨
		System.out.println(firstAddr);
		
		// 주어진 인덱스부터 끝까지 추출
		String secondAddr = addr.substring(14);
		System.out.println(secondAddr);
		
	}

}
