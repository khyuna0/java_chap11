package com.khyuna0.ch11.part02.Exer;

public class IdDomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string =  "korea@korea.com";
		
		int indexnum = string.indexOf("@");
		
//		
		
		String id = string.substring(0, indexnum);
		String domain = string.substring(indexnum + 1);
		
		System.out.println(id);
		System.out.println(domain);
	}

}
