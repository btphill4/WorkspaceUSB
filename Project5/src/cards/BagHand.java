package cards;

import java.util.ArrayList;
import java.util.Iterator;
import cards.PlayingCard;


public class BagHand implements HandOfCards, Iterable<PlayingCard>
{
	private ArrayList<PlayingCard> thing;
	private int rank;
	
	//Constructors
	public BagHand()
	{
		super();
		this.thing = new ArrayList<PlayingCard>();
	}

	//methods
	@Override
	public void add(PlayingCard c) 
	{
		thing.add(c);
	}
	@Override
	public void print() 
	{
	System.out.print("BagHand: ");
	int count = 1;
	for(PlayingCard c : thing)
		{
			String ret = "Card" + count + ": " + c + " ";
			count++;
		}
	}

	public Iterator<PlayingCard> iterator() {
		return thing.iterator();
	}


	public String getValue() {
		String ret = null;
		int value = 0;
		for (int i = 0; i <= 21; i++)
		{
			if(PlayingCard.getRank() > 10)
			{
				value = 10;
			}
			else if (PlayingCard.getRank() == 1)
			{
				value = 11;
			}
			else 
			{
				value = PlayingCard.getRank();
			}
		}
		if (value == 21)
		{
			ret = "Blackjack";
		}
		return ret;
	
	}

}
	
	
	
	
	
	

