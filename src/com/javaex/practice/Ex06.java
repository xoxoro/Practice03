package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			
			//5의 배수이면서 7의 배수이냐?-->35랑 70만 출력
			if((i%5==0) && (i%7==0)) {
				//break;
				//continue;
				System.out.println(i);
			}
			
		} //for문의 끝
	}

}
