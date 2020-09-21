package solutions.activity5;
import solutions.activity5.cards.*;
import solutions.activity5.hands.*;

public class Activity5 {

	public static void main(String[] args) {
		Deck<PlayingCard> d = new Deck<PlayingCard>(52);
		HandOfCards[] hands = new HandOfCards[3];
		hands[0] = new HandOfTwo();
		hands[1] = new ArrayHand();
		hands[2] = new ArrayListHand();
		
		for (HandOfCards hand : hands) {
			hand.add((PlayingCard) d.dealOne());
			hand.add((PlayingCard) d.dealOne());
			hand.print();
			System.out.println();
		}
	}
}