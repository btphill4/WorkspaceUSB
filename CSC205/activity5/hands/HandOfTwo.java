package solutions.activity5.hands;

import solutions.activity5.cards.PlayingCard;

// HandOfTwo is a class implementing a hand of 2 cards using 2 variables
public class HandOfTwo implements HandOfCards {

	PlayingCard card1;
	PlayingCard card2;

	public void HandOf2() {
		card1 = null;
		card2 = null;
	}

	public void add(PlayingCard c) {
		if (card1 == null)
			card1 = c;
		else if (card2 == null)
			card2 = c;
		// else hand is full, do nothing
	}

	public void print() {
		System.out.println("HandOfTwo:");
		if (card1 != null)
			System.out.println("Card 1: " + card1);
		if (card2 != null)
			System.out.println("Card 2: " + card2);
	}

}
