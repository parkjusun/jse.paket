package com.jse.swing;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.jse.swing.Grade;

import com.jse.swing.MemberBean;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Engine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Grade grade = null;
		MemberBean member = new MemberBean();

		Grade[] grades = new Grade[3];
		MemberBean[] members = new MemberBean[3];

		while (true) {
			System.out.println("숫자를 입력하자");
			System.out.println(
					"0. 종료" + " 1. 성적표입력" + " 2. 성적출력" + " 3. 총점별 이름 나열" + "4. 회원등록" + "5. 회원확인" + "6. 회원 나이순");

			switch (scan.nextInt()) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				System.out.println("성적입력 시작");

				for (int i = 0; i < 2; i++) {
					grades[i] = Input(scan);
				}

				break;

			case 2:
				System.out.println("성적 출력");

				for (int i = 0; i < grades.length; i++) {
					grade = grades[i];
					System.out.println("이름 : " + grade.getName() + " 국어 :" + grade.korean + " 영어 : " + grade.english
							+ " 수학 :" + grade.math + " 합계 :" + grade.getSum() + " 평균 :" + grade.average() + " 학점 : "
							+ grade.averageResult2());
				}

				break;

			case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");

				break;

			case 4:

				for (int i = 0; i < members.length; i++) {
					members[i] = meberPrivacy(scan);
				}

				break;

			case 5:
				for (int i = 0; i < members.length; i++) {
					System.out.println("나이 : " + members[i].getUserid() + " 비밀번호: " + members[i].getName() + " 이름: "
							+ members[i].getPassward() + " 나이: " + members[i].getAge());
				}

				break;
			case 6:
				int[] rank = new int[3];

				for (int i = 0; i < members.length; i++) {

					if (rank[0] < members[i].getAge()) {

						rank[0] = members[i].getAge();

					} else if (rank[1] < members[i].getAge()) {

						rank[1] = members[i].getAge();

					} else {

						rank[2 + 1] = members[i].getAge();
					}
				}

				System.out.println("1위 :" + rank[0] + " 2위  :" + rank[1] + " 3위 :" + rank[2]);

				break;

			case 7:
				
				
				break;

			default:
				break;
			}

		}

	}

	static Grade Input(Scanner scanner) {
		System.out.println("이름, 국어, 영어, 수학, 입력");

		return new Grade(scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
	}

	static MemberBean meberPrivacy(Scanner scanner) {
		MemberBean member = new MemberBean();
		System.out.println("아이디 : ");
		member.setUserid(scanner.next());
		System.out.println("비밀번호 : ");
		member.setPassward(scanner.next());
		System.out.println("이름 : ");
		member.setName(scanner.next());
		System.out.println("나이 :");
		member.setAge(scanner.nextInt());

		return member;

	}

}
