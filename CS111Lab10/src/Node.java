/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 10
 * Jakob Kaivo
 * 3/27/23
 * Purpose: Create a linked list
 */

public class Node<E> {
	
	/*
	 * Class Name: Node
	 * Purpose: Used by class Deque in order to create a linked list
	 * Exceptions: None
	 */
	
	private E aNode;
	private Node<E> next;
	private Node<E> prev;
	
	public Node(E data, Node<E> next, Node<E> prev) {
		
		/*
		 * Method Name: Node
		 * Purpose: constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		this.aNode = data;
		this.next = next;
		this.prev = prev;
		
	}

	public E getData() {
		
		/*
		 * Returns a reference to the data object stored in this node. 
		 */
		
		/*
		 * Method Name: 
		 * Purpose: 
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return this.aNode;
		
	}

	public void setData(E e) {
		
		/*
		 * Updates the node to reference a new data object (1pt)
		 */
		
		/*
		 * Method Name: 
		 * Purpose: 
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		this.aNode = e;
		
	}

	public Node<E> getNext() {
		
		/*
		 * Returns a reference to the next node in the list
		 */
		
		/*
		 * Method Name: 
		 * Purpose: 
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return this.next;
	}

	public void setNext(Node<E> node) {
		
		/*
		 * Updates the node to change what the next node refers to
		 */
		
		/*
		 * Method Name: 
		 * Purpose: 
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		this.next = node;
		
	}

	public Node<E> getPrev() {
		
		/*
		 * Returns a reference to the previous node in the list
		 */
		
		/*
		 * Method Name: 
		 * Purpose: 
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return this.prev;
	}

	public void setPrev(Node<E> node) {
		
		/*
		 * Updates the node to change what the previous node refers to. 
		 */
		
		/*
		 * Method Name: 
		 * Purpose: 
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		this.prev = node;
		
	}
	
}