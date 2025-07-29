package com.khyuna0.ch11.part01;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10000;i++) {
			System.out.println(i);
			if (i == 5000) {
				break;
				// System.exit(i); // -> 프로그램 종료
			}
		}
		System.out.println("for문 종료 후 출력되는 문장");
		System.out.println("====================");
		
		
		// time 은 long 으로 선언
		long time1 = System.nanoTime(); // 현재 시간을 나노초로 뽑음
		long timeM1 = System.currentTimeMillis(); // 현재 시간을 밀리초로 뽑음
		
		System.out.println("====================");
		long sum = 0L;
		for(int i=1;i<=10000000;i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("====================");
		
		long time2 = System.nanoTime();
		long timeM2 = System.currentTimeMillis();
		
		System.out.println(time2 - time1); // 위 for 문을 반복하는 데 걸린 시간 (나노 초)
		System.out.println(timeM2 - timeM1); // (밀리 초)
		
	}

}
