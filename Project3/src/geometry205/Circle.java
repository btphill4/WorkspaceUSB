package geometry205;
import java.lang.Math.*;

public class Circle 
{
	public double perimeter;
	public double radius;
	public double area;
	
	//methods
	public Circle(double newRadius)
	{
		radius = newRadius;
	}

	
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [perimeter=" + getPerimeter() + ", radius=" + radius + ", area=" + getArea() + "]";
	}

	
	
	
	
}
