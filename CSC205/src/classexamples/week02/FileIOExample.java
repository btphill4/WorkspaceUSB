package classexamples.week02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
	public static void main (String args[]) {
		File file = new File("example.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// File exists so continue
		}
		
		// Try-with-resources - implicitly finally block with close()
		try (FileWriter fw = new FileWriter(file);
			 FileReader fr = new FileReader(file);) {
			
			fw.write("This is a test for CSC205\n");
			fw.flush();
			fw.close();
			
			char[] a = new char[100];
			fr.read(a);
			System.out.println("Contents: " + new String(a));

		} catch (IOException e) {
			System.err.println("Something went wrong working with the file");
		}
		
		
		
	}

}
