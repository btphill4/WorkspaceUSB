package ch3;
//Program Name:  	ChangeMaker.java
//Author:  			Brandon Phillips, 
//Class:  			CSC 110
//Date:  			1/26/2018
//Description:  	Generates a random phone number with a few restraints


import java.text.DecimalFormat;
import java.util.Random;

public class PhoneNumber {

	public static void main(String[] args) 
	{
		
	Random generator = new Random();	
	int num1, num2, num3, num4, num5;
	
	num1 = generator.nextInt(8);
	num2 = generator.nextInt(8);
	num3 = generator.nextInt(8);
	
	num4 = generator.nextInt(743);
	num5 = generator.nextInt(10000);
	
	DecimalFormat dFmt = new DecimalFormat("000");
	System.out.println("My new phone number is: " + num1 + num2 + num3 + "-" + dFmt.format(num4) + "-" + dFmt.format(num5));
	}

}

/* My Output
My new phone number is:673-21-1018
*/
