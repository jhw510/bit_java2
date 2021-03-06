package com.jse.member;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton, loginButton;
	JLabel[] labels;
	JTextField[] textFields;
	JPanel panel;
	MemberService memberService;
	public void open() {
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[6];
		textFields = new JTextField[6];
		String[] names = {"이름","아이디","패스워드","SSN","주소","검색결과"};
		for(int i=0;i < names.length;i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}	
		saveButton = new JButton("저장");
		listButton = new JButton("목록");
		loginButton = new JButton("로그인");
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
		panel.add(saveButton); 
		panel.add(listButton);
		panel.add(loginButton);
		labels[0].setBounds(40,10,40,40);
		labels[1].setBounds(40,50,40,40);
		labels[2].setBounds(40,90,60,40);
		labels[3].setBounds(40,130,40,40);
		labels[4].setBounds(40,170,60,40);
		labels[5].setBounds(40,210,60,40);
		textFields[0].setBounds(120,10,200,30);
		textFields[1].setBounds(120,50,200,30);
		textFields[2].setBounds(120,90,200,30);
		textFields[3].setBounds(120,130,280,30);
		textFields[4].setBounds(120,180,280,30);
		textFields[5].setBounds(120,220,280,150);
		saveButton.setBounds(125,400,80,30);
		listButton.setBounds(240,400,80,30);
		loginButton.setBounds(340,400,80,30);
	}
	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
