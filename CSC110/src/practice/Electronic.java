package practice;
import java.text.NumberFormat;
public class Electronic {
	String name;
	protected double weight ;
	protected double cost;
	protected double powerUsage;
	protected String nameofManufacturer;
	
	private static int electronicCount = 0;
	//default information
	public Electronic() {
		
		weight = 0;
		cost = 0;
		powerUsage = 0;
		nameofManufacturer = "unknown";
		
		electronicCount++;
	}
	
	//overloaded constructor
	public Electronic(double initWeight, double initCost, double initPowerUsage, String Name) {
	weight = initWeight;
	cost = initCost;
	powerUsage = initPowerUsage;
	nameofManufacturer = Name;
	
	electronicCount++;
	}
	
	public String toString()
	{
		NumberFormat nfm = NumberFormat.getCurrencyInstance();
		return  "Weight: "+weight +" kgs\tCost: "+ nfm.format(cost)+" \tPower Usage: "+powerUsage+" W"
				+ "\nName of the Manufacturer: "+nameofManufacturer;
	}
	public static int getElectronicCount()
	{
		return electronicCount;
	}
}
