package com.jse.card;

public interface CardService {
	public void add(Card card);
	public Card[] list();
	public Card detail();
	public int count ();
	
	//public String ranking();
	
	public void update(Card card);
	public void delete(Card card);
}
