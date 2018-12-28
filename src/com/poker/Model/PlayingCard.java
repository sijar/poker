/**
 * Class to keep Card Properties
 * Date:- 17-July-2008
 * @author SIJAR
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