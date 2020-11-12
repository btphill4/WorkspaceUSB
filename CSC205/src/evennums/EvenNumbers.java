package evennums;

import java.util.Iterator;

public class EvenNumbers implements Iterator<Integer> {

	private Integer num;
	private int max;
	
	public EvenNumbers() {
		this(Integer.MAX_VALUE);
	}
	
	public EvenNumbers(int max) {
		super();
		this.num = 0;
		this.max = max;
	}

	@Override
	public boolean hasNext() {
		return (num <= max);
	}

	@Override
	public Integer next() {
		if (this.hasNext()) {
			Integer ret = num;
			num = num + 2;
			return ret;
		}
		else {
			return null;
		}
	}
	
}
