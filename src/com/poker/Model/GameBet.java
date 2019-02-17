/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface GameBet is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.Model;

public class GameBet { 

	//Fields
	private static Integer Bet = 0;

	//Constructor	
	public GameBet(){ 
		Bet = 0;   //DEFAULT CREDIT
	}

	/** 
	 * @param Bet
	 */
	public GameBet(Integer Bet){
		GameBet.Bet = Bet;
	}


	//Methods	
	/**
	 * Getters
	 * @return Integer
	 */
	public static Integer getBet(){
		return Bet;
	}
	/**
	 * Setters
	 * @param Suite
	 */
	public void setBet(Integer Bet){
		GameBet.Bet = Bet;
	}

	/**
	 * Method to Clear Bet
	 */
	public static void clearBet(){
			Bet = 0;
		System.out.print("Bet = "+Bet);
	}


	/**
	 * Method to increase Bet
	 */
	public static boolean increaseBet(int incr){
		if((GameCredit.getCredit()-incr) >= 0 ){
		Bet+=incr;
		System.out.print("Bet = "+Bet);
		return true;
		}
		return false;
	}

	/**
	 * Method to decrease Bet
	 */
	public static boolean decreaseBet(int decr){
		if(Bet-decr >= 0){
			Bet -= decr;
			return true;
		}
		System.out.print("Bet = "+Bet);
		return false;
	}


}
