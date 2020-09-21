package iteratorExample;

public class Iterator 
{
	public static void main(String[] args) {
		EvenNumbers evens = new EvenNumbers(10);
		EvenNumbers moreEvens = new EvenNumbers();
		
		System.out.println("Evens (iterator) : ");
		while (evens.hasNext())
		{
			System.out.print(evens.next() + " ");
		}
		
		System.out.println();
		System.out.println("MoreEvens: ");
		
}
}