package com.jse.Member2;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MemberView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel title, userIdLabel, passwdLabel, emailLabel, ageLabel, addrLabel;
	private JTextField userIdText, passwdText, emailText, ageText, addrText;
	private JButton submitButton, listButton, loginButton;
	private JTextArea resultText;
	public MemberService memberService;
	private Container container;

	public void open() {
		memberService = new MemberServiceImpl();
		setTitle("Swing Exercise");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		title = new JLabel("Swing Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		container.add(title);

		userIdLabel = new JLabel("userId");
		userIdLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		userIdLabel.setSize(100, 20);
		userIdLabel.setLocation(100, 100);
		container.add(userIdLabel);

		userIdText = new JTextField();
		userIdText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		userIdText.setSize(190, 20);
		userIdText.setLocation(200, 100);
		container.add(userIdText);

		passwdLabel = new JLabel("passwd");
		passwdLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		passwdLabel.setSize(100, 20);
		passwdLabel.setLocation(100, 150);
		container.add(passwdLabel);

		passwdText = new JTextField();
		passwdText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		passwdText.setSize(150, 20);
		passwdText.setLocation(200, 150);
		container.add(passwdText);

		emailLabel = new JLabel("email");
		emailLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		emailLabel.setSize(100, 20);
		emailLabel.setLocation(100, 200);
		container.add(emailLabel);

		emailText = new JTextField();
		emailText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		emailText.setSize(150, 20);
		emailText.setLocation(200, 200);
		container.add(emailText);

		ageLabel = new JLabel("age");
		ageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		ageLabel.setSize(100, 20);
		ageLabel.setLocation(100, 250);
		container.add(ageLabel);

		ageText = new JTextField();
		ageText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		ageText.setSize(150, 20);
		ageText.setLocation(200, 250);
		container.add(ageText);

		addrLabel = new JLabel("Address");
		addrLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addrLabel.setSize(100, 20);
		addrLabel.setLocation(100, 300);
		container.add(addrLabel);

		addrText = new JTextField();
		addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		addrText.setSize(150, 20);
		addrText.setLocation(200, 300);
		container.add(addrText);

		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
		submitButton.setSize(100, 20);
		submitButton.setLocation(150, 450);
		submitButton.addActionListener(this);
		container.add(submitButton);

		listButton = new JButton("List");
		listButton.setFont(new Font("Arial", Font.PLAIN, 15));
		listButton.setSize(100, 20);
		listButton.setLocation(270, 450);
		listButton.addActionListener(this);
		container.add(listButton);

		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
		loginButton.setSize(100, 20);
		loginButton.setLocation(390, 450);
		loginButton.addActionListener(this);
		container.add(loginButton);

		resultText = new JTextArea();
		resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		resultText.setSize(300, 400);
		resultText.setLocation(500, 100);
		resultText.setLineWrap(true);
		resultText.setEditable(false);
		container.add(resultText);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			JOptionPane.showMessageDialog(this, "입력한 결과는");
			userIdText.setText("hw,kp,manggus,ron,miguni");
			passwdText.setText("1,2,3,4,5");
			addrText.setText("인천,역곡,원종동,한울아파트,소사");
			emailText.setText("hw@mail,kp@mail,manggus@mail,ron@mail,miguni@mail");
			ageText.setText("29,31,29,7,29");
			// String data =
			 String.format("%s/%s/%s/%s/%s",userIdText.getText(),passwdText.getText(),
			 emailText.getText(),addrText.getText(),ageText.getText());
			String[] userids = userIdText.getText().split(",");
			String[] passwds = passwdText.getText().split(",");
			String[] emails = emailText.getText().split(",");
			String[] addrs = addrText.getText().split(",");
			String[] ages = ageText.getText().split(",");
			Member2[] members = new Member2[5];
			for (int i = 0; i < members.length; i++) {
				members[i] = new Member2();
				members[i].setUserId(userids[i]);
				members[i].setPasswd(passwds[i]);
				members[i].setEmail(emails[i]);
				members[i].setAddr(addrs[i]);
				members[i].setAge(Integer.parseInt(ages[i]));
				memberService.add(members[i]);

			}

		} else if (e.getSource() == listButton) {
			Member2[] members = memberService.getMember();
			String result = "";
			for (int i = 0; i < members.length; i++) {
				result += (members[i].getUserId() + "/"
						+members[i].getPasswd() + "/"
						+members[i].getEmail() + "/"
						+members[i].getAddr() + "/"
						+members[i].getAge() + "\n");
			}
			userIdText.setText("");
			passwdText.setText("");
			emailText.setText("");
			addrText.setText("");
			ageText.setText("");
			resultText.setText(result);

		} else if (e.getSource() == loginButton) {
			JOptionPane.showMessageDialog(this,
					"입력한 아이디는 " + userIdText.getText() + "\n입력한 비밀번호는 " + passwdText.getText());
			Member2 members = new Member2();
			members.setUserId(userIdText.getText());
			members.setPasswd(passwdText.getText());
			
			Member2 ok = memberService.login(members);
		if(ok != null){
			JOptionPane.showMessageDialog(this,"성공");
			resultText.setText(ok.getUserId()+ok.getPasswd());	
		}
		else {
			JOptionPane.showMessageDialog(this,"실패");
		}
		}

	}

}
