package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");                 //sysout 키 밑에 바로 sysout몸무게쓰고 int height,weight순으로 하니까 안나왔음 하나씩 제대로 하기
		int height = sc.nextInt();   //입력받을곳 지정
		
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		
		double normal = (height-100)*0.9; //표준체중 식
		
		if(normal>weight) {
			System.out.println("저체중 입니다.");
		}else if(normal<weight) {
			System.out.println("과체중 입니다.");
		}else {
			System.out.println("표준 입니다.");
		}
		
		
		
		System.out.println("표준체중: "+ normal);
		sc.close();
	}

}
