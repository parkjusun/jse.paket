package com.jse.phone;

import java.util.Scanner;
import javax.swing.JOptionPane;
import com.jse.utill.Constants;

public class PhoneController {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();
		String message = "";

		while (true) {

			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":

				return;
			case "1":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");

					phoneService.add(new Phone(values[0], values[1], values[2]), i);
				}
				break;

			case "2":
				Phone[] phone = phoneService.getPhones();// 폰서비스에서 결과값을 가져와 폰에다가 넣어둔다.
				for (int j = 0; j < 3; j++) {
					message += phone[j].toString()+"\n";
				}

				JOptionPane.showMessageDialog(null, message);
				break;

			case "3":

				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");

					phoneService.addCelPhone(new Cellphone(values[0], values[1], values[2], true), i);
				}

				break;
			case "4":

				Cellphone[] cellphones = phoneService.getCelPhones();
				for (int i = 0; i < 3; i++) {
					message += cellphones[i].toString()+"\n";
				}

				JOptionPane.showMessageDialog(null, message);

				break;

			case "5":
								
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					phoneService.addIphone(new Iphone(values[0], values[1], values[2], true, values[3]),i);
				}

				break;
				
			case "6":
				Iphone[] iphones = phoneService.getIphones();
				for (int i = 0; i < 3; i++) {
					message += iphones[i].toString()+"\n";
					
				}
				
				JOptionPane.showMessageDialog(null, message);

				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] value = JOptionPane.showInputDialog(Constants.GALAYNOTE).split(",");
					phoneService.addGalayNote(new GalaxyNote(value[0], value[1], value[2], true, value[3], value[4]), i);
				}
				
			case "8":
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNotes();
				for (int i = 0; i < 3; i++) {
					message += galaxyNotes[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);

				break;

			default:
				break;
			}

		}

	}
	
}
