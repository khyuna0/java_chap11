package com.khyuna0.ch11.part02.Exer;

public class Banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String string = "banana";
	      
	      String result = "";
	      
	      for (int i=0;i<string.length();i++) {
	         if (result.indexOf(string.charAt(i)) == -1) {
	            result += string.charAt(i);
	         } 
	      }
	         
	      System.out.println(result);
	}
}