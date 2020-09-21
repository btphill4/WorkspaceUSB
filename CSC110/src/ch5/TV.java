package ch5;
//**********************************************************
//Program Name: TV.java
//Author : Brandon Phillips
//Date Written : 3/21
//Class : CSC110/CIS163
//
//Brief Description: generates and selects a card from a deck of cards
//**************************************************************
public class TV {

		 //Instance variables
         int channel = 1; // Default channel is 1
         int volume = 0; // Default volume level is 1
         boolean on = false; // By default TV is off
         int MaxChannel;
         int MaxVolume;


         public TV() {
         }
         //getter methods
         public int getChannel()
         {
        	 return channel;
         }
         public int getVolume()
         {
        	 return volume;
         }
         public void turnOn() 
         {
        	 on = true;
         }
         public void turnOff() 
         {
           on = false;
         }
         public int getMaxChannel()
         {
        	 return MaxChannel;
         }
         public int getMaxVolume()
         {
             return MaxVolume;
         }
         
         //setters
         public void setChannel ( int someChannel) 
         {
        	 channel = someChannel;
         }
         public void setVolume (int someVolume) 
         {
             volume = someVolume;
         }
       public void setMaxChannel(int maxChannel)
       {
           if (on && maxChannel >= 1 && maxChannel <= 120)
             channel = maxChannel;
        }
       public void setMaxVolume(int maxVolume)
       {
           if (on && maxVolume >= 0 && maxVolume <= 7)
           volume = maxVolume;
         }
       public void channelUp() 
       {
           if (on && channel < MaxChannel)
             channel++;
           else channel = 1;
        }
       public void channelDown() 
       {
           if (on && channel > 1)
             channel--;
           else channel = 1;
         }
         public void volumeUp() 
         {
           if (on && volume < 7)
             volume++;
           else volume = 0;
         }
         public void volumeDown() 
         {
           if (on && volume > 0)
             volume--;
           else volume = 0;
         }
         
         public String toString()
         {
             return ("\nchannel: " + channel + " \nvolume: " + volume + " \non: " + on +
            		 " \nMaxChannel: " + MaxChannel + " \nmaxVolume: " + MaxVolume);
         }
		public String isOn() {
			
			return "true";
		}

        

       }
