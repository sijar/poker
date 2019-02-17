/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface BetIncrButtonHandler is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.controller;

import com.poker.Model.GameBet;
import com.poker.Model.GameCredit;
import com.poker.view.GameGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class BetIncrButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {		
		System.out.println(e.getActionCommand());
		if(GameGui.getDealButton().isVisible()){
			if(GameBet.increaseBet(1)){
				GameCredit.decreaseCredit(1);
				GameGui.getCreditLabel().setText("Credit=" + GameCredit.getCredit());
			}
		}
		GameGui.getBetLabel().setText("Bet =" + GameBet.getBet());
	}
}	
