package com.khyuna0.ch11.part02.Exer;

public class ABCounter {
	public static void main(String[] args) {
	String string = "abcabcabc";
	
	int count = 0;
	for (int i=0;i<string.length();i++) {
		if(string.charAt(i) == 'a' && string.charAt(i+1) == 'b') {
			count++;
		}
	}
	
	System.out.println(count);
	
	}
	
}	
