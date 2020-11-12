package geometry205;

public class Rectangle extends Shapes 
{
	public double area;
	public double length;
	public double width;
	public double perimeter;
	
	//methods
	public Rectangle(double newLength, double newWidth) 
	{
		length = newLength;
		width = newWidth;
	}

	public double getArea() {
		area = length * width;
		return area;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public double getPerimeter() {
		perimeter = length + width;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Rectangle [area= " + getArea() + ", length= " + length + ", width= " + width + ", perimeter= " + getPerimeter() + "]";
	}

	
	
	
	
	
	
	
	
}
