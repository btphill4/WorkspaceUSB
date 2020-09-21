package bag;

import java.util.ArrayList;
import java.util.Iterator;

public class MyBag<T> implements Bag<T> {
	
	private ArrayList<T> thing;
	private int size = 0;
	
	public MyBag()
	{
		thing = new ArrayList<T>();
	}

	@Override
	public boolean isEmpty() {
		return (thing.size() == 0);
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(Object item) {
		item = thing;
		size++;
		}

	@Override
	public Iterator<T> iterator() {
		return thing.iterator();
		
	}

}
