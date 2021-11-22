package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
		/*입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
			- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
		 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
 			- 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum=0;
		int i;
		
		if(num%2==0)//짝수
		{
			for(i=1; i<=num; i++) {
				if(i%2==0) {
					sum = num+i;
				}
			}
			
		}
		else //홀수 
		{
			for(i=1; i<=num; i++) {
				if(i%2!=0) {
					sum = num+i;
				}
			}
		}
		System.out.println("결과값: "+sum);
	
		sc.close();
	}

}
