package ch3;
//**********************************************************
//Program Name: SphereCalculations.java
//Author : Brandon Phillips
//Date Written : 1/31/2018
//Class : CSC110/CIS163
//
//Brief Description:  Calculate the volume and surface area of a sphere given the radius
//**************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;


public class SphereCalculations {

	public static void main(String[] args) 
	{
		double radius, volume, surfaceArea;
		Scanner keyboard = new Scanner(System.in);
		
		//ask for radius
		System.out.println("Welcome to the Sphere Calulator");
		System.out.println("Enter the sphere's radius: ");
		radius = keyboard.nextDouble();
		
		
		//Calculations 
		DecimalFormat dFmt = new DecimalFormat("0.####");
		volume = ((4.0/3) * Math.PI * Math.pow(radius,3));
		surfaceArea = (4 * Math.PI * Math.pow(radius,2));
		
		//Display results
		System.out.println("The results are: ");
		System.out.println((radius));
		System.out.println(dFmt.format(volume));
		System.out.println(dFmt.format(surfaceArea));		
		
		

	}

	

	}

/* My Output
 
Test Case 1
 Welcome to the Sphere Calulator
Enter the sphere's radius: 
4.2
The results are: 
4.2
310.3391
221.6708

Test Case 2
Welcome to the Sphere Calulator
Enter the sphere's radius: 
7.5
The results are: 
7.5
1767.1459
706.8583

*/