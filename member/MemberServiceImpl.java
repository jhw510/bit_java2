  
package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	private String list;
	
	
	
	
	public MemberServiceImpl() {
		members = new Member[6];
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
	public String login(String userid, String passwd) {
		getMembers();
		String result = "로그인 실패";
		for (int i = 0; i < members.length; i++) {
			if (userid.equals(members[i].getUserid())) {
				if (passwd.equals(members[i].getPasswd())) {
					result = "로그인 성공";
				}
			} else
				continue;
		}
		return result;
	}
	
}