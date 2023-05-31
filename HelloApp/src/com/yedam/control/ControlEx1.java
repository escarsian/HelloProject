package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		//0 ~ 1 사이의 임의의 수를 생성.
		//ex)3.121231=>3
		// 0 ~ 9 => 1 ~ 10
//		int result = (int) (Math.random() * 10) + 1; // 
//		System.out.println(result);
//		if(result%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
//		
		//Math.random을 활용해서 10~100까지의 임의의 수.
		// 생성된 값이 100~90 A출력
		//80~89: B 70~79: C, 그외는 D 출력.
		while (true) {
			int result1 = (int) (Math.random()*91)+10;
			System.out.println(result1);
			if(result1 ==100) {
				break;
			}
		}
		int result1 = (int) (Math.random()*91)+10;
		String grade = "";
		System.out.println(result1);
		if(result1>=90) {
			grade= "A";
		}else if(result1>=80){
			grade= "B";
		}else if(result1>=70) {
			grade= "C";
		}else {
			grade= "D";
		}
		System.out.printf("점수 %d는 %s등급입니다.",result1, grade);
	}
}
