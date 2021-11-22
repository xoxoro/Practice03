package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
		//13번문제에 계산식이 표시되도록 프로그램을 작성하라.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int i;
		
		
		
		for(i=1; i<=num; i++){
				
			sum = sum+i;
			if(i<num) {
				System.out.print(i+"+");
			}
			else if(i==num) {
				System.out.println(i);
			}
		}
		
		System.out.println("합계: "+sum);
		
		sc.close();
		

	}

}
