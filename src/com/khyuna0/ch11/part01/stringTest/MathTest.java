package com.khyuna0.ch11.part01.stringTest;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-10)); // 절대값 
		
		System.out.println(Math.ceil(1.1)); // 소수점 올림값 
		System.out.println(Math.floor(1.9)); // 내림
		System.out.println(Math.round(3.45)); // 반올림, 소수점 몇 자리 반올림 설정 가능
		
		System.out.println(Math.max(1,2)); // 최대값 / max -> min 최소값
		
		System.out.println(Math.random()); // 0.0 < n < 1.0 사이의 수 반환
		System.out.println(Math.floor(Math.random()*45 + 1)); 
		
		System.out.println(Math.rint(-3.7)); // 인수값에 가장 가까운 정수를 실수형으로 반환 ( n.5 -> 반올림 ) 
		// 반올림하는 메소드
		
		
		
	}

}
