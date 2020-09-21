package ch7;
//**********************************************************
//  In class Activity - Ch 7 Arrays - 2D/Multidimensional
//  Program Name : ArrayActivity2D.java  Starting File
//
//  Author:Brandon Phillips and Katelyn Valles
//  Date Written : Skeleton by PBaker.  Additions by : 
//  Class:
//
//  Brief Description:
//  Intro to 2 dimensional arrays in a java
//  
//**********************************************************

public class ArrayActivity2D
{
    public static void main(String[] args)
    {
		double value = 0.0;
		double sum = 0.0;
		double average = 0.0;
		int countValues = 0;
		
		//Declare an array called myExams that keeps track of exam scores for 10 students.
		//Each student has 3 quiz scores.
		
		double[][] myExams = new double[10][3];

    	//load the array with the values 0 - 29, in order
		value = 0;
		for (int r = 0; r < myExams.length; r++)
		{
			for(int c = 0; c < myExams[r].length; c++)
			{
				myExams[r][c] = value;
				value++;
			}
			System.out.println();
		}
		
		/*
		myExams[0][0]= 0.0;
		myExams[0][1]= 1.0;
		myExams[0][2]= 2.0;
		myExams[1][0]= 3.0;
		myExams[1][1]= 4.0;
		myExams[1][2]= 5.0;
		myExams[2][0]= 6.0;
		myExams[2][1]= 7.0;
		myExams[2][2]= 8.0;
		myExams[3][0]= 9.0;
		myExams[3][1]= 10.0;
		myExams[3][2]= 11.0;
		myExams[4][0]= 12.0;
		myExams[4][1]= 13.0;
		myExams[4][2]= 14.0;
		myExams[5][0]= 15.0;
		myExams[5][1]= 16.0;
		myExams[5][2]= 17.0;
		myExams[6][0]= 18.0;
		myExams[6][1]= 19.0;
		myExams[6][2]= 20.0;
		myExams[7][0]= 21.0;
		myExams[7][1]= 22.0;
		myExams[7][2]= 23.0;
		myExams[8][0]= 24.0;
		myExams[8][1]= 25.0;
		myExams[8][2]= 26.0;
		myExams[9][0]= 27.0;
		myExams[9][1]= 28.0;
		myExams[9][2]= 29.0;
		*/
		
    	
			
		
		// display all the components of the array
		System.out.println("Display the array\n");
		for (int r = 0; r < myExams.length; r++)
		{
			for(int c = 0; c < myExams[r].length; c++)
			{
				System.out.print(myExams[r][c] + "\t");
		
			}
			System.out.println();
		}
			
		
		
		// add up all the element values in the array
		System.out.println("Display the array\n");
		sum = 0.0;
		for (int r = 0; r < myExams.length; r++)
		{
			for(int c = 0; c < myExams[c].length; c++)
			{
				sum += myExams[r][c];
			}
		}
		
		
		System.out.println("The sum of the array: " + sum);

		// challenge : calculate the average
		average = 0.0;
		
		average = sum / (myExams.length * myExams[0].length);
			
		
		
		System.out.println("\nChallenge: Calculate the average ");
		System.out.println("The average is: " + average);
		
		
		
		System.out.println("\nChallenge: Count how many values that are greater than 22: ");
		
		countValues = 0;
		
		for (int r = 0; r < myExams.length; r++)
		{
			for(int c = 0; c < myExams[c].length; c++)
			{
				if(myExams[r][c] > 22)
				{
					countValues ++;
				}
			}
		}
		
		
		
		System.out.println("Number of values greater than 22: " + countValues);
		


    }
}
