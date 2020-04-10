package com.jse.card;

import java.util.Arrays;

public class CardcService {
	private Card[] cards;
	private int i;
	
	
	public CardcService() {
		cards = new Card[3];
		i = 0;
	} 
	
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public Card[] getCards() {
		return cards;
	}
	
	public void add(Card card) {
		cards[i]=card;
		
		i++;
			
	}
	
	public String printCard() {
		String result = "";
		
		return result;
	}

	@Override
	public String toString() {
		return "CardcService [cards=" + Arrays.toString(cards) + ", i=" + i + "]";
	}
	
	

}
