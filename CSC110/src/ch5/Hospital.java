package ch5;
//**********************************************************
//Program Name: Hospital.java
//Author : Brandon Phillips
//Date Written : 3/6/2018
//Class : CSC110
//Brief Description: Tests our HospitalEmployee class
//**************************************************************
import java.text.NumberFormat;
public class Hospital {

	public static void main(String[] args) 
	{
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		double bonus = 0;
		//Welcome message
		System.out.println("Welcome to our Hospital");
		
		//create a HospitalEmployee called worker1
		HospitalEmployee worker1 = new HospitalEmployee();
		
		//display the state of object worker1using the toString method
		System.out.println("Beginning State of worker1: "); 
		System.out.println(worker1.toString());
		
		//set the pay rate of worker1to 20.00 using the setPayRate method
		worker1.changePayRate(20.00);
		
		//display the state of object worker1using the toString method
		System.out.println("After pay rate is set: " + worker1.toString());
		
		//change/increase the pay rate of worker1 by 4.50 using the changePayRate method
		worker1.changePayRate(4.50);
		
		//change/increase the hours worked of worker1 by 30 using the changeHoursWorked method
		worker1.changeHoursWorked(30);
		
		//display the state of worker1using the toString method
		System.out.println("After pay rate and hours worked increase: " + worker1.toString());
		
		//display the name and gross pay of worker1using getEmpName and calculateGrossPay methods.
		System.out.println(worker1.getEmpName() + " earned " + worker1.calculateGrossPay());
		
		//display the name, bonus, and total earnings of worker1.Use the calculateBonus method when calculating the bonus for worker1.
		//worker1 is an excellent employee.
		System.out.println("After bonus: " + worker1.getEmpName() + " received a bonus of " + cFmt.format(worker1.calculateBonus("Excellent")) + 
				" and has earned a total of " + (bonus + worker1.calculateGrossPay()));
		
			System.out.println();
			System.out.println("--------------------------------------------------------------------");
			System.out.println();
		
		//Update class tester
		System.out.println("Welcome to our hospital");
		//create a HospitalEmployee called worker2 using the constructor added in this assignment
		HospitalEmployee worker2 = new HospitalEmployee();
		//display the state of worker1
		System.out.println("state of worker1: " + worker1.toString());
		//display the state of worker2
		System.out.println("state of worker2: " + worker2.toString());
		//set the pay rate for the worker2 to 12.25.
		worker2.setPayRate(12.25);
		//set the hours worked for worker2 to 15
		worker2.setHoursWorked(15);
		//set the pay rate for worker2 to -10.50
		worker2.setPayRate(-10.50);
		//display the state of worker1
		System.out.println("state of worker1: " + worker1.toString());
		//display the state of worker2
		System.out.println("state of worker2: " + worker2.toString());
		//display the employee name, and gross pay of worker2.
		System.out.println("Name: " + worker2.getEmpName() + " Gross Pay: " + worker2.calculateGrossPay());
		//display the employee name and bonus for worker2. Use your new calculateBonus method.
		System.out.println("Name: " + worker2.getEmpName() + " received a bonus of " + cFmt.format(worker2.calculateBonus("Excellent")) + 
				" and has earned a total of " + (worker2.calculateBonus("Excellent") + worker2.calculateGrossPay()));
		//display the number of HospitalEmployee objects created. Use getHospitalEmployeeCount()
		System.out.println("Number of Employees: " + worker2.getHospitalEmployeeCount());
		
		
		
		
		
		
		
		
	}

}


/* my ouput
Welcome to our Hospital
Beginning State of worker1: 
Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 0.0	 payRate: $0.00
After pay rate is set: Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 0.0	 payRate: $20.00
After pay rate and hours worked increase: Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 30.0	 payRate: $24.50
Brandon Phillips earned 735.0
After bonus: Brandon Phillips received a bonus of $0.00 and has earned a total of 735.0


Welcome to our hospital
state of worker1: Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 30.0	 payRate: $24.50
state of worker2: Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 0.0	 payRate: $0.00
state of worker1: Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 30.0	 payRate: $24.50
state of worker2: Employee: Brandon Phillips	 empNumber: 9999	 hoursWorked: 15.0	 payRate: $12.25
Name: Brandon Phillips Gross Pay: 183.75
Name: Brandon Phillips received a bonus of $500.00 and has earned a total of 683.75
Number of Employees: 2

*/