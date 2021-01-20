package solutions.activity5.hands;

import java.util.ArrayList;
import java.util.Iterator;

import solutions.activity5.cards.PlayingCard;

// Complete ArrayListHands which implements the HandofCards interface using an ArrayList

public class ArrayListHand implements HandOfCards, Iterable<PlayingCard> {

	ArrayList<PlayingCard> hand;
	
	public ArrayListHand() {
		super();
		this.hand = new ArrayList<PlayingCard>();
	}

	@Override
	public void add(PlayingCard c) {
		hand.add(c);
	}

	@Override
	public void print() {
		System.out.println("ArrayListHand:");
		int count = 1;
		for (PlayingCard c : hand) {
			System.out.println("Card " + count + ": " + c);
			count ++;
		}
	}

	@Override
	public Iterator<PlayingCard> iterator() {
		return hand.iterator();
	}
}
