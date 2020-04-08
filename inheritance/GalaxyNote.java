package com.jse.inheritance;

public class GalaxyNote extends Iphone {
	private String bigsize;

	public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search, String bigsize) {
		super(phoneNumber, name, company, portable,search);

	}

	public String getBigsize() {
		return bigsize;
	}

	public void setBigsize(String bigsize) {
		this.bigsize = bigsize;
	}

}
