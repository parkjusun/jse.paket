package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();
		String message = "";

		while (true) {

			switch (JOptionPane.showInputDialog("프로그램을 시작합니다." + "0.종료" + "1.집전화 입력" + "2.집전화 출력" + "3.휴대전화 입력" + "4.휴대전화 출력"+ "5. 검색입력" + "6.검색출력")) {
			case "0":

				return;
			case "1":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, 이름, 회사").split(",");

					phoneService.add(new Phone(values[0], values[1], values[2]), i);
				}
				break;

			case "2":
				System.out.println("저장된 목록보기.");

				Phone[] phone = phoneService.getPhones();// 폰서비스에서 결과값을 가져와 폰에다가 넣어둔다.
				for (int j = 0; j < 3; j++) {
					System.out.println(message += String.format("출력 : %s, %s, %s \n", phone[j].getPhoneNumber(),
							phone[j].getCompany(), phone[j].getCompany()));
				}

				JOptionPane.showMessageDialog(null, message);
				break;

			case "3":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, 이름, 회사, 휴대여부").split(",");

					phoneService.addCelPhone(new Cellphone(values[0], values[1], values[2], true), i);
				}

				break;
			case "4":

				Cellphone[] cellphones = phoneService.getCelPhones();
				for (int i = 0; i < 3; i++) {
					message += String.format("출력 : %s %s %s %s \n", cellphones[i].getPhoneNumber(),
							cellphones[i].getName(), cellphones[i].getCompany(), cellphones[i].getMove());
				}

				JOptionPane.showMessageDialog(null, message);

				break;

			case "5":
								
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, 이름, 회사, 휴대여부, 검색").split(",");
					phoneService.addIphone(new Iphone(values[0], values[1], values[2], true, values[3]),i);
				}

				break;
				
			case "6":
				Iphone[] iphones = phoneService.getIphones();
				for (int i = 0; i < 3; i++) {
					message += String.format("검색 : %s \n",iphones[i].getSearch());
					
				}
				
				JOptionPane.showMessageDialog(null, message);

				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] value = JOptionPane.showInputDialog("전화번호, 이름, 회사,휴대여부, 검색, 사이즈 ").split(",");
					phoneService.addGalayNote(new GalaxyNote(value[0], value[1], value[2], true, value[3], value[4]), i);
				}
				
			case "8":
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNotes();
				for (int i = 0; i < 3; i++) {
					message += String.format("사이즈 : %s \n", galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);

				break;

			default:
				break;
			}

		}

	}
}
