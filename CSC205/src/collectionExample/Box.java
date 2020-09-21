package collectionExample;

public class Box<T> {

	T thing;
	
	public Box(T thing)
	{
		super();
	}
	
	public void add(T t)
	{
		thing = t;
	}
	
	public T whatsInTheBox()
	{
		return thing;
	}

	@Override
	public String toString() {
		return "[" + thing + "]";
	}
	
	
	
}
