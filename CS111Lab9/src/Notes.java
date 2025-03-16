/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 9
 * Jakob Kaivo
 * 3/20/2023
 * Purpose: Sorted Lists: 
 */



public class Notes {
	
	/*
	 * Class Name: 
	 * Purpose: Create a basic implementation of a deque for generic types
	 * Exceptions: NoSuchElementException if length = 0
	 */
	
	
	
	// Method
		
		/*
		 * Method Name: Deque
		 * Purpose: Constructor
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: creates a new instance of Deque with length zero
		 * Exceptions: None
		 */
	
/*
 * Using the attached ListException.java, SortedArrayList.java , and SortedListInterface.java , implement the SortedArrayList generic class. You may use SortedArrayListTest.java  for testing.

Fields. Data must be backed by at least an array of the appropriate generic type. Fields must be private. You may not use any type other than an array to hold the actual data. (3pts)
Constructor with no parameters. Construct a list with a maximum size of 25 elements. (2pts)
Constructor with one parameter. The parameter represents the maximum size of the list. Construct a list with enough space for that many elements. Must throw a ListException if the maximum size is less than 0. (3pts)

isEmpty(): Returns true if there are 0 elements in the list, false otherwise. (2pts)
isFull(): Returns true if the current number of elements in the list is equal to its maximum size, false otherwise. (2pts)
getMaxSize(): Returns the maximum number of elements the list can hold. (2pts)
size(): Returns the current number of elements in the list. (2pts)
indexOf() with one parameter: Returns the 0-based index of the first occurence of the specified value in the list. Return -1 if the value is not found. (5pts)
indexOf() with two parameters: Returns the 0-based index of the first occurence of the specified value in the last after the specified index. Return -1 if the value is not found. (5pts)
contains(): Returns true if the specified value occurs anywhere in the list, otherwise false. (3pts)
add(): Adds the specified value to the list. The list must be kept in sorted order, from least to greatest. Must throw a ListException if the list is full. (10pts)
get(): Returns the value at the specified 0-based index. Must throw a ListException if the index is not valid. (3pts)
remove() with integer parameter: Removes the value at the given 0-based index. All elements to the right of that index must be shifted left by one, and the current size decrese by one. Returns the value of the obect that was at that index. Must throw a ListException if the index is invalid. (10pts)
remove() with a parameter of the generic type: Removes all occurrences of the given value from the list. Remaining elements must be shifted so that no gaps exist in the list, and the size reduced by the number of elements removed. Returns true if one or more objects are removed from the list, false otherwise. (10pts)
removeAll(): Removes all occurrences of every value in the provided list from this. Remaining elements must be shifted so that no gaps exist in the list, and the size reduced by the number of elements removed. Returns true if one or more objects are removed from the list, false otherwise. (5pts)
clear(): Removes all elements from the list and sets the current size to 0. (3pts)
toString(): Converts the list to a String with the following format: (5pts)
	A single opening square bracket: [
	Each element converted to a String, as though by a call to its toString() method.
	All but the last element must be followed immediately by a comma and a single space.
	The final element must be followed immediately by a closing square bracked: ]

Format and document code according to course Coding Standards.(25pts)

Bonus (not required): Modify the SortedArrayList so that calling the constructor with no parameters constructs a list that has no maximum size. When using such a list, the getMaxSize() method must return Integer.MAX_VALUE, isFull() must always return false, and the add() method must always succeed. If the list is constructed with a specific maximum, all methods must behave according to that maximum size. No unit tests will be provided for the bonus opportunity. (max 20 pts)

Turn in only your SortedArrayList.java. Do not modify or submit ListException.java or SortedListInterface.java.
 */
	
	

}
