package ch7;

/*
 * Name: Brandon Phillips
 * Date: 4/10
 * Class: csc110
 * Description:
 * An Integer Array
 *
 * This is the starting code for the StatsArray Assignment
 * The display method and the sortArray methods have been implemented
 *
 *
 * All of the other methods are just returning some default value.  You will need to
 * implement these methods so that they return the appropriate value.
 *
 *  
 */

import java.awt.*;
import java.util.Random;  //for our random number generator




public class StatsArray {

	//instance variables
	private int size;  //how big is the array
	private int[] stats; // an array of integers
	private int sum;
	//default constructor -overloaded method
	StatsArray() {
		size = 10;
		stats = new int[size] ;  //instantiate the array called stats
	}

	public void display(Graphics g)
	{
		int x = 50;  //coordinates for displaying
		int y = 40;

		//display the array with position number
		for(int i = 0; i < stats.length; i++)
		{
			g.drawString("Stats [" + i + "] = "+ stats[i],
			 x,	(y + 15 * i));
		}
	}

	public void fillArray()
   {
		/*fill the array with random numbers (int) in the range 0 - 100.*/
		Random random = new Random();
		for(int i = 0; i < stats.length; i++)
			stats[i] = random.nextInt(101);


	}

	public int getSum() 
	{
		//add up all the values in the array
		for(int i = 0; i < stats.length; i++) {
			 sum = sum + stats[i];
			
		}
		return sum;
	}


	public int getMax() 
	{
		//return the maximum value in the array
		int max = stats.length;

		for (int i = 1; i < stats.length; i++) {
			
		    if (stats[i] > max) {
		      max = stats.length;
		    }
		}
			return max;
	}

	public int getMin()
	{
		//return the minimum value in the array
		int minValue = stats[0];
	    for (int i = 1; i < stats.length; i++) {
	        if (stats[i] < minValue) {
	            minValue = stats[i];
	        }
	    }
			return minValue;
	}

	public double getAverage() 
	{
		double average = 0.0;
		for (int i = 1; i < stats.length; i++)
		{
		 average = sum / stats.length;
			
		}
		//return the average
		return average;
			
	}

	public int countValues(int lowRange, int highRange) 
	{
		//count how many numbers are >= lowRange and <= highRange

		return 0;
	}


	public boolean isValueFound(int someNumber) 
	{
		//check to see if someNumber is in the array
		for (int i = 1; i < stats.length; i++)
		{
			if (someNumber != stats[i])
			{
				return false;
			}
			else
				return true;
		}
		return true;
	}


	public void sortArray() 
	{
		/*sort the array in ascending order - selection sort*/

		int tempValue;
		int min;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			min = i;
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[min])
				{
					min = j;
				}
			}
			tempValue = stats[min];
			stats[min] = stats[i];
			stats[i] = tempValue;


		}

	}


	public void sortBArray() {
		/*Here is another common sort algorithm.
		  It sorts the array in ascending order.
		  This is called a bubble sort.  I have added it
		  so that you can take a look at it.*/

		int tempValue;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[i])
				{
					tempValue = stats[i];
					stats[i] = stats[j];
					stats[j] = tempValue;
				}
			}
		}


	}





}//end of StatsArray Class definition