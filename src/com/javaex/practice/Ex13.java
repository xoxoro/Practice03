package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
		//숫자1개를 입력받아 입력한 숫자까지 누적합계를 구하라.
		//100을 입력받는다면 1+2+3+4+5+...+99+100
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		int sum = 0;
		int i;
		
		for(i=1; i<=num; i++) {
			sum = sum+i;
			
		}
		System.out.println("합계: "+sum);
		
		
		
		
		
		
		sc.close();

	}

}
