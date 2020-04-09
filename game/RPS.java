package com.jse.game;

import java.util.Random;
public class RPS {
private int userValue;
private int computerValue;
	public void setUserValue(int userValue) {
	this.userValue = userValue;
}
	public int getUserValue() {
	return userValue;
	}
	public void setComputerValue(int computerValue) {
		this.computerValue = computerValue;
	}
	public int getComputerValue() {
	return computerValue;
	}
	
	public String game() {
	

		String result2 = "";
		if(userValue == 1) {
			switch (computerValue) {
			case 1:result2 ="무승부";break;
			case 2:result2 ="컴퓨터 승리 당신 패배";break;
			case 3:result2 ="컴퓨터 패배 당신 승리";break;
			
			}
		}else if (userValue == 2) {
			switch (computerValue) {
			case 1:result2 ="컴퓨터 패배 당신 승리";break;
			case 2:result2 ="무승부";break;
			case 3:result2 ="컴퓨터 승리 당신 패배";break;
			}
			}else if (userValue == 3) {
			switch (computerValue) {
			case 1:result2 ="컴퓨터 승리 당신 패배";break;
			case 2:result2 ="컴퓨터 패배 당신 승리";break;
			case 3:result2 ="무승부";break;
			}
	
	}
	return result2;
	
}
	
	
	
	
	
	
	
	
	
	/*Scanner scanner = new Scanner (System.in);
	Random random = new Random();
	System.out.println("<1> 가위  <2> 바위  <3 >보  를 입력하시오.");
	int expect = scanner.nextInt();
	
	System.out.println(String.format("당신은 %s 를 냈습니다.", expect));
	int rps = random.nextInt(3)+1;
	

  
	System.out.println(String.format("컴퓨터은 %d 를 냈습니다.", rps));
	
	String result = "";
	if(expect == 1) {
		switch (rps) {
		case 1:result ="무승부";break;
		case 2:result ="컴퓨터 승리 당신 패배";break;
		case 3:result ="컴퓨터 패배 당신 승리";break;
		
		}
	}else if (expect == 2) {
		switch (rps) {
		case 1:result ="컴퓨터 패배 당신 승리";break;
		case 2:result ="무승부";break;
		case 3:result ="컴퓨터 승리 당신 패배";break;
		}
		}else if (expect == 3) {
		switch (rps) {
		case 1:result ="컴퓨터 승리 당신 패배";break;
		case 2:result ="컴퓨터 패배 당신 승리";break;
		case 3:result ="무승부";break;
		}
	}
	

	
	System.out.println("결과는 " + result + " 입니다");
	*/

}

