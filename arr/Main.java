package com.jse.arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService cardServic = new CardService();

		while (true) {
			System.out.println("0.프로그램 종료" + " 1.카드 3장 받기"+ " 2.출력");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("프로그램 종료");
				return;
				
			case 1:
				System.out.println("카드 3장 받기  모양, 숫자");
				for (int i = 0; i < 3; i++) {
					cardServic.add(new CardBean(scanner.next(),scanner.nextInt()));	
				}

				break;
				
			case 2:
				CardBean[] cards = cardServic.getCards();
				for (int i = 0; i < 3; i++) {
					System.out.println(String.format("카드모양 %s 카드넘버 %d", cards[i].getKind(),cards[i].getNumber()) );
				}

				break;

			default:
				break;
			}

		}
	}
}
