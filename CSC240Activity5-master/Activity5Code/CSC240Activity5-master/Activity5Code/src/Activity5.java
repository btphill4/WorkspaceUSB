import java.util.LinkedList;

import cards.*;
import hands.*;

public class Activity5 {

	public static void main(String[] args) {
		Deck d = new Deck(52);
		HandOfTwo hand = new HandOfTwo();
		LinkedList<E> hand2 = new LinkedListHand();		
		
		hand.add(d.dealOne());
		hand.add(d.dealOne());

		hand2.add(d.dealOne());
		hand2.add(d.dealOne());
		
		System.out.println("Hand :");
		hand.print();
		
		System.out.println("Hand2 :");
		hand2.print();
	}
	
	
}
