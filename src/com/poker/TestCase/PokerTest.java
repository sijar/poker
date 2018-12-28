package com.poker.TestCase;

import com.poker.CardUtil.CardGenerator;
import com.poker.Model.Card;
import com.poker.Model.CardBench;
import com.poker.Model.CardContainer;
import com.poker.view.GameGui;

class PokerTest {

	public static void main(String[] arg){

		CardBench.fillWholeCardBench();
		System.out.println("All Cards");
		for(Card c : CardContainer.fetchCardList()){
			System.out.println(c.getSuite()+"__"+ c.getRank()+ "\t"); 
		}		
		System.out.println("5 cards in Card-Bench");
		for(Card c : CardBench.getCardBench()){
			System.out.print(c.getSuite()+"__"+ c.getRank()+ "\t"); 
		}
		new GameGui();
	}
	
}