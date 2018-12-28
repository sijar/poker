/**
 * Class is ADT called GameRules
 * Date:- 17-July-2008
 * @author SIJAR
 */

package com.poker.CardRules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.poker.Model.Card;
import com.poker.Model.CardBench;
import com.poker.Model.PlayingCard;

public final class GameRules { 

	//Fields

	//Constructor

	//Methods
	private GameRules(){
	}



	/**
	 * Method to figure out JACK_OR_BETTER
	 * @author SIJAR
	 */
	public static boolean isJackOrBetter(){

		Card[] cardBench = CardBench.getCardBench();		
		for(int i=0; i<cardBench.length-1; ++i){
			if( cardBench[i].getRank() <= PlayingCard.CardRank.JACK.ordinal()){
				for(int j=i+1; j<cardBench.length; ++j){
					if(cardBench[i].getRank() == cardBench[j].getRank()){
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Method to figure out TWO_PAIR
	 * Two different pair.
	 * @author SIJAR
	 */
	public static boolean isTwoPair(){
		List<Integer> pairList = new ArrayList<Integer>();
		int pairCount=0;
		Integer previousRank = null;
		for(int i=0; i<(CardBench.getCardBench().length-1); ++i){
			if(isPaired(i)){
				pairList.add(CardBench.getCardAt(i).getRank());
			}
		}
		Collections.sort(pairList);
		for(Integer rank : pairList){
			if(rank != previousRank){
				previousRank = rank;
				++pairCount;
			}
		}
		if(pairCount == 2){
			return true;
		}
		return false;
	}

	/**
	 * Method to figure out PAIR
	 * @return boolean
	 * @param index
	 * @author SIJAR
	 */
	public static boolean isPaired(int index){
		Card[] cardBench = CardBench.getCardBench();		
		for(int j=index+1; j<cardBench.length; ++j){
			if( cardBench[index].getRank() == cardBench[j].getRank()){
				return true;
			}
		}
		return false;
	}	

	/**
	 * Method to figure out 3_OF_A_KIND
	 * @author SIJAR
	 */
	public static boolean isThreeOfAkind(){

		Card[] cardBench = CardBench.getCardBench();		
		for(int i=0; i<cardBench.length-2; ++i){
			for(int j=i+1; j<cardBench.length-1; ++j){
				for(int k=j+1; k<cardBench.length; ++k){
					if((cardBench[i].getRank()==cardBench[j].getRank())&&(cardBench[j].getRank()==cardBench[k].getRank())&&(cardBench[k].getRank()==cardBench[i].getRank())){
						return true;
					}
				}
			}	
		}	
		return false;
	}

	/**
	 * Method to figure out STRAIGHT
	 * i.e All in a Sequence
	 * @author SIJAR
	 */
	public static boolean isStraight(){

		Card[] cardBench = CardBench.getCardBench();
		int i=0;
		//Sort the no.s
		for(i=0; i<cardBench.length-1; ++i){
			for(int j=i+1; j<cardBench.length; ++j){				
				if(cardBench[i].getRank() > cardBench[j].getRank()){
					//Swap
					Card temp = cardBench[i];
					cardBench[i] = cardBench[j];
					cardBench[j] = temp;
				}
			}
		}
		//Sorted array
		for(i=0; (i<cardBench.length-1) && ((cardBench[i].getRank() == (cardBench[i+1].getRank()-1))) ; ++i)
			; //no operation			
		if(i == (cardBench.length-1)){
			return true;
		}
		return false;
	}

	/**
	 * Method to figure out Color
	 * @author SIJAR
	 */
	public static boolean isColour(){

		Card[] cardBench = CardBench.getCardBench();
		int i;
		for(i=0; (i<cardBench.length-1) && (cardBench[i].getSuite() == cardBench[i+1].getSuite()) ; ++i){
			if( (i == cardBench.length-1) && (! isStraight()) ){
				return true;
			}
		}			
		return false;
	}

	/**
	 * Method to figure out 4_OF_A_KIND
	 * @author SIJAR
	 */
	public static boolean isFourOfAkind(){

		Card[] cardBench = CardBench.getCardBench();		
		for(int i=0; i<cardBench.length-3; ++i){
			for(int j=i+1; j<cardBench.length-2; ++j){
				for(int k=j+1; k<cardBench.length-1; ++k){
					for(int l=k+1; l<cardBench.length; ++l){
						if((cardBench[i].getRank()==cardBench[j].getRank())&&(cardBench[j].getRank()==cardBench[k].getRank())&&(cardBench[k].getRank()==cardBench[l].getRank())){
							return true;
						}
					}
				}	
			}
		}
		return false;
	}

	/**
	 * Method to figure out StraightColor
	 * @author SIJAR
	 */
	public static boolean isStraightColour(){
		if( isColour() && isStraight()){
			return true;
		}
		return false;
	}

	/**
	 * Method to figure out FullHouse
	 * @author SIJAR
	 */
	public static boolean isFullHouse(){
		if( isTwoPair() && isThreeOfAkind()){
			return true;
		}
		return false;
	}

	/**
	 * Method to figure out RoyalFlush
	 * @author SIJAR
	 */
	public static boolean isRoyalFlush(){

		Card[] cardBench = CardBench.getCardBench();
		//FIND ACE
		for(int i=0; i<cardBench.length; ++i){
			if(cardBench[i].getRank() == 0 ){
				if(isStraightColour()){ //if in sequence & same suite
					return true;
				}
			}
		}
		return false;
	}


}
