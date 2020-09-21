package ch2;
//Program Name:  	Seconds.java
//Author:  			Brandon Phillips
//Class:  			CSC 110
//Date:  			1/26/2018
//Description:  	This program gives the total number of seconds for different hours, minutes or seconds

import java.util.Scanner;

public class Seconds {
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//label variables
		double second;
		double minute;
		double hour;
		
		//ask for the hours, minutes, seconds
		System.out.print ("Enter the number of hours: ");
		hour = scan.nextDouble();
		
		System.out.print ("Enter the number of minutes: ");
		minute = scan.nextDouble();
		
		System.out.print ("Enter the number of seconds: ");
		second = scan.nextDouble();
		
		//calculate the total number of seconds and display the answer
		double totalSeconds = (hour * 3600) + (minute * 60) + second;
		
		System.out.println("Total seconds: " + totalSeconds);
	
		scan.close();
	}

}
/* My Output
 Enter the number of hours: 1
Enter the number of minutes: 1
Enter the number of seconds: 2
Total seconds: 3662.0
*/
