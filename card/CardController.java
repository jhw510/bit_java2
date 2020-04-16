package com.jse.card;

import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		
		CardService cardService = new CardServiceImpl();
		Card card = null;
		while (true) {
			System.out.println("0.종료    1.카드 3장 뽑기  2. 받은 카드 출력하기");
			
			switch(JOptionPane.showInputDialog(null)) {
			case "0": return;
			case "1": 
				
				
			for(int i=0;i<3;i++) {
			String[]valuse=JOptionPane.showInputDialog("카드 3장 받아요 모양,숫자").split(","); 
			card = new Card();
			card.setKind(valuse[i]);
			card.getNumber();
			cardService.add(card);
			
				
			}
			
			break;
			case "2" :
				Card[] cards = cardService.list();
				for(int i=0;i<3;i++) {
					System.out.println(String.format("카드모양 %s,카드넘버%d",
							cards[i].getKind(),cards[i].getNumber()));
				}
				break;
			
			}
		}
	}
}
