package com.jse.grade;

//import java.util.Scanner;

/*
클라이언트에서 프로그램 개발 요청이 왔습니다.
 * 이름과 국,영,수 세과목점수를 입력받아서()
 *  [홍길동 : 총점 ***점, * 평균***점,학점 : F] 
 *  을 출력하는 프로그램을 만들어 주세요.
 *   단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A 
 *   * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 
 *   D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요 
 */


public class Grade {
	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int korean,math,english,java;

	private String name;

}


	
