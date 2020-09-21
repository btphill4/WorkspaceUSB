package exam.midterm;

import java.util.Random;

import exam.midterm.datastructures.List;
import exam.midterm.datastructures.Queue;
import exam.midterm.datastructures.Stack;

public class MidtermExam {

	public static <T> void reverseSortQueue(Queue<T> q) {

	}
	
	public static void less_than(List<Integer> lst, Integer target) {

	}
	
	public static void main(String args[]) {
		Random rands = new Random();
		System.out.println("Begin Midterm Exam Testing");
		Queue<Integer> q = new Queue<Integer>();
		List<Integer> l = new List<Integer>();
		
		for(int ii=0;ii<10;ii++) {
			int num = rands.nextInt(100);
			q.enqueue(num);
			l.addToFront(num);
		}
		System.out.println("Queue: " + q);
		System.out.println("List: " + l);
		
		System.out.println("\nResults:");
		reverseSortQueue(q);
		System.out.println("Queue: " + q);

		less_than(l, 45);
		
		System.out.println("End Midterm Exam Testing");
	}	
}
