/**
 * Class is the controller called CardBenchController
 * CardBench will always have 5 cards. 
 * Date:- 21-July-2008
 * @author SIJAR
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
