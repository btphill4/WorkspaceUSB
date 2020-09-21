package ch7;


//BankTester class - Updated use in Array of Objects Activity
//Author:  P Baker
//Uses the Bank and BankAccount classes
//
//Students fill in as indicated with **


import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int size = 3;
		
		Bank wellsFargo = new Bank();
		
		System.out.println("Load the bank with BankAccounts");
		
		for(int i = 0; i < size; i++)
		{
			int acctNo;
			double initBalance;
			String owner;
			System.out.print("Enter the account number, balance, and owner:");
			acctNo = scan.nextInt();
			initBalance = scan.nextDouble();
			owner = scan.nextLine();
			
			//Add a BankAccount object to wellsFargo
			wellsFargo.add(new BankAccount(acctNo, initBalance, owner));		
		}
		
		System.out.println("Wells Fargo Accounts");
		//**display all the account information in wellsFargo
		wellsFargo.displayAllBankAccounts();
		
		//**display the total cash in wellsFargo
		wellsFargo.getTotalCash();
		
		System.out.println("Bank Closed");
		scan.close();

	}

}
