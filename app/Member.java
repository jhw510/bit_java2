package com.jse.app;

public class Member {
	private String id;
	public Member() {
		
	}
	public void setId(String id) {
		System.out.println("지역변수 들어옴 " + id);
		this.id = id ;
		System.out.println("인스턴스 변수에 저장됌" + this.id);
	}
	
	public String getId () {
		return this.id;
	 }
}
