/**
 * Class is ADT called Card
 * Date:- 17-July-2008
 * @author SIJAR
 */

package com.poker.Model;

public class Card implements PlayingCard{ 
	
	//Fields
	//private String Colour;
	private Integer Suite;
	private Integer Rank;
	
	//Constructor
	
	public Card(){  			//Default card
		//Colour = CARD_RED;
		Suite = CardSuite.CLUB.ordinal();
		Rank = CardRank.NINE.ordinal();
	}
	
	/**
	 * 
	 * 
	 * @param Suite
	 * @param Rank
	 */
	public Card(Integer Suite, Integer Rank ){
		//this.Colour = Colour;
		this.Suite = Suite;
		this.Rank = Rank;
	}
	
	
	//Methods
	
	/**
	 * Getters
	 * @return Integer
	 */
	public Integer getSuite(){
		return Suite;
	}
	/**
	 * Setters
	 * @param Suite
	 */
	public void setSuite(Integer Suite){
		this.Suite = Suite;
	}
	/**
	 * Getters
	 * @return String
	 */
	/*
	public String getColour(){
		return Colour;
	}*/
	/**
	 * Setters
	 * @param Colour
	 */
	/*
	public void setColour(String Colour){
		this.Colour = Colour;
	}*/	
	/**
	 * Getters
	 * @return Integer
	 */
	public Integer getRank(){
		return Rank;
	}
	/**
	 * Setters
	 * @param Rank
	 */
	public void setRank(Integer Rank){
		this.Rank = Rank;
	}
	
	
	//Method to compare Cards	
	/**
	 * Method to compare 2 different cards
	 */
	public Card compareCards(Card c1,Card c2){
		if(c1 == null && c2 == null){
			return null;
		}
		else if (c1 == null || c2 == null){
			return((c1 == null)? c2:c1 ); //Return which is not null			
		}
		//Only way to compare to cards
		else if((c1.getSuite() == c2.getSuite())){
			return (c1.getRank() > c2.getRank()) ? c1:c2;
		}
		return null;
	}
	
}
