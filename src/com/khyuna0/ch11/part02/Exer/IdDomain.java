package com.khyuna0.ch11.part02.Exer;

public class IdDomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string =  "korea@korea.com";
		
		int indexnum = string.indexOf("@");
		
		System.out.println(indexnum); // 5
		
//		int front = indexnum - 1;  @ 앞 문자
//		int back = indexnum + 1;
		
		for (int i=0;i<indexnum;i++) {
			System.out.println();
		}
		
		for (int i=indexnum + 1;i<string.length();i++) {
			System.out.println(i);
		}
	}

}
