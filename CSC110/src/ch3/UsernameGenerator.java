package ch3;
//**********************************************************
//Program Name: UsernameGenerator.Java
//Author : Brandon Phillips
//Date Written : 1/31/2018
//Class : CSC110/CIS163
//
//Brief Description:  Generate a random username
//**************************************************************


import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator {

	public static void main(String[] args) {
		
		
		String name1 = " "; 
		String name2 = " "; 
		String year;
		int num1, num2, num3;
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		//ask for input 
		System.out.println("Welcome. This program will help you create a username");
		System.out.print("Enter your first name: ");
		name1 = keyboard.nextLine();
		
		System.out.print("Enter your Last name: ");
		name2 = keyboard.nextLine();
		
		System.out.print("Enter your birth year: ");
		year = keyboard.nextLine();
		
		//generate 3 random numbers
		num1 = generator.nextInt(25)+50;
		num2 = generator.nextInt(100)+1;
		num3 = generator.nextInt(1000)+1000;
		
		//Generate usernames
		System.out.println();
		System.out.println("Here are the three possible usernames generated for you");
		System.out.println(name1.substring(0,2) + name1.length() + name2 + num1);
		System.out.println(name1.substring(0) + name2 + year.substring(2,4) + num2);
		System.out.println(name1.substring(0,3) + year.substring(0,2) + name1 + num3);
		
	
	}

}

/* My Output
Welcome. This program will help you create a username
Enter your first name: Brandon
Enter your Last name: Phillips
Enter your birth year: 1999

Here are the three possible usernames generated for you
Br7Phillips60
BrandonPhillips9928
Bra19Brandon1916
*/