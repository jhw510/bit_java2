package com.jse.inheritance;

import java.util.Scanner;

public class Must {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();

		while (true) {
			System.out.println("0종료 1.전화번호정보 입력 2.전화번호 정보 출력");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;

			case 1:
				System.out.println("1.전화번호 정보를 입력합니다");
				for (int i = 0; i < 3; i++) {
					System.out.println("전화번호 (예 :010-xxxx-xxxx) ,이름 ,통신사를 입력하시오");
					phoneService.add(new Phone(scanner.next(), scanner.next(), scanner.next()));

				}
				break;
			case 2: System.out.println("2.전화번호 정보를 출력합니다");
			Phone[] phones=phoneService.getPhones();
			for(int i=0; i<3; i++) {
				Phone phone= phones[i];
				System.out.println(
						"번호: "+phones[i].getPhoneNumber()+" 이름: " +  phones[i].getName() +
						" 통신사: " +phones[i].getCompany());
				} break;
			}
		}
	}
}
