package ch10;

//********************************************************************
// Program Name:  ExceptionallPanel.java    Starting File for Students  
// Author : P Baker 
// Date : Nov 2008
//
// Brief Description :  Demonstrates handling exceptions
//        
//
//*********************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExceptionalPanel extends JPanel
{

	private JButton myButton;
	private JTextField myTextField;
	private JTextField myTextField2;
	private JLabel myLabel;
	//private JLabel myTestLabel
   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
  public ExceptionalPanel( )
  {

		//label to write answer
	    myLabel = new JLabel("Testing some division ");
	
	  	//textfields
		myTextField = new JTextField(10);
		myTextField2 = new JTextField(10);
		
			//button
		myButton = new JButton("Calculate");
		myButton.addActionListener( new ButtonListener());

		add(myLabel);
		add(myTextField);
		add(myTextField2);
		add(myButton);
		
		setBackground (Color.cyan);
      setPreferredSize (new Dimension(200, 300));
  }
     
  	private void checkForTwo(int someNumber) throws IllegalArgumentException
    	{
    		if (someNumber == 2 )
    			throw new IllegalArgumentException("The user entered a 2");
    	}


  
  	

   //*****************************************************************
   //  Represents a listener for button push (action) events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Reads values in textFields and completes
		//  calculation when the button is pushed.
      //--------------------------------------------------------------
	      public void actionPerformed (ActionEvent event)
	      {
					try
					{
						
					
							int num1 = Integer.parseInt(myTextField.getText());
							int num2 = Integer.parseInt(myTextField2.getText());
							//checkForTwo(num1);
							//checkForTwo(num2);
							myLabel.setText("The Answer is: "+ num1 / num2);
							
							
					}
					
					catch(NumberFormatException e)
					{
						myLabel.setText("User error. PLease enter and integer");
						System.out.println(e);
					}
					catch(IllegalArgumentException e)
					{
						myLabel.setText("User error. Can't divide 2");
						System.out.println(e);
					}
					catch(ArithmeticException e)
					{
						myLabel.setText("User error. Can't divide by zero");
						System.out.println(e);
					}
					catch (Exception e)
					{
						myLabel.setText("User error. PLease enter and integer");
						System.out.println(e);
					}
					finally 
					{
						System.out.println("Call tech support.");
					}
		     }//end of ActionPerformed
      
   }//end of ButtonListener
	

}//end of ExceptionalPanel

