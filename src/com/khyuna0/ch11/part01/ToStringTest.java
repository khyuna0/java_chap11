package com.khyuna0.ch11.part01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		
		System.out.println(object.toString()); // -> 클래스이름 @ 해시코드 값을 16진수로 변환한 수
		Member member1 = new Member(); // -> null 값
		Member member2 = new Member("tiger"); // -> tiger
		System.out.println(member1.toString());
		System.out.println(member2.id);
		
		Date date = new Date();
		System.out.println(date.toString());
	}

}
