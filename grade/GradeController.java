package com.jse.grade;

import java.util.Scanner;

import javax.print.attribute.standard.Severity;
import javax.swing.JOptionPane;

import com.jse.member.MemberBean;
import com.jse.member.MemberServiceImp;
import com.jse.utill.Constants;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.javafx.geom.AreaOp.AddOp;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class GradeController {

	public static void main(String[] args) {

		GradeService gradeService = new GradeServiceImpl();

		MemberServiceImp memberService = new MemberServiceImp();
		Grade grade = null;

		while (true) {
			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				System.out.println(Constants.END);
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADES).split(",");
					grade = new Grade();

					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);

				}

				break;

			case "2":

				break;

			case "3":
				JOptionPane.showMessageDialog(null, gradeService.ranking());

				break;

			case "4":

				for (int i = 0; i < 3; i++) {
					System.out.println(Constants.MEMBER_MENU);
//					memberService.add(new MemberBean(scan.next(), scan.next(), scan.next(), scan.nextInt()));
				}

				break;

			case "5":
				MemberBean[] members = memberService.getMembers();
				for (int i = 0; i < 3; i++) {
					System.out.println(members[i].toString());
				}

				break;
			case "6":
				int[] rank = new int[3];

				break;

			case "7":

				break;

			default:
				break;
			}

		}

	}

//	static Grade Input(Scanner scanner) {
//		System.out.println("이름, 국어, 영어, 수학, 입력");
//
////		return new Grade(scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
//	}

}
