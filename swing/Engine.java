package com.jse.swing;

import java.util.Scanner;
import com.jse.swing.Grade;

public class Engine {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Grade grade = null;
		
		while (true) {
			System.out.println("숫자를 입력하자");
			System.out.println("0. 종료"+" 1. 성적표"+" 2. 프로그램 실행");
			

			switch (scan.nextInt()) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				System.out.println("1번 프로그램 시작");
				grade = new Grade();
				
				// 이름
				System.out.println("이름을 적어주세요.");
				String name = scan.next();
				
				// 국어
				System.out.println("국어점수");
				double korean = scan.nextDouble();
				
				//영어
				System.out.println("영어점수");
				double english = scan.nextDouble();
				
				//수학
				System.out.println("수학점수");
				double math = scan.nextDouble();
				
				grade.setSum(korean, english, math);
				
				// 결과 값
				System.out.println("이름 :"+ name +" 총점 : "+ (int)grade.getSum() + " 평균 : "+ (int)grade.average()+ " 학점 : "+ grade.averageResult2());
				break;
				
			case 2:
				System.out.println("2번 프로그램 시작");
				break;

			default:
				break;
			}

		}

	}
}
