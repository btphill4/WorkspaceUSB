package ch5;

import java.text.NumberFormat;


//class name: BankAccount
//date 2/21
//author: Brandon Phillips
//Brief description Basic Bank account blueprint
public class BankAccount 

{
	//class variables or static variables
	private static int count = 0;
	
	//instance variables
	private double balance;
	private  String name;
	private int acctNumber;
	
	//constructor method
		//constructors cannot have a return data type
		//sets the initial states and contains the different types of states
		//constructors name must be the exact same as the class
	
	
	public BankAccount()  //default constructor
	{
		balance = 0.0;
		name = "unknown";
		acctNumber = 0;
		count++;
	}
	
	public BankAccount(int acctNo, double initBalance, String owner)
	{
		acctNumber = acctNo;
		balance = initBalance;
		name = owner;
		count++;
	}

	//other methods
	
	//Setter or mutator methods
	public void setAcctNumber(int acct)
	{
		acctNumber = acct;
		
	}
	public void setName(String owner)
	{
		name = owner;
	}
	
	//getter or accessor methods
	public int getAcctNumber()
	{
		return acctNumber; 
	}
	public double getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return name;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdrawl(double amount)
	{
		balance = balance - amount;
	}
	public void withdrawl(double amount, double fee)
	{
		balance = balance - amount - fee;
	}
	public String toString() //return the current state of an object
	{
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		return("acctNumber: " + acctNumber +
				" balance: " + cFmt.format(balance) + " name: " + name);
	}
	public static int getCount()
	{
		return count;
	}
	
	
	
	
}