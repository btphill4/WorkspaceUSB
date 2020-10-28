package ch2;
//Program Name:  	CoffeeCostCalulator
//Author:  			Brandon Phillips
//Class:  			CSC 110
//Date:  			1/24/2018
//Description:  	

/*   IN Class Demo - Ch 2
     Program Name : MoreCalculations.java 
	  Author: P Baker
	  Date : 
     
     Brief Description:  Demo the following
		Looking at calculations with integers and doubles.

		Of special interest is integer division.
		Show conversion with assignment
		Show conversion via promotion
		Show conversion with casting with (double)

		Using modulo in conjunction with integer division.

		Using final to declare a constant.  Note constants are
		traditionally written in all caps.

		The code starts out as a skeleton.  We will add to it
		together in class.
 */




public class MoreCalculations
{


	private static final int NICKEL_VALUE = 0;

	public static void main(String[] args)
	{

		//variable declarations

		int iResult;
		double dResult;


		iResult = 13 / 6;
		//System.out.println("iResult = " + iResult);

		int x = 10;
		int y = 6;

		//dResult = iResult;  //example of conversion with assignment
		dResult = (double)(x) / y;



		//System.out.println("dResult = " + dResult);

		//Modular arithmetic
		int totalCash = 4;
		int nickels = totalCash / NICKEL_VALUE;
		final int NICKEL_VALUE = 5;


		System.out.println("Total Cash = " + totalCash);
		System.out.println("Nickels = " + nickels);


		int penniesLeft = totalCash % 5;

		System.out.println("Pennies left = " + penniesLeft);
		
		


	}




}