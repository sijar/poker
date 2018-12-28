/**
 * Class is Controller of the CardPanel.
 * Created on 26-July-2008
 * @author SIJAR
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
	public final static void showCardCover() {
		ImageIcon coverImage = new ImageIcon(CardImageGenerator.CARD_IMAGE_DIRECTORY + "cover.png");
		for(JLabel GuiCardLabel : GameGui.getCardLabel()){
			GuiCardLabel.setIcon(coverImage);			
		}
	}
	
}
