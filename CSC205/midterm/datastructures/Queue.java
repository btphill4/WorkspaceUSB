package exam.midterm.datastructures;

import classexamples.week07.jsjf.QueueADT;

public class Queue<T> implements QueueADT<T> {

	List<T> elements;

	public Queue() {
		super();
		this.elements = new List<T>();
	}

	@Override
	public void enqueue(T element) {
		elements.addToRear(element);
	}

	@Override
	public T dequeue() {
		return elements.removeFirst();
	}

	@Override
	public T first() {
		return elements.first();
	}

	@Override
	public boolean isEmpty() {
		return elements.isEmpty();
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public String toString() {
		return elements.toString();
	}	
}
