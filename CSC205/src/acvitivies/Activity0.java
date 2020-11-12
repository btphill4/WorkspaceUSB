// Brandon Phillips 

package acvitivies;
import java.util.Scanner;
public class Activity0 {

	public static void main(String[] args)
	{
		//intialize variables
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		do		//do while loop to make sure input is no higher than 20
		{
		// Asks for user input to chose integer >= 20 
		System.out.println("Enter a number no higher than 20: ");
		x = scan.nextInt();
		}
		while (x > 20);
			
		//prints the all numbers from 1 to x
		System.out.println("Numbers: ");
		for (int num = 1;num <= x; num++)
		{
			System.out.print(num + " ");
		}
		
		//prints only even numbers
		System.out.println("\nEvens: " );
		for (int num = 1;num <= x; num++)
		{
			if (num % 2 == 0)
			{	
			System.out.print(num + " ");
			}
		}	
		//Activity changing multiples of 5 and 7 to strings
		System.out.println("\nActivity: " );
		for (int num1 = 1;num1 <= x; num1++)
		{
			if (num1 % 5 == 0)
			{
				String fiver = Integer.toString(num1);
			    fiver = "fiver";
				System.out.print(fiver + " ");
			}
			else if (num1 % 7 == 0)
			{
				String seven = Integer.toString(num1);
				seven = "ssss";
				System.out.print(seven + " ");
			}
			else
			{
				System.out.print(num1 + " ");
			}
		}
		scan.close();
	}	
		
}

