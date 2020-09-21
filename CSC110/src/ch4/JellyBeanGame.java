package ch4;

// ****************************************************************
//   Program Name: JellyBeanGame.java - SKELETON CODE for STEP 1
//  
//   Author :  Brandon Phillips
//   Date : 2/18/2018
//   Description:
//   Play a game where the user tries to guess the
//   number of jellybeans in a jar.  Can range from 1 to 1000
//   
//   Uses a do..while loop.
//
// ****************************************************************

import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame
{
    public static void main(String[] args)
    {
        int numOfJellyBeans = 0;       //Number of jelly beans in jar
        int guess = 0;                 //The user's guess
        int numOfGuesses = 0;
        String playAgain;

		 Random generator = new Random();
		 Scanner scan = new Scanner (System.in);

		//randomly generate the number of jelly beans in jar
		 numOfJellyBeans = generator.nextInt(1000)+1;

		System.out.println("There are between 1 and 1000 jellybeans in the jar.");
		System.out.println("How many do you think are in the jar?");
		

do
{
	do
    {
		guess = scan.nextInt();
		 //prompt user and read in guess 
			if (guess < numOfJellyBeans)
			{ 
				System.out.println("Your guess was to low");
			}	
			else 
				if (guess > numOfJellyBeans)
			{
				System.out.println("Your guess was too high");
			}
				else
					if (guess == numOfJellyBeans)
				{
					System.out.println("High Five! You got it after " + numOfGuesses + " guesses!!");
				}
		//Guessed right
		
			numOfGuesses++;
		 
		
			
		 
	}	while (guess != numOfJellyBeans);
	
	//ask to play again
	
		System.out.println("Play again? y or n: ");
		 playAgain = scan.nextLine();
			if (playAgain.equals("n"))
			{
				System.out.println("See you later!");
			}
			else
			{
			System.out.println("How many do you think are in the jar?");
			}
}
while (playAgain.equalsIgnoreCase("y"));
}
	}

  
  

/* My Output
There are between 1 and 1000 jellybeans in the jar.
How many do you think are in the jar?
500
Your guess was too high
250
Your guess was to low
350
Your guess was too high
300
Your guess was to low
325
Your guess was to low
335
Your guess was too high
333
Your guess was too high
330
Your guess was too high
328
Your guess was too high
326
High Five! You got it after 9 guesses!!
Play again? y or n: 
How many do you think are in the jar?
*/