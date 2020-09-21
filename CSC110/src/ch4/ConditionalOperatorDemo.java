package ch4;

public class ConditionalOperatorDemo {

	public static void main(String[] args) 
	{
		int n1 = 5;
		int n2 = 15;
		int max = 0;
		
		//find the max of 2 numbers
		//if(n1 > n2)
			//max = n1;
		//else
			//max = n2;
		
		//using a conditional operator
		//	= (condition)? true : false;
		//max = (n1 > n2)? n1 : n2;
		//System.out.println("Max: " + max);

		//Example 2
		int grade = 75;
		
		if (grade >= 60); 
			System.out.println("Passed");
			//else 
			System.out.println("failed");
		
		//Convert to a conditional operator
		System.out.println((grade >= 60)? "Passed" : "Failed"); 
		
		
	}

}
