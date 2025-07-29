package com.khyuna0.ch11.part01;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class cla = Car.class; 
		
		System.out.println(cla.getName()); // 패키지와 클래스 이름 출력
		System.out.println(cla.getSimpleName()); // 클래스 이름
		System.out.println(cla.getClass());
		
	}

}
