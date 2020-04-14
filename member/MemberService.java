package com.jse.member;

public interface MemberService {
	public void setMembers(Member[] members);
	public Member[] getMembers();
	public void setCount(int count);
	public int getCount();
	public void add(Member member);
	public void setList(String list);
	public String getList();
	public Member login(Member member);
	

	
	
}