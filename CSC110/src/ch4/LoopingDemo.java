package ch4;

/* Program Name :  LoopingDemo
   
	We will use this demo to look at 3 different looping constructs
		    while
		    do..while
		    for

    [1] With each looping construct we will display 12345

    [2] Show how to add up numbers 1- 5 in loop

    [3] Nested for loop

    Patricia Baker
 */

public class LoopingDemo
{

	public static void main (String[] args)
	{


		/* Review the while loop.  It displays 1 -  5 */

		System.out.println("\n*****while loop******");
		int counter = 1;
		while (counter <= 5)   //displays 1 - 5
		 { 
			System.out.print(counter + "\t");
			counter++;
		}


		System.out.println();

		int sum = 0;
		System.out.println("\n*****for loop******");
			for (counter = 1; counter <= 5; counter++)
				System.out.print(counter + "\t");
			sum = sum + counter;
				System.out.print("The sum is: " + sum);
			




		System.out.println();

		
		//Do/while loop
		System.out.println("\n*****do..while loop******");
		do 
		{	
			System.out.print(counter + "\t");
			counter++;
		}
			while (counter <= 5);
	


		System.out.println();




		/*
		  Nested for loops.  Creating 6 rows of numbers 1 - 5

		 */

		System.out.println("\n*****nested for loop******");
		
		for (int row = 1; row <= 5; row++)
		{
			for (int col = 1; col <= row; col++)
			{	
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
   
	
	
	
	}

}
