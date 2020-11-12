package ch8;
//Class Name :Hospital.java  
//Author : Brandon Phillips
//Date : 4/24/2018
//Brief Description :  Tester for doctor and hospitalEmployee

public class Hospital {

	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to our hospital");
		System.out.println("=======================");
		System.out.println(" ");
		
		//Create luke in HospitalEmployee Class
		HospitalEmployee luke = new HospitalEmployee("Luke Skywalker", 5432, 40.00, 20.50);
		
		//toString()
		System.out.println("Beginning state of luke: " + luke.toString());
		
		//calculate and display luke's bonus as a satisfactory employee
		System.out.println(luke.empName + "is a satisfactory employee HospitalEmployee. Bonus = " + luke.calculateBonus("satisfactory"));
		
		System.out.println(" ");
		
		//create a Doctor object called darth 
		Doctor darth = new Doctor("Darth Vader", 9876, 17, 150.00, "PLastic Surgery");
		
		//toString()
		System.out.println("Beginning state of luke: " + darth.toString());
		
		//Calculate and display darth's bonus working evening shift
		System.out.println(darth.getEmpName() + " is a doctor and works the evening shift. Bonus = " + darth.calculateBonus("Evening Shift"));
		
		//Create and display darth login
		System.out.println(darth.getEmpName() + "'s login is: " + darth.createLogin());
		
		//display number of HospitalEmployee objects created
		System.out.println(luke.getHospitalEmployeeCount());
		
		
		System.out.println("Good Bye");
	}

}
