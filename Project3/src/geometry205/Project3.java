package geometry205;

public class Project3 
{
	public static void main(String[] args) 
	{
		System.out.println("Project 3 tester");
		System.out.println("");
			// Create rectangle with l=4, w=3
				Shapes r1 = new Rectangle(4,3);
				// Create square with s=5
				Shapes s1 = new Square(5);
				// Create a circle with r=4
				Circle c1 = new Circle(4);
				// Create a right Triangle with b=7, h=6
				Shapes t1 = new Triangle(7,6);
				
				//calculate total area
			for(int i = 0; i < 1; i++)
			{
				double a1 = r1.getArea();
				double a2 = s1.getArea();
				double a3 = c1.getArea();
				double a4 = t1.getArea();
				
				double totalArea = a1 + a2 + a3 + a4;
				System.out.println("The total area is " + totalArea);
			}
			System.out.println("");
			System.out.println(r1.toString());
			System.out.println(s1.toString());
			System.out.println(c1.toString());
			System.out.println(t1.toString());
		
		
		

	}

}
