package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
		//숫자 하나를 입력받아 아래와 같이 *이 출력되도록 프로그램을 작성하라.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y=0; y<num; y++)/*num=5이면 5줄이 옴*/ {
			for(int x=0; x<num-y; x++)/*5줄에서 가로가 한칸씩 깎임*/ {
				System.out.print("*");
			}
			System.out.println();
				
		}
		
		sc.close();

	}

}
