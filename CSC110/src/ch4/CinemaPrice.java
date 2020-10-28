package ch4;
//**********************************************************
//Program Name: CinemaPrice.java
//Author : Brandon Phillips
//Date Written : 2/9/2018
//Class : CSC110/CIS163
//
//Brief Description: Gives the price per ticket based on a randomly generated age
//**************************************************************
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
public class CinemaPrice {
	
	public static void main(String[] args)
	{
		{	
		//label variables
		int age;
		double price;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		
		//ask for price
		System.out.println("Please enter the cinema ticket price: ");
		price = scan.nextDouble();
		
		//generate age
		age = generator.nextInt(100)+1;
		System.out.println("Your age is: " + age);
		
		//Calculate price 
		if (age < 5)
		{ 
			price = 0.0;
			System.out.println("Your ticket price is: " + cFmt(price) + " which is free");
		}
		else if (age <= 12)
		{
			price = price/2.0;
			System.out.println("Your ticket price is: " + cFmt.format(price) + " which is half price ");
		}
		else if (age <= 54)
		{
			System.out.println("Your ticket price is: " + cFmt.format(price) + " which is full price");
		}
		else 
		{
			price = 0.0;
			System.out.println("Your ticket price is: " + cFmt.format(price) + " which is free");
		}

		
		scan.close();
	}
	}

	private static String cFmt(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

/* My output
Please enter the cinema ticket price: 
10
Your age is: 98
Your ticket price is: $0.00 which is free
Please enter the cinema ticket price: 
10
Your age is: 31
Your ticket price is: $10.00 which is full price
 
 */
