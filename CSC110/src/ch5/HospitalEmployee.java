package ch5;
//**********************************************************
//Program Name: HospitalEmployee.java
//Author : Brandon Phillips
//Date Written : 3/6/2018
//Class : CSC110
//Brief Description: Creates a class called HospitalEmployee that does a few different task
//**************************************************************
import java.text.NumberFormat;

public class HospitalEmployee {

	//Instance Variables
	private String empName;
	private int empNumber;
	private double hoursWorked;
	private double payRate;
	private static int hospitalEmployeeCount = 0;

	//Constructor
	public HospitalEmployee()
	{
		empName = "Brandon Phillips";
		empNumber = 9999;
		hoursWorked = 0;
		payRate = 0;
	
		hospitalEmployeeCount++;
	}
	
	public HospitalEmployee(String eName, int eNumber, double hours, double pay) 
	{
		empName = eName;
		empNumber = eNumber;
		hoursWorked = hours;
		payRate = pay;
	
		hospitalEmployeeCount++;
	}

	//getter methods
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpNumber()
	{
		return empNumber;
	}
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	public double getPayRate()
	{
		return payRate;
	}
	public static int getHospitalEmployeeCount()
	{
		return hospitalEmployeeCount;
	}
	
	
	//Setter methods
	public void setEmpName(String eName)
	{
		empName = eName;
	}
	public void setEmpNumber(int eNumber)
	{
		empNumber = eNumber;
	}
	public void setHoursWorked(double hours)
	{
		if (hours > 0)
		{
			hoursWorked = hoursWorked + hours;
		}
		
	}
	public void setPayRate(double rate)
	{
		if (rate > 0)
		{
			payRate = rate;
		}
	}
	
	
	public double calculateGrossPay()
	{
		return (hoursWorked * payRate);
	}
	public void changeHoursWorked(double hours)
	{
		hoursWorked = hoursWorked + hours;
	}
	public void changePayRate(double amount)
	{
		payRate = payRate + amount;
	}
	public String toString() 
	{
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		return("Employee: " + empName + "\t empNumber: " + empNumber + 
				"\t hoursWorked: " + hoursWorked + "\t payRate: " + cFmt.format(payRate));
	}
	
	public double calculateBonus(String Rating)
	{
		double bonus;
		if(Rating.equals("Excellent"))
		{
			 bonus = 500;
			 return bonus;

		}
		else if(Rating.equals("Satisfactory"))
		{
			bonus = 300;
			return bonus;
		}
		else
		{
			bonus = 0;
			return bonus;
		}
		
	/*	public double calculateBonus(Rating)
	{
		switch (Rating.toLowerCase())
		{
		case 1: Rating = "Excellent";
		bonus = 500;
		return bonus;
		break;
		case 2: Rating = "Satisfactory";
		bonus = 300;
		return bonus;
		break;
		default: bonus = 0;
		return bonus;
		break;
		
		}
		*/
		
	}
		
		
		
	}
	
	
	

