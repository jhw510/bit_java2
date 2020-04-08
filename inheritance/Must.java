package com.jse.inheritance;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Must {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();

		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog("0종료 1.전화번호정보 입력 2.전화번호 정보 출력")) {
			case "0":
				
				return;

			case "1":
				for (int i = 0; i < 3; i++) {
			
					String[] values =	JOptionPane.showInputDialog("전화번호 (예 :010-xxxx-xxxx) ,이름 ,통신사를 입력하시오").split(",");
					
					phoneService.add(new Phone(values[0],values[1], values[2]));
					
				} 
				
			
				break;
			case "2": 
			Phone[] phones=phoneService.getPhones();
			String message="";
			for(int i=0; i<3; i++) {
				Phone phone= phones[i];
			message +=String.format("출력 : %s, %s ,%s  \n", phones[i].getPhoneNumber(),
					phones[i].getName(),phones[i].getCompany());
					/*(
						"번호: "+phones[i].getPhoneNumber()+" 이름: " +  phones[i].getName() +
						" 통신사: " +phones[i].getCompany());*/
				} JOptionPane.showMessageDialog(null, message);
			break;
			}
		}
	}
}
