package com.dev.emp;


class World{ //public은 한 클래스에 하나만.
	
}

public class Hello {
	private String name;
	int age;
	public double height;
	
	void setName(String name) {
		this.name = name; // 클래스 범위 안에서 접근 가능.
	}
}
