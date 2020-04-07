package com.jse.swing;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.jse.swing.MemberBean;
import com.sun.javafx.geom.AreaOp.AddOp;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Engine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		GradeService gradeService =new GradeService();
		
		MemberService memberService = new MemberService();
		
		
		

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

				for (int i = 0; i < 3; i++) {
					System.out.println("이름, 국어, 영어, 수학, 입력");	
					gradeService.add(new GradeBean(scan.next(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble()));
					
				}
				
				
				break;

			case 2:
				System.out.println("성적 출력");
				GradeBean[] grades = gradeService.getGrades();

				for (int i = 0; i < grades.length; i++) {
					System.out.println("이름 : " + grades[i].getName() + " 국어 :" + grades[i].korean + " 영어 : " + grades[i].english
							+ " 수학 :" + grades[i].math + " 합계 :" + grades[i].getSum() + " 평균 :" + grades[i].average() + " 학점 : "
							+ grades[i].averageResult2());
				}

				break;

			case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");

				break;

			case 4:
				
				for (int i = 0; i < 3; i++) {
					System.out.println("아이디, 비밀번호, 이름, 나이 를 입력하세요.");
					memberService.add(new MemberBean(scan.next(), scan.next(),scan.next(), scan.nextInt()));
				}
				

				break;

			case 5:
				MemberBean[] members = memberService.getMembers();
				for (int i = 0; i < 3; i++) {
					System.out.println(members[i].getUserid() + members[i].getPassward()+members[i].getName()+members[i].getAge());
				}


				break;
			case 6:
				int[] rank = new int[3];


	

				System.out.println("1위 :" + rank[0] + " 2위  :" + rank[1] + " 3위 :" + rank[2]);

				break;
				

			case 7:
				
				
				break;

			default:
				break;
			}

		}

	}

	static GradeBean Input(Scanner scanner) {
		System.out.println("이름, 국어, 영어, 수학, 입력");

		return new GradeBean(scanner.next(),
				scanner.nextDouble(), 
				scanner.nextDouble(),
				scanner.nextDouble());
	}

//	static MemberBean meberPrivacy(Scanner scanner) {
//		MemberBean member = new MemberBean();
//		System.out.println("아이디 : ");
//		member.setUserid(scanner.next());
//		System.out.println("비밀번호 : ");
//		member.setPassward(scanner.next());
//		System.out.println("이름 : ");
//		member.setName(scanner.next());
//		System.out.println("나이 :");
//		member.setAge(scanner.nextInt());
//
//		return member;
//
//	}

}
