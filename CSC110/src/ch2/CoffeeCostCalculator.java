package ch2;
//Program Name:  	CoffeeCostCalulator
//Author:  			Brandon Phillips
//Class:  			CSC 110
//Date:  			1/22/2018
//Description:  	Calculates the cost of buying a cup of coffee.

import java.util.Scanner;
public class CoffeeCostCalculator {

	public static void main(String[] args) {
		
		double singleCupCost = 2.25;
		double weeklyCost = singleCupCost * 7;
		double yearlyCost = weeklyCost * 52;
		Scanner scan = new Scanner(System.in);
		
		
		final int daysInWeek = 7;
		final int weeksInYear = 52;
		
		//Get the Single Cup Cost from the user
		System.out.println("Please enter the cost of one cup of coffee");
		singleCupCost = scan.nextDouble();
		
		weeklyCost = singleCupCost * daysInWeek; 
		yearlyCost = weeklyCost * weeksInYear; 
		
		System.out.println("Coffee Cost Calculator");
		System.out.println("----------------------");
		System.out.println("The cost of one cup of coffee is: $" + singleCupCost);
		System.out.println("The cost of one week of coffee is: $" + weeklyCost);
		System.out.print("The cost of one year of coffee is: $" + yearlyCost);
		System.out.println("    WOW! That is pricey!!");
	}

}


/* My Output
 

Coffee Cost Calculator
----------------------
The cost of one cup of coffee is: $2.25
The cost of one week of coffee is: $15.75
The cost of one year of coffee is: $819.0

The Challenge

Please enter the cost of one cup of coffee
4.75
Coffee Cost Calculator
----------------------
The cost of one cup of coffee is: $4.75
The cost of one week of coffee is: $33.25
The cost of one year of coffee is: $1729.0    WOW! That is pricey!!
 */
