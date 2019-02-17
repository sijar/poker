/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface ResultController is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.controller;


import com.poker.CardRules.GameRules;
import com.poker.Model.GameCredit;
import com.poker.view.GameGui;

public final class ResultController {

	/**
	 * Method will check rules and manipulate Credit
	 */
	public static void ResultAction() {
		if(GameRules.isRoyalFlush()){
			GameGui.getResultLabel().setText(" *** ROYAL FLUSH ***");
			CreditController.setRoyalFlush();
		}

		else if(GameRules.isStraightColour()){
			GameGui.getResultLabel().setText(" *** STRAIGHT COLOR ***");
			CreditController.setStraightColor();
		}

		else if(GameRules.isFourOfAkind()){
			GameGui.getResultLabel().setText(" *** FOUR OF A KIND ***");
			CreditController.setFourOfAKind();
		}
		else if(GameRules.isFullHouse()){
			GameGui.getResultLabel().setText(" *** FULL HOUSE ***");
			CreditController.setFullHouse();
		}

		else if(GameRules.isColour()){
			GameGui.getResultLabel().setText(" *** COLOR ***");
			CreditController.setColor();
		}

		else if(GameRules.isStraight()){
			GameGui.getResultLabel().setText(" *** STRAIGHT ***");
			CreditController.setStraight();
		}

		else if(GameRules.isThreeOfAkind()){
			GameGui.getResultLabel().setText(" *** 3 OF A KIND ***");
			CreditController.setThreeOfAKind();
		}

		else if(GameRules.isTwoPair()){
			GameGui.getResultLabel().setText(" *** 2 PAIR ***");
			CreditController.setTwoPair();
		}

		else if (GameRules.isJackOrBetter()){
			GameGui.getResultLabel().setText(" *** JACK OR BETTER ***");
			CreditController.setJackOrBetter();
		}
		else {
			CreditController.setLose();
			//Check for Game over Condition
			if(GameCredit.getCredit() == 0){
				GameGui.getLoseLabel().setVisible(true);
				System.out.print("GAME OVER");
				try {
					Thread.currentThread().sleep(2000);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				CardPanelController.showCardCover();
			}						
			GameGui.getResultLabel().setText(" *** YOU LOSE ***");
		}
	}
}
