package ch8;

//Class Name :Item.java  Superclass of CD.  In class Inheritance activity
//Author : PBaker
//Date :  
//Brief Description :  represents a general music item that has a title and playing time.

public class Item
{
	protected String title;
	protected int playingTime;  //in minutes
	
	
	public Item( )
	{	title = "unknown";
		playingTime = 0; 
   }

	public Item(String theTitle, int time)
	{	title = theTitle;
		playingTime = time;
    }

	public double calcTimeInHrs( )
	{  
      return playingTime / 60.0 ; 
   }	

	public String toString( )
	{	
      return ( " title: "+ title + " playingTime: " + playingTime) ; 
   }
	
        //other methods omitted for this example

 } //end of class Item
