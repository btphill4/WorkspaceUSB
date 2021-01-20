package geometry205;

public abstract class Shapes
{
	public double area;
	public double perimeter;
	public abstract double getArea();
	public abstract double getPerimeter();

	public String toString()
	{
		return "Area = " + area + " Periemter = " + perimeter;
	}
}
