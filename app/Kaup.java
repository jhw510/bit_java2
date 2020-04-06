package com.jse.app;
import java.util.Scanner;
/*
 * 개발자님 키와 몸무게를 이용하여 
 * 카우푸지수를 구하고 
 * 그 결과 정상 저체중 비만등으로 몸의 상태만
 * 알려주는 프로그램을 만들어주세요
 */
public class Kaup {

private String kaupResult;	
private double kaupCal;
private double kaupHeight;
private double kaupWeight;



public void setKaupHeight(double kaupHeight) {
	this.kaupHeight=kaupHeight;
}
public double getKaupHeight() {
	return kaupHeight;
}public void setKaupWeight(double kaupWeight) {
	this.kaupWeight=kaupWeight;
}
public double getkaupWeight(double kaupWeight) {
	return kaupWeight;
}

public void setKaupCal(double kaupCal) {
	this.kaupCal=kaupCal;
}
public double getKaupCal(double kaupCal) {
	return kaupCal;
}


public void readKaupResult(String kaupResult) {
	this.kaupResult=kaupResult;
}public String getKaupResult() {
	return kaupResult;
}



public String kaupResult() {
	
	double kaupCal = kaupWeight /(kaupHeight*kaupHeight)*10000 ;

	System.out.println("카우푸지수"+kaupCal);
	if(kaupCal <= 17) {
		System.out.println("당신은 저체중입니다.");
	 
	}else if(18< kaupCal && kaupCal < 20) {
	  System.out.println("당신은 정상체중입니다");
	
	 }else if (kaupCal >= 20) {
	System.out.println("당신은 과체중입니다");

	}else {
		System.out.println("잘못 입력하셨습니다.");
	}    return kaupResult;
	}


}
