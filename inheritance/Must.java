package com.jse.inheritance;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Must {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();
		String message = "";
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(
					"0종료 \t 1.집전화 입력 \t " + "2.집전화 정보 출력" + "\t 3.휴대전화 입력 "
							+ "\t 4.휴대전화출력 "
							+ "\t 5. 아이폰으로 검색"
							+"\t 6. 검색결과내용"
							+"\t 7. 갤럭시 노트 사이즈입력"
							+"\t 8.사이즈 확인")) {
			case "0":
				return;

			case "1":
				for (int i = 0; i < 3; i++) {

					String[] values = JOptionPane
							.showInputDialog("전화번호 (예:032-0000-0000),이름 ," + "통신사를 입력하시오   ***,를 꼭 입력해주세요***")
							.split(",");

					phoneService.add(new Phone(values[0], values[1], values[2]));

				}
				break;
			case "2":
				Phone[] phones = phoneService.getPhones();

				for (int i = 0; i < 3; i++) {
					Phone phone = phones[i];
					message += String.format("출력 : %s, %s ,%s  \n", phones[i].getPhoneNumber(), phones[i].getName(),
							phones[i].getCompany());
					/*
					 * ( "번호: "+phones[i].getPhoneNumber()+" 이름: " + phones[i].getName() + " 통신사: "
					 * +phones[i].getCompany());
					 */
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {

					String[] values = JOptionPane
							.showInputDialog("휴대전화번호 (예 :010-xxxx-xxxx) ," + "이름 ,통신사를 입력하시오 ***,를 꼭 입력해주세요***")
							.split(",");

					phoneService.add(new CelPhone(values[0], values[1], values[2], true));

				}
				break;

			case "4":
				CelPhone[] celPhones = phoneService.getCelPhones();

				for (int i = 0; i < 3; i++) {
					CelPhone celPhone = celPhones[i];
					message += String.format("출력 : %s, %s , %s, %s \n", celPhones[i].getPhoneNumber(),
							celPhones[i].getName(), celPhones[i].getCompany(), celPhones[i].getMove());

				}
				JOptionPane.showMessageDialog(null, message);

				break;

			case "5":

				String search = JOptionPane.showInputDialog("검색어를 입력하시오");

				break;
			case "6":
				
			

			
					
				break;
			
			case "7" :
				String bigsize = JOptionPane.showInputDialog("갤럭시 노트 사이즈 입력 ");
				break;
				
				
			}
		}
	}
}
