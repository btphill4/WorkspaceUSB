package geometry205;

public class Square extends Shapes
{
	public double area;
	public double length;
	public double perimeter;
	
	

	//methods
	public Square(double newLength) 
	{
		length = newLength;
	}
	
	public double getArea() {
		area = length * length;
		return area;
	}
	
	public double getPerimeter()
	{
		perimeter = length + length;
		return perimeter;
	}
	public double getLength() {
		return length;
	}
	
	@Override
	public String toString() 
	{
		return "Square [area= " + getArea() + ", length= " + length + ", perimeter= " + getPerimeter() + "]";
	}
	
	
	
}
