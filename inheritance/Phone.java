package com.jse.inheritance;

public class Phone {
	private String phoneNumber;
	private String name;
	private String company;

	public Phone(String phoneNumber, String name, String company) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.company = company;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}
}
