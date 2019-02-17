/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface PlayingCard is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.Model;

//enum CardColour{RED,BLACK};
//enum CardSuite{CLUB,HEARTS,DIAMOND,SPADE};


public interface PlayingCard {
	
	enum CardRank{ACE,KING,QUEEN,JACK,NINE,EIGHT,SEVEN,SIX,FIVE,FOUR,THREE,TWO};
	enum CardSuite{CLUB,HEART,DIAMOND,SPADE};
	//public static final String CARD_RED = "0";
	//public static final String CARD_BLACK = "1";
	
	//public static final String SUITE_CLUB = "CLUB";
	//public static final String SUITE_HEART = "HEART";
	//public static final String SUITE_DIAMOND = "DIAMOND";
	//public static final String SUITE_SPADE= "SPADE";
	
}