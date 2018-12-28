/**
 * Utility class to cards based upon RANK and SUITE
 * Date:- 21-JULY-2008
 * @author SIJAR
 */
package com.poker.CardUtil;

import java.util.Comparator;
import com.poker.Model.Card;

public class CardComparator implements Comparator<Card> {

	public int compare(Card c1, Card c2) {
		
	   if((c1.getRank()== c2.getRank()) && (c1.getSuite() == c2.getSuite()) ){
		   return 0;
	   }
	   else {
		   return -1;
	   }
	}	
}