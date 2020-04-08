package com.jse.inheritance;



public class PhoneService {
private Phone[] phones;
private int count;

public PhoneService() {
	phones = new Phone[3];
		count = 0;	
}
	public void SetPhones(Phone[]phones) {
		this.phones=phones;
	}
	public  Phone[] getPhones() {
		return phones;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(Phone phone) {
		phones[count] = phone;
		
		count++;
	}
}
