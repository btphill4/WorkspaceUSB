package ch5;
//class name: BankAccount
//date 2/21
//author: Brandon Phillips
//Brief description Basic Bank account 
public class Bank {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to our bank \n" );
		
		//create a Bank account object called myAcct
		BankAccount myAcct = new BankAccount();
		//display the state of object myAcct
		System.out.println("The balance of myAcct is: " + myAcct.toString());
		
		//deposit 100.00 in my myAcct
		myAcct.deposit(100.00);
		
		//display the balance in myAcct
		System.out.println("The balance of myAcct after the deposit is: " +  myAcct.getBalance());
		
		//withdraw 25.00 from myAcct
		myAcct.withdrawl(25.00);
		//display the state of the object myAcct
		System.out.println("State of myAcct after the deposit and withdrawl: " + myAcct.toString());
		
		
		//update 2
		
		//Create a BankAccount object called studentAcct
		BankAccount studentAcct = new BankAccount();
		
		//StudentAcct should be owned by Sue Student
		studentAcct.setName("Sue Student");
		
		//studentAcct account number should be 1234
		studentAcct.setAcctNumber(1234);
		
		//Display the state of object student account
		System.out.println("State of studentAcct after the deposit and withdrawl: " + studentAcct.toString());
		
		//Deposit 200.00 in studentAcct
		studentAcct.deposit(200.00);
		
		//withdraw 30.00 from studentAcct
		studentAcct.withdrawl(30.00);
		
		//display the balance in studentAcct
		System.out.println("The balance of studentAcct after deposit/withdrawl is : " + studentAcct.getBalance());
		
		//Display the state of object myAcct
		System.out.println("State of myAcct: " + myAcct.toString());
		
		//display the state of object studentAcct
		System.out.println("State of studentAcct: " + studentAcct.toString());
		
		//update 3
		//create a BankAccount object called teacherAcct. Use overloaded (new) constructor
		//with account number 4444, balance of 1500, and name James Gosling
		BankAccount teacherAcct = new BankAccount();
		teacherAcct.setName("James Gosling");
		teacherAcct.setAcctNumber(4444);
		teacherAcct.deposit(1500);

		//display the state of object teacherAcct
		System.out.println("The state of teacherAcct: " + teacherAcct.toString());
		
		//withdraw 50.00 from teacherAcct with a 5.00 fee
		teacherAcct.withdrawl(50, 5);
		
		//display state of object teacherAcct
		System.out.println("The state of teacherAcct after withdrawl: " + teacherAcct.toString());
		
		//display the number of BankAccount objects created
		System.out.println("The bank has " + BankAccount.getCount() + " Accounts");






}
}
