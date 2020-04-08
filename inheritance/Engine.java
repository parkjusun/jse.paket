package com.jse.inheritance;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();

		while (true) {

			System.out.println("프로그램을 시작합니다." + "0.종료" + "1.시작"+ "2.전화번호입력"+ "3.전화번호 불러오기");

			switch (scanner.nextInt()) {
			case 0:
				System.out.println("프로그램 종료");

				return;
			case 1:
				for (int i = 0; i < 3; i++) {
					System.out.println("전화번호, 이름, 회사");
					phoneService.add(new Phone(scanner.next(), scanner.next(), scanner.next()),i);
				}
				break;

			case 2:
				System.out.println("저장된 목록보기.");
				
				Phone[] phone = phoneService.getPhones();// 폰서비스에서 결과값을 가져와 폰에다가 넣어둔다.
				for (int j = 0; j < 3; j++) {
					System.out.println("출력:"+phone[j].getName()+phone[j].getPhoneNumber()+phone[j].getCompany());
				}
				break;

			default:
				break;
			}

		}

	}
}
