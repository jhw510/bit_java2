package com.jse.grade;
import javax.swing.JOptionPane;


import com.jse.util.Constants2;


public class GradeOldController {

	public static void main(String[] args) {
		
		GradeService gradeService = new GradeServiceImpl();
		
		Constants2 MENU = new Constants2();
	
		
		Grade grade =null;
		while (true) {
			
			switch (JOptionPane.showInputDialog(Constants2.MENU)) {
			case "0":
				
				return;

			case "1":
				
				for (int i = 0; i < 3; i++) {
					String[] values= JOptionPane.showInputDialog(Constants2.GRADE_MEMU).split(",");
				grade= new Grade();
				grade.setName(values[0]);
				grade.setKorean(Integer.parseInt(values[1]));
				grade.setMath(Integer.parseInt(values[2]));
				grade.setEnglish(Integer.parseInt(values[3]));
				gradeService.add(grade);
					/*	gradeService.add
							(new Grade(scanner.nextInt(),
									scanner.nextInt(), scanner.nextInt(),
									scanner.next()));*/

				}

				break;

			case "2":
				JOptionPane.showMessageDialog(null, gradeService.list());
			
				
				break;

			case "3":
				System.out.println("총점정보로 123 등  나열하기");

				
				break;
/*
			case "4":
				JOptionPane.showInputDialog(Constants2.MEMBER_MEMU);
				for (int i = 0; i < 3; i++) {
					JOptionPane.showInputDialog(Constants2.MEMBER2_MEMU);
					memberService.add
					(new Member(scanner.next(), 
				scanner.next(), scanner.next(), scanner.nextInt()));

				}

				break;
			case "5":

				break;   */
			}
		}
	}


	}


