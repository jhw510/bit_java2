package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private int count;
	private CelPhone[] celPhones;

	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		count = 0;
	}

	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}

	public void SetPhones(Phone[] phones) {
		this.phones = phones;
	}

	public Phone[] getPhones() {
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
	public void addCelPhone(CelPhone celPhone) {
		celPhones[count] = celPhone;

		count++;
	}
}
