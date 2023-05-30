package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
//		firstMethod();
	//	secondMethod();
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력: ");
		int num3 = scn.nextInt();
		System.out.println("두번째 값을 입력: ");
		int num4 = scn.nextInt();
		thirdMethod(num3, num4);
		
		scn.close();
	}
	public static void thirdMethod(int a, int b){
		//매개로 받은 2개의 수를 더하고 결과를 출력.
		int result =  a + b;
		System.out.println("결과값은 : " + result);
		
	}
	
	public static void secondMethod(){
		//Scanner 활용.
		//"I am a boy", 3 => 문장을 입력받은 숫자의 횟수만큼 출력.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("출력할 문장을 입력하세요.");
		String str1 = scn.nextLine();
		System.out.println("반복할 횟수를 입력: ");
		int num2 = scn.nextInt();
		
		for(int i=1; i<=num2; i++) {
			System.out.println(str1);
		}
		scn.close();
	}

	public static void firstMethod() {
		// Scanner 사용해서 입력값을 2개.
		// 3,4 => 3의 4제곱 값을 출력.
		int result = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int num1 = scn.nextInt();
		System.out.println("두번째 숫자 입력");
		int num2 = scn.nextInt();
		for (int i = 1; i <= num2; i++) {
			result = result * num1;
		}
		System.out.println("결과 : " + result);
		scn.close();
	}
}
