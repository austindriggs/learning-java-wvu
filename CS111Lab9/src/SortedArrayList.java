/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 9
 * Jakob Kaivo
 * 3/20/2023
 * Purpose: Sorted Array Lists
 */

public class SortedArrayList<S extends Comparable<S>> implements SortedListInterface<S> {
	
	/*
	 * Class Name: SortedArrayList
	 * Purpose: Implement the SortedListInterface by providing methods in order to manipulate our list
	 * Exceptions: throw new ListException if invalid indexes are given for the list
	 */
	
	private S[] myList;
	
	private int currentSize = 0; // starting with 0 elements in both constructors
	private final int DEFAULT_SIZE = 25; //
	
	public SortedArrayList() {
		
		/*
		 * Method Name: SortedArrayList
		 * Purpose: default constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: new instance of SortedArrayList with default size
		 * Exceptions: None
		 */
		
		this.myList = (S[]) new Comparable[DEFAULT_SIZE]; // Comparable instead of Object because we extend Comparable on our generic type
		
	}

	public SortedArrayList(int max) {

		/*
		 * Method Name: SortedArrayList
		 * Purpose: constructor with max size
		 * Parameters: int max for the max size of the array
		 * Preconditions: max > 0
		 * Postconditions: new instance of SortedArrayList with max size
		 * Exceptions: throws ListException if the maximum size is less than 0
		 */
		
		
		if (max < 0) {
			throw new ListException("Invalid Index: please try again.");
		}
		
		this.myList = (S[]) new Comparable[max];
		
	}

	public boolean isEmpty() {
		
		/*
		 * Method Name: isEmpty
		 * Purpose: checks to see if there are any elements in the list
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns true if there are 0 elements in the list, false otherwise
		 * Exceptions: None
		 */
		
		if (currentSize == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean isFull() {
			
		/*
		 * Method Name: isFull
		 * Purpose: checks to see if the list is full
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns true if the current number of elements in the list is equal to its maximum size, false otherwise
		 * Exceptions: None
		 */
		
		if (this.currentSize == this.myList.length) {
			return true;
		}
		
		return false;
		
	}

	public int getMaxSize() {

		/*
		 * Method Name: getMaxSize
		 * Purpose: returns the maximum number of elements the list can hold
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the length of the list
		 * Exceptions: None
		 */
		
		return this.myList.length;
		
	}

	public int size() {
		
		/*
		 * Method Name: size
		 * Purpose: returns the current number of elements in the list
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this currentSize
		 * Exceptions: None
		 */
		
		return this.currentSize;
	}

	public int indexOf(S value) {
			
		/*
		 * Method Name: indexOf
		 * Purpose: Returns the 0-based index of the first occurence of the specified value in the list. Return -1 if the value is not found
		 * Parameters: S value
		 * Preconditions: None
		 * Postconditions: returns the index or -1
		 * Exceptions: None
		 */
		
		return indexOf(value, 0); // I want to start at index 0 
		
	}

	public int indexOf(S value, int index) {

		/*
		 * Method Name: indexOf
		 * Purpose: Returns the 0-based index of the first occurence of the specified value in the last after the specified index. Returns -1 if the value is not found
		 * Parameters: S value you want to find and int index you want to start at
		 * Preconditions: a valid index
		 * Postconditions: returns the index or -1
		 * Exceptions: throws ListException if 0 <= index < currentSize is not true in checkIndex
		 */
		
		checkIndex(index);
		
		for (int i = index; i < this.currentSize; i++) {
			if (this.myList[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
		
	}

	public S get(int index) {
		
		/*
		 * Method Name: get
		 * Purpose: returns the value at the specified 0-based index
		 * Parameters: int index
		 * Preconditions: a valid index
		 * Postconditions: returns the value or -1
		 * Exceptions: throws ListException if 0 <= index < currentSize is not true in checkIndex
		 */
		
		checkIndex(index);

		if (index >= currentSize) {
			throw new ListException("Invalid Index: please try again.");
		}
		
		return this.myList[index];
		
	}

	public boolean contains(S value) {
		
		/*
		 * Method Name: contains
		 * Purpose: returns true if the specified value occurs anywhere in the list, otherwise false
		 * Parameters: S value you want to search for
		 * Preconditions: None
		 * Postconditions: returns true or false
		 * Exceptions: None
		 */
		
		if (this.indexOf(value) != -1) {
			return true;
		}
		
		return false;
	}

	public void add(S value) {
		
		/*
		 * Method Name: add
		 * Purpose: adds the specified value to the list in sorted order, from least to greatest
		 * Parameters: S value to be added
		 * Preconditions: the list isn't full
		 * Postconditions: updates the list with the new value in order and increments current size
		 * Exceptions: throws ListException if the list is full

		 */
		
		if (this.isFull()) {
			throw new ListException("List is full: cannot add a new value.");
		}
		
		else if (this.isEmpty()) {
			this.myList[this.currentSize] = value;
			this.currentSize++;
		}
		
		else if (this.myList[this.currentSize - 1].compareTo(value) <= 0) {
			this.myList[this.currentSize] = value;
			this.currentSize++;
		}
			
		else {
			
			for (int i = 0; i < this.currentSize; i++) {
			
				if (this.myList[i].compareTo(value) >= 0) {
	
					for (int j = this.currentSize - 1; j >= i; j--) {
						this.myList[j + 1] = this.myList[j];
					}
					
					this.myList[i] = value;
					this.currentSize++;
					break;
	
				} // end if
			} // end for i
		} // end else
			
	}

	public boolean removeAll(SortedListInterface<? extends S> anotherList) {
		
		/*
		 * Method Name: removeAll
		 * Purpose: Removes all occurrences of every value in the provided list from this list and leaves no gaps and updates currentSize
		 * Parameters: anotherList
		 * Preconditions: neither list should be empty
		 * Postconditions: updates the list and increments currentSize and returns true if one or more objects are removed from the list, false otherwise
		 * Exceptions: None
		 */
		
		int startSize = currentSize;
		
		for (int i = 0; i < anotherList.size(); i++) {
			while ( this.contains(anotherList.get(i)) ) {
				this.remove(anotherList.get(i));
			}
		}
		
		if (startSize == currentSize) {
			return false;
		}
		
		return true;
		
	}

	public S remove(int index) {
				
		/*
		 * Method Name: remove
		 * Purpose: removes the value at the given 0-based index, shifts all elements to fill gap, and decrements currentSize
		 * Parameters: int index
		 * Preconditions: None
		 * Postconditions: returns the value of the obect that was at that index
		 * Exceptions: throws ListException if the index is invalid
		 */
		
		checkIndex(index);
		if (this.isEmpty()) {
			throw new ListException("Invalid Index: please try again.");
		}
		
		S value = this.myList[index];
		
		for (int i = index; i < this.currentSize; i++) {
			this.myList[i] = this.myList[i + 1];
		}
		
		this.currentSize--;
		
		return value;
	}

	public boolean remove(S value) {
		
		/*
		 * Method Name: remove
		 * Purpose: removes all occurrences of the given value from the list, shifts all elements to fill gap, and decrements currentSize
		 * Parameters: S value
		 * Preconditions: None
		 * Postconditions: returns true if one or more objects are removed from the list, false otherwise
		 * Exceptions: None
		 */
		
		boolean removed = false;
		
		for (int i = 0; i < this.currentSize; i++) {
			
			if (this.myList[i].equals(value)) {
				
				for (int j = i; j < currentSize; j++) {
					this.myList[j] = this.myList[j + 1];
				}
		
				currentSize--;
				removed = true;
				
			}
			
		}
		
		return removed;
		
	}

	public void clear() {

		/*
		 * Method Name: clear
		 * Purpose: removes all elements from the list and sets the current size to 0
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: sets every element in the list to null and currentSize to 0
		 * Exceptions: None
		 */
		
		for (int i = 0; i < this.myList.length; i++) {
			this.myList[i] = null;
		}
		
		this.currentSize = 0;
		
	}

	public String toString() {
		
		/*
		 * Method Name: toString
		 * Purpose: converts the list as a string with format [element, element, element...] for all elements
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the string
		 * Exceptions: None
		 */
		
		String listString = "[";
		
		for (int i = 0; i < this.currentSize - 1; i++) {
			listString += this.myList[i] + ", ";
		}
		
		listString += this.myList[this.currentSize - 1] + "]";
		
		return listString;
		
	}
	
	private void checkIndex(int num) {
		
		/*
		 * Method Name: checkIndex
		 * Purpose: my method that I thought would cut down on some coding but I don't think it did that makes sure an index is valid
		 * Parameters: int num that represents the index
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: throws ListException if the index is invalid
		 */
		
		if (num < 0 || num > this.currentSize) {
			throw new ListException("Invalid Index: please try again.");
		}

	}

	/*
	 * Bonus (not required): Modify the SortedArrayList so that calling the constructor with no parameters constructs a list that has no maximum size. 
	 * When using such a list, the getMaxSize() method must return Integer.MAX_VALUE, isFull() must always return false, and the add() method 
	 * must always succeed. If the list is constructed with a specific maximum, all methods must behave according to that maximum size. No unit 
	 * tests will be provided for the bonus opportunity. (max 20 pts)
	 */

}