package com.jse.swing;
import com.jse.util.Constants2;
import java.util.Scanner;

public class GradeController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();
		MemberService memberService = new MemberService();
		Constants2 MENU = new Constants2();
		String message="";
		while (true) {
			System.out.println(Constants2.MENU);
			switch (scanner.nextInt()) {
			case 0:
				
				return;

			case 1:
				
				for (int i = 0; i < 3; i++) {
					System.out.println(Constants2.GRADE_MEMU);
					gradeService.add
							(new Grade(scanner.nextInt(),
									scanner.nextInt(), scanner.nextInt(),
									scanner.next()));

				}

				break;

			case 2:

				Grade[] grades = gradeService.getGrades();
				message ="";
				for (int i = 0; i < 3; i++) {
					message+=grades[i].toString();
					
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
				System.out.println(Constants2.MEMBER_MEMU);
				for (int i = 0; i < 3; i++) {
					System.out.println(Constants2.MEMBER2_MEMU);
					memberService.add
					(new Member(scanner.next(), 
				scanner.next(), scanner.next(), scanner.nextInt()));

				}

				break;
			case 5:

				break;
			}
		}
	}

	public static Grade input(Scanner scanner) {
		System.out.println(Constants2.GRADE_MEMU);
		return new Grade(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.next());

	}

	public static Member join(Scanner scanner) {
		System.out.println(Constants2.MEMBER2_MEMU);
		return new Member(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());

	}
}

