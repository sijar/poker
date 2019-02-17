/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardRankComparator is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.CardUtil;

import java.util.Comparator;
import com.poker.Model.Card;

public class CardRankComparator implements Comparator<Card> {

	public int compare(Card c1, Card c2) {
		return c1.getRank().compareTo(c2.getRank());
	}	
}