package com.jse.phone;

public class PhoneService {
	private Phone[] phones;
	private int count;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;

	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;

	}

	public Iphone[] getIphones() {
		return iphones;
	}

	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}

	public GalaxyNote[] getGalaxyNote() {
		return galaxyNotes;
	}

	public void setGalaxyNote(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
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

	public void add(CelPhone celPhone) {
		celPhones[count] = celPhone;

		count++;
	}
	public void add(GalaxyNote galaxyNote) {
		galaxyNotes[count] = galaxyNote;
		
		count++;
	}
	public void add(Iphone iphone) {
		iphones[count] =  iphone;
		
		count++;
	}

}
