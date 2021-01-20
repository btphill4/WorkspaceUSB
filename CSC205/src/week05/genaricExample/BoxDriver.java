package week05.genaricExample;

import java.util.ArrayList;

public class BoxDriver {

	public static void main(String args[]) {
		Box<String> box1 = new Box<String>("Hello, world!");
		Box<Integer> box2 = new Box<Integer>(6);
		Box<Cat> box3 = new Box<Cat>(new Cat("Bentley"));
		Box<ArrayList<Object>> box4 = new Box<ArrayList<Object>>();
		
		ArrayList<Object> stuff = new ArrayList<Object>();
		stuff.add(1);
		stuff.add("Bob");
		stuff.add('A');
		stuff.add(new Cat("Garfield"));
		stuff.add(box1);
		box4.add(stuff);
		
		//box1.add(10);
		//box2.add("Goodbye!");
		
		System.out.println("Box 1: + " + box1);
		System.out.println("Box 2: + " + box2);
		System.out.println("Box 3: + " + box3);
		System.out.println("Box 4: + " + box4);
	}
}
