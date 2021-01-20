	//********************************************************************
	// Program Name:  GreetingPanel.java  - Starting Code 
	// Author :Brandon Phillips
	// Date : 3/25/2018
	//
	// Brief Description:  User puts their name in the JTextField.  When the
    //                       button is clicked, the name is retrieved and 
    //                       a nice message is displayed by setting the
    //                       text of a JLabel.
	//********************************************************************
	package ch6;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	

	public class GreetingPanel extends JPanel
	{
	   
	   private JLabel questionLabel;  
	   private JTextField answerTextField;
	   private JButton button;
	   private JLabel niceMessageLabel;
	  // private String name = "";

	 	//Constructor:  Sets up the Panel  
	   public GreetingPanel()
	   {
			
			//create all the panel components
		   questionLabel = new JLabel ("What is your name?" );
		   answerTextField = new JTextField(10);
		   button = new JButton("press Here!");
		   niceMessageLabel = new JLabel ("Hello, " );
	        
		 
			
			//add all the components to panel.  order is important
		   	add(questionLabel);
		   	add(answerTextField);
		    add(button); 
		    add(niceMessageLabel);
		   
	        //connect event handler to event source
	        button.addActionListener(new ButtonListener());
	        
			//configure panel.  
	        setBackground(Color.LIGHT_GRAY);
	        setPreferredSize(new Dimension(170, 200));
	        niceMessageLabel.setFont(new Font ("comic sans", Font.BOLD, 20));
		    questionLabel.setFont(new Font ("comic sans", Font.ITALIC, 15));
		    niceMessageLabel.setForeground(Color.red);
	   }

	   //private internal class that is a listener for button push (action) events.
		//also called an event handler
		private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	   //get the name the user put in the answerTextField
	    	  String name = answerTextField.getText();
	    	   
	    	   //now set the text of the niceMessageLabel 
	    	   //to a nice message that includes the name 
	    	  niceMessageLabel.setText("Hello, " + name);
	           
				  
				  
	      }//end of ActionPerformed method
			
	   }//end of ButtonListener
		
	}//end of GreetingPanel


