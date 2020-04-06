package com.jse.app;
import java.util.Scanner;
public class GenderChecker {
	public static void main(String[] args) {
		find();
	}

	static void find() {

		System.out.println("주민번호를 입력해주세요. 예시 )900000-3333333");
		Scanner scanner = new Scanner (System.in);
		//  String ssn="900000-1111111";
		String ssn = scanner.next();
	    System.out.println(ssn);
		char ch = ssn.charAt(7);
		//String a = "";
		//char c = '';
		//case '1'
		//char c = 0;
		String result = "잘못 입력 했습니다.";
		switch (ch) {
		case '2': case '4':result ="여성";break; //'' 가 붙는 이유 char로 했기때문에 
	    case '1': case '3':result="남성";break;
		case '5': case '6':result ="외국인";break;   
		default:break;   
		}
	
		
		//System.out.println("남성");//1,3
		//System.out.println("외국인");//5,6
		//System.out.println("잘못입력한값");//7,8,9,0 
	
		System.out.println(result);   
	}

}
