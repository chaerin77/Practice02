package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		
	/*	double numd = (double)num;
	 	if(num>0) {
			System.out.println("계산결과는 "+ (numd*7+2) + " 입니다.");
		}else {
			System.out.println("계산결과는 "+ ((numd*numd*numd)-9*numd+2)  + " 입니다.");
		} */
		
		if(num>0) {
			System.out.println("계산결과는 "+ ((double)num*7+2) + " 입니다.");
		}else {
			System.out.println("계산결과는 "+ ((double)(num*num*num)-9*num+2)  + " 입니다.");
		} 
		sc.close();
	}

}
