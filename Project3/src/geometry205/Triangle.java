package geometry205;

public class Triangle extends Shapes
{
	public double base;
	public double height;
	public double perimeter;
	public double area;
	
	
	public Triangle(double newBase, double newHeight)
	{
		base = newBase;
		height = newHeight;
	}
	
	public double getArea()
	{
		area = (base* height)/2;
		return area;
	}
	
	public double getPerimeter()
	{
		perimeter = base + base + base;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", perimeter=" + perimeter + ", area=" + area + "]";
	}
	
	
	
}
