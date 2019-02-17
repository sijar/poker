/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardBenchController is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.controller;

import com.poker.CardUtil.CardGenerator;
import com.poker.Model.Card;
import com.poker.Model.CardBench;

public final class CardBenchController {
	
	/**
	 * Method to insert/update the CardBench
	 * with a unique card
	 * @author SIJAR
	 * @param position
	 */	
	public static void insertNewCardInBench(int position){		
		Card card = CardGenerator.generateACard();		
		//TODO (Find a Better Logic)
		while(CardBench.UpdateCardBench(card,position) < 0 ){
			card = CardGenerator.generateACard();
		}		
	}	
	
}
