package exam.midterm.datastructures;

import classexamples.week07.jsjf.StackADT;

public class Stack<T> implements StackADT<T> {

	List<T> elements;
	
	public Stack() {
		super();
		elements = new List<T>();
	}

	@Override
	public void push(T element) {
		elements.addToFront(element);
	}

	@Override
	public T pop() {
		return elements.removeFirst();
	}

	@Override
	public T peek() {
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
