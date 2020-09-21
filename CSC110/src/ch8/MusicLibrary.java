package ch8;

//Name : MusicLibrary.java  In class Inheritance activity.
//Author : Brandon and Katelyn
//Date : 
//Brief Description :  Tester/Driver that creates CD and Item objects
import java.text.DecimalFormat;

public class MusicLibrary
{
	
	
	public static void main( String[] args)
	{
		DecimalFormat dFmt = new DecimalFormat("0.#");
		
		
		System.out.println("Welcome to my Music Library");
		// create a CD object called cd1
		CD cd1 = new CD("The Wall", 90, "Pink Floyd", 26);
		
		//display the state of cd1 using toString() in a System.out.println() statement
		System.out.println("State of cd1: " + cd1.toString());
		
		//display the cd1's playing time in hours. Use the calcTimeHrs() method
		System.out.println("Playing time of cd1 in hours: " + cd1.calcTimeInHrs());
		
		//display cd1's average track time
		System.out.println("The average track time of cd! in minutes: " + dFmt.format(cd1.calcAvgTrackTime()));
		
		//cd2
		//create an Item object called cd2. use the default constructor
		CD cd2 = new CD();
		
		//display the state of cd2 using toString() in a System.out,println() statement
		System.out.println("State of cd2: " + cd2.toString());
		
	}


}

/* output
Welcome to my Music Library
State of cd1:  title: The Wall playingTime: 90 artist: Pink Floyd
Playing time of cd1 in hours: 1.5
The average track time of cd! in minutes: 3.5
State of cd2:  title: unknown playingTime: 0 artist: unknown

*/

/* Type answers the 10 questions listed below.  Save your file and hand in with CD.java.

Q 1 : What is the visibility access modifier for the instance variables in the Item class?  Why was this chosen?
A 1: Protected so we can use it with inheritance classes

Q 2 : Which of the methods in the CD class override a method in the Item class? 
A 2: cd()

Q 3:  What is the difference between an overloaded method and an overridden method?
A 3: Overloaded methods have the same method name but different parameters

Q 4 : In what class is the method calcTimeInHrs() defined?
A 4 : item 

Q 5 : What kind of object is cd1?  List all of object cd1's instance variables.
A 5: CD object

Q 6:  Why is object cd1 able to invoke/use calcTimeInHrs()? 
A 6: you call the method using super()
 
Q 7:  Which toString method is invoked by object cd1 in the following statement? 
                         System.out.println(cd1.toString( ) );
A 7: Cd method

Q 8 : What kind of object is cd2? List all of object cd2's instance variables.
A 8: 

Q 9:  Which toString method is invoked by object cd2 in the following statement?
                         System.out.println(cd2.toString( ) );
A 9: item method
Q 10: What does the following display?  Why??
                        System.out.println(“Average track time : “ + cd2.calcAvgTrackTime( ) );
A 10:  an error, it is using the item method and calcAvgTrackTime is under the cd class



*/