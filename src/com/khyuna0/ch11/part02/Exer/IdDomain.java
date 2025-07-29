package com.khyuna0.ch11.part02.Exer;

public class IdDomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string =  "korea@korea.com";
		
		int indexnum = string.indexOf("@");
		
//		System.out.println(indexnum);  5
		
		String frontNum = string.substring(0, indexnum);
		String backNum = string.substring(indexnum + 1);
		
		System.out.println(frontNum);
		System.out.println(backNum);
	}

}
