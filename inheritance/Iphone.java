package com.jse.inheritance;

public class Iphone extends CelPhone {


	private String search;

	public Iphone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company, portable);
		
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	
}
