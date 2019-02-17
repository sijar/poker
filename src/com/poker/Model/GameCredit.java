/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface GameCredit is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.Model;

import com.poker.view.GameGui;

public class GameCredit { 

	//Fields
	private static Integer Credit = 5;

	//Constructor	
	public GameCredit(){ 
		//Credit = 5;   //DEFAULT CREDIT
	}

	/** 
	 * @param Rank
	 */
	public GameCredit(Integer Credit){
		GameCredit.Credit = Credit;
	}


	//Methods	
	/**
	 * Getters
	 * @return Integer
	 */
	public static Integer getCredit(){
		return Credit;
	}
	/**
	 * Setters
	 * @param Suite
	 */
	public static void setCredit(Integer Credit){
		GameCredit.Credit = Credit;
	}


	/**
	 * Method to increase Credit
	 */
	public static void increaseCredit(int incr){
		Credit += incr;
	}

	/**
	 * Method to decrease Credit
	 */
	public static void decreaseCredit(int incr){
		if(Credit-incr >= 0){
			Credit -= incr;
		}			
		//Check for losing Condition
		//if(Credit == 0){
			//GameGui.getResultLabel().setText(" ***YOU LOSE***" + "\n");
			//System.exit(1);
		//}

	}

}