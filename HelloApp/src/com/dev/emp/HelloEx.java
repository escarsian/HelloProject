package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {// 매개값을 문자열 배열 타입으로 받겠다.
		
		for(String str : args) {
			System.out.println(str);
		}
		
		Hello hello = new Hello();
//		hello.name = "Hong"; //private. 이라서 접근 불가.
		hello.age = 20; // default. 동일한 패캐지 내에서는 접근 가능.
		hello.height = 179.0; // default. 동일한 패캐지 내에서는 접근 가능.
		
		World world = new World(); //동일한 패키지 접근 가능.
		
		System.out.println("end of prog.");
	}
}
