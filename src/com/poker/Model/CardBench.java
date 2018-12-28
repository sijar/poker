/**
 * Class is ADT called CardBench
 * CardBench will always have 5 cards. 
 * Date:- 17-July-2008
 * @author SIJAR
 */

package com.poker.Model;

import java.util.Arrays;

import com.poker.CardUtil.CardComparator;
import com.poker.CardUtil.CardGenerator;

public final class CardBench { 

	//Fields	
	private static Card[] CardBench = new Card[5];;  //Object[] of Card

	//Constructor	
	public CardBench(){  
		//CardBench = new Card[5]; //Default Bench Size
	}	

	//Methods	
	/**
	 * Getters
	 * @return Card[]
	 */
	public static Card[] getCardBench(){
		return CardBench;
	}
	/**
	 * Setters
	 * @param Card[]
	 */
	private void setSuite(Card[] CardBench){
		com.poker.Model.CardBench.CardBench = CardBench;
	}

	/**
	 * Method to fill the Whole Bench
	 * @author SIJAR
	 */
	public static void fillWholeCardBench(){	
		for(int i=0; i<CardBench.length; ++i){
			CardBench[i] = CardGenerator.generateACard();
		}
	}

	/**
	 * Method to fill the Whole Bench
	 * @author SIJAR
	 * @param position
	 */	
	private static void fillCardBenchAt(int position){	
		CardBench[position] = CardGenerator.generateCards(1).get(0);
	}	

	/**
	 * Method to get a Card from the CardBench
	 * @author SIJAR
	 * @param position; 0<= position <= length-1
	 */	
	public static Card getCardAt(int position){	
		return CardBench[position];
	}

	/**
	 * Method to Update the CardBench
	 * @author SIJAR
	 * @return integer
	 * @param Card
	 * @param position
	 */	
	public static int UpdateCardBench(Card card , int position){		
		if(card == null){
			return -1;
		}
		CardComparator cc = new CardComparator();
		//Check Duplicate
		for(Card c: CardBench){
			if(cc.compare(c,card)== 0 ){ 
				return -1; //failure Duplicate
			}
		}
		//Insert card
		CardBench[position] = card;	
		return position; //return where inserted 
	}

}	

