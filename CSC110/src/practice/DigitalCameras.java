package practice;

public class DigitalCameras extends Electronic{
	
	private double lifeExpectancy;
	public DigitalCameras()
	{
		super();
		lifeExpectancy = 0;
	}
	public DigitalCameras(double Weight, double Cost, double PowerUsage, String Name, double Years)
	{
		super(Weight, Cost, PowerUsage, Name);
		lifeExpectancy = Years;
	} 
	public void setLifeExpectancy(double someYears)
	{
		lifeExpectancy = someYears;
	}
	double getLifeExpectancy()
	{
		return lifeExpectancy;
	}
	public int calculateWarranty(double warrantyExpense) //return a number of months 
	{
		double rate = warrantyExpense/cost;
		int months = 2 + (int)(lifeExpectancy * rate * 12); // free first 2 months
		return months;
	}
	public String toString()
	{
		return super.toString()+ "\tLife expectancy: "+lifeExpectancy + " years";
	}
}
