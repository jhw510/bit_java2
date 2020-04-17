package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {

		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] returnMembers = null;
		int countName = count(name);
		if (countName != 0) {
			returnMembers = new Member[countName];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getName())) {
					returnMembers[j] = members[i];
					j++;
					if (countName == j) {
						break;
					}
				}
			}
		}
		return returnMembers;
	}

	@Override
	public Member[] searchByGender(String gender) {

		return null;
	}

	@Override
	public Member detail(String userid) {
		Member returnDetail = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {
				returnDetail = members[i];
			}
		}
		return returnDetail;
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
		return returnCount;
	}

	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = members[i];
			}
		}

		return returnMember;
	}

	@Override
	public void update(Member member) {

		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid()))
				members[i].setPasswd(member.getPasswd());
		}

	}

	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {

				members[i] = members[count - 1];
				members[count - 1] = null;
				count--;
			
			}

		}
	}
}
