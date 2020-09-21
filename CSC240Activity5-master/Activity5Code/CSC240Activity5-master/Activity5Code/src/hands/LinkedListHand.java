import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import hands.HandOfCards;
import week06.jsjf.LinearNode;
import week06.jsjf.ListADT;
import week06.jsjf.LinkedList.LinkedListIterator;
import week06.jsjf.exceptions.ElementNotFoundException;
import week06.jsjf.exceptions.EmptyCollectionException;

public class LinkedListHand<PlayingCards> implements HandOfCards {
	
	linkedList<PlayingCard> hand;
	
	public LinkListHand()
	{
		super();
		this.hand = new LinkedList<PlayingCard>();
	}
	
	public void drawOne(PlayingCard c)
	{
		hand.add(c);
	}
	
	public void print() {
	System.out.println("LinkedListHand:");
	int count = 1;
	for (PlayingCard c : hand) {
	System.out.println("Card " + count + ": " + c);
	count ++;
	}
	
}
