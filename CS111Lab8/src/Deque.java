/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 8
 * Jakob Kaivo
 * 3/6/2023
 * Purpose: Implement a mix of a queue and stack called a deque
 */

import java.util.NoSuchElementException;

public class Deque<E> {
	
	/*
	 * Class Name: Deque
	 * Purpose: Create a basic implementation of a deque for generic types
	 * Exceptions: NoSuchElementException if length = 0
	 */
	
	private E[] arr;
	
	public Deque() {
		
		/*
		 * Method Name: Deque
		 * Purpose: Constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: creates a new instance of Deque with length zero
		 * Exceptions: None
		 */
		
		this.arr = (E[]) new Object[0];
		
	}

	public void addFirst(E e) {
		
		/*
		 * Method Name: addFirst
		 * Purpose: puts e at beginning of array and shifts everything else one index higher
		 * Parameters: generic type E e
		 * Preconditions: None
		 * Postconditions: E e will now be first in the array and Deque
		 * Exceptions: None
		 */
		
		if (this.arr.length == 0) {
			this.arr = (E[]) new Object[1];
			this.arr[0] = e;
		}
		else {
			
			E[] temp = (E[]) new Object[this.arr.length + 1];
			
			temp[0] = e;
			
			for(int i = 0; i < this.arr.length; i++) {
				temp[i + 1] = this.arr[i];
			}
			
			this.arr = (E[]) new Object[temp.length];
			
			for(int i = 0; i < this.arr.length; i++) {
				this.arr[i] = temp[i];
			}
			
		}
		
	}

	public E removeFirst() {
		
		/*
		 * Method Name: removeFirst
		 * Purpose: removes the first element from the array and returns its value
		 * Parameters: None
		 * Preconditions: array cannot be empty
		 * Postconditions: removes the 0th index of the array
		 * Exceptions: throws a NoSuchElementException if the array is empty
		 */
		
		E removed = null;
		
		if (this.arr.length == 0) {
			throw new NoSuchElementException();
		}
		else {
			
			removed = this.arr[0];
			
			if (this.arr.length == 1) {
				this.arr = (E[]) new Object[0];
			}
			
			else {
				
				E[] temp = (E[]) new Object[this.arr.length - 1];
				
				for(int i = 0; i < this.arr.length - 1; i++) {
					temp[i] = this.arr[i + 1];
				}
				
				this.arr = (E[]) new Object[temp.length];
				
				for(int i = 0; i < temp.length; i++) {
					this.arr[i] = temp[i];
				}
				
			}
			
		}
		
		return removed;
	}

	public E getFirst() {
		
		/*
		 * Method Name: getFirst
		 * Purpose: returns the first element of the array without modifying the array
		 * Parameters: None
		 * Preconditions: array cannot be empty
		 * Postconditions: returns the first index of the array
		 * Exceptions: throws a NoSuchElementException if the array is empty
		 */
		
		if (this.arr.length == 0) {
			throw new NoSuchElementException();
		}
		else {
			return this.arr[0];
		}
		
	}

	public void addLast(E e) {
		
		/*
		 * Method Name: addLast
		 * Purpose: puts e at the end of array
		 * Parameters: E e
		 * Preconditions: None
		 * Postconditions: E e will now be last in the array and Deque
		 * Exceptions: None
		 */
		
		if (this.arr.length == 0) {
			this.addFirst(e);
		}
		else {
			
			E[] temp = (E[]) new Object[this.arr.length + 1];
			
			for(int i = 0; i < this.arr.length; i++) {
				temp[i] = this.arr[i];
			}
			
			temp[temp.length - 1] = e;
			
			this.arr = (E[]) new Object[temp.length];
			
			for(int i = 0; i < this.arr.length; i++) {
				this.arr[i] = temp[i];
			}
			
		}
		
	}

	public E removeLast() {
		
		/*
		 * Method Name: removeLast
		 * Purpose: removes the last element from the array and returns its value
		 * Parameters: None
		 * Preconditions: array cannot be empty
		 * Postconditions: the last element will be removed
		 * Exceptions: throws a NoSuchElementException if the array is empty
		 */
		
		E removed = null;
		
		if (this.arr.length == 0) {
			throw new NoSuchElementException();
		}
		
		else {
			
			removed = this.arr[this.arr.length - 1];
			
			if (this.arr.length == 1) {
				this.removeFirst();
			}
			else {
				
				E[] temp = (E[]) new Object[this.arr.length - 1];
				
				for(int i = 0; i < temp.length; i++) {
					temp[i] = this.arr[i];
				}
				
				this.arr = (E[]) new Object[temp.length];
				
				for(int i = 0; i < this.arr.length; i++) {
					this.arr[i] = temp[i];
				}
				
			}
		}
		
		return removed;
	}

	public E getLast() {
		
		/*
		 * Method Name: getLast
		 * Purpose: returns the last element of the array without modifying the array
		 * Parameters: None
		 * Preconditions: array cannot be empty
		 * Postconditions: None
		 * Exceptions: throws a NoSuchElementException if the array is empty
		 */
		
		if (this.arr.length == 0) {
			throw new NoSuchElementException();
		}
		else {
			return this.arr[this.arr.length - 1];
		}
	}

	public int size() {
		
		/*
		 * Method Name: size
		 * Purpose: returns the current size of the array
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return this.arr.length;
	}
	
}