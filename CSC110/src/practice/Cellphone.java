package practice;
import java.text.NumberFormat;
public class Cellphone extends Electronic 
{
	//instance variables
	protected String type;
	protected double size;
	NumberFormat nfm = NumberFormat.getCurrencyInstance();
	//constructor
	public Cellphone()
	{
	super();
	type = "unknown";
	size = 0.0;
	}
	
	public Cellphone(double weight, double cost,double powerUsage, String nameOfManufactor, String type, double size) 
	{
		super(weight, cost, powerUsage, nameOfManufactor);
		this.type = "Unknown";
		size = 0.0;
	}	
	
	//setter methods
	public void setWeight(double pounds)
	{
		weight = pounds;
	}
	public void setCost(double price)
	{
		cost = price;
	}
	public void setPowerUsage(double volts)
	{
		powerUsage = volts;
	}
	public void setNameOfManufactor(String brand)
	{
		name = brand;
	}
	public void setSize(double height)
	{
		size = height;
	}
	
	//getter method
	public double getWeight() 
	{
		return weight;
	}
	public double getCost()
	{
		return cost;
	}
	public double getPowerUsage()
	{
		return powerUsage;
	}
	public String getNameOfManufactor()
	{
		return nameofManufacturer;
	}
	public double getSize()
	{
		return size;
	}
	public String getType()
	{
		return type;
	}
	//Calculation - cost per size
	public String costPerSize(double size, double cost)
	{
		return nfm.format(cost / size);
	}
	
	//toString
	public String toString()
	{
		return super.toString() + " size: " +  size + " inches " + " Type: " + getType();
	}
	
	
	
	
}
