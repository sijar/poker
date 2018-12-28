package com.poker.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.poker.CardUtil.CardImageGenerator;
import com.poker.Model.CardBench;
import com.poker.Model.GameBet;
import com.poker.Model.GameCredit;
import com.poker.view.GameGui;

public final class DrawCardButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("Draw_Card Button Pressed");
		//INITIALIZE EVERYTHING THAT RELEVENT

		GameBet.clearBet(); //init-Bet
		GameGui.getBetLabel().setText("Bet = " +GameBet.getBet());
		
		//if credit is zero make it 5
		if(GameCredit.getCredit() == 0){
		GameCredit.increaseCredit(5);
		GameGui.getCreditLabel().setText("Credit ="+ GameCredit.getCredit());
		}
		//init-HoldButton
		for(JRadioButton holdButton :GameGui.getHoldButton()){
			holdButton.setSelected(false);			
		}
		//init-Cards
		CardBench.fillWholeCardBench();
		int i=0;
		JLabel[] GuiCardLabel = GameGui.getCardLabel();
		for(ImageIcon image : CardImageGenerator.generateImageAsInBench()){			
			GuiCardLabel[i++].setIcon(image);
		}
		//init-Result
		GameGui.getResultLabel().setText("Result==>");
		
		//Hide DrawButton & Unhide Deal
		GameGui.getDrawCardButton().setVisible(false);
		GameGui.getDealButton().setVisible(true);
		GameGui.getLoseLabel().setVisible(false);
	}

}
