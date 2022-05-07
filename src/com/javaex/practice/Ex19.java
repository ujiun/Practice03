package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		int money = 0;
		int num = 0;
		int change= 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("------------------------------");
			
			System.out.print("선택>");
			num = sc.nextInt();
		
			if(num==1) {				
				System.out.print("예금액>");
				change = sc.nextInt();
				money = money + change;
				
			}else if(num==2) {
				System.out.print("출금액>");
				change = sc.nextInt();
				money = money - change;
			}else if(num==3) {
				System.out.println("잔고액>" + money);
			}else if(num==4) {
				System.out.println("프로그램종료");
				break;				
			}else {
				System.out.println("다시입력해주세요");
			}
			System.out.println("\n");
		}
		
		
		sc.close();
		
	}

}
