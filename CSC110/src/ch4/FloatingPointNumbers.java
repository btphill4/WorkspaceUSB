package ch4;
//demo to show floating point equality issues
public class FloatingPointNumbers {

	public static void main(String[] args) {
		
		double x = 1.0;
		double y = 3.0/7.0 + 2.0/7.0 + 2.0/7.0;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		if (x == y)
			System.out.println("x and y are equal");
		else 
			System.out.println("x and y are not equal");
		
		
		//Check the absolute value of their difference
		//is it less than a given tolerance
		if (Math.abs(x - y) < (0.000001))
			System.out.println("They are the same with a tolerance of 0.000001");	
				
		else 
			System.out.println("They are the same with a tolerance of 0.000001");
		
		
		
	}

}
