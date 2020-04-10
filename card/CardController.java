package com.jse.card;

import java.util.Scanner;
import javax.swing.*;

import javax.swing.JOptionPane;

import com.jse.utill.Constants;

public class CardController {
	public static void main(String[] args) {
		String buttonName = null;
		JFrame frame = new JFrame("");
		JButton b = new JButton(buttonName);
		
		
		
		
		CardcService cardServic = new CardcService();
		Card card = null;

		while (true) {
		
			switch (JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0":
				return;
				
			case "1":
				String value[] = JOptionPane.showInputDialog(Constants.CARDS).split(",");
				card = new Card();
				card.setKind(value[0]);
				card.setNumber(Integer.parseInt(value[1]));
				

				break;
				
			case "2":
				Card[] cards = cardServic.getCards();
				for (int i = 0; i < 3; i++) {
					System.out.println(cards[i].toString());
				}

				break;
				

			default:
				break;
			}

		}
	}
}
