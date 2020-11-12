package ch4;

/* Introducing If statements

		Conditions
		Comparison operators > < >= <= != ==

		using the else statement rather than 2 if statements
		short-circuit evaluation


		Scenario:  you can vote if you are 18 or older.
		Enter age and then display appropriate message.

		Using Scanner method nextInt() to retrieve the age that is entered.

 */

 import java.util.Scanner;
 import java.util.Random;
 
 public class Voter
{

	public static void main(String[] args)
    {
		int age;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		//System.out.print ("Enter your age: ");
		//age = scan.nextInt();
		
		age = generator.nextInt(101);
		System.out.println(age);
		
		
		/*using an if..else statement,
		  to display message
	 	*/
		
		if (age > 18 && age < 105)  
		{
		System.out.println("You can vote");
		}
			else 
				if (age == 18)
			{
				System.out.println("Make sure you register");
			}
		
			else
			{
				System.out.println("You cannot vote");
			}
		
		
		scan.close();
	}

}