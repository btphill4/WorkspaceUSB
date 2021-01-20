package practice;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedLists<T> implements Iterable<T> {

	private ListNode<T> head;
	private ListNode<T> tail;
	private int size;
	
	private class ListNode<E>
	{
		private E element;
		private ListNode<E> next;
		
		public ListNode(E element, ListNode<E> next)
		{
			this.element = element;
			this.next = next;
		}
		
	}
	
	public LinkedLists()
	{
		size = 0;
		head = tail = null;
	}
	
	public void addToFront(T e) 
	{
		//create a new node that has the old head as its next
		ListNode<T> newNode = new ListNode<T>(e, head);
		
		//the head should now refer to the new node (the new head)
		head = newNode;
		
		//if the list was empty, this is the only node so it is the tail
		if (size == 0)
		{
			tail = newNode;
		}
		size++;
	}
	
	public void addToRear(T e)
	{
		//if the list is empty, call addToFront()
		if(isEmpty())
		{
			addToFront(e);
		}
		else 
		{
			//create a new node that has the null as its next
			ListNode<T> newTail = new ListNode<T>(e, null);
			tail.next = newTail;
			//the tail should now refer to the new node
			tail = newTail;
			size++;
		}
	}
	
	public T removeFirst() {
		//first check to see if list is empty
		if(isEmpty())
		{
			throw new NoSuchElementException("Empty List");
		}
		
		//get the element from the head node
		T ret = head.element;
	
		//set the head to the old heads next
		head = head.next;
	
		size--;
		if(size == 0)
		{
			tail = head;
		}
		return ret;
		}
	
	public T removeLast() 
	{	//first check to see if list is empty
		if(isEmpty())
		{
			throw new NoSuchElementException("Empty List");
		}
		//get the element from the head node
			T ret = tail.element;
		if (size == 1)
		{
			return removeFirst();
		}
		else
		{
		//find the next to last node because it will be new tail
			ListNode<T> newTail = head;
			while (newTail.next != tail)
			{
				newTail = newTail.next;
			}
			//finally set the new tail
			tail = newTail;
			tail.next = null;
			size--;
		}
		
		
		return ret;
		
	}
	
	public int size()
	{
		return size;
	}
	
	private boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString()
	{
		String ret = "head -> ";
		
		//traverse the list
		ListNode<T> current = head;
		while(current != null) //to tell if we at the end
		{
			ret += current.element + " -> ";
			current = current.next; //says the current node is the next node if it isn't null
		}
		return ret + "tail";
	}
	
	
	
	public T first()
	{
		//first check to see if list is empty
		if(isEmpty())
		{
			throw new NoSuchElementException("Empty List");
		}
		return head.element;
	}
	public T last()
	{
	//first check to see if list is empty
			if(isEmpty())
			{
				throw new NoSuchElementException("Empty List");
			}
				return tail.element;
	}

	@Override
	public Iterator<T> iterator()
	{
		// TODO Auto-generated method stub
		return new LinkListIterator<T>(head); //create a class below
	}
	
	
	
	
	
	
	
	
	
	
	private class LinkListIterator<E> implements Iterator<E>
	{
		private ListNode<E> current;
		
		public LinkListIterator(ListNode<E> start)
		{
			super();
			this.current = start;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (current != null);
		}

		@Override
		public E next() //Similar to front method 
		{
			//first check to see if list is empty
			if(isEmpty())
			{
				throw new NoSuchElementException("Empty List");
			}
			E ret = current.element;
			current = current.next;
			return ret;
		}
		
	}
	
	
	
	
	
	
	
	
	
}	

