package com.yedam.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		// 학교의 학생 키. a반(2), b반(4), c반(3).
		double[][] heightAry = { { 173.5, 168.3 }, // a
				{ 176.5, 158.3, 190.2, 188.7 }, // b
				{ 162.5, 167.3, 187.1 }// c
		};
		System.out.println(heightAry[1].length);

		// 각 반 별로 키의 평균 => 1번째 반의 평균키:...
		// 각 반 별로 키의 평균 => 2번째 반의 평균키:...
		// 각 반 별로 키의 평균 => 3번째 반의 평균키:...

		for (int j = 0; j < heightAry.length; j++) {
			double heightSum = 0;
			for (int i = 0; i < heightAry[j].length; i++) {
				heightSum += heightAry[j][i];
			}
			String fmt = "%d번째 반의 평균 키는 : %.1f \n";
			System.out.printf(fmt, j+1, ( heightSum / heightAry[j].length ));
		}

	}
}
