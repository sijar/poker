/**
 * Utility class to sort cards based upon Suite
 * Date:- 17-JULY-2008
 * @author SIJAR
 */

package com.poker.CardUtil;

import java.util.Comparator;
import com.poker.Model.Card;

public class CardSuiteComparator implements Comparator<Card> {

	public int compare(Card c1, Card c2) {
		return c1.getSuite().compareTo(c2.getSuite());
	}	
}