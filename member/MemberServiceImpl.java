package com.jse.member;
public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	private String list;
	
	
	public MemberServiceImpl() {
		members = new Member[5];
	}
	@Override
	public void setMembers(Member[] members) {
		this.members = members;
	}
	@Override
	public Member[] getMembers() {
		return members;
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
		System.out.println("서비스로 들어온 멤버");
		System.out.println(member);
	}
	@Override
	public void setList(String list) {
		this.list = list;

	}

	@Override
	public String getList() {
		return list;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public Member login(Member member) {
		Member ok = null;
		for(int i=0;i<members.length;i++) {
			if (member.getUserid()
					.equals(members[i]
							.getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {		
				ok = new Member();
		ok=members[i];
		break;
			}
		}
		System.out.println("결과" + ok);
		return  ok;
	}
	
	
}
	

