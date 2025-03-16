/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 11
 * Jakob Kaivo
 * 4/3/23
 * Purpose: Traverse a linked list
 */

import java.util.NoSuchElementException;

public class Deque<E> {
	
	/*
	 * Class Name: Deque
	 * Purpose: Uses class Node in order to create a linked list
	 * Exceptions: NoSuchElementException if the list is empty
	 */
	
	private Node<E> head;
	private Node<E> tail;
	private int currentSize;
	
	public Deque() {
	
		/*
		 * Method Name: Deque
		 * Purpose: constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		// corrections from lab 10:  head and tail should initially be null
		
		this.head = null;
		this.tail = null;
		this.currentSize = 0;
		
	}

	public void addFirst(E e) {
		
		/*
		 * Method Name: addFirst
		 * Purpose: takes an object and inserts it before the head of the list
		 * Parameters: E e
		 * Preconditions: None
		 * Postconditions: a new node with data e inserted at the front of the list
		 * Exceptions: None
		 */
	
		if (this.currentSize == 0) {
			Node<E> newHead = new Node<E>(e, null, null);
			this.head = newHead;
			this.tail = this.head;
		}
		else {
			Node<E> oldHead = this.head;
			Node<E> newHead = new Node<E>(e, oldHead, null);
			this.head = newHead;
			oldHead.setPrev(newHead);
		}
		
		this.currentSize++;
		
	}
	
	public E removeFirst() {
	
		/*
		 * Method Name: removeFirst
		 * Purpose: removes the first object from the head of the list and returns it as a reference
		 * Parameters: None
		 * Preconditions: the list is not empty
		 * Postconditions: the head node of the list is removed and head is now the next node
		 * Exceptions: NoSuchElementException if the list is empty
		 */
		
		this.isEmpty();
		
		Node<E> oldHead = this.head;
		
		this.head = this.head.getNext();
		
		this.currentSize--;
		
		return oldHead.getData();
		
	}

	public E getFirst() {
		
		/*
		 * Method Name: getFirst
		 * Purpose: returns a reference to the object at the head of the list
		 * Parameters: None
		 * Preconditions: the list is not empty
		 * Postconditions: None
		 * Exceptions: NoSuchElementException if the list is empty
		 */
		
		this.isEmpty();
		
		return this.head.getData();
		
	}

	public void addLast(E e) {
		
		/*
		 * Method Name: addLast
		 * Purpose: takes an object and adds it after the tail of the list
		 * Parameters: E e
		 * Preconditions: None
		 * Postconditions: puts the data e at the end of the list
		 * Exceptions: None
		 */
		
		if (this.currentSize == 0) {
			Node<E> newTail = new Node<E>(e, null, null);
			this.tail = newTail;
			this.head = this.tail;
		}
		else {
			Node<E> oldTail = this.tail;
			Node<E> newTail = new Node<E>(e, null, oldTail);
			this.tail = newTail;
			oldTail.setNext(newTail);
		}
		
		this.currentSize++;
		
	}

	public E removeLast() {
		
		/*
		 * Method Name: removeLast
		 * Purpose: removes the last object from the tail of the list and returns it as a reference
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: removes the last node from the list
		 * Exceptions: NoSuchElementException if the list is empty
		 */
		
		this.isEmpty();
		
		Node<E> oldTail = this.tail;
		
		if (this.currentSize == 1) {
			this.head = null;
			this.tail = null;
		}
		else if (this.currentSize == 2) {
			this.tail = this.head;
			this.tail.setNext(null);
		}
		else {
			this.tail = oldTail.getPrev();
		}
		
		this.currentSize--;
		
		return oldTail.getData();
		
	}

	public E getLast() {
		
		/*
		 * Method Name: getLast
		 * Purpose: returns a reference to the last object at the tail of the list
		 * Parameters: None
		 * Preconditions: the list is not empty
		 * Postconditions: None
		 * Exceptions: NoSuchElementException if the list is empty
		 */
		
		this.isEmpty();

		return this.tail.getData();
		
	}

	public int size() {
		
		/*
		 * Method Name: size
		 * Purpose: returns the current number of objects in the list
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */

		return this.currentSize;
		
	}
	
	private void isEmpty() {
		
		/*
		 * Method Name: isEmpty
		 * Purpose: my method to make sure the list is not empty
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: NoSuchElementException if the list is empty
		 */
		
		if (this.currentSize == 0) {
			throw new NoSuchElementException("ERROR: List is empty.");
		}
		
	}
	
	public String toString() {
		
		/*
		 * Method Name: toString
		 * Purpose: print out the array from head to tail
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns a String
		 * Exceptions: None
		 */
		
		if (this.currentSize == 0) {
			return "[]";
		}
		
		String thisString = "[";
		
		for (Node<E> currentNode = this.head; currentNode != null; currentNode = currentNode.getNext()) {
			thisString += currentNode.getData();
			if (currentNode != tail) {
				thisString += ", ";
			}
		}
		
		thisString += "]";
		
		return thisString;
		
	}
	
	public String toStringReverse() {
		
		/*
		 * Method Name: toStringReverse
		 * Purpose: print out the array from tail to head
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns a String
		 * Exceptions: None
		 */
		
		if (this.currentSize == 0) {
			return "[]";
		}
		
		String thisString = "[";
		
		for (Node<E> currentNode = this.tail; currentNode != null; currentNode = currentNode.getPrev()) {
			thisString += currentNode.getData();
			if (currentNode != head) {
				thisString += ", ";
			}
		}
		
		thisString += "]";
		
		return thisString;
		
	}
	
}