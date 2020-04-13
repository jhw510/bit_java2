package com.jse.member;

public class GenderCheckerServiceImpl implements GenderCheckerService {

	private GenderChecker[] ssns;
	private int count;
	
	public GenderCheckerServiceImpl() {
		ssns = new GenderChecker[3];
		count = 0;
	}
	
	@Override
	public void setSsn(GenderChecker[] ssns) {
		this.ssns = ssns;
	}

	@Override
	public GenderChecker[] getSsn() {
		return ssns;
	}
	
	@Override
	public void setCount(int count) {
		this.count = count;
		
	}
	
	@Override
	public int getCount() {
		return 0;
	}
	
	@Override
	public void add(GenderChecker ssn) {
		ssns[count] = ssn;
		count++;
	}

	@Override
	public String genderChecker(GenderChecker ssn) {
		String gender = "잘못 입력한 값";
		char ch = ssn.getSsn().charAt(7);
		switch (ch) {
		case '1': case '3': gender = "남성";
			break;
		case '2': case '4': gender = "여성";
			break;
		case '5': case '6': gender = "외국인";
			break;
		}
		return gender ;
	}

	@Override
	public String printSsn() {
		String msg = "";
		for(int i = 0 ; i < 3 ; i++) {
			msg += String.format("성별 : %s\n", genderChecker(ssns[i]));
		}
		return msg;
	}
}
