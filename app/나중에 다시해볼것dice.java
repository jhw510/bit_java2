
///이 클래스는 expcet 는 int타입이고 recult는 string 타입이여서 오류가 나는건데
//지금 배우는 과정으로는 두 타입이 다를경우 타입을 맞춰주는걸 못배워서 해결을 못함 
//나중에 다시 해볼것


/*package com.jse.app;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.Random;
//시나리오를 잊지말고 할 것
public class Dice {
	private int diceNum; 
	private int expect;
	private String result; 
	public void setExpect(int expect) {
		this.expect = expect;
	}
	public int getExpect(int expect) {
		return expect;
	}
	public void setDice(int diceNum) {
		this.diceNum = diceNum;
	}
	public int getDice(int diceNum) {
		return diceNum;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult(String result) {
		return result;
	}
	public void result (int expect,int diceNum) {
	int dice1 = diceNum ;
	int expect1 = expect;
	
	}
	public String swichDice () {
		
		
		
		
		String result = "";
		
		
		switch (diceNum) {
		case 1:result = "홀"; break;
		case 2:result = "짝"; break;
		}
		System.out.println(String.format(" 결과 값 : %d", diceNum));
		String result2 = "틀렸";

		if (expect == (result)) {
		result2 = "맞았";
		
		
		}
		System.out.println("정답은  " + result2 + "습니다" );
		return result2;
		}
	
	
 //public void switchdice () {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	
	

	

	
	
	static void ifdice() {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	System.out.println("******주사위 홀짝 맞추기 게임******");
	System.out.println("기대하는 값 홀 또는 짝 을 입력해 주세요.");
	
	String expect = scanner.next();
	System.out.println("예상값은 ' " +expect + " ' 입니까?");
	int dice = random.nextInt(6) + 1;

	System.out.println("주사위의 값은 " + dice);
	String result = "";
	if(dice == 1) {
	result = "홀";
	}else if (dice == 2 ) {
		result = "짝";
	}else if (dice == 3) {
	result = "홀";
	
	}else if (dice == 4) {
		result ="짝";
	}else if(dice == 5){
	result ="홀";
	}else {
	result = "짝";
	}
System.out.println("정답은 "+ result);
if(expect.equals(result)) {  //object type의  operation은  method로 처리한다.

System.out.println("짝짝짝 맞췄습니다.");
}else {	

System.out.println("땡땡땡 틀렸습니다.");
}
}
}
*/
