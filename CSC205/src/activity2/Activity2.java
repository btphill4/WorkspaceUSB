package activity2;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Driver class for CSC205 Activity 2
 * 
 * @author Wade Huber
 *
 */
public class Activity2 {

	public static void main(String[] args) 
{

		Fraction n = new Fraction(8,0);
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		do
		{
		System.out.print ("Enter the numerator:  ");
		try 
		{
			n.setNumerator(scan.nextInt());
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("Please enter an integer");
		    loop = false;
		}
		catch (Exception e)
		{
			System.out.println("Please enter a number");
			loop = false;
		}
		finally 
		{
			loop = true;
		}
		} while(loop == false );	
		
	do
	{ 
		System.out.println("Enter the denominator:  ");
		try
		{
		n.setDenominator(scan.nextInt());	
		}	
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			loop = false;
		}
		catch (InputMismatchException e)
		{
			System.out.println("Please enter an integer");
			loop = false;
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			loop = false;
		}
		finally 
		{
			loop = true;
		}
	} while (loop == false); 
			
		if (n.getDenominator() != 0)
		{
		System.out.println ("The fraction " + n.getNumerator() + "/" +
				n.getDenominator() + " is equal to " + n.toMixedNumber());
		}
		scan.close();
		}
	}

