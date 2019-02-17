/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 6/2/19 11:22 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface GameGui is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package com.poker.view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

import com.poker.CardUtil.CardImageGenerator;
import com.poker.Model.GameBet;
import com.poker.Model.GameCredit;
import com.poker.controller.BetDecrButtonHandler;
import com.poker.controller.BetIncrButtonHandler;
import com.poker.controller.CardPanelController;
import com.poker.controller.DealButtonHandler;
import com.poker.controller.DrawCardButtonHandler;

public class GameGui extends javax.swing.JFrame { 

	//Fields
	private static final long serialVersionUID = -2552572822158031190L;
	private static javax.swing.JButton incrBet;
	private static javax.swing.JButton DecrBet;
	private static javax.swing.JLabel BetLabel;
	private static javax.swing.JLabel CreditLabel;
	private static javax.swing.JLabel ResultLabel;
	private static javax.swing.JPanel UpperPanel;	
	private static javax.swing.JLabel[] CardLabel;
	private static javax.swing.JLabel LoseLabel;
	private static javax.swing.JPanel CardPanel;
	private static javax.swing.JPanel RadioPanel;
	private static javax.swing.JPanel ResultPanel;	
	private static javax.swing.JRadioButton[] HoldButton;
	private static javax.swing.JButton DealButton;
	private static javax.swing.JButton DrawCardButton;
	private static javax.swing.ImageIcon[] cardImage;
	final int origX;	
	final int origY;

	// Constructor
	public GameGui() {
		initComponents();
		pack();
		origX = getSize().width;
		origY = getSize().height;
		//Add Components
		ShowUpperPanel();
		ShowCardPanel();
		ShowRadioPanel();
		ShowResultPanel();
		ShowMainPanel();
		setVisible(true);
	}	

	//Methods
	/**
	 * Getters & setters for Buttons
	 */
	public static JButton getIncrBet(){
		return incrBet;
	}
	public static JButton getDecrBet(){
		return DecrBet;
	}
	public static JButton getDealButton(){
		return DealButton;
	}
	public static JButton getDrawCardButton(){
		return DrawCardButton;
	}
	public static JRadioButton[] getHoldButton(){
		return HoldButton;
	}	

	/**
	 * Getters & setter for Labels 
	 * 
	 */
	public static JLabel getBetLabel(){
		return BetLabel;
	}
	public static JLabel getCreditLabel(){
		return CreditLabel;
	}
	public static JLabel getResultLabel(){
		return ResultLabel;
	}
	public static JLabel[] getCardLabel(){
		return CardLabel;
	}
	public static JLabel getLoseLabel(){
		return LoseLabel;
	}
	
	/**
	 * Getters & setters for Image
	 */
	public static ImageIcon[] getCardImage(){
		return cardImage;
	}
	public static void setCardImage(ImageIcon[] Image){
		cardImage = Image; 
	}


	/**
	 *  Method is called from within the constructor to initialize the Game
	 *  @author SIJAR
	 */
	private void initComponents() {
		incrBet = new javax.swing.JButton("BET ++");
		DecrBet = new javax.swing.JButton("BET --");
		DealButton = new JButton("DEAL");
		DrawCardButton = new JButton("DRAW NEW CARDS");
		//Initially Hide Deal Button
		DealButton.setVisible(false);
		HoldButton = new JRadioButton[5]; //5 Cards

		UpperPanel = new JPanel(new GridBagLayout()); //Best to add complex comp
		CardPanel = new javax.swing.JPanel(new GridLayout(1,5,120,0)); //Best to add comp in series
		RadioPanel = new javax.swing.JPanel(new GridLayout(1,5,150,0)); //2 rows, 5 colum
		ResultPanel = new javax.swing.JPanel(new FlowLayout());	

		CardLabel = new JLabel[5];  //5 Cards		
		BetLabel = new javax.swing.JLabel("Bet =" + GameBet.getBet());		
		CreditLabel = new javax.swing.JLabel("Credit =" + GameCredit.getCredit());
		ResultLabel = new javax.swing.JLabel(" Result ==>" );
		LoseLabel = new javax.swing.JLabel("*********** GAME OVER **************");		
		cardImage = new ImageIcon[5]; //5 Cards
		//Show 5 Defaults Cards
		/*
		cardImage[0] = new ImageIcon("image/1_0.png");	
		cardImage[1] = new ImageIcon("image/2_11.png");
		cardImage[2] = new ImageIcon("image/1_3.png");
		cardImage[3] = new ImageIcon("image/1_9.png");
		cardImage[4] = new ImageIcon("image/3_7.png");
		 */

		//For window closing
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				windowResized(evt);
			}
		});

		//Set ActionListener for each Button
        incrBet.setActionCommand("Bet++ button pressed");
		incrBet.addActionListener(new BetIncrButtonHandler());
		DecrBet.setActionCommand("Bet-- button pressed");
		DecrBet.addActionListener(new BetDecrButtonHandler());
		DealButton.setActionCommand("Deal button pressed");
		DealButton.addActionListener(new DealButtonHandler());
		DrawCardButton.setActionCommand("DrawCards button pressed");
		DrawCardButton.addActionListener(new DrawCardButtonHandler());

		
	}

	private void windowResized(java.awt.event.ComponentEvent evt){
		setSize(
				(getWidth() < origX) ? origX : getWidth(),
						(getHeight() < origY) ? origY : getHeight());
	}


	private void ShowUpperPanel() {		 
		UpperPanel.add(BetLabel, new GridBagConstraints(6,1,3,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0) ,0,0));
		UpperPanel.add(CreditLabel,new GridBagConstraints(10,1,3,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0) ,0,0));	
		UpperPanel.add(incrBet,new GridBagConstraints(1,0,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.CENTER,new Insets(0,0,0,0) ,0,0));	
		UpperPanel.add(DecrBet,new GridBagConstraints(1,3,2,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.CENTER,new Insets(0,0,0,0) ,0,0));
	}

	private void ShowCardPanel() {		
		int i=0;
		for(ImageIcon icon : CardImageGenerator.generateImageAsInBench()){
			cardImage[i++] = icon; 
		}
		i=0;
		for(ImageIcon image : cardImage){
			CardLabel[i++] = new JLabel(image,JLabel.CENTER); 
		}
		for(i=0; i<CardLabel.length; ++i){
			CardPanel.add(CardLabel[i]);
		}
		CardPanelController.showCardCover();
	}

	private void ShowRadioPanel() {		
		for(int i=0;i<HoldButton.length;++i){
			HoldButton[i] = new JRadioButton("HOLD",false);
		}
		for(JRadioButton radio : HoldButton){
			RadioPanel.add(radio);
		}
	}

	private void ShowResultPanel() {
		ResultPanel.add(DrawCardButton);
		ResultPanel.add(DealButton);
		ResultPanel.add(ResultLabel);
		ResultPanel.add(LoseLabel);
		LoseLabel.setVisible(false);
	}

	private void ShowMainPanel() {
		getContentPane().setLayout(new GridLayout(4,1)); //4 rows,1 column		
		getContentPane().add(UpperPanel);
		getContentPane().add(CardPanel);
		getContentPane().add(RadioPanel);
		getContentPane().add(ResultPanel);
	}
	
}	