package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
		//정수 다섯개를 입력받아 가장 큰 수를 출력하라.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num;
		int max=0;
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			num= sc.nextInt();
			if(num>max) {
				max=num;
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();
	}

}
