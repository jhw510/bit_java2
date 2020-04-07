package com.jse.arr;

public class CardService {
	private CardBean[] cards;
	public CardService() {
		cards = new CardBean[3];
	}
	public void setCards(CardBean[] cards) {
		this.cards=cards;
		}
	public CardBean[] getCards() {
		return cards;
	}
}
