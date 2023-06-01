package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int[] intAry = new int[6];
		intAry[0] = (int) (Math.random() * 100);
		intAry[1] = (int) (Math.random() * 100);
		intAry[2] = (int) (Math.random() * 100);
		intAry[3] = (int) (Math.random() * 100);
		intAry[4] = (int) (Math.random() * 100);
		intAry[5] = (int) (Math.random() * 100);
		
			for (int j = 0; j < intAry.length - 1; j++) {
				for (int i = 0; i < intAry.length - 1; i++) {
					// i = 0: 3 <-> 7, i = 1: i = 2:
					int temp = 0;
					if (intAry[i] < intAry[i + 1]) {
						temp = intAry[i];
						intAry[i] = intAry[i + 1];
						intAry[i + 1] = temp;
					}
				}
			}
		for (int num : intAry)
			System.out.println(num);
	}

	public static void method1() {
		int[] intAry = new int[3];

		int a = (int) (Math.random() * 100); // (int)(Math.random()*100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);

		
		for(int j=0; j<intAry.length-1;j++) {
			for(int i=0; i<intAry.length-1;i++) {
				int temp =0;
				if(intAry[i]<intAry[i+1]) {
					temp=intAry[i];
					
				}
			}
		}
		// 제일 큰 수 intAry 의 첫번째 : 제일 큰 값...제일 작은 값.
		// intAry[0]= 85, intAry[1] = 34,...
//
//		if (a > b) {
//			if (a > c) {
//				intAry[0] = a;
//				if (b > c) {
//					intAry[1] = b;
//					intAry[2] = c;
//				} else {
//					intAry[1] = c;
//					intAry[2] = b;
//				}
//			} else {
//				intAry[0]=c;
//				intAry[1]=a;
//				intAry[2]=b;
//			}
//		} else {
//			if (b > c) {
//				intAry[0]=b;
//				if (a > c) {
//					intAry[1]=a;
//					intAry[2]=c;
//				} else {
//					intAry[1]=c;
//					intAry[2]=a;
//				}
//			} else {
//				intAry[0]=c;
//				intAry[1]=b;
//				intAry[2]=a;
//			}
//		}
		for (int num : intAry)
			System.out.println(num);
	}
}
