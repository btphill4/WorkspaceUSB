package ch6;

//********************************************************************
// Program Name:  CarCounterPanel.java  Starting File - CarCounter 1 Activity 
// Author : Brandon Phillips
// Date : 3/19/2018
//
// Brief Description:
// 	Demonstrates a graphical user interface and an event listener.
//		Frames, Panels, labels, textfields, buttons
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class CarCounterPanel extends JPanel
{
    private int carCount;
    private JLabel carLabel;
	private JTextField carTextField;
	private JButton carButton;
	private Random gen;
	
	private JLabel carMakeLabel;
	private JTextField carMakeTextField;
	
	//activity 3
	private JLabel carPassengerLabel;
	private JTextField carPassengerTextField;
	private JButton carPassengerButton;
	private double totalPassengers = 0;
	
	//bonus stuff
	private JLabel carImageLabel; //container
	private ImageIcon chevyImageIcon;
	private ImageIcon fordImageIcon;

 	//Constructor:  Sets up the Panel  
	public CarCounterPanel()
   {
      carCount = 0;
		
	  //create panel components
	  carLabel = new JLabel ("Number of cars: " );
	  carTextField = new JTextField(10);
	  carButton = new JButton("press Here!");
      gen = new Random();
      
      carMakeLabel = new JLabel("Car Make: ");
      carMakeTextField = new JTextField(10);
      
      carPassengerLabel = new JLabel("Passengers: ");
      carPassengerTextField = new  JTextField (10);
      carPassengerButton = new JButton("Estimate Passengers");
      
      
      
      
      //Bonus Stuff
      carImageLabel = new JLabel(" ");
      chevyImageIcon = new ImageIcon("src/ch6/chevy.jpg");
      fordImageIcon = new ImageIcon("src/ch6/ford.jpg");
      
      
      //add components to panel.  order is important
      add(carLabel);
      add(carTextField);
      add(carMakeLabel);
      add(carMakeTextField);
      add(carButton);
      //add(carImageLabel);
      add(carPassengerLabel);
      add(carPassengerTextField);
      add(carPassengerButton);
      
        
      //connect event handler to event source
    carButton.addActionListener(new ButtonListener());
    carPassengerButton.addActionListener(new ButtonListener());
		
				
	  //configure panel.  
      setBackground(Color.blue);
      setPreferredSize(new Dimension(155, 250));
	  carTextField.setText(Integer.toString(0));
   }

   //private internal class that is a listener for button push (action) events.
	//also called an event handler
	private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
    	  if(event.getSource() == carButton)
    	  
    	  
    	  
    	  
    	  
			//update the counter and the textField with the button is pushed
           //carCount++;
    	  
    	   //generate a random number from 0-50
    	   carCount = gen.nextInt(51);
    	   if (carCount % 2 == 0)
    	   { setBackground(Color.yellow);
    	     carMakeTextField.setText("Chevy");
    	     carImageLabel.setIcon(chevyImageIcon);
    	   }
    	   else 
    	   { setBackground(Color.green);   
    	     carMakeTextField.setText("Ford");
    	     carImageLabel.setIcon(fordImageIcon);
    	   }
           carTextField.setText(Integer.toString(carCount)); //only takes strings
      
           carPassengerTextField.setText(" ");
           if (event.getSource() == carPassengerButton)
           {
           //activity 3
           //Get total passengers by multiplying cars by 2
           totalPassengers = Double.parseDouble(carTextField.getText()) * 2.0;
           //put result of totalPassengers into the carPassengerTextField
           carPassengerTextField.setText(Double.toString(totalPassengers));
           }
          
			  
      }//end of ActionPerformed method
		
   }//end of ButtonListener
	
}//end of CarCounterPanel
