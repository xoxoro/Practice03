package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
		/*1~100사이의 숫자중 임의로 숫자를 정한 후 코딩할때마다 숫자를 변경해서 테스트함.
		 사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
		사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
		정답을 맞춘경우 “맞았습니다.” 출력됩니다.
		게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
		(y 인경우 다시 게임이 시작됩니다.)
		 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("  [숫자맞추기게임 시작]  ");
		System.out.println("===================");
		
		int text = (int)(Math.random()*10)+1 ;
		int num;
		
		while(true){
		
			
			System.out.print(">>");
			num = sc.nextInt();
			
				if(num<text) {
					System.out.println("더 높게");
				}
			
				else if(num>text) {
					System.out.println("더 낮게");
				}
				
				else if(num==text) {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");
					
					String yn = sc.next();
					
					if(yn.equals("y")) {
						break;
					}
					else if(yn.equals("n")) {
						continue;//근데 다시 새로운 번호를 부여받아 시작하고싶다면..?
					}
					
				}
		
		}
		
		System.out.println("===================");
		System.out.println("  [숫자맞추기게임 종료]  ");
		System.out.println("===================");
		
		sc.close();
	}

}
