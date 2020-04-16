package com.jse.member;


public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
	count=0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
		System.out.println("서비스로 들어온 멤버");

	}

	@Override
	public Member[] list() {

		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member [] returnMembers = null;
		int searchCount = count(name);
		if (searchCount !=0) {
			returnMembers = new Member[searchCount];
			int j = 0;
			for(int i = 0; i<count;i++) {
				if(name.equals(members[i].getUserid())) {
					returnMembers[j]= members[i];
					j++;
					if(searchCount == j) {
						break;
					}
				}
			}
		}
		return returnMembers;
	}

	@Override
	public Member[] searchByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Member detail(String userid) {
		Member returnMemberk = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {

				returnMemberk = members[i];

				break;
			}
		}
		return returnMemberk;
	}

	@Override
	public int count() {

		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;

		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				returnCount++;

			}
		}

		return count;
	}

	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = new Member();  //returnMember=members[i]  만 써도 된다
				returnMember = members[i];
				break;
			}
		}

		return returnMember;
	}

	@Override
	public void update(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
			break;
			}
		}

	}

	@Override
	public void delete(Member member) {
		//int c= count+ (-1);
		
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())); {
				
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				
				//members[i] = null;
				
				
				//members[c]=members[Integer.parseInt(member.getUserid())];
				
			}
		}
	}

}
