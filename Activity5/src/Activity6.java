import java.util.LinkedList;

import cards.Deck;
import cards.PlayingCard;
import hands.LinkedListHand;

public class Activity6 {

	public static void main(String[] args) {
		Deck<PlayingCard> d = new Deck<PlayingCard>(52);
		LinkedListHand hand = new LinkedListHand();

		
			hand.add((PlayingCard) d.dealOne());
			hand.add((PlayingCard) d.dealOne());
			hand.print();
			System.out.println();
	
	}
}
