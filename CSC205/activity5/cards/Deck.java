package solutions.activity5.cards;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Deck<T> implements Iterable<T>{
	private ArrayList<T> cards;
	private Random rand;

	public Deck(int n) {
		super();
		rand = new Random();
		cards = new ArrayList<T>(n);
		for (int suite = 1; suite <= 4; suite ++)
			for (int rank = 1; rank <= 13; rank ++) {
				if ((suite - 1) * 13 + rank <= n) { 
				  cards.add((T) new PlayingCard(rank, suite));
				}
			}
	}
	
	public T dealOne() {
		return cards.get(rand.nextInt(52));
	}
	
	public String toString(){
		String ret = "";
		for (T card : cards){
			ret += card + "\n";
		}
		return ret;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return cards.iterator();
	}
}
