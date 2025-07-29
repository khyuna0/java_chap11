package com.khyuna0.ch11.part02.Exer;

public class Banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "banana";
		
		String str1 = "";
		
		for (int i=0;i<string.length();i++) {
			if (str1.indexOf("b") == -1) {
				str1 = str1 + "b";
			} if (str1.indexOf("a") == -1) {
				str1 = str1 + "a";
			} if (str1.indexOf("n") == -1) {
				str1 = str1 + "n";
			}
		}
			
		System.out.println(str1);
		
	}
}