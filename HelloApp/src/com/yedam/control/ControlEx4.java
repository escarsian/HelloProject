package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1부터 100까지의 수 중에서 3의 배수의 합계. method1()
		// Math.random()의 2번 실행 => 두 수의 합이 5가 되는 경우. 주사위
		// 1,4 2,3 3,2 등등의 경우 반복 횟수를 중단. method2()
		// 반복문 for를 활용.
		// *
		// **
		// ***
		// **** .method3()
		method1();
		method2();
		method3();
		method4();
	}

	public static void method1() {
		int sum = 0;
		int i = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void method2() {
		int num1=0;
		int num2=0;
		int num3=0;
		while (true) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			num3 = num1 + num2;
			if (num3 == 5) {
				break;
			}
		}
		System.out.println(num3);
	}
	
	public static void method3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i < j) {
					System.out.printf("%s", " ");
				} else {
					System.out.printf("%s", "*");
				}
			}
			System.out.println();
		}
	}

	public static void method4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j >= 5) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
	}
}
