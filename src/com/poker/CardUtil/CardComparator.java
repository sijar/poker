/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardComparator is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
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