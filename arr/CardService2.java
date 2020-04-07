package com.jse.arr;

public class CardService2 {
	private CardBean[][] cardBox;
	public CardService2() {
		cardBox = new CardBean[52][10];
	}
	public void setCardBox(CardBean[][] cardBox) {
		this.cardBox = cardBox;
	}
	public CardBean[][] cardBox() {
		return cardBox;
	}
}
