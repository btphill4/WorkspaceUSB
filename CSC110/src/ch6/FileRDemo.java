
package ch6;
//Program Name : FileRDemo.java  Student starting File for Files Activity 1
//               Example of Reading from a file
//Author : Brandon Phillips
//Date : 3/21
//Brief Description:  We will use this starting file to show an example
//                    of reading and writing to stream files.
//
//IOExceptions are checked exceptions.  So either must catch or list
//in method header.  We chose the later.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//                     inside the same Java package.  In my example
//                     I created a package called ch10Files.  So the path 
//                     for all files will be src/ch10Files/~~~~

import java.io.*; //needed for FileReader
import java.util.Scanner;


public class FileRDemo {

	public static void main(String[] s) throws IOException 
	{
		//declare and instantiate the input file object and open the file
		Scanner inFile = new Scanner(new FileReader("src/ch6/StudentGrades.txt"));
		
			
		String line = ""; //variable to put each line as read
		String name;
		int exam1, exam2, exam3;

		/*use while because don't know how many lines in the file
		  hasNextLine returns false when the end of the file is reached. */

		while ( inFile.hasNextLine())//will return true and enter the loop if there is another line in the file
		{
				//read a line of text from the file
				line = inFile.nextLine();
				
				//create another Scanner object called tokens and associate with line
				Scanner tokens = new Scanner(line);
				
				//use a comma as the delimiter
				tokens.useDelimiter(",");
				
				name = tokens.next();		//read in the first chunk of data until a comma is encountered
				exam1 = tokens.nextInt();
				exam2 = tokens.nextInt();
				exam3 = tokens.nextInt();
				
				double averageScore = (exam1 + exam2 + exam3)/3.0;
				//print out the code
				System.out.println("Student: " + name + " Java Exam 1: " + exam1 + " Java Exam 2: " 
						+ exam2 + " Java Exam 3: " + exam3);
				
				
				//challenge
				System.out.println("Student: " + name.substring(0,1) + "." + name.substring(name.indexOf(" ")) + " Average Exam Score " + averageScore);
				System.out.println();

		}
	    //close the file
		inFile.close();
		
		//write out files
		PrintWriter outFile = new PrintWriter("src/ch6/GradeReport.txt");
		while (inFile.hasNextLine())
		{
			line = inFile.nextLine();
			outFile.println(line);
		}
		outFile.close();
		
		
		
		
	}
}

/*Expected Output - nothing too fancy.  Just displaying what was read from the input file
Donald Duck,90,80,90
Minnie Mouse,90,98,92
Homer Simpson,60,70,75



Part 3 output: 
Student: Donald Duck Java Exam 1: 90 Java Exam 2: 80 Java Exam 3: 90
Student: Minnie Mouse Java Exam 1: 90 Java Exam 2: 98 Java Exam 3: 92
Student: Homer Simpson Java Exam 1: 60 Java Exam 2: 70 Java Exam 3: 75

challenge
Student: Donald Duck Java Exam 1: 90 Java Exam 2: 80 Java Exam 3: 90
Student: D.Duck Average Exam Score 86.0

Student: Minnie Mouse Java Exam 1: 90 Java Exam 2: 98 Java Exam 3: 92
Student: M.Mous Average Exam Score 93.0

Student: Homer Simpson Java Exam 1: 60 Java Exam 2: 70 Java Exam 3: 75
Student: H.imps Average Exam Score 68.0





*/
