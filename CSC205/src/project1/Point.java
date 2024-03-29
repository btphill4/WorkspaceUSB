package project1;

public class Point {
	
		//initialize variables
		public double x;
		public double y;
		
		//Constructors
		Point()
		{
			x = 0.0;
			y = 0.0;
		}
		
		Point( double coordX, double coordY)
		{
			x = coordX;
			y = coordY;
		}
		
		//setters
		public void setX(double x)
		{
			this.x = x;
		}
		public void setY(double y)
		{
			this.y = y;
		}
		public void setPoint(double x, double y)
		{
			this.x = x;
			this.y = y;
		}
		//getters
		public double getX()
		{
			Double.toString(x);
			return x;
		}
		public double getY()
		{
			Double.toString(y);
			return y;
		}
		
		//shift numbers
		public void shiftX(double n)
		{
		x += n;	 
		}
		public void shiftY(double n)
		{
		y += n; 
		}
		
		//distance from points 
		//I wasn't able to get this to work 
		public double distance(Point b) 
		{
			double distance = Math.sqrt((Math.pow((getX()-b.getX()), 2) + Math.pow(getY()-b.getY(),2)));
			return distance;
		}

		public void rotate(double rotation) 
		{
		double newX = x*Math.cos(rotation) - y*Math.sin(rotation);
		double newY = x*Math.sin(rotation) + y*Math.cos(rotation);
		x = newX;
		y = newY;
		}

		//toString as ordered pairs
		public String toString()
		{
		 return "(" + getX() + "," + getY() + ")";	
		}
		
}
