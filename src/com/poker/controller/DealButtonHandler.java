/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface DealButtonHandler is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.controller;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import com.poker.CardUtil.CardImageGenerator;
import com.poker.Model.CardBench;
import com.poker.view.GameGui;
import com.poker.controller.ResultController;

public final class DealButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {		
		System.out.println(e.getActionCommand());
		
		//Wait for Bet to be Raised
		//while(GameBet.getBet() <= 0) ; //Nop
		
		int i=0;
		//Change the CardBench according to value of HOLD
		for(JRadioButton holdButton : GameGui.getHoldButton()){
			if(!(holdButton.isSelected())){
				CardBenchController.insertNewCardInBench(i);				
			}
			++i;
		}
		for(com.poker.Model.Card card : CardBench.getCardBench()){
			System.out.print(card.getSuite()+"__"+ card.getRank()+ "\t");
		}
		//Set the Bench card to Image
		i=0; //re-initialize
		JLabel[] GuiCardLabel = GameGui.getCardLabel();
		for(ImageIcon image : CardImageGenerator.generateImageAsInBench()){
			GuiCardLabel[i++].setIcon(image);			
		}
		//Hide Deal & show Draw
		GameGui.getDrawCardButton().setVisible(true);
		GameGui.getDealButton().setVisible(false);
		
		//POPULATE RESULT AND SHOW
		ResultController.ResultAction();
	}
}
