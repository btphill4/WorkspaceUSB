package geometry205;

import geometry205.*;

public class Project2TestDriver {

	public static void main(String[] args) {
		// Create rectangle with l=3, w=4
		Rectangle r1 = new Rectangle(3,4);
		// Create square wtih s=4
		Square s1 = new Square(4);
		// Create a circle with r=4
		Circle c1 = new Circle(4);
		
		System.out.println("Project 2 Test Driver");
		
		System.out.println(r1.toString());
		System.out.println(s1.toString());
		System.out.println(c1.toString());
	}

}
