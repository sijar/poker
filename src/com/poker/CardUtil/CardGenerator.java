/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardGenerator is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.CardUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


import com.poker.Model.Card;
import com.poker.Model.CardContainer;
import com.poker.Model.PlayingCard;

/**
 * Class purpose is to generate card
 * @author SIJAR
 */
public final class CardGenerator {

	/**
	 * Method will Create all 52 cards
	 * @return List<Card>
	 * @author SIJAR
	 */
	public static List<Card> generateAllCards() {
		List<Card> cardList = new ArrayList<Card>();		
		//Fill all cards
		for(int j = PlayingCard.CardSuite.CLUB.ordinal() ; j<=PlayingCard.CardSuite.SPADE.ordinal() ; ++j){
			for(int i = PlayingCard.CardRank.ACE.ordinal() ; i<=PlayingCard.CardRank.TWO.ordinal() ; ++i){
				cardList.add(new Card(j,i));
			}
		}
		return cardList;
	}

	/**
	 * Method will generator <code>limit</code>no. of Cards
	 * Cards will be generated randomly
	 * @param limit
	 * @return List<Card>
	 * @author SIJAR
	 */
	public static List<Card> generateCards(int limit) {		
		List<Card> cardList = new ArrayList<Card>();
		Random random = new Random(); //to generator random no.		
		for( ; limit>0 ; limit--){ 
			cardList.add(new Card(random.nextInt(4),random.nextInt(12)));
		} 
		return cardList;

		//FETCH CARDS FROM CONTAINER
		/*
		List<Card> cardList = new ArrayList<Card>();
		Iterator<Card> cardSetIterator = CardContainer.fetchCardList().iterator();
		for(int i=1; i<=limit; ++i){
			cardList.add(cardSetIterator.next());
		}
		return cardList;
		 */
	}	

	/**
	 * Method will generator one of Cards
	 * Cards will be generated randomly
	 * @param limit
	 * @return Card
	 * @author SIJAR
	 */
	public static Card generateACard() {		
		Card card = new Card();
		Random random = new Random(); //to generator random no.		
		return (new Card(random.nextInt(4),random.nextInt(12)));
	} 
}
