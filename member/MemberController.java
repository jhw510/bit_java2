package com.jse.member;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class MemberController {
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		GenderCheckerService genderCheckerService = new GenderCheckerServiceImpl();
		Member member = null;
		GenderChecker ssn = null;
		KaupService kaupService = new KaupServiceImpl();
		Kaup kaup = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.MEMBER_MENU)) {
			case "0":
				return;
			case "1":
				memberService.setCount(0);
				for(int i = 0; i < 3; i++) {
				member = new Member();
				String[] values = JOptionPane.showInputDialog(Constants.MEMBER_INPUT).split(",");
				member.setUserid(values[0]);
				member.setPasswd(values[1]);
				member.setName(values[2]);
				member.setSsn(values[3]);
				memberService.add(member);
				}
				break;
			case "2":
				memberService.getMembers();
				String userid = JOptionPane.showInputDialog("아이디를 입력하세요.");
				String passwd = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
				JOptionPane.showMessageDialog(null, memberService.login(userid, passwd));
				break;
			case "3":
				for(int i = 0; i<3; i++) {
					ssn = new GenderChecker();
					String input = JOptionPane.showInputDialog("주민등록번호를 입력하세요");
					ssn.setSsn(input);
					genderCheckerService.add(ssn);}
				JOptionPane.showMessageDialog(null,genderCheckerService.printSsn());
				break;
			case "4":
				for(int i = 0; i <3; i++) {
					kaup = new Kaup();
					String[] values = JOptionPane.showInputDialog("몸무게, 키").split(",");
					kaup.setKaupWeight(Double.parseDouble(values[0]));
					kaup.setKaupHeight(Double.parseDouble(values[1]));
					kaupService.add(kaup);
				}
				JOptionPane.showMessageDialog(null, kaupService.printKaup());
				break;
			}
		}
	}
}