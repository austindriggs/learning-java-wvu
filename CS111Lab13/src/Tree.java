/**
* @author Austin Driggs
* CS 111 Section 002
* Lab 13
* Jakob Kaivo
* 4/17/23
* Purpose: Learn more about recursion and how to search through an unbalanced binary search tree
*/

public class Tree<S extends Comparable<S>> {
	
	/*
	 * Class Name: Tree
	 * Purpose: Implement an unbalanced binary search tree
	 * Exceptions: None
	 */
	
	private S data;
	private Tree<S> left;
	private Tree<S> right;
	
	public Tree() {

		/*
		 * Method Name: Tree
		 * Purpose: Default Constructor: initialize an empty Tree with no data and no children
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: creates a new instance of Tree that's empty
		 * Exceptions: None
		 */
		
		this.data = null;
		this.left = null;
		this.right = null;
		
	}

	public Tree(S data) {

		/*
		 * Method Name: Tree
		 * Purpose: Constructor: initialize a Tree with the given value and no children
		 * Parameters: S data
		 * Preconditions: None
		 * Postconditions: creates a new instance of Tree
		 * Exceptions: None
		 */
		
		this.data = data;
		this.left = null;
		this.right = null;
		
	}

	public Tree(S[] values) {
		
		/*
		 * Method Name: Tree
		 * Purpose: Constructor: initialize a Tree with nodes for all values of the array, in sorted order
		 * Parameters: S[] values
		 * Preconditions: None
		 * Postconditions: Creates multiple instances of Trees
		 * Exceptions: None
		 */
		
		for (int i = 0; i < values.length; i++) {
			add(values[i]);
		}
		
	}

	public void add(S data) {
		
		/*
		 * Method Name: add
		 * Purpose: inserts a value into the tree
		 * Parameters: S data
		 * Preconditions: None
		 * Postconditions: adds the new value into the tree
		 * Exceptions: None
		 */
		
		// If the tree is empty, place the value at the root
		if (this.data == null) {
			this.data = data;
		}
	
		// If the provided value is less than or equal to the current value, add the value to the left, else add it to the right
		else if (this.data.compareTo(data) >= 0) {
			// If the reference is null, add it in there, otherwise keep searching
			if (this.left != null) {
				this.left.add(data);
			}
			else {
				this.left = new Tree<S>(data);
			}
		}
		else {
			if (this.right != null) {
				this.right.add(data);
			}
			else {
				this.right = new Tree<S>(data);
			}
		}
		
	}

	public boolean contains(S data) {
		
		/*
		 * Method Name: contains
		 * Purpose: Test whether or not the tree contains a specific value
		 * Parameters: S data
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		if (this.data.equals(data)) {
			return true;
		}
		else if (this.data.compareTo(data) > 0 && this.left != null) {
			return this.left.contains(data);
		}
		else if (this.data.compareTo(data) < 0 && this.right != null) {
			return this.right.contains(data);
		}
		
		return false;
		
	}

	public String toString() {
		
		/*
		 * Method Name: toString
		 * Purpose: create a string representation of the tree
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns a string of the tree
		 * Exceptions: None
		 */
		
		String myString = "[";
		
		myString += helperString();
		
		myString += "]";
		
		return myString;
		
	}
	
	private String helperString() {
		
		/*
		 * Method Name: helperString
		 * Purpose: handles the actual string to place in between the square brackets in the toString method
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the string without the square brackets
		 * Exceptions: None
		 */
		
		String myString = "";
		
		if (this.left != null) {
			myString += this.left.helperString() + ", ";
		}
		
		if (this.data != null) {
			myString += this.data.toString();
		}
		
		if (this.right != null) {
			myString += ", " + this.right.helperString();
		}
		
		return myString;
		
	}
	
}