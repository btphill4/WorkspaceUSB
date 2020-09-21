package iteratorExample;


import java.util.Iterator;

public class EvenNumbers implements Iterator<Integer>
{
	private Integer num;
	private int max;
	
	public EvenNumbers()
	{
		this(Integer.MAX_VALUE);
	}
	
	public EvenNumbers(int max)
	{
		super();
		this.num = 0;
		this.max = max;
	}
	
	public boolean hasNext()
	{
		return (num + 1 < max);
	}
	
	public Integer next()
	{
		Integer ret = num;
		if (this.hasNext()) 
		{
		ret = num;
		num = num + 2;
		return ret;
		}
		else 
		{
		return ret;
		}
	}
}
