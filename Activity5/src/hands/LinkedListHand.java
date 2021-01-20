package hands;

import java.util.Iterator;
import java.util.LinkedList;

import cards.HandOfCards;
import cards.PlayingCard;

public class LinkedListHand implements HandOfCards, Iterable<PlayingCard> {

	LinkedList<PlayingCard> hand;
	
	public LinkedListHand()
	{
		super();
		this.hand = new LinkedList<PlayingCard>();
	}
	@Override
	public Iterator<PlayingCard> iterator() {
		// TODO Auto-generated method stub
		return hand.iterator();
	}

	@Override
	public void add(PlayingCard c) {
		hand.add(c);
		
	}

	@Override
	public void print() {
		System.out.println("LinkedListHand:");
		int count = 1;
		for (PlayingCard c : hand) {
			System.out.println("Card " + count + ": " + c);
			count ++;
		}
		
	}

}
