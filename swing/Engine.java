package com.jse.swing;

import java.util.Scanner;
import com.jse.swing.Grade;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		while (true) {
			System.out.println("0.종료  1. 시작  2.성적알기");

			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료합니다");
				return;
			case 1:
				System.out.println("1이 나옵니다.");
				break;
			case 2:
				grade = new Grade();
				System.out.println("성적을 알려드립니다.");
				System.out.println("이름을 입력하시오");
				String name = scanner.next();
				System.out.println("국어점수를 입력하시오");
				
				grade.setKorea(scanner.nextInt());
				System.out.println("영어점수를 입력하시오");
				
				grade.setEnglish(scanner.nextInt());
				System.out.println("수학를 입력하세요");
			
				grade.setMath(scanner.nextInt());
				int average = grade.average();

				int total = grade.total();

				System.out.println("당신의 총점은 " + total + "이고" + "평균은 " + average + "입니다.");
				System.out.println(grade.grade());
				break;
			}

		}
	}
}
