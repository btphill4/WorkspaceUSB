package week05.genaricExample;

public class Box<T> {
	
	T thing;

	public Box() {
		super();
		this.thing = null;
	}
	public Box(T thing) {
		super();
		this.thing = thing;
	}

	public void add(T t) {
		thing = t;
	}
	
	public T whatIsInTheBox() {
		return thing;
	}

	@Override
	public String toString() {
		return "[" + thing + "]";
	}
	
}
