package com.jse.card;
//import java.util.Scanner;
public class Card {
	private String kind;
	private int number;
	
	public Card(String kind,int number) {
		this.kind=kind;
		this.number=number;    
	}
	public void setKind(String kind) {
		this.kind=kind;
		}
public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	
}
