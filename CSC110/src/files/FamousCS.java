package files;


import java.io.*; //needed for FileReader
import java.util.Scanner;




public class FamousCS {

	
	public static void main(String[] args) throws IOException
	{
		//Read the file
		Scanner inFile = new Scanner(new FileReader("src/files/names.txt"));
		
		//variables
		String name1 = "", name2 = "", bio = "";
		String line;
		int countScientist = 0;
		PrintWriter out = new PrintWriter("src/files/CSReport.txt");
		
		//Reading each line
		while ( inFile.hasNextLine())//will return true and enter the loop if there is another line in the file
		{
				//read a line of text from the file
				line = inFile.nextLine();
				
				//create another Scanner object called tokens and associate with line
				Scanner tokens = new Scanner(line);
				
				//use a comma as the delimiter
				tokens.useDelimiter(",");
				name1 = tokens.next();
				name2 = tokens.next();
				bio = tokens.next();
				
				
				
				//Print to java
				System.out.println(name2.substring(0,1) + ". " + name1 + " " + bio);
				countScientist++;
				
				out.println(name2.substring(0,1) + ". " + name1 + " " + bio);
				out.println("There are " + countScientist + " famous computer scientist in the file.");
				
				
		}
				//Count number of scientist
				System.out.println("There are " + countScientist + " famous computer scientist in the file.");
		
		//write to the file
				
				while (inFile.hasNextLine())
				{
					//read the files and assign variables
					line = inFile.next();
					Scanner tokens = new Scanner(line);
					tokens.useDelimiter(",");
					name1 = tokens.next();
					name2 = tokens.next();
					bio = tokens.next();
					
					//print out the file
					
					out.close();
					
				}
				
				//close files
				
				
				inFile.close();
				out.close();
	}
	
}



/* my output
J. Gosling is often called the inventor of Java
E. Dijkstra was the supreme algorithmist - he researched and developed how to solve problems fast
A. Kay developed the first OO programming language called Smalltalk
R. Pausch led the team of Carnegie Mellon graduate students that developed the Alice programming language
A. Turing is often considered the father of modern computer science
J. Backus developed the Fortran language with his team at IBM
D. Knuth wrote the ultimate Computer Science comprehensive text called The Art of Computer Programming
J. McCarthy is famous for his contributions to and coined the term Artificial Intelligence
G. Hopper was a Navy Admiral who invented the first compiler
J. von Neumann developed the von Neumann architecture used in virtually every non-parallel processing computer
K. Thompson designed and implemented the original Unix operating system
There are 11 famous computer scientist in the file.
*/
