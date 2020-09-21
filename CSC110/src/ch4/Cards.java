package ch4;
//**********************************************************
//Program Name: CinemaPrice.java
//Author : Brandon Phillips
//Date Written : 2/12/2018
//Class : CSC110/CIS163
//
//Brief Description: generates and selects a card from a deck of cards
//**************************************************************

import java.util.Random;

public class Cards 
{

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		String suit1 = null, face1 = null;
		int suit, face;
		
		//generate number 1-4 for type of card
		suit = generator.nextInt(4) + 1;
		 //System.out.println(suit); //used to show the numbers i got for testing purposes
		 
		//Use a switch statement 
	      {  switch(suit)
		  { 
		  case 1: suit = 1;
		  	suit1 = "hearts";
		  		//System.out.println(suit1); //used to test that i get the correct numbers
		  	break;
		  case 2: suit = 2;
		  	suit1 = "spades";
		  		//System.out.println(suit1);
		  	break;
		  case 3: suit = 3;
		  	suit1 = "clubs";
		  		//System.out.println(suit1);
		  	break;
		  case 4: suit = 4;
		  	suit1 = "diamonds";
		  		//System.out.println(suit1);
		  	break;
		  }
	      
	      //generate number on card
	      face = generator.nextInt(13) + 1;
		  //System.out.println(face);
	      {  switch(face)
			  { 
			  case 1: face = 1;
			  	face1 = "ace";
			  		//System.out.println(face1); //used to test this part of the code 
			  	break;
			  case 2: face = 2;
			  	face1 = "2";
			  		//System.out.println(face1);
			  	break;
			  case 3: face = 3;
			  	face1 = "3";
			  		//System.out.println(face1);
			  	break;
			  case 4: face = 4;
			  	face1 = "4";
			  		//System.out.println(face1);
			  	break;
			  case 5: face = 5;
			  	face1 = "5";
			  		//System.out.println(face1);
			  	break;
			  case 6: face = 6;
			  	face1 = "6";
			  		//System.out.println(face1);
			  	break;
			  case 7: face = 7;
			  	face1 = "7";
			  		//System.out.println(face1);
			  	break;
			  case 8: face = 8;
			  	face1 = "8";
			  		//System.out.println(face1);
			  	break;
			  case 9: face = 9;
			  	face1 = "9";
			  		//System.out.println(face1);
			  	break;
			  case 10: face = 10;
			  	face1 = "10";
			  		//System.out.println(face1);
			  	break;
			  case 11: face = 11;
			  	face1 = "jack";
			  		//System.out.println(face1);
			  	break;
			  case 12: face = 12;
			  	face1 = "queen";
			  		//System.out.println(face1);
			  	break;
			  case 13: face = 13;
			  	face1 = "king";
			  		//System.out.println(face1);
			  	break;
			  }
			 //Display card chosen from deck
			  	System.out.println("You have selected the " + face1 + " of " + suit1);
			  
		
	}

}
}
}

/* My output
You have selected the 7 of hearts
*/