package week06.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T>  implements Iterable<T> {
	
	private ListNode<T> head;
	private ListNode<T> tail;
	private int size;
	
	private class ListNode<E> {
		private E element;
		private ListNode<E> next;
		
		public ListNode(E element, ListNode<E> next) {
			this.element = element;
			this.next = next;
		}
	}
	
	public LinkedList() {
		size = 0;
		head = tail = null;
	}
	
	public void addToFront(T e) {
		// Create a new node that has the old head as its next
		ListNode<T> newNode = new ListNode<T>(e, head);
		
		// The head should now refer to the new node (the new head)
		head = newNode;
		
		// If the list was empty, this is the only node so it is the tail
		if(size == 0) {
			tail = newNode;
		}
		
		size ++;
	}
	
	public void addToRear(T e) {
		// If the list is empty, call addToFront()
		if(isEmpty()) {
			addToFront(e);
		}
		else {
			// Create a new node that has the null as its next
			ListNode<T> newTail = new ListNode<T>(e, null);
			tail.next = newTail;
			// The tail should now refer to the new node
			tail = newTail;
			size++;
		}
	}
	
	public T removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		
		// Get the element from the head node
		T ret = head.element;
		
		// Set the head to the old head's next
		head = head.next;

		size --;
		if (size == 0) {
			tail = head;
		}
		return ret;
	}
	
	public T removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		
		// Get the element from the tail node
		T ret = tail.element;
		
		if(size == 1) {
			return removeFirst();
		}
		else {
			// Find the next-to-last node which will be the new tail
			ListNode<T> newTail = head;
			while(newTail.next != tail) {
				newTail = newTail.next;
			}
			// Set the new tail
			tail = newTail;
			tail.next = null;
			size --;
		}
		
		return ret;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		String ret = "head -> ";
		
		// Traverse the list
		ListNode<T> current = head;
		while (current != null) {
			ret += current.element + " -> ";
			current = current.next;
		}
		return ret + "tail";
	}
	
	public T first() {
		// First check if the list is empty
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		return head.element;
	}	
	
	public T last() {
		// First check if the list is empty
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		return tail.element;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(head);
	}
	
	private class LinkedListIterator<E> implements Iterator<E> {

		private ListNode<E> current;
		
		public LinkedListIterator(ListNode<E> start) {
			super();
			this.current = start;
		}

		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			// First check if the list is empty
			if (isEmpty()) {
				throw new NoSuchElementException("Empty List");
			}
			
			E ret = current.element;
			current = current.next;
			return ret;
		}
		
	}
}
