package com.dev;

//import com.dev.emp.Hello;

//import com.dev.Hello;

public class HelloEx {
	public static void main(String[] args) {
		//동일한 패키지 클래스.
//		com.dev.Hello hello = new com.dev.Hello(); //com.dev패키지에 있는 Hello
		
		com.dev.emp.Hello hello1 = new com.dev.emp.Hello();//com.dev.emp 패키지에 있는 Hello
		hello1.name = "Hong"; // 클래스 내에서만 접근 가능. 
		hello1.age = 20; // 동일한 패키지 내에서 접근 가능.
		hello1.height = 168.6; // 다른 패키지에서도 접근 가능.
		

		World world = new world();  
	}
}
