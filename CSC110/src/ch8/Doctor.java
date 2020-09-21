package ch8;
//Class Name : Doctor.java  
//Author : Brandon Phillips
//Date : 4/24/2018
//Brief Description :  sub class for HospitalEmployee
import java.util.Random;
public class Doctor extends HospitalEmployee
{
	//declare variables
	private String specialty;

	Random rand = new Random();
	//constructor methods
	public Doctor()
	{
	super();
	specialty = " ";
	}
	
	public Doctor(String eName, int eNumber, double hours, double pay,String special)
	{
		super(eName, eNumber, hours, pay);
		special = "unknown";
	}
	//other methods
	public String getSpecialty()
	{
		return specialty;
	}
	
	public void setSpecialty(String special)
	{
		special = specialty;
	}
	
	
	public double calculateBonus(String Shift)
	{
		double bonus;
		if (Shift == "night shift")
		{
			bonus = super.calculateBonus(10);
		}
		else
		{
			bonus = super.calculateBonus(5);
		}
		return bonus;
	}
	
	public String createLogin() 
	{
		String username = "unknown";
		int num = rand.nextInt(10);
		username = (empName.substring(0,2) + num + empNumber);
		return username;
	}
	public String toString()
	{
		return ("The beginning state of " + super.getEmpName() + ": " + super.toString() + super.getEmpName() 
		+ "is a doctor and works" + getSpecialty() );
	}

}
