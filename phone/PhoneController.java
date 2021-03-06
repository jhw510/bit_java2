package com.jse.phone;

import java.awt.Component;

import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class PhoneController {
	
	public static void main(String[] args) {

		PhoneOldService phoneService = new PhoneOldService();
		String message = "";
		Constants MENU = new Constants();
	System.out.println(phoneService.toString());
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				return;

			case "1":
				for (int i = 0; i < 3; i++) {

					String[] values = JOptionPane
							.showInputDialog(Constants.PHONE_MENU)
							.split(",");

					phoneService.add(new Phone(values[0], values[1], values[2]));

				}
				break;
			case "2":
				Phone[] phones = phoneService.getPhones();
				message = "";
				for (int i = 0; i < 3; i++) {
					
					message += phones[i].toString()	;				/*
					 * ( "번호: "+phones[i].getPhoneNumber()+" 이름: " + phones[i].getName() + " 통신사: "
					 * +phones[i].getCompany());
					 */
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {

					String[] values = JOptionPane
							.showInputDialog(Constants.CELPHONE_MENU)
							.split(",");

					phoneService.add(new CelPhone(values[0], values[1], values[2], true));

				}
				break;

			case "4":
				CellPhone[] cellPhones = phoneService.getCellPhones();

				for (int i = 0; i < 3; i++) {
					CelPhone celPhone = cellPhones[i];
					message += cellPhones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);

				break;

			case "5":

				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					phoneService.add(new Iphone(values[0], values[1], values[2], true, values[4]));
				}

				break;
			case "6":
				Iphone[] iPhones = phoneService.getIphones();
				message = "";
				for(int i=0; i< 3;i++) {
					message += iPhones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
			

			
					
				break;
			
			case "7" :
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU).split(",");
					phoneService.add(new GalaxyNote(values[0], values[1], values[2], 
															true, values[3], values[4]));
				}
				break;
			case "8": 
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNote(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += galaxyNotes[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				
			}
		}
	}
}
