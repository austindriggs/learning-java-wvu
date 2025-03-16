/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 11
 * Jakob Kaivo
 * 4/3/23
 * Purpose: Traverse a linked list
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
		 * Parameters: data, next, and prev
		 * Preconditions: None
		 * Postconditions: creates a new instance of a Node
		 * Exceptions: None
		 */
		
		this.aNode = data;
		this.next = next;
		this.prev = prev;
		
	}

	public E getData() {
		
		/*
		 * Method Name: getData
		 * Purpose: returns a reference to the data object stored in this node
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: returns a reference to the data object stored in this node
		 */
		
		return this.aNode;
		
	}

	public void setData(E e) {
		
		/*
		 * Method Name: setData
		 * Purpose: updates the node to reference a new data object
		 * Parameters: E e
		 * Preconditions: None
		 * Postconditions: sets this Nodes data to e
		 * Exceptions: None
		 */
		
		this.aNode = e;
		
	}

	public Node<E> getNext() {
		
		/*
		 * Method Name: getNext
		 * Purpose: returns a reference to the next node in the list
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the next node in the list
		 * Exceptions: None
		 */
		
		return this.next;
	}

	public void setNext(Node<E> node) {
		
		/*
		 * Method Name: setNext
		 * Purpose: updates the node to change what the next node refers to
		 * Parameters: Node<E> node
		 * Preconditions: None
		 * Postconditions: updates the node to change what the next node refers to
		 * Exceptions: None
		 */
		
		this.next = node;
		
	}

	public Node<E> getPrev() {
		
		/*
		 * Method Name: getPrev
		 * Purpose: returns a reference to the previous node in the list
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the previous node
		 * Exceptions: None
		 */
		
		return this.prev;
	}

	public void setPrev(Node<E> node) {
		
		/*
		 * Method Name: setPrev
		 * Purpose: updates the node to change what the previous node refers to. 
		 * Parameters: Node<E> node
		 * Preconditions: None
		 * Postconditions: sets this previous node to node
		 * Exceptions: None
		 */
		
		this.prev = node;
		
	}
	
}