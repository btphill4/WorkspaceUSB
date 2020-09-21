package ch7;


//Bank class - Updated use in Array of Objects Activity
//Author:  P Baker
//
//Students implement methods: getTotalCash() and displayAllBankAccounts()

public class Bank 
{
 //instance variables
 private int size;
 private BankAccount[] accounts;
 private int currentIndex;
 
 //constructor.  sets up initial Bank
 public Bank()
 {
	 size = 3; 
	 accounts = new BankAccount[size];
	 currentIndex = 0;  //next available index in the accounts array
 }
 
 //add a specific BankAccount object to the accounts array
 public void add(BankAccount someAccount)
 {
	 if(currentIndex < size) //not at the end of the array yet
	 {
		 accounts[currentIndex] = someAccount;
		 currentIndex = currentIndex + 1;
	 }
 }
 
 //**adds up the balance of all the BankAccount objects in accounts array
 public double getTotalCash()
 {
	 
	 double cash=0;
	 for(int r = 0; r < size; r++) 
	 
	 {
		 cash = cash+ accounts[r].getBalance();
	 }
		 return cash;
 }
 
 //**display information for all the BankAccounts in accounts array
 public void displayAllBankAccounts()
 {
	 for(int r = 0; r < size; r++) 
	 
	 {
		 System.out.println(accounts[r].toString());
		 
	 }
	 
 }

}
