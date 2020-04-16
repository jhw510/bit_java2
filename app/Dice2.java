package com.jse.app;
import java.util.Random;
import java.util.Scanner;
public class Dice2 {
	private int diceNumber; 
	private String expect;
	
	public void readExpect(String expect) {
		this.expect = expect;
	}
	public String getExpect() {
		return expect;
	}
	public void setDice(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	public int getDice(int diceNumber) {
		return diceNumber;
	}
	
	
	public String swichDice () {
	
	
	
	
	String result = "";
	
	
	switch (diceNumber) {
	case 1:case 3:case 5:result = "홀"; break;
	case 2:case 4:case 6:result = "짝"; break;
	}
	System.out.println(String.format(" 결과 값 : %d", diceNumber));
	String result2 = "틀렸";

	if (expect.equals(result)) {
	result2 = "맞았";
	
	
	}
	System.out.println("정답은  " + result2 + "습니다" );
	return result2;
	}
}
	

