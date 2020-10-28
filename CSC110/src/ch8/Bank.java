package ch8;

//Program Name: Bank.java - Creates BankAccount objects and CheckingAccount objects 
//Use in Inheritance discussion
//Author:  Brandon Phillips
//

//Brief Description:  Tests the BankAccount and CheckingAccount classes.

public class Bank
{
	public static void main( String [ ] args)
	{
		System.out.println("Welcome to our Bank\n");
		
		//create BankAccount object
		BankAccount myAcct = new BankAccount();
		//System.out.println(" " + myAcct.getClass() );
		System.out.println("Status of myAcct: " + myAcct.toString( ) );
		
		myAcct.deposit(100);		
		myAcct.withdraw(25);
		
		System.out.println("The balance of myAcct is : " + myAcct.getBalance( ) );
		
		
		System.out.println("\nA Checking Account");
		
		
	 	//create a CheckingAccount object called studentAcct
		CheckingAccount studentAcct = new CheckingAccount();
		//display the state of object studentAcct
		System.out.println("Status of myAcct: " + studentAcct.toString( ) );
		//deposit 50.00 in studentAcct
		studentAcct.deposit(50.00);
		//display the state of object studentAcct
		System.out.println("Status of myAcct: " + studentAcct.toString( ) );
		//set studentAcct's transaction fee to 5.00
		studentAcct.setTransactioFee(5.00);
		//deposit 15.00 in studentAcct
		studentAcct.deposit(15.00);
		//display the state of object studentAcct
		System.out.println("Status of myAcct: " + studentAcct.toString( ) );
		///display the number of BankAccount objects created
		System.out.println("Number of bank accounts " + BankAccount.getAcctCount());
	}


}//end of Bank