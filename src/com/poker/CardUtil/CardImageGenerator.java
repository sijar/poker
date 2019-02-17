/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardImageGenerator is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.CardUtil;


import java.util.Arrays;
import com.poker.Model.Card;
import com.poker.Model.CardBench;
import java.io.*;
import javax.swing.ImageIcon;

/**
 * Class purpose is to generate card's Image
 * @author SIJAR
 */
public final class CardImageGenerator {

	//Fields
	public static final String CARD_IMAGE_DIRECTORY = "image/";

	/**
	 * Method will generator images from cardBench
	 * @return ImageIcon[]
	 * @author SIJAR
	 */
	public static ImageIcon[] generateImageAsInBench() {
		//FETCH CARDS FROM BENCH
		ImageIcon[] images = new ImageIcon[5];
		int i=0;
		for(Card card : CardBench.getCardBench()){
			images[i++] = SearchCardImage(card);  //Search for this card
		}
		return images;
	}

	/**
	 * Method that will search the file then return its image
	 * @param card
	 * @return ImageIcon
	 * @author SIJAR
	 */
	private static ImageIcon SearchCardImage(Card card) {
		try {
			String imageFile = card.getSuite().toString() + "_" + card.getRank().toString()+ ".png"; //suite_rank   	
			//File directory = new File(CARD_IMAGE_DIRECTORY);
			//String[] DirFiles = directory.list();

			//if(Arrays.binarySearch(DirFiles,imageFile) >= 0){ //Why Null
				return (new ImageIcon(CARD_IMAGE_DIRECTORY + imageFile));
			//}
		} catch(Exception fe){
			fe.printStackTrace();
		}
		return null;
	}

}
