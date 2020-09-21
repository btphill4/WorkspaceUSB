package ch5;

public class Dog {

	
	//instance variables
	private String name;
	private int birthYear;
	private String breed;
	
	
	public Dog()
	{
		name = "unknown";
		birthYear = 0;
		breed = "unknown";
		
		
	}
	public Dog(String initName, int bYear, String initBreed)
	{
		name = initName;
		birthYear = bYear;
		breed = initBreed;
	}
	//getter methods
	public String getName()
	{
		return name;
	}
	public int getBirthYear()
	{
		return birthYear;
	}
	public String getBreed()
	{
		return breed;
	}
	
	//setter methods
	public void setname(String someName)
	{
		name = someName;
	}
	public void setBirthYear(int year) 
	{
		birthYear = year;
	}
	public void setBreed(String someBreed) 
	{
		breed = someBreed;
	}
	
	
	public int calculateAge(int currentYear) 
	{
		int age = 0;
		age = currentYear - birthYear;
		return age;
	}
	public String toString() 
	{
		return("name: " + name + " birth year " + birthYear + " breed: " + breed);
	
	}
	
}
