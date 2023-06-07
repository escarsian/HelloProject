package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	// 학생정보관리 app.
	// 1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6. 종료
	// 학생 정보 : 학생 번호(23-001))/이름/성별(남, 여)/점수
	static Student[] infos = new Student[5];
	static Scanner scn = new Scanner(System.in);

	// 1.register() 2.list() 3.search 4.modify() 5.remove()
	// 남- 1명, 여 - 2명, 최고점수 : 이름 - 100점
	public static void initStudent() {
		infos[0] = new Student("홍길동", "11-1", "남", 100);
		infos[1] = new Student("김길동", "11-2", "남", 80);
		infos[2] = new Student("박길동", "11-3", "여", 90);
		infos[3] = new Student("최길동", "12-1", "여", 95);
	}
	
	public static void main(String[] args) {

		boolean run = true;
		initStudent();
		
		while (run) {
			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6. 종료");
			System.out.println("숫자를 입력하세요.");
			int num = Integer.parseInt(scn.nextLine());

			if (num == 1) {
				registerStudent();
			}else if (num == 2) {
				listStudent();
			} else if (num == 3) {
				searchStudent();
			} else if (num == 4) {
				modifyStudent();
			} else if (num == 5) {
				removeStudent();
			} else if (num == 6) {
				System.out.println("종료.");
				run = false;
			}
		}
		System.out.println("end of prog.");
	}
	
	public static void registerStudent() {
		System.out.println("학생 이름 입력> ");
		String stuName = scn.nextLine();

		System.out.println("학생 번호 입력> ");
		String stuNum = scn.nextLine();

		System.out.println("학생 성별 입력> ");
		String stuSex = scn.nextLine();

		System.out.println("학생 점수 입력> ");
		int stuGrade = Integer.parseInt(scn.nextLine());
		
		Student newOne = new Student(stuName, stuNum, stuSex, stuGrade);
		

		for (int i = 0; i < infos.length; i++) {
			if (infos[i] == null) {
				infos[i] = newOne;
				break;
			} else {
				continue;
			}
		}
	}
	public static void listStudent() {
		boolean isExist = false;
		int mCnt = 0; int wCnt = 0; int mScore = 0;
		String mName = "";
		for (Student std : infos) {
			if(std != null) {
				std.showInfo();
				isExist = true;
				if(std.getStuSex().equals("남"))
					mCnt++;
				else
					wCnt++;
				if (mScore < std.getStuGrade()) {
					mScore = std.getStuGrade();
					mName = std.getStuName();
				}
			}else {
				System.out.println("null");
			}
		}
		if(isExist) {
			System.out.println("-------------------------------");
			System.out.printf("남-%d, 여-%d, 최고점수 : %s - %d점\n", mCnt, wCnt, mName, mScore);
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
	}//end of list()

	public static void searchStudent() {
		System.out.println("학생 번호 입력> ");
		String stuNum = scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < infos.length; i++) {
			if (infos[i] != null) {
				if (infos[i].getStuNum().equals(stuNum)) {
					System.out.printf("학생 이름은 %s, 학생 번호는 %s, 학생 성별은 %s, 학생 점수는 %d", infos[i].getStuName(),
							infos[i].getStuNum(), infos[i].getStuSex(), infos[i].getStuGrade());
				}
				isExist = true;
				break;
			}
		}
	}

	public static void modifyStudent() {
		System.out.println("학생 번호 입력> ");
		String stuNum= scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < infos.length; i++) {
			if (infos[i] != null) {
				if (infos[i].getStuNum().equals(stuNum)) {
					System.out.println("수정할 점수를 입력> ");
					int score = Integer.parseInt(scn.nextLine());
					infos[i].setStuGrade(score);
					System.out.printf("바뀐 점수는 %d.", score);
					isExist = true;
					break;
				}
			}
		}
//		if (!isExist) {
//			System.out.printf("%s 학생 번호가 존재하지 않습니다.", );
//			return;
//		}
	}

	public static void removeStudent() {
		System.out.println("삭제할 학생 번호");
		String student = scn.nextLine();
		for (int i = 0; i < student.length(); i++) {
			if (infos[i] != null && infos[i].getStuNum().equals(student))
				infos[i] = null;
			System.out.println("정상적으로 삭제됨.");
			break;
		}
	}

	

}
