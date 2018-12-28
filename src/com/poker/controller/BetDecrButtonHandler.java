/**
 * Class is to handle BetDecr Button
 * Date: 21-JULY-2008
 * @author SIJAR
 */

package com.poker.controller;

import java.awt.event.*;
import com.poker.Model.GameBet;
import com.poker.Model.GameCredit;
import com.poker.view.GameGui;

public final class BetDecrButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());

		if(GameGui.getDealButton().isVisible()){
			if(GameBet.decreaseBet(1)){
				GameCredit.increaseCredit(1);
				GameGui.getCreditLabel().setText("Credit=" + GameCredit.getCredit());
			}
		}
		GameGui.getBetLabel().setText("Bet =" + GameBet.getBet());
	}	
}
