package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
		// 숫자를 1개 입력받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하라.
		 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int b=num/5;//개수
	
		
		for(int i=0; i<num; i++) {
			if(i%5==0) {
				sum=sum+i;//개수의 합
			}
		}
		
		System.out.println("5의배수의 개수: "+b);
		System.out.println("5의배수의 합: "+sum);
		
		sc.close();
	}

}
