package hands;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;

import cards.PlayingCard;
import java.util.Random;

// Complete ArrayListHands which implements the HandOfCards interface using an ArrayList

public class ArrayListHand<PlayingCards> implements HandOfCards, Iterable<Object> {
	
		PlayingCards thing;
		PlayingCard card1 = null;
		PlayingCard card2 = null;

	public ArrayListHand()
	{
		super();
		this.thing = null;
	}
	
	public ArrayListHand(PlayingCards t)
	{
		thing = t;
	}
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(PlayingCard c) {
		if (card1 == null)
			card1 = c;
		else if (card2 == null)
			card2 = c;
		// else hand is full, do nothing
		
	}

	@Override
	public void print() {
		if (card1 != null)
			System.out.println("Card 1: " + card1);
		if (card2 != null)
			System.out.println("Card 2: " + card2);
	}

	
}
