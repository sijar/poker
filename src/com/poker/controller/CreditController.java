/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CreditController is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.controller;

import com.poker.Model.GameCredit;
import com.poker.Model.GameBet;
import com.poker.view.GameGui;

public final class CreditController {	

	public static void setRoyalFlush() {
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*500) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setStraightColor() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*120) ;		
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setFourOfAKind() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*50) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setFullHouse() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*10) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setColor() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*7) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setStraight() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*5) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setThreeOfAKind() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.setCredit(GameCredit.getCredit()*3) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setTwoPair() {
		// TODO Auto-generated method stub
		GameCredit.increaseCredit(GameBet.getBet());
		GameCredit.increaseCredit(GameCredit.getCredit()) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setJackOrBetter() {
		// TODO Auto-generated method stub		
		GameCredit.increaseCredit(GameBet.getBet()) ;
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

	public static void setLose() {
		// TODO Auto-generated method stub
		GameGui.getCreditLabel().setText("Credit = "+ GameCredit.getCredit());
	}

}
