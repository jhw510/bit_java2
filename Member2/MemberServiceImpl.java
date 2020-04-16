package com.jse.Member2;

public class MemberServiceImpl implements MemberService {
 private Member2[] members;
 private int count;
 
 public MemberServiceImpl() {
	 members = new Member2[5];
 }
	
 @Override
	public void setMember(Member2[] members) {
		this.members= members;
		
	}

	@Override
	public Member2[] getMember() {
		
		return members;
	}
	@Override
	public void add(Member2 member2) {
		members[count] = member2;
		count++;
	}

	

	@Override
	public Member2 login(Member2 members) {
		Member2 ok = null;
		for (int i=0;i<this.members.length;i++) {
			if(members.getUserId().equals(this.members[i].getUserId())
					&& members.getPasswd().equals(this.members[i].getPasswd())) {
				ok = new Member2();
				ok=this. members[i];
				break;
				
			}
		}
		return ok;
	}

}
