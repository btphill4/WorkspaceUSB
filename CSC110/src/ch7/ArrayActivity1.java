package ch7;
//********************************************************************
//Chapter 7 activity 
//Program Name:  ArrayActivity1.java      
//Author : Brandon Phillips
//
//Brief Description :  Creates and array for exam scores
//********************************************************************

public class ArrayActivity1 {

	public static void main(String[] args) 
	{	
		//create array
		double[] myExams = new double[4];
		double sum = 0;
		
		//input variables
		myExams[0] = 92.3;
		myExams[1] = 82.0;
		myExams[2] = 98.4;
		myExams[3] = 91.0;
		
		
		//display exam score 2
		System.out.println(myExams[1]);
		
		//display all components
		for (int i = 0; i < myExams.length; i++)
		{
			System.out.println("Exams Scores: " + myExams[i]);
		}
		
		//Sums up the array
		for (int i = 0; i < myExams.length; i++)
		{
			 sum = sum + myExams[i];
			 
		}
		//print out sum
		System.out.println("Sum of Exam Scores: " + sum);
		
		//Question 7 error
		//double exam4 = myExams[4];
		
		
/*		// NEW CODE STARTS HERE
		double arrayMax = findMax(myExams);
		System.out.println("The max is: " + arrayMax);
		
		double[] bigArray = {45.6, 32.7, 77.8, 55.2, 0.56, 66.4, -45.7, 32.1, 0.00, 65.0};
		System.out.println("The max is: " + findMax(bigArray));
		
		multiply(myExams, 2);
		System.out.println("The max is: " + findMax(myExams));
		
		
	}*/
/*	public static double findMax(double[] someArray)
	{
		double arrayMax = someArray[];

		for(int i = 0; i < someArray.length; i++)
		{
		    if (someArray[i] > arrayMax) 
		    {
		      arrayMax = someArray[i];
		    }
		   
		}
		return arrayMax;
	}
	public static void multiply(double [] someArray, double multiplier)
	{
		for(int i = 0; i < someArray.length; i++)
		{
			someArray[i] = someArray[i] * multiplier;
		}
	}
		
	*/
	
}
}

