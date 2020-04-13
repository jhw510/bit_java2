package com.jse.member;

public interface KaupService {
	public void setKaups(Kaup[] kaups);
	public Kaup[] getKaups();
	public void setCount(int count);
	public int getCount();
	public void add(Kaup kaup);
	public double addKaupHeight(double height);
	public String calculate(Kaup kaup);
	public String printKaup();
}