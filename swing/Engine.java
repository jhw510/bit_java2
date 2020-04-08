package com.jse.swing;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();
		MemberService memberService = new MemberService();

		while (true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력 " + "3.총점별로 123등 나열하기   4 .회원가입 " + " 5. 회원들 나이순 정렬");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;

			case 1:
				System.out.println("성적표입력");
				for (int i = 0; i < 3; i++) {
					System.out.println("국어,영어,수학  이름을  입력");
					gradeService.add
							(new GradeBean(scanner.nextInt(),
									scanner.nextInt(), scanner.nextInt(),
									scanner.next()));

				}

				break;

			case 2:

				GradeBean[] grades = gradeService.getGrades();
				for (int i = 0; i < 3; i++) {
					GradeBean grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", grades[i].getName(),
							grades[i].total(), grades[i].average(), grades[i].grade()));

				}
				break;

			case 3:

				grades = gradeService.getGrades();
				int a = grades[0].total();
				int y = grades[1].total();
				int z = grades[2].total();

				if (a > y && a>z) {
					if (y > z ) {
						System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:"
								+ grades[2].getName());
					} else if (z > y) {
						System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:"
								+ grades[1].getName());
					}
				} else if (y > a && y>z) {
					if (a > z) {
						System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:"
								+ grades[2].getName());
					} else if (z > a) {
						System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:"
								+ grades[0].getName());
					}
				} else if (z > y && z>a) {
					if (y > a) {
						System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:"
								+ grades[0].getName());
					} else if (a > y) {
						System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:"
								+ grades[1].getName());
					}
				}
				break;

			case 4:
				System.out.println("회원가입을 위한 정보를 입력해주세요");
				for (int i = 0; i < 3; i++) {
					System.out.println("id, 비밀번호 , 이름 , 나이를  입력");
					memberService.add
					(new MemberBean(scanner.next(), 
				scanner.next(), scanner.next(), scanner.nextInt()));

				}

				break;
			case 5:

				break;
			}
		}
	}

	public static GradeBean input(Scanner scanner) {
		System.out.println("국어,영어,수학  이름을  입력");
		return new GradeBean(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.next());

	}

	public static MemberBean join(Scanner scanner) {
		System.out.println("id ,비밀번호 , 이름,나이를  입력");
		return new MemberBean(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());

	}
}

