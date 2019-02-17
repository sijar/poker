/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CardPanelController is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import com.poker.CardUtil.CardImageGenerator;
import com.poker.view.GameGui;

/**
 * Class shows the Back of the card Before Drawing new Cards
 * @author SIJAR
 */

public final class CardPanelController {

	/**
	 * Method will show Back of the cards
	 * @author SIJAR
	 */
	public static void showCardCover() {
		ImageIcon coverImage = new ImageIcon(CardImageGenerator.CARD_IMAGE_DIRECTORY + "cover.png");
		for(JLabel GuiCardLabel : GameGui.getCardLabel()){
			GuiCardLabel.setIcon(coverImage);			
		}
	}
	
}
