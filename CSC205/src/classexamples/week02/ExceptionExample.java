package classexamples.week02;

public class ExceptionExample {

	public static void main(String[] args) {

		int num = 10;
		
		System.out.println("num = " + num);
		
		try {
			int zero = 0;
			num = 3 / zero;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.err.println("Hey, you can't divide by zero!!");
			num = -1;
		} finally {
			System.out.println("Finally, done with this.");
		}
		
		// zero = 1;  // zero is a "local" variable in the try block - out of scope here
		System.out.println("num = " + num);
	}
	

}
