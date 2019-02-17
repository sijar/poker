/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardContainer is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.Model;

import java.util.HashSet;
import java.util.Set;

import com.poker.CardUtil.CardGenerator;

/**
 * Don't ever Change this class
 * @author SIJAR
 *
 */
public final class CardContainer { 

	//Fields
	private static Set<Card> cardList = new HashSet<Card>(); //Only Single cardList for application

	//Constructor	
	private CardContainer(){
	}

	/**
	 * 
	 * @param LinkedHashSet<Card>
	 */
	private CardContainer(HashSet<Card> cardList){
		CardContainer.cardList = cardList; 
	}


	//Methods

	/**
	 * Getters; NOT-VISIBLE TO ALL
	 * @return cardList
	 */
	private Set<Card> getCardList(){
		return cardList;
	}

	/**
	 * Setters; NOT-VISIBLE TO OTHERS
	 * @param Suite
	 */
	private void setCardList(HashSet<Card> cardList){
		CardContainer.cardList = cardList; 
	}

	//Method to retrieve CardList
	/**
	 * Method to retrieve CardList
	 * HashSet is used in order to randomize
	 * @author SIJAR
	 */
	public static Set<Card> fetchCardList(){	
		//must generate all 52  unique cards
	for(Card c : CardGenerator.generateAllCards()){
		cardList.add(c);
	}		
		return cardList;		
	}

}
