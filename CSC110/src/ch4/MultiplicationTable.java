/*
Program Name :  MultiplicationTable.java
Author : Brandon Phillips
Date : 2/24/2018
Class: CSC110AA/AB and CIS163AA
Description:
		  This program prompts the user for a number 1 - 5, 
		  checks for bad input,
		  and creates a multiplication table.
		  Student completes.
*/

package ch4;

import java.util.Scanner;

/* produces a multiplication table of integers */

public class MultiplicationTable {
	public static void main(String[] args) 
	{
		int size;
		int value;
		Scanner scan = new Scanner (System.in);

		//read in size of multiplication table
		System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
		size = scan.nextInt();

		//using a for loop, display the top header row of numbers
		System.out.print("\t");
		for (int horiz = 1; horiz <= size; horiz++)
		{    System.out.print(horiz + "\t");    }

		System.out.println();

		
		//using a for loop, display the top header row underline (use a dash)
		System.out.print("\t");
		for (int horiz = 1; horiz <= size; horiz++)
		{    System.out.print("-" + "\t");		}

		System.out.println();
		
		
		/* using a nested for loop create the rest of the table */
		while(size != 0) {
				
		for (int horiz = 1; horiz <= size; horiz++)
		{
			System.out.print(horiz + "|");
			for (value = 1; value <= size; value++) 
			{
			System.out.print("\t" + (value*horiz));
			}
		System.out.println();
		
		}
		System.out.println("Please enter the table size from 1 to 5 (0 to quit): ");
		size = scan.nextInt();
		} 

		System.out.println("\nDone!");
	}
}


/* My output
Please enter the table size from 1 to 5 (0 to quit): 5
	1	2	3	4	5	
	-	-	-	-	-	
1|	1	2	3	4	5
2|	2	4	6	8	10
3|	3	6	9	12	15
4|	4	8	12	16	20
5|	5	10	15	20	25
Please enter the table size from 1 to 5 (0 to quit): 
0

Done!
*/
