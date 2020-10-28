package ch2;
//Program Name:  	ChangeMaker.java
//Author:  			Brandon Phillips
//Class:  			CSC 110
//Date:  			1/26/2018
//Description:  	This program gives the average of 3 tests scores


import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args)
	{
		
		//label the variables
		int amount, originalAmount;
		int quaters, dimes, nickels, pennies;
		Scanner keyboard = new Scanner(System.in);
		
		//Ask for input
		System.out.println("Welcome to ChangeMaker.");
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("I will find a combination of coins \n"
							+ "that equals that amount of change. \n");
		
		System.out.println("Please enter an amount from 1 to 99:");
		amount = keyboard.nextInt();
		
		originalAmount = amount; 
		
		//Calculate the quarters left
		quaters = amount / 25;
		amount = amount % 25;
		
		//Calculate the dimes
		dimes = amount / 10;
		amount = amount % 10;
		
		//Calculate the nickels
		nickels = amount / 5;
		amount = amount % 5;
		
		//Calculate the pennies
		pennies = amount / 1;
		amount = amount % 1;
		
		
		//gives change back
		System.out.println(quaters +"quaters");
		System.out.println(dimes +"dimes");
		System.out.println(nickels +"nickels");
		System.out.println(pennies +"pennies");
		
		
		
		
		
	}

}

/* My Output
Welcome to ChangeMaker.
Enter a whole number from 1 to 99.
I will find a combination of coins 
that equals that amount of change. 

Test Case 1
Please enter an amount from 1 to 99:
17
0quaters
1dimes
1nickels
2pennies

Test case 2
Please enter an amount from 1 to 99:
51
2quaters
0dimes
0nickels
1pennies

Test Case 3
Please enter an amount from 1 to 99:
17
0quaters
1dimes
1nickels
2pennies

Test Case 4
Please enter an amount from 1 to 99:
4
0quaters
0dimes
0nickels
4pennies

*/

