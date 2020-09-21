//Brandon Phillips

package acvitivies;
import java.util.Random;

public class PlayingCards 
{
		Random generator = new Random();

		public int suit; 
		public int face;
		public int randomSuits = generator.nextInt(3);
	    public int randomFace = generator.nextInt(13);
	    
		//Class methods
	    
		//Constructor
		public PlayingCards() 
		{
			suit = randomSuits;
			face = randomFace;
		}

		public PlayingCards(int cardFace, int cardSuit)
		{
			face = cardFace;
			suit = cardSuit;
		}
		
		//Calculated the suit and face depending on its random value
		public String getSuitAsString() 
		{
	        switch ( suit ) 
	        {
	           case 0:   
	        	   return "Spades";
	           case 1:   
	        	   return "Hearts";
	           case 2: 
	        	   return "Diamonds";
	           case 3:   
	        	   return "Clubs";
	           default: 	  
	        	   return "default";
	        }
		}
		
	       
	      public String getFaceAsString() 
	      { 
	    	switch(face)
			  { 
			  case 1: 
			  	return "ace"; 
			  case 2: 
			  	return "2";
			  case 3: 
			  	return "3";
			  	
			  case 4: 
			  	return "4";
			  	
			  case 5: 
			  	return "5";
			  
			  case 6: 
			  	return "6";
			  	
			  case 7: 
			  	return "7";
			  	
			  case 8: 
			  	return "8";
			  	
			  case 9:
			  	return "9";
			  
			  case 10: 
			  	return "10";
			  
			  case 11:
			  	return "jack";
			  	
			  case 12: 
			  	return "queen";
			  	
			  case 13: 
			  	return "king";
			  		  
			  default: 
				  return "default";
			
			   }
	      }
        
        public String toString() {
         
        System.out.println(" You have Selected the: " + getFaceAsString() + " of " + getSuitAsString());
        return getFaceAsString() + " of " + getSuitAsString();
        }
}	
		
		
		
		
		
	