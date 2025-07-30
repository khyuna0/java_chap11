package com.khyuna0.ch11.part02.Exer;

public class Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "i like chopin";
		
		// 첫 글자 index 0 대문자, 다음엔 공백 기준
		
		String str = string.trim(); 
		
		String result = ""; 
		for (int i=1;i<str.length();i++)
		{
			if( str.charAt(i) == ' ' ) {
				result += " " + Character.toUpperCase(str.charAt(i+1));  // Character 클래스의 static method 호출함
				i++; // 공백, 공백 다음 문자 순서 처리 하고 다음 순서로 넘김
				}
			else {
				result += str.charAt(i);
				} 
		}
		
		System.out.println(Character.toUpperCase(str.charAt(0))+result); 
		
		
	}

}
