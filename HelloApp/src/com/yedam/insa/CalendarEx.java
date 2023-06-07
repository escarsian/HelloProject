package com.yedam.insa;

import java.util.Calendar;
import java.util.Scanner;

//set(), cal()

public final class CalendarEx {
	static final int year = 2023;// 년도 정보를 지정할 필드.
	static final int month= 5;// 월 정보를 지정할 필드.

	//static 메소드.
	static void set(int year, int month) {
//		CalendarEx.year = year;
//		CalendarEx.month = month - 1; //사용자의 입력값과 실제 월 정보 맞춰줌.
	}

	static void cal() {
		//년도, 월 : 정해짐.
		//말일, 첫날의 위치.
		//월별로 필요한 정보 : 1)월 2)1일의 시작위치 3)마지막날의 값
	Calendar cal = Calendar.getInstance();
	cal.set(CalendarEx.year, CalendarEx.month, 1);
	
	int firstDate = cal.get(Calendar.DAY_OF_WEEK) -1 ;
	int lastDate = cal.getActualMaximum(Calendar.DATE);
	
	String title = "===" + year + "년 "+(month + 1)+"월 "+ "===";
	System.out.println(title);
	String days = "Sun Mon Tue Wed Thr Fri Sat";
	System.out.println(days);
	System.out.println("=============================");
	
	//1일 위치를 정해주기 위해 빈공란을 출력
	for (int i = 0; i < firstDate; i++) {
		System.out.printf("%3s ", "");
	}
	//월의 마지막 날짜만큼 반복 출력.
	for (int day = 1; day <= lastDate; day++) {
		System.out.printf("%3d ", day);
		//줄 바꿈 처리.
		if ((firstDate + day) % 7 == 0) {
			System.out.println();
		}
	}
	}
}
