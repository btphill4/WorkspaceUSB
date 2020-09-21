package ch8;

import java.text.NumberFormat;

/* Class Name: The CheckingAccount class - derived/sub/child class for Inheritance Discussion
Author: Brandon Phillips
	Date : 4/16
	Brief Description: subclass to BankAccount
*/
public class CheckingAccount extends BankAccount
{
	//declare instance variables
	private double transactionFee;
	
	//constructor methods
	public CheckingAccount()
	{
		super(); // is equal to BankAccont();
		transactionFee = 1.00;
	}
	
	public CheckingAccount(int acctNo, double initBalance, String owner, double fee)
	{
		super(acctNo, initBalance, owner); 
		transactionFee = fee;

	}
	
	//other methods
	public void setTransactioFee(double fee) 
	{
		transactionFee = fee;
	}
	
	public double getTransactionFee()
	{
		return transactionFee;
	}
	
	public void deposit(double amount)
	{
		balance = (balance + amount) - transactionFee;
	}
	
	public void withdraw(double amount)
	{
		balance = (balance - amount) - transactionFee;
	}
	
	public String toString()
	{
		return (super.toString() + " TransactionFee = " + transactionFee);
	}
	
	
	
}
