package ch4;
// ****************************************************************
// Class Name :  LoveJava.java
// Author : Brandon Phillips Orhan Nebi
// Date Written :
// Class : CSC110 or CIS163
// Brief Description:  Use a while loop to print many messages 
//                     declaring your passion for Java
// ****************************************************************
import java.util.Scanner;

public class LoveJava
{
    public static void main(String[] args)
    {
	   int limit = 5;
    	int count;
    	int sum = 0 ;
    	
    	Scanner scan = new Scanner(System.in);
		
    	//ask for limit
    	System.out.println("How many times do you want to display the message");
    	limit = scan.nextInt();
   
		count = 1;
		while (count <= limit)
		{
			 if ( count % 2 == 0 )
		         System.out.println(count + " I love Java!! This number is an even number.");
		      else
		         System.out.println(count + " I love Java!! This number is an odd number.");
			//System.out.println(count + "I love Java!! This number is " + );
		    sum = sum + count; 
		    count++;
		}
		System.out.println("Message was printed " + limit + " times");
		System.out.println("The sum of the numbers from 1 to 4 is " + sum);
    }
}

/* My output
 Case 1
 How many times do you want to display the message
2
I love Java!!
I love Java!!

Case 2 
How many times do you want to display the message
3
I love Java!!
I love Java!!
I love Java!!
Message was printed 3 times

Case 3
How many times do you want to display the message
4
1 I love Java!!
2 I love Java!!
3 I love Java!!
4 I love Java!!
Message was printed 4 times
The sum of the numbers from 1 to 4 is 10

Case 4
How many times do you want to display the message
4
1 I love Java!! This number is an odd number.
2 I love Java!! This number is an even number.
3 I love Java!! This number is an odd number.
4 I love Java!! This number is an even number.
Message was printed 4 times
The sum of the numbers from 1 to 4 is 10
*/
