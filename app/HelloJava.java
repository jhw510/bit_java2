package com.jse.app;
import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이 뭐예요?");
		String name =scanner.next();
		System.out.println("안녕하세요? " + name + "씨.");
		System.out.println(name + " 씨 혹시 어디 사세요?");
		String where = scanner.next();
		System.out.println("아~ " + where + " 사시는 구나!");
		System.out.println("몇 살이예요?");
		int age = scanner.nextInt();
		System.out.println(age + " 살이구나.");
		System.out.println("키는 몇 cm이고 , 몸무게는 몇 kg입니까? ");
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		System.out.println("키는 " +height+ "cm이고, 몸무게는" + weight + "kg 이시구나." );
		System.out.println("혈액형은 뭐예요?");
		char bloodType = scanner.next().charAt(0);
		System.out.println(bloodType + " 형 이였군요!");
		
		
		
		
		
		
	
	}
}
