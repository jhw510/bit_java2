package com.jse.member;

public interface GenderCheckerService {
	public void setSsn(GenderChecker[] ssns);
	public GenderChecker[] getSsn();
	public void setCount(int count);
	public int getCount();
	public void add(GenderChecker ssn);
	public String genderChecker(GenderChecker ssn);
	public String printSsn();
}