package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		List<String> names = new ArrayList<String>();
		List<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		// Initialize row2 with a list
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(3,4));
		matrix.add(row1);
		matrix.add(row2);
				
		for(int ii=0;ii<10;ii++) {
			numbers.add(ii);
		}
		numbers.add(10);
		numbers.add(20);
		numbers.add(4);
		
		names.add("Twenty");
		names.add("Bob");
		names.add("Jeb");
		names.add("Sally");
		
		System.out.println("numbers: " + numbers);
		System.out.println("names: " + names);
		System.out.println("matrix: " + matrix);
		
		// Iterator
		System.out.print("Numbers (iterator) : ");
		Iterator<Integer> nums = numbers.iterator();
		while(nums.hasNext()) {
			System.out.print(nums.next() + " ");
		}
		
		// For-each loop
		System.out.print("\nNumbers (for-each) : ");
		for(Integer x : numbers) {
			System.out.print(x + " ");
		}

		System.out.println("\n\nI have " + names.size() + " names and " + 
		                   numbers.size() + " numbers");
	}

}
