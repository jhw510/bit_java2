package com.jse.swing;

import java.util.Scanner;

public class Engine {
// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[3];
		Member[] member = new Member[2];
		while (true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력 3.총점별로 123등 나열하기   4 .회원가입");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;

			case 1:
				System.out.println("성적표입력");
				for (int i = 0; i < 3; i++) {

					grades[i] = input(scanner);

				}
				break;

			case 2:
				for (int i = 0; i < 3; i++) {
					Grade grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", grade.getName(), grade.total(),
							grade.average(), grade.grade()));

				}
				break;

			case 3:

				// Grade x = input(scanner);
				// grades[i] = x;

				/*
				 * Grade y= input2(scanner); grades[i] = y; Grade z= input3(scanner); grades[i]
				 * = z;
				 */
				// grades[i].total();

				/*
				 * case 1:(x>z>y)=("1등" +x +"2등"+ y +"3등"+z);break; case 2:(x>y>z)=("1등" +x
				 * +"2등"+ z +"3등"+y);break; case 3:(y>z>x)=("1등" +y +"2등"+ z +"3등"+x);break;
				 * case 4:(y>x>z)=("1등" +y +"2등"+ x +"3등"+z);break; case 5:(z>x>y)=("1등" +z
				 * +"2등"+ y +"3등"+y);break; case 6:(z>y>x)=("1등" +z +"2등"+ y +"3등"+y);break;
				 */

				for (int i = 0; i < 3; i++) {
				}
				int a = grades[0].total();
				int y = grades[1].total();
				int z = grades[2].total();

				if (a > y) {
					if (y > z) {
						System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:"
								+ grades[2].getName());
					} else if (z > y) {
						System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:"
								+ grades[1].getName());
					}
				} else if (y > a) {
					if (a > z) {
						System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:"
								+ grades[2].getName());
					} else if (z > a) {
						System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:"
								+ grades[0].getName());
					}
				} else if (z > a) {
					if (a > y) {
						System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:"
								+ grades[1].getName());
					} else if (y > a) {
						System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:"
								+ grades[0].getName());
					}
				}
			}
		}
	}

	public static Grade input(Scanner scanner) {

		Grade grade = new Grade();
		System.out.println("이름을 입력하시오");
		grade.setName(scanner.next());
		System.out.println("국어점수를 입력하시오");
		grade.setKorea(scanner.nextInt());
		System.out.println("영어점수를 입력하시오");

		grade.setEnglish(scanner.nextInt());
		System.out.println("수학를 입력하세요");

		grade.setMath(scanner.nextInt());
		return grade;

	}

	public static Grade input2(Scanner scanner) {

		Grade grade = new Grade();
		System.out.println("이름을 입력하시오");
		grade.setName(scanner.next());
		System.out.println("국어점수를 입력하시오");
		grade.setKorea(scanner.nextInt());
		System.out.println("영어점수를 입력하시오");

		grade.setEnglish(scanner.nextInt());
		System.out.println("수학를 입력하세요");

		grade.setMath(scanner.nextInt());
		return grade;

	}

	public static Grade input3(Scanner scanner) {

		Grade grade = new Grade();
		System.out.println("이름을 입력하시오");
		grade.setName(scanner.next());
		System.out.println("국어점수를 입력하시오");
		grade.setKorea(scanner.nextInt());
		System.out.println("영어점수를 입력하시오");

		grade.setEnglish(scanner.nextInt());
		System.out.println("수학를 입력하세요");

		grade.setMath(scanner.nextInt());
		return grade;

	}

	public static Member join(Scanner scanner) {

		Member member = new Member();
		System.out.println("이름을 입력하시오");
		member.setName(scanner.next());
		System.out.println("id를 입력하시오");
		member.setUserid(scanner.next());
		System.out.println("비번를 입력하시오");
		member.setPasswd(scanner.next());
		System.out.println("나이를 입력하세요");

		member.setAge(scanner.nextInt());
		return member;
	}
}
