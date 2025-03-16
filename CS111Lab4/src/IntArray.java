/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 4
* Jakob Kaivo
* 1/30/23
* Purpose: Practice using arrays in classes and different methods.
*/

import java.util.Arrays;

public class IntArray {
	
	/*
	 * Class Name: IntArray
	 * Purpose: Practice using arrays in classes and different methods.
	 * Exceptions: None
	 */
	
	private int[] array;
	
	public IntArray() {
		
		/*
		 * Method Name: IntArray
		 * Purpose: Constructor with no parameters. Ensure that the constructed object initially has a length of 0.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: Creating a new array with length 0
		 * Exceptions: None
		 */
		
		this.array = new int[0]; // 0 is the default value
		
	}

	public IntArray(int[] array) {
		
		/*
		 * Method Name: IntArray
		 * Purpose: Constructor with an array of integer parameters. Initialize the constructed object with a copy of the provided array
		 * Parameters: int[] array
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		this.array = Arrays.copyOf(array, array.length);
		
	}

	public int getValue(int index) {
		
		/*
		 * Method Name: getValue
		 * Purpose: Return the value at a specified index.
		 * Parameters: 	1. 	Throw an ArrayIndexOutOfBounds if a negative index is provided. 
		 * 				2. 	If the given index is between 0 and the current length, return the value at that index.
		 * 				3. 	If the given index is greater than the current length, expand the object to have a length 
		 * 					one larger than the specified index, filling new elements with 0, and return 0.
		 * Preconditions: None
		 * Postconditions: Expanding the array if needed, and returning the value
		 * Exceptions: ArrayIndexOutOfBoundsException
		 */
		
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("The index needs to be greater than 0.");
		}
		else if (index < this.array.length) {
			return this.array[index];
		}
		else {
			this.array = Arrays.copyOf(this.array, index + 1);
			return 0;
		}
		
	}

	public void setValue(int index, int value) {
		
		/*
		 * Method Name: setValue
		 * Purpose: Store a value at a specified index.
		 * Parameters: int index and int value
		 * Preconditions: 	1. 	Throw an ArrayIndexOutOfBounds if a negative index is provided. 
		 * 					2. 	If the given index is between 0 and the current length, store the given value at that index. 
		 * 					3. 	If the given index is greater than the current length, expand the object to have a length one 
		 * 						larger than the specified index, filling new elements with 0, and store the given value at 
		 * 						the end of the object.
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("The index needs to be greater than 0.");
		}
		else if (index < this.array.length) {
			this.array[index] = value;
		}
		else {
			this.array = Arrays.copyOf(this.array, index + 1);
			this.array[index] = value;
		}
		
	}
	
	public int length() {
		
		/*
		 * Method Name: length
		 * Purpose: Return the currently allocated size of the object.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: Returning the length
		 * Exceptions: None
		 */
		
		return this.array.length;
	}

	public int[] asArray() {
		
		/*
		 * Method Name: asArray
		 * Purpose: Returns the current object as an array of integers. The returned array must not be a 
		 * reference to any field (i.e. modifications to the array should not modify the object, and vice versa).
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: Returning the array
		 * Exceptions: None
		 */
		
		return this.array;
	}

	public boolean equals(IntArray that) {
		
		/*
		 * Method Name: equals
		 * Purpose: Compare the current object with the parameter. Return true if the two objects have the same 
		 * length and all values at corresponding indices are equals; otherwise return false.
		 * Parameters: IntArray that
		 * Preconditions: None
		 * Postconditions: Returning true or false
		 * Exceptions: None
		 */

		if (that.length() == this.array.length) {
			for (int i = 0; i < this.array.length; i++) {
				if (this.array[i] != that.array[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
		
	}
}