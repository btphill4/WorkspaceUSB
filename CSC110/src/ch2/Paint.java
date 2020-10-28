package ch2;

//**********************************************************
//  In class Activity - ch 2  
//  Program Name : Paint.java
//
//  Author: Orhan Nebi, Brandon Phillips
//  Date Written : 1/24/2018
//  Class: CSC 110
//
//  Brief Description:
//  Determine how much paint is needed to paint the walls
//  of a room given its length, width, and height in feet
//**********************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
  			final int COVERAGE = 350;  //paint covers 350 sq ft/gal

			Scanner scan = new Scanner(System.in);

   		//declare double variables for length, width, height, totalSqFt, and paintNeeded;
			double length = 25;
			double width = 20;
			double height = 10;
			
			
	
	
	

  		 //Prompt for and read in the length of the room
		System.out.print ("Enter the length of the room: ");
		length = scan.nextDouble();

  		 //Prompt for and read in the width of the room
		System.out.print ("Enter the width of the room: ");
		width = scan.nextDouble();

  		 //Prompt for and read in the height of the room
		System.out.print ("Enter the height of the room: ");
		height = scan.nextDouble();


   	/*Compute the total square feet to be painted--think
     		about the dimensions of each wall*/
		double totalSqFt = 2 *( length *  height) + (2 *(width * height)); 
		 
		
   	//Compute the amount of paint needed
		double paintNeeded = totalSqFt / COVERAGE;
		
   	 //display your results  
		System.out.println();
		System.out.println (paintNeeded + " gallons of paint are needed to "
			    + "paint a room " + width + " feet wide by ");
		System.out.println(length + " feet long by " + height + " feet high. ");
		
		scan.close();
    }
}
/* My Output
 * Enter the length of the room: 25
Enter the width of the room: 20
Enter the height of the room: 10

2.5714285714285716 gallons of paint are needed to paint a room 20.0 feet wide by 
25.0 feet long by 10.0 feet high. 
*/
