package solutions.activity5.cards;
// Card class
// Constructor creates a joker, deal() method sets a rank & suit.
import java.util.Random;

public class PlayingCard {

	public final static String suits[] = {"None", "Hearts", "Spades", "Diamonds", "Clubs"};
	public final static String ranks[] = {"Joker", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
											"10", "Jack", "Queen", "King"};
	private int rank;
	private int suit;
	
	/**
	 * Default constructor sets the card to a random value
	 */
	public PlayingCard ()
	{
		// Set each data member to a random number between 1 and length-1
		Random randNum = new Random();
		this.setRank(randNum.nextInt(ranks.length-1) + 1);
		this.setSuit(randNum.nextInt(suits.length-1) + 1);
	}
	
	/**
	 * Constructor with String values
	 * 
	 * @param rank the rank name
	 * @param suit the suit name
	 */
	public PlayingCard (String rank, String suit)
	{
		
		this.rank = find_entry(rank, ranks);
		this.suit = find_entry(suit, suits);
	}	
	
	/**
	 * Find the index of an entry in an array
	 * 
	 * @param value   the entry to search for
	 * @param values  array to search
	 * @return        index of the value in values (0 default)
	 */
	private static int find_entry(String value, String values[]) 
	{
		int ret = 0;
		for (int ii=0;ii<values.length;ii++)
		{
			if (value.toUpperCase() == values[ii].toUpperCase()) 
				ret = ii;
		}
		return ret;
	}
	
	/**
	 * Constructor with int values
	 * 
	 * @param rank the rank index
	 * @param suit the suit index
	 */
	public PlayingCard (int rank, int suit)
	{
		// Use setters instead of directly assigning so that any logic
		//   validating the values can reside in one place.
		this.setRank(rank);
		this.setSuit(suit);
	}


	// Getters & Setters
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank % ranks.length;
	}
	public void setRank(String rank) {
		this.rank = find_entry(rank, ranks);
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit % suits.length;
	}
	public void setSuit(String suit) {
		this.suit = find_entry(suit, suits);
	}
	
	/**
	 * Return string representation of the Card
	 * 
	 * @return string in the form "rank of suit"
	 */
	public String toString ()
	{
		return (ranks[rank] + " of " + suits[suit]);
	}
	
}