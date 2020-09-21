package evennums;

public class IteratorExample {

	public static void main(String[] args) {
		EvenNumbers evens = new EvenNumbers(10);
		EvenNumbers moreEvens = new EvenNumbers();
		
		System.out.print("Evens (iterator): ");
		while(evens.hasNext()) {
			System.out.print(evens.next() + " ");
		}
		
		System.out.println();
		System.out.print("MoreEvens: ");
		for(int ii=0;ii<20;ii++) {
			System.out.print(moreEvens.next() + " ");
		}
		System.out.println();
	}

}
