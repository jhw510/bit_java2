package com.jse.member;

public class KaupServiceImpl implements KaupService {
	private Kaup[] kaups;
	private int count;

	@Override
	public void setKaups(Kaup[] kaups) {
		this.kaups = kaups;
	}

	@Override
	public Kaup[] getKaups() {
		return kaups;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int getCount() {
		return count;
	}

	public double addKaupHeight(double kaupHeight) {
		return kaupHeight/100;
	}
	
	@Override
	public String calculate(Kaup kaup) {
		double kaupIndex = kaup.getKaupWeight() / (kaup.getKaupHeight() * kaup.getKaupHeight());
		String result = "";
		if (kaupIndex < 18.5 ) {
			result = "저체중";
		} else if (kaupIndex < 23.0) {
			result = "정상체중";
		} else if (kaupIndex < 25.0) {
			result = "과체중";
		} else if (kaupIndex < 30.0) {
			result = "위험1단계";
		} else if (kaupIndex < 40.0) {
			result = "위험2단계";
		} else {
			result = "위험3단계";
		}

		return result;
	}

	@Override
	public String printKaup() {
		String msg = "";
		for(int i = 0; i < 3 ; i++) {
			msg += calculate(kaups[i]) + "\n";
		}
		return msg;
	}

	@Override
	public void add(Kaup kaup) {
		kaups[count] = kaup;
		count ++;
		
	}


}