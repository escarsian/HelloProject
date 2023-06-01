package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[2];

		// 등록.
		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디를 입력> ");
			m1.memberId = scn.nextLine();
			System.out.print("이름을 입력> ");
			m1.memberName = scn.nextLine();
			System.out.print("point를 입력> ");
			m1.point = Integer.parseInt(scn.nextLine());

			members[i] = m1;

		}

		// memberId 조회 후 point를 변경.
		System.out.println("조회할 아이디를 입력.");
		String searchId = scn.nextLine();
		System.out.println("변경할 point를 입력.");
		int newPoint = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.length; i++) {
			if (members[i].memberId.equals(searchId)) {
				members[i].point = newPoint;
//				System.out.println("변경된 값 : "+ members[i].point);
			}
		}

		// 출력.
		for (int i = 0; i < members.length; i++) {
			System.out.printf("아이디 : %s, 이름은 %s, point : %d \n", members[i].memberId, //
					members[i].memberName, //
					members[i].point);// int 타입은 초기값 0

		}
		scn.close();

	}
}
