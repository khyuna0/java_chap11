package com.khyuna0.ch11.part02.Exer;

public class TextCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "Hello123Java456";
	
		
		int count1 = 0;
		
		for (int i=0;i<string1.length();i++) {
			if (string1.charAt(i) >= 65 && string1.charAt(i) <= 90 ) {
				count1++;
			} if (string1.charAt(i) >= 97 && string1.charAt(i) <= 122 ) {
				count1++;
			}
		}
		
		System.out.println(count1);
		
	}

}
