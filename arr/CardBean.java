package com.jse.arr;
//import java.util.Scanner;
public class CardBean {
	private String kind;
	private int number;
	
	public CardBean(String kind,int number) {
		this.kind=kind;
		this.number=number;
	}
	public void setKind(String kind) {
		this.kind=kind;
	
	}

	public String getkind() {
		return kind;
	}
	public void getNumber(int number) {
		
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	
}
