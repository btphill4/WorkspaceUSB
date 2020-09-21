package ch4;

// ****************************************************************
//   Program Name : LoveJavaSolution.java
//	  Author : PBaker
//   Date:
//   Description:
//     Use a while loop to print many messages declaring your
//     passion for java.
//   
// ****************************************************************
import java.util.Scanner;

public class LoveJavaSolution
{
    public static void main(String[] args)
    {
		int limit;
		int count;
		int sum;
		String evenOrOdd;
		String again = "y";
		
		Scanner scan = new Scanner (System.in);

		
		do 
		{
			System.out.print("How many times to you want to print the message?  ");
			limit = scan.nextInt();
	
			sum = 0;
			count = 1;
			
			for (count = 1; count <= limit; count++)
			{

			//when a number is divided by 2, if the remainder is 0 it is even!!
			evenOrOdd = (count % 2 == 0)? "even": "odd";
			
			/* same as 
			if (count % 2 == 0 )
			{   evenOrOdd = "even"; }
			else
			{   evenOrOdd = "odd"; }
			*/
	
		    System.out.println(count + " I love Java!!"
		    			+ " This number is " + evenOrOdd + ".");
	
		   sum += count; //needs to come before incrementing count
		   // count++;
		}

			System.out.println("Message was printed " + limit + " times.");
			System.out.println("The sum of the numbers from 1 to " + limit + " is " + sum + ".");
			
			System.out.println("Would you like to run this again? (y/n)");
			again = scan.next();
    } while (again.equalsIgnoreCase("y"));
    
		System.out.println("\nGood bye! \n" );


    }
}

/* Example output

 How many times to you want to print the message?  3
    1 I love Java!! This number is odd.
    2 I love Java!! This number is even.
    3 I love Java!! This number is odd.
    Message was printed 3 times.
    The sum of the numbers from 1 to 3 is 6.
    
    Good bye! 

*/
