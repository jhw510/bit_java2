package com.jse.member;

public class MemberService {
	private Member[] members;
 private int count;
	public MemberService() {
		members = new Member[3];
count= 0;
	}
	public  void setMembers(Member[] Members) {
		this.members = members;
	}
	public  Member[] getMembers() {
		return members;
}
	public void add(Member member) {
		members[count]=member;
		count++;
	}
}