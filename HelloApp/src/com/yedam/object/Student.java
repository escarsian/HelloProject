package com.yedam.object;

public class Student {
 private String stuName;
 private String stuNum;
 private String stuSex;
 private int stuGrade;
 public Student(String stuName, String stuNum, String stuSex, int stuGrade) {
	 this.stuName = stuName;
	 this.stuNum = stuNum;
	 this.stuSex = stuSex;
	 this.stuGrade = stuGrade;
 }
 
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public void setStuNum(String stuNum) {
	this.stuNum = stuNum;
}
public void setStuSex(String stuSex) {
	this.stuSex = stuSex;
}
public void setStuGrade(int stuGrade) {
	this.stuGrade = stuGrade;
}
public String getStuName() {
	return stuName;
}
public String getStuNum() {
	return stuNum;
}
public String getStuSex() {
	return stuSex;
}
public int getStuGrade() {
	return stuGrade;
}

public void showInfo() {
	System.out.printf("이름 %s, 학번 %s, 점수 %d \n", stuName, stuNum, stuGrade);
}
}
