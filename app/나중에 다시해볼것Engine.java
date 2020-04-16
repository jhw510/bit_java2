
// Dice 클래스에 이유 참조 , 나중에 /*  */ 된 메소드들 풀어서 해결해보기


/*
package com.jse.app;
import java.util.Random;
import java.util.Scanner;
import com.jse.app.Member;
import com.jse.app.Calculator;
import com.jse.app.Dice;
public class Engine {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Member member = new Member();
		Calculator calculator = new Calculator();
		Random random = new Random();
		Dice dice = new Dice();
		while(true){
			System.out.println("<0. 종료>  <1.회원가입>  <2. 로그인 > "
					+ "<3. 1부터 100까지의 합> <4. 가위바위보> <5.홀짝주사위> <6.계산기>");
		
			int fleg = scanner.nextInt();
			switch(fleg) {
			case 0:	System.out.println("종료");return;
			case 4:	game();break;
		
			case 3:	sum();break;
			case 6:	
			System.out.println("계산기가 작동합니다.");

			System.out.println("첫번째 수를 입력하시오");
			int a = scanner.nextInt();
			calculator.setNum1(a);
			System.out.println("두번째 수를 입력하시오");
			int b = scanner.nextInt();
			calculator.setNum2(b);
			System.out.println("세번째 수를 입력하세요");
			int c = scanner.nextInt();
			calculator.setNum3(c);
			
			int d=calculator.calculator(a,b,c);
			System.out.println("세수의 합은 " + d);
			
			
			break;
			case 5:	System.out.println("******주사위 홀짝 맞추기 게임******");
			System.out.println("1.홀 또는 2.짝 을 입력해 주세요.");
			int expect = scanner.nextInt();
			 dice.setExpect(expect);
			
			 System.out.println(String.format("예상 입력값은 %s", expect));	 
			System.out.println("컴퓨터가 숫자를 고르는 중입니다.");
				int diceNum = random.nextInt(2) +1;
			 dice.setDice(diceNum);
			
			 System.out.println(String.format("컴퓨터가 생성한 값 : %d",dice));
			System.out.println(String.format(" 결과 값 : %d", dice));
			    String result =dice.swichDice ();
			 
			
				;break;
			case 1:	
			System.out.println("회원가입");
			System.out.println("아이디 입력");
			String userid = scanner.next();
			member.setId(userid);
			
			break;
			case 2: 
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				
				String returnId = member.getId();
				System.out.println("로그인 된 아이디" + returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
				
			}
		}
	}
	
	*/
	
//	/*static void switchdice () {
//
//		Random random = new Random();
//		int dice = random.nextInt(6) +1;
//		
//		System.out.println("******주사위 홀짝 맞추기 게임******");
//		System.out.println("기대하는 값 홀 또는 짝 을 입력해 주세요.");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println(String.format("예상 입력값은 %s", expect));
//		
//
//		String result = "";
//
//		
//		System.out.println(String.format("컴퓨터가 생성한 값 : %d",dice));
//		switch (dice) {
//		case 1:case 3:case 5:result = "홀"; break;
//		case 2:case 4:case 6:result = "짝"; break;
//		}
//		System.out.println(String.format(" 결과 값 : %d", dice));
//		String result2 = "틀렸";
//
//		if (expect.equals(result)) {
//		result2 = "맞았";
//		
//		
//		}
//		System.out.println("정답은  " + result2 + "습니다" );
//		
//		
//		
//		
//	}*/



/*static void sum() {
		int sum=0;
		

		for(int i=1;i<=100;i++) {
			System.out.println(i);
			
			sum += i;
			
		}
		
		System.out.println(String.format("%d", sum));
	
}
	static void game() {
		Scanner scanner = new Scanner (System.in);
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
}
}

*/
