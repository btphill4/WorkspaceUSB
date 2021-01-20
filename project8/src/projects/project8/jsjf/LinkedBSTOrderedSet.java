package projects.project8.jsjf;

import java.util.Iterator;

import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;
import jsjf.exceptions.NonComparableElementException;

public class LinkedBSTOrderedSet<T> implements OrderedSet<T>{

	public LinkedBSTOrderedSet() {
		
	}

	public void addElement(T element) {
		if (!(element instanceof Comparable))
			throw new NonComparableElementException("LinkedBinarySearchTree");

		Comparable<T> comparableElement = (Comparable<T>)element;

		if (isEmpty())
			root = new BinaryTreeNode<T>(element);
		else
			addElement(element, root);
	}

	@Override
	public T removeElement(T targetElement) {
		T result = null;

		if (node == null)
			throw new ElementNotFoundException("LinkedBinarySearchTree");
		else
		{
			if (((Comparable<T>)targetElement).equals(node.element)) 
			{   // remove the current node
				result =  node.element;
				BinaryTreeNode<T> inOrderSuccessor = replacement(node);
				// Decide if current node is left or right child of the parent
				if (parent.right == node)
					parent.right = inOrderSuccessor;
				else 
					parent.left = inOrderSuccessor;

				modCount++;
			}
			else 
			{   // Look for the target in a sub-tree            
				parent = node;
				if (((Comparable<T>)targetElement).compareTo(node.element) < 0)
					result = removeElement(targetElement, node.getLeft(), parent);
				else
					result = removeElement(targetElement, node.getRight(), parent);
			}
		}

		return result;
	}

	@Override
	public T find(T targetElement) {
		T result = null;
		
		if (isEmpty())
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		else 
		{ 	
			if (((Comparable<T>)targetElement).equals(root.element)) 
				result = root.element;
		
		}
		
		return result;  // temp
	}

	@Override
	public T findMin() {
		T result = null;
		
		if (isEmpty())
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		else 
		{ 	
			if (root.left == null)
			{
				result = root.element;
			}
			BinaryTreeNode<T> parent = root;
			BinaryTreeNode<T> current = root.left;
			while(root.left != null)
			{
				parent = current;
				current = current.left;
				result = current.element;
			}
		}
		return result;  // temp
	}

	@Override
	public T findMax() {
		T result = null;
		
		if (isEmpty())
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		else 
		{ 
			if (root.right == null)
			{
				result = root.element;
			}
			else 
			{
				while(root.right != null)
				{
					BinaryTreeNode<T> current = root.right;
					BinaryTreeNode<T> parent = root;
				
					parent = current;
					current = current.left;
					result = current.element;;
				}
			}
		}
		return result;  // temp
	}

	@Override
	public boolean contains(T targetElement) {
		T result = null;
		
		if (isEmpty())
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		else
		{ 	
			if (((Comparable<T>)targetElement).equals(root.element)) 
				return true;
		else
		{
		return false;
		}
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
