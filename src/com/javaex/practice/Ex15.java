package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	//숫자를 1개 입력받아 입력한 수의 약수를 모두 출력하세요.
	//예를 들어 10을 입력한 경우 1,2,5,10이 출력된다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
				
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		
		sc.close();		
	}
}
