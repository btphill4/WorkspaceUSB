package project1;


public class Project1  {                

	public static void main(String[] args)                 
	{
		System.out.println("Project 1 : Points Tester\n");
		
		Point a = new Point(3.0, 1.0);
		Point b = new Point(6.0, 5.0);	
		
		System.out.println("Point 1: " + a);
		System.out.println("Point 2: " + b);
		
		System.out.println("\nDistance: " + a.distance(b));
		double rotation = Math.PI / 2.0;
		a.rotate(rotation);
		System.out.println("\nRotated a " + rotation + ": " + a);
		
		b.shiftX(4);
		b.shiftY(-2);
		System.out.println("Shifted b " + ": " + b);


	}
}
