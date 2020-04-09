
package com.jse.game;

import java.util.Random;
import java.util.Scanner;

import com.jse.game.Calculator;
import com.jse.game.Dice;

import com.jse.game.RPS;
import com.jse.member.Kaup;
import com.jse.member.Member;
public class GameController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Random random = new Random();
		RPS rps = null;
		Calculator calculator = null;
		Dice dice = null;
		Kaup kaup = null;
		while (true) {
			System.out.println(
					"<0. 종료>  <1.회원가입>  <2. 로그인 > " + "<3. 1부터 100까지의 합> <4. 가위바위보> <5.홀짝주사위> <6.계산기>" + "<7.비만계산기>");

			int fleg = scanner.nextInt();
			switch (fleg) {
			case 0:
				System.out.println("종료");
				return;
			case 4:
				System.out.println("가위1 바위2 보 3를 입력하시오");
				
				System.out.println("사용자의 값은 " + scanner.nextInt());
				rps.setUserValue(scanner.nextInt());
				int computerValue = random.nextInt(3) + 1;
				System.out.println(String.format("컴퓨터은 %d 를 냈습니다.", random.nextInt(3) + 1));
				rps.setComputerValue(random.nextInt(3) + 1);
				String result2 = rps.game();
				System.out.println(result2);

				;
				break;
			case 7:
				kaup = new Kaup();

				System.out.println("****비만도 계산기****");
				System.out.println("키를 작성해주세요  예시) 160.3 ");
				double kaupHeight = scanner.nextInt();
				System.out.println("몸를 작성해주세요  예시) 50.9 ");
				double kaupWeight = scanner.nextInt();
				System.out.println("당신의 키 " + kaupHeight + " 와 당신의 몸무게 " + kaupWeight + " 로 계산중");
				kaup.setKaupHeight(scanner.nextInt());
				kaup.setKaupWeight(scanner.nextInt());

				System.out.println(kaup.kaupResult());

				break;

			case 3:

				sum();
				break;
			case 6:
				Calculator calculator1 = new Calculator();

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

				int d = calculator.calculator(a, b, c);
				System.out.println("세수의 합은 " + d);

				break;
			case 5:
				dice = new Dice();

				System.out.println("******주사위 홀짝 맞추기 게임******");
				System.out.println("기대하는 값 홀 또는 짝 을 입력해 주세요.");

				String expect = scanner.next();
				System.out.println(String.format("예상 입력값은 %s", expect));

				dice.readExpect(expect);
				int diceNumber = random.nextInt(6) + 1;
				System.out.println(String.format("컴퓨터가 생성한 값 : %d", diceNumber));
				dice.setDice(diceNumber);
				String result = dice.swichDice();
				;
				break;
			case 1:

				System.out.println("회원가입");
				System.out.println("아이디 입력");
				String userid = scanner.next();
				member.setUserid(userid);

				break;
			case 2:

				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();

				String returnId = member.getUserid();
				System.out.println("로그인 된 아이디" + returnId);
				if (id2.equals(returnId)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;

			}
		}
	}

	/*
	 * static void switchdice () {
	 * 
	 * Random random = new Random(); int dice = random.nextInt(6) +1;
	 * 
	 * System.out.println("******주사위 홀짝 맞추기 게임******");
	 * System.out.println("기대하는 값 홀 또는 짝 을 입력해 주세요."); Scanner scanner = new
	 * Scanner(System.in); String expect = scanner.next();
	 * System.out.println(String.format("예상 입력값은 %s", expect));
	 * 
	 * 
	 * String result = "";
	 * 
	 * 
	 * System.out.println(String.format("컴퓨터가 생성한 값 : %d",dice)); switch (dice) {
	 * case 1:case 3:case 5:result = "홀"; break; case 2:case 4:case 6:result = "짝";
	 * break; } System.out.println(String.format(" 결과 값 : %d", dice)); String
	 * result2 = "틀렸";
	 * 
	 * if (expect.equals(result)) { result2 = "맞았";
	 * 
	 * 
	 * } System.out.println("정답은  " + result2 + "습니다" );
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	static void sum() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

			sum += i;

		}

		System.out.println(String.format("%d", sum));

	}
	/*
	 * static void game() { RPS rps = new RPS(); Scanner scanner = new Scanner
	 * (System.in); Random random = new Random();
	 * System.out.println("<1> 가위  <2> 바위  <3 >보  를 입력하시오."); int expect =
	 * scanner.nextInt();
	 * 
	 * System.out.println(String.format("당신은 %s 를 냈습니다.", expect)); int rps1 =
	 * random.nextInt(3)+1;
	 * 
	 * 
	 * System.out.println(String.format("컴퓨터은 %d 를 냈습니다.", rps1));
	 * 
	 * String result = ""; if(expect == 1) { switch (rps1) { case 1:result
	 * ="무승부";break; case 2:result ="컴퓨터 승리 당신 패배";break; case 3:result
	 * ="컴퓨터 패배 당신 승리";break;
	 * 
	 * } }else if (expect == 2) { switch (rps1) { case 1:result
	 * ="컴퓨터 패배 당신 승리";break; case 2:result ="무승부";break; case 3:result
	 * ="컴퓨터 승리 당신 패배";break; } }else if (expect == 3) { switch (rps1) { case
	 * 1:result ="컴퓨터 승리 당신 패배";break; case 2:result ="컴퓨터 패배 당신 승리";break; case
	 * 3:result ="무승부";break; } }
	 * 
	 * 
	 * 
	 * 
	 * System.out.println("결과는 " + result + " 입니다"); }}
	 */
}