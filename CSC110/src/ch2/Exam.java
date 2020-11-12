package ch2;
//Program Name:  	Exam.java
//Author:  			Brandon Phillips
//Class:  			CSC 110
//Date:  			1/26/2018
//Description:  	This program gives the average of 3 tests scores
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) 
	{
		
		//label variables
		double examOne;
		double examTwo;
		double examThree;
		
		//ask for the test scores
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the first exam score: ");
		examOne = scan.nextDouble();
		
		System.out.println("Enter the Second exam score: ");
		examTwo = scan.nextDouble();
		
		System.out.println("Enter the Third exam score: ");
		examThree = scan.nextDouble();
		
		
		//Calculate the average of the scores
		double average = (examOne + examTwo + examThree) / 3;
		
		System.out.println("The average exam, score is: " + average);

		scan.close();
	}

}

/* My Output
 Enter the first exam score: 
90
Enter the Second exam score: 
91
Enter the Third exam score: 
100
The average exam, score is: 93.66666666666667
 */



