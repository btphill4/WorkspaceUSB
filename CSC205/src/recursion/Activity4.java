package recursion;
import java.util.Arrays;
import java.util.List;
import recursion.*;

public class Activity4 {

	public static void main(String[] args) {
		List<Integer> testValues = Arrays.asList(1, 5, 10, 20);
		
		System.out.println("Recursion Tests:");
		
		System.out.println("Class examples:");
		System.out.println("sum_up:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: " + Recursion.sum_up(ii) + "   ");
		}
		System.out.println();
		System.out.println("sum_up_tail:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: " + Recursion.sum_up_tail(ii) + "   ");
		}
		System.out.println();

		System.out.println();
		System.out.println("print_up_to:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: ");
			Recursion.print_up_to(ii);
		}

		System.out.println();
		System.out.println("Factorial:");
		for (Integer ii : testValues) {
			System.out.print(Recursion.fact(ii) + "   ");
		}
		System.out.println();
		
//		Uncomment the following block of code to test Activity 4
//		Comment out any function calls that do not work

		System.out.println("Activity 4:");

		// Test fibonacci
		System.out.println();
		System.out.println("Fibonacci:");
		for (Integer ii : testValues) {
			System.out.print(Recursion.fib(ii) + "   ");
		}
		System.out.println();

		// Test Euclid's GCD algorithm 
		System.out.println();
		System.out.println("GCD:");
		System.out.print("[96 & 60] " + Recursion.gcd(96, 60) + "    ");
		System.out.print("[30 & 10] " + Recursion.gcd(30, 10) + "    ");
		System.out.print("[96 & 120] " + Recursion.gcd(96, 120) + "    ");
		System.out.println();
	
		// Test power function
		System.out.println();
		System.out.println("Power:");
		for (Integer ii : testValues) {
			for (int jj = 0; jj<6; jj ++)  {
				System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
			}
			System.out.println();
		}

	}
}
