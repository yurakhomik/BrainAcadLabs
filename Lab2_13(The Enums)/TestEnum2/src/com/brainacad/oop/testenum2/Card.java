package com.brainacad.oop.testenum2;

import com.brainacad.oop.testenum2.Main.Rank;
import com.brainacad.oop.testenum2.Main.Suit;

public class Card {

	private Suit cardSuit;
	private Rank cardRank;
	
	public Suit getSuit() {
		return cardSuit;
	}
	
	public Card (Suit cardSuit, Rank cardRank) {
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	}

	@Override
	public String toString() {
		return "The Card: " + cardSuit + "_" + cardRank ;
	}
	
	
}
