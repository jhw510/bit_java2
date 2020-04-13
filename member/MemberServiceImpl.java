  
package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	
	
	
	
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
