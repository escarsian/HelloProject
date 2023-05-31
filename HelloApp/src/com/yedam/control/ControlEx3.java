package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		int month = 4;
//		// 월별로 필요한 정보 : 1)월 2) 1일의 시작 위치 3) 마지막날의 값
		String title = "===" + month + "===";
		System.out.println(title);
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("=============================");
		for (int i = 0; i < getFirstDate(month); i++) {
			System.out.printf("%3s ", "");
		}
		for (int day = 1; day <= getLastDate(month); day++) {
			System.out.printf("%3d ", day);
			if ((getFirstDate(month) + day) % 7 == 0) {
				System.out.println();
			}
		}
	}

	// 4,5,6월 달력. switch ~ case 구문
	public static int getFirstDate(int month) {
		int result = 0;
		switch (month) {
		case 4:
			result = 6;
			break;
		case 5:
			result = 1;
			break;
		case 6:
			result = 4;
			break;
		default:
			result = 0;
		}
		return result;
	}

	// 4,5,6월 달력. switch ~ case 구문
	public static int getLastDate(int month) {
		int result = 0;
		switch (month) {
		case 4:
			result = 30;break;
		case 5:
			result = 31;break;
		case 6:
			result = 30;break;
		default : result = 31;
		}
		return result;
	}

//	public static void method2() {
//		for (int num = 1; num <= 9; num++) {
//			for (int num2 = 2; num2 <= 5; num2++) {
//				int num1 = num2;
//				System.out.printf("%2d * %2d = %2d ", num1, num, (num1 * num));
//			}
//			System.out.println();
//		}
//
//	}
//
//	public static void method1() {
//		// 반복문 : for, while, do ~ while
//		for (int i = 0; i < 10; i += 2) {
//			if (i % 2 == 1)
//				System.out.printf("i의 값은 %d \n", i);
////		else
////			System.out.println("짝수입니다.");
//		}
//	}
}
