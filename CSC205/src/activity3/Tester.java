package activity3;

public class Tester {

	public static void main(String[] args)
{
		System.out.println("Activty 3 : Priority Tester\n");
		
		Task a = new Task(2);
		Task b = new Task(0);
		
		System.out.println("Task a :" + a.getPriority());
		System.out.println("Task b :" + b.getPriority());
		
		a.setPriority(3);
		b.setPriority(1);
		
		System.out.println();
		System.out.println(a.toString());
		System.out.println(b.toString());
		

	}

}
