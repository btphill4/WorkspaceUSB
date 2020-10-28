package ch2;
 //Program Name : AreaCalculation
 //Author : Brandon Phillips
 //Date Written: 1/22/2018
 //Class : CSC110
 //Brief Description:  
 //        This program calculates the area of a rectangle.


import java.util.Scanner;  //Needed for the Scanner class


public class AreaCalculation
{

	private static Scanner keyboard;

	public static void main(String[] args)  //all the action happens here!
	{

		 //define all variables and assign values
		 int length = 20;
		 int width = 10;
		 int area;

		 keyboard = new Scanner(System.in);
		 
		 //Prompt User for data
		 System.out.print("Enter the Length: ");
		 length = keyboard.nextInt();
		
		 System.out.print("Enter the width: ");
		 width = keyboard.nextInt();
		 
		  //perform area calculation 
		 area = length * width;

		 //now display your answer
		 System.out.println("The area is:  " + area);


	} //end of the main method


} // end of the class 

/* My Output

Enter the Length: 5
Enter the width: 25
The area is:  125

*/

