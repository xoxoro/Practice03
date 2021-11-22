package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
		/*숫자를 1개 입력받아 팩토리얼 값을 출력하라.
		 5 입력시 1*2*3*4*5 의 값이 출력됩니다.
		 7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.*/
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int fact = 1;
		int i;
		
		
		for(i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("결과값: "+fact);
		
		
		
		
		sc.close();

	}

}
