package com.brainacad.oop.testenum2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Card[] card = new Card[0];
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				card = Arrays.copyOf(card, card.length + 1);
				card[card.length - 1] = new Card (suit, rank);
			}
			
		}
		

		boolean[] isNextSuit = { false, false, false};
		for (Card el : card) {
			if(el.getSuit() == Suit.DIAMOND && isNextSuit[0] == false) {
				isNextSuit[0] = true;
				System.out.println();
			} else if (el.getSuit() == Suit.CLUB && isNextSuit[1] == false) {
				System.out.println();
				isNextSuit[1] = true;
			} else if (el.getSuit() == Suit.HEART && isNextSuit[2] == false) {
				System.out.println();
				isNextSuit[2] = true;
			}
			
			System.out.println(el);
		}
		
		
	}
	
	enum Suit {
		SPADE, DIAMOND, CLUB, HEART
	}
	
	enum Rank {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

}
