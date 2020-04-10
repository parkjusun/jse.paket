package com.jse.member;

import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	
	static void find(){
		
		//시나리오
		String result = null;
		System.out.println("주민번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String ssn = scan.next();
		
		if (ssn.length() <=7) {
			result = "잘못입력한 값(숫자 적음)";
		}else {
			char ch = ssn.charAt(7);

			//String ="";
			//Char ='';
			//case '1'
			
			switch (ch) {
			case '1': case '3':
				result = "남성";//1,3
				break;
			case '2': case '4':
				result = "여성";//2.41
			case '5': case '6':
				result = "외국인";//5,6
				break;
				
			default:
				result = "잘못입력한 값";//0,7,8,9
				break;
			}
			
		}
		System.out.println(result);

	}
}
