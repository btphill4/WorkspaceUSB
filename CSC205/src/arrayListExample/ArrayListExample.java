package arrayListExample;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		
		//initiate row two with a list
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(3,4));
		matrix.add(row1);
		matrix.add(row2);
		
		
		
		
		for (int ii = 0; ii < 10; ii++)
		{
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
		
		//iterator
		System.out.println("Numbers (iterator) : ");
		Iterator<Integer> nums = numbers.iterator();
		while (nums.hasNext())
		{
			System.out.print(nums.next() + " ");
		}
		
		//For-each loop
		System.out.println("Numbers (for-each) : ");
		for (Integer x : numbers)
		{
			System.out.print(x + " ");
		}
		
		System.out.println(" I have " + numbers );
	}


}
