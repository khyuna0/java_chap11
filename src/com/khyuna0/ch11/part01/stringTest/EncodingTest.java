package com.khyuna0.ch11.part01.stringTest;

public class EncodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "안녕하세요!";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1); // 해시값 출력
		System.out.println(bytes1.length);
		
		String str2 = new String(bytes1);
		System.out.println(str2);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); // 인코딩 방법이 다름
			System.out.println(bytes2.length); // 11
			
			byte[] bytes3 = str.getBytes("UTF-8"); // 16
			System.out.println(bytes3.length);
			
		} catch (Exception e) { // 인코딩 시 에러 발생 확률이 있다
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
