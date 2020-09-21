package ch6;
//********************************************************************
//Chapter 6 Program 2 - BankAccount GUI
//Program Name:BankPanel.java      
//Author :  Brandon Phillips
//Date: 4/2/2018
//
//Brief Description: Creates a simple GUI for the Bank Account
//********************************************************************

import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import ch5.BankAccount;







		public class BankPanel extends JPanel
		{
		   
			
			private JLabel accountNameLabel;  
			private JLabel accountNumberLabel;
			private JLabel accountBalanceLabel;
			private JLabel accountStatusLabel;
			private JLabel depositWithdrawLabel;
			
			private JTextField accountNameField;
			private JTextField accountNumberField;
			private JTextField accountBalanceField;
			private JTextField accountStatusField;
			private JTextField depositWithdrawField;
			
			
			private JButton depositButton;
			private JButton withdrawButton;
			
			{
			//constructor
			BankAccount BartSimpson = new BankAccount(); //create an account
			
			BartSimpson.setName("Bart Simpson"); // sets account name
			BartSimpson.setAcctNumber(128895); //Sets account number
		
			
			
			
			//create labels
			accountNameLabel = new JLabel("Account Name");
			accountNumberLabel = new JLabel("Account Number");
			accountBalanceLabel = new JLabel("Account Balance");
			accountStatusLabel = new JLabel("Account Status");
			depositWithdrawLabel = new JLabel("Deposit/Withdraw");
			
			
			//Create textfields
			accountNameField = new JTextField(10);
			accountNumberField = new JTextField(10);
			accountBalanceField = new JTextField(10);
			accountStatusField = new JTextField(10);
			depositWithdrawField = new JTextField(10);
			
			//Create Buttons
			depositButton = new JButton("Deopsit");
			withdrawButton = new JButton("Withdraw");
			
			//add to panel
			add(accountNameLabel);
			add(accountNameField);
			add(accountNumberLabel);
			add(accountNumberField);
			add(accountBalanceLabel);
			add(accountBalanceField);
			add(accountStatusLabel);
			add(accountStatusField);
			add(depositButton);
			add(withdrawButton);
			add(depositWithdrawLabel);
			add(depositWithdrawField);
			
			//format size/color
			setBackground (Color.cyan);
			setPreferredSize (new Dimension(275, 215));
			
			//set up buttons and register with ActionListener
		//	withdrawButton.addActionListener(new ButtonListener());
		//	depositButton.addActionListener(new ButtonListener());
			
			//Default Text Fields
			accountNameField.setText(BartSimpson.getName());//BankAccount object BartSimpson
			accountNumberField.setText(Integer.toString(BartSimpson.getAcctNumber())); //set account number field
			accountStatusField.setText("OKAY"); //default status field to okay
			accountBalanceField.setText(Double.toString(BartSimpson.getBalance()));
			depositWithdrawField.setText("0.00");
			
			if (BartSimpson.getBalance() >= 0.0)
			{
				accountStatusField.setText("OKAY");
			}
			else
			{
				accountStatusField.setText("Overdrawn");
			}
			
			
			
			
			
			//Withdraw and Deposit button commands
		
			class ButtonListener implements ActionListener
			   {
			      public void actionPerformed (ActionEvent event)
			      {
			 		
								    
					   if (event.getSource() == depositButton)
						{
						   double amt = Double.parseDouble(depositWithdrawField.getText());
						   BartSimpson.deposit(amt);
						   accountBalanceField.setText(Double.toString(BartSimpson.getBalance()));
						}
					   if (event.getSource() == withdrawButton)
						{
						   double amt = Double.parseDouble(depositWithdrawField.getText());
						   BartSimpson.withdrawl(amt);
						   accountBalanceField.setText(Double.toString(BartSimpson.getBalance()));
						} 
					  

					   
						
						
								
					
						
			   }//end of actionPerformed method
					
			}//end of ButtonListener
				
			}
		}
			
			
			
		

