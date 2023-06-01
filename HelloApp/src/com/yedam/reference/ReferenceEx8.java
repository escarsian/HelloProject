package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생 수 => 점수 입력. 점수 출력, 최고 점수, 평균 점수.

		Scanner scn = new Scanner(System.in);
		int student = 0;// 학생 수 지정.
		int[] scores = null;// scores = new int[ ];
		boolean run = true;

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.학생 수 2.점수 입력 3.점수 리스트 4.분석(최고, 평균) 5.종료 ");
			System.out.println("----------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) { // 학생수
				System.out.print("학생 수> ");
				student = Integer.parseInt(scn.nextLine());
				scores = new int[student];

			} else if (selectNo == 2) {// 배열의 크기만큼 학생의 점수.
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> \n", i);
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) {// 배열의 점수 출력.
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d \n", i, scores[i]);
				}
			} else if (selectNo == 4) {// 분석:최고, 평균.
				int maxVal = 0;
				int avgVal = 0;
				int sum = 0;
				for (int score : scores) {
					if (maxVal < score) {
						maxVal = score;
					}
					sum += score;
				}
				avgVal = sum/scores.length;
				System.out.printf("최고 점수 %d \n", maxVal);
				System.out.printf("평균 점수 %d \n", avgVal);
			} else if (selectNo == 5) {// 종료 : 프로그램 종료.
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

		System.out.println("end of prog.");
	}// end of main().
}
