package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		// 기본입력. 입력값이 대문자, 소문자, 숫자=> 출력.
		// q가 113 => 종료.
		String msg = "";
		int result = 0;
		while (true) {
//			if (result == 13 || result == 10) {
//				try {
//					result = System.in.read();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				continue;
//			}
			System.out.println("값을 입력하세요.");
			try {
				result = System.in.read();
				//System.out.println(result);
				if (result == 113) {
					break;
				}
				if (result >= 97 && result <= 122) {
					msg = "소문자입니다.";
				} else if (result >= 65 && result <= 90) {
					msg = "대문자입니다.";
				} else if (result >= 48 && result <= 57) {
					msg = "숫자입니다.";
				} else {
					msg = "기타값입니다.";
				}
				//13,10을 소진하기 위해서 System.in.read() 2번 실시
				System.in.read();
				System.in.read();
				
				System.out.println(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
		System.out.println("끝.");

	}
}
