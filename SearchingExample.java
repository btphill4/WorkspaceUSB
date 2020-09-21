package classexamples.week9;
import classexamples.week9.csc205.Searching;
import classexamples.week9.csc205.StudentRecord;

public class SearchingExample {
	public static void main(String[] args) {
		Integer result;
		Integer a[] = new Integer[5000];

		for (int ii=0; ii< a.length; ii++) {
			a[ii] = ii * 2;
		}	
			
		StudentRecord s[] = new StudentRecord[10];
	    s[1] = new StudentRecord("Devin Dennis", 3.1);
	    s[6] = new StudentRecord("Levi Castillo", 3.0);
	    s[8] = new StudentRecord("Roy Cobb", 2.0);
	    s[4] = new StudentRecord("Hector Grant", 3.4);
	    s[9] = new StudentRecord("Whitney Carroll", 4.0);
	    s[3] = new StudentRecord("Floyd Harrington", 3.5);
	    s[7] = new StudentRecord("Ollie Ramirez", 3.9);
	    s[0] = new StudentRecord("Alice Fleming", 2.8);
	    s[2] = new StudentRecord("Enrique Barrett", 3.2);
	    s[5] = new StudentRecord("Jennifer Reed", 3.7);

		for (int ii=0; ii< s.length; ii++) {
			System.out.println(s[ii]);
		}

		System.out.println("\nLinear Search:");
		result = Searching.linearSearch(a, 4);
		System.out.println("Linear Result1 (4): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.linearSearch(a, 40);
		System.out.println("Linear Result2 (40): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.linearSearch(a, 440);
		System.out.println("Linear Result3 (440): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.linearSearch(a, 41);
		System.out.println("Linear Result4 (41): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.linearSearch(a, 8800);
		System.out.println("Linear Result5 (8800): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.linearSearch(a, 100000);
		System.out.println("Linear Result6 (100000): " + result + "  (" + Searching.getCounter() + ")");


		System.out.println("\nBinary Search:");
		result = Searching.binarySearch(a, 4);
		System.out.println("Binary Result1 (4): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.binarySearch(a, 40);
		System.out.println("Binary Result2 (40): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.binarySearch(a, 440);
		System.out.println("Binary Result3 (440): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.binarySearch(a, 41);
		System.out.println("Binary Result4 (41): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.binarySearch(a, 8800);
		System.out.println("Binary Result5 (8800): " + result + "  (" + Searching.getCounter() + ")");
		result = Searching.binarySearch(a, 100000);
		System.out.println("Binary Result6 (100000): " + result + "  (" + Searching.getCounter() + ")");

		System.out.println("\n");
		StudentRecord student = Searching.binarySearch(s, new StudentRecord("Floyd Harrington"));
		System.out.println("Found student: " + student);		
	}
}
