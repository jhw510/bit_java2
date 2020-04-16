package com.jse.carinfo;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CarView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container container;
	private JLabel title, carNameLabel, carNumberLabel, carCelphonLabel, carEmailLabel, carAddrLabel;
	private JTextField carNameText, carNumberText, carCelphonText, carEmailText, carAddrText;
	private JTextArea resultText;
	private JButton submitButton, listButton, loginButton;
	public CarService carService;

	public void open() {
		carService = new CarServiceImpl();

		setTitle("Swing Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		container.add(title);

		carNameLabel = new JLabel("carName");
		carNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		carNameLabel.setSize(100, 20);
		carNameLabel.setLocation(100, 100);
		container.add(carNameLabel);

		carNameText = new JTextField();
		carNameText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		carNameText.setSize(190, 20);
		carNameText.setLocation(200, 100);
		container.add(carNameText);

		carNumberLabel = new JLabel("carNumber");
		carNumberLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		carNumberLabel.setSize(100, 20);
		carNumberLabel.setLocation(100, 150);
		container.add(carNumberLabel);

		carNumberText = new JTextField();
		carNumberText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		carNumberText.setSize(150, 20);
		carNumberText.setLocation(200, 150);
		container.add(carNumberText);

		carCelphonLabel = new JLabel("carCelphon");
		carCelphonLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		carCelphonLabel.setSize(100, 20);
		carCelphonLabel.setLocation(100, 200);
		container.add(carCelphonLabel);

		carCelphonText = new JTextField();
		carCelphonText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		carCelphonText.setSize(150, 20);
		carCelphonText.setLocation(200, 200);
		container.add(carCelphonText);

		carEmailLabel = new JLabel("carEmail");
		carEmailLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		carEmailLabel.setSize(100, 20);
		carEmailLabel.setLocation(100, 250);
		container.add(carEmailLabel);

		carEmailText = new JTextField();
		carEmailText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		carEmailText.setSize(150, 20);
		carEmailText.setLocation(200, 250);
		container.add(carEmailText);

		carAddrLabel = new JLabel("carAddress");
		carAddrLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		carAddrLabel.setSize(100, 20);
		carAddrLabel.setLocation(100, 300);
		container.add(carAddrLabel);

		carAddrText = new JTextField();
		carAddrText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		carAddrText.setSize(150, 20);
		carAddrText.setLocation(200, 300);
		container.add(carAddrText);

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
			carNameText.setText("정혜원,김경표,안류경,김서영,최은교");
			carNumberText.setText("11111,22222,33333,44444,55555");
			carCelphonText.setText("010-0000-0000,017-1111-1111,019-2222-2222,018-3333-3333,011-4444-4444");
			carAddrText.setText("심곡동,역곡,원종동,한울아파트,부평");
			carEmailText.setText("kpLove@mail,hwLove@mail,dansuDansu@mail,ronLove@mail,goldFinger@mail");
			String[] name = carNameText.getText().split(",");
			String[] number = carNumberText.getText().split(",");
			String[] celphon = carCelphonText.getText().split(",");
			String[] addr = carAddrText.getText().split(",");
			String[] email = carEmailText.getText().split(",");
			Car[] car = new Car[5];
			for (int i = 0; i < car.length; i++) {
				car[i] = new Car();
				car[i].setCarName(name[i]);
				car[i].setCarNumber(number[i]);
				car[i].setCarCelphon(celphon[i]);
				car[i].setCarAddr(addr[i]);
				car[i].setCarEmail(email[i]);
				carService.add(car[i]);

			}
		

		} else if (e.getSource() == listButton) {
			Car[] carlist = carService.getCars();

			String result = "";
			for (int i = 0; i < carlist.length; i++) {
				result += (carlist[i].getCarName() + " / " 
						+ carlist[i].getCarNumber() + " / "
						+ carlist[i].getCarCelphon() + "/" 
						+ carlist[i].getCarAddr() + " \n " 
						+ carlist[i].getCarEmail()
						+ "\n");

			}
			carNameText.setText("");
			carNumberText.setText("");
			carCelphonText.setText("");
			carAddrText.setText("");
			carEmailText.setText("");
			resultText.setText(result);
			
		} else if (e.getSource() == loginButton) {
			Car car = new Car();
		JOptionPane.showMessageDialog(this,carNameText.getText() + carNumberText.getText());
		car.setCarName(carNameText.getText());
		car.setCarNumber(carNumberText.getText());
			Car ok = carService.login(car);
			if(ok!= null) {
				JOptionPane.showMessageDialog(this, "성공");
			}else {
			JOptionPane.showMessageDialog(this, "실패");
			}
	
			
		} 

		}

	}

