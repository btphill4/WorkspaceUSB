package ch4;
//**********************************************************
//Program Name: CinemaPrice.java
//Author : Brandon Phillips
//Date Written : 2/18/2018
//Class : CSC110/CIS163
//
//Brief Description: Gives the price per ticket based on a randomly generated age
//**************************************************************
import java.util.Scanner;
import java.text.NumberFormat;


public class CinemaPriceEnhanced {

	public static void main(String[] args) {
		
		//label variables
		int age = 0;
		double price = 0.0;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		
		//ask for price
		System.out.println("Please enter the cinema ticket price: ");
		price = scan.nextDouble();
		System.out.println("Please enter your age (0 to quit): ");
		age = scan.nextInt();
		
		//Calculate price 
		while (age !=0) //using a 0 sentinel
			{
		if (age < 5)
			{ 
				price = 0.0;
				System.out.println("Your ticket price is: " + cFmt.format(price) + " which is free");
			}
			else if (age <= 12)
			{
				price = price/2.0;
				System.out.println("Your ticket price is: " + cFmt.format(price) + " which is half price ");
			}
			else if (age <= 54)
			{
				price = 15.00;
				System.out.println("Your ticket price is: " + cFmt.format(price) + " which is full price");
			}
			else 
			{
				price = 0.0;
				System.out.println("Your ticket price is: " + cFmt.format(price) + " which is free");
			}
					System.out.println("Please enter your age (0 to quit): ");		
					age = scan.nextInt();
			}
			System.out.println("Good bye");
	}
	
}
/* My output
Please enter the cinema ticket price: 
15.00
Please enter your age (0 to quit): 
10
Your ticket price is: $7.50 which is half price 
Please enter your age (0 to quit): 
24
Your ticket price is: $15.00 which is full price
Please enter your age (0 to quit): 
0
Good bye
*/
