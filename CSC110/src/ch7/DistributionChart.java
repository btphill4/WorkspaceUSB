
//********************************************************************
// DistributionChart.java       
// Name: 
// Date:
// 
// 
// Design and implement an application called DistributionChart
// that creates a chart/histogram so that you can visually inspect 
// the frequency distribution of a set of values.
//
// 
//********************************************************************
package ch7;
import java.util.Scanner;

public class DistributionChart 
{
	

   public static void main (String[] args)
   {
      int size = 10;
      int[] range = new int[size];  // each entry represents a range of values
	     
      getData(range);   //pass the entire array into the method
      
      displayChart(range);
      
      System.out.println("\nSee you later!!");
      
   } //end of main
   
   public static void getData(int[] someArray)
   {
	   int size = 0;
	   int[] range = new int[size];
	   Scanner scan = new Scanner (System.in);
 
	   System.out.println ("Enter a series of numbers between 1 and 100. Separate each number with a space.");
	   System.out.println ("Signal the end by entering a number outside " +
	         "of that range and then press enter.");
	   System.out.print("Go: ");
	   
	   //reads an arbitrary number of integers that are in the range 1 to 100 inclusive
	   //for each integer read in, determine which range it is in and increment the corresponding element in the array
	   
	   //your code goes here (use if statements or maybe switch statements)
	   for (int i = 0 ; i < size; i++ ) 
	   {
           range[i] = scan.nextInt();
       }
	   

	   
	   
	    
	    scan.close();  
   }//end of getData
   
   public static void displayChart(int[] someArray)
   {
	   //Print chart title with your name
	   
	   //Print histogram.(display using *'s create a for loop for the number of stars) 
	      
	     
	      
   } //end of displayChart


}// end of DistributionChart tester class

/* Example output.  

 
 
 */

