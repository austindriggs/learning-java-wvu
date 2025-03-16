/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 7 (Programming Assignment 1)
 * Jakob Kaivo
 * 2/27/23
 * 
 * Purpose:
 *  
 * OLD Purpose:
 * 
 *  In this assignment you will implement your OWN version of the String class and some of its 
 * 	 methods. You should be familiar with the behavior of this class from CS 110. The intent of this 
 * 	 project is to practice both writing a class, AND manipulating arrays of characters.
 *  Topics: arrays, writing classes, understanding classes
 * 
 *  It is reasonable to assume, based on our experience,  that the Java String class really stores the 
 *   text that the String contains as an array of characters.  This is the implementation that we will 
 *   assume.  You CAN NOT directly call methods from Java’s class String except in a few 
 *   documented exceptions as described below.
 * 
 *  Things to remember:
 * 	 In Java Strings are immutable, this means that any changes you make to a String object creates a new String. OUR class will behave in the same way.
 * 	 You may not use any methods from the Java String class, except as specified in the second constructors and toString method
 *	 You may use methods from the Java Arrays class and the Character class
 * 
 * 
 * 
 * NEW Purpose:
 * 
 * Extend your MyString implementation from Programming Assignment 1 to implement the java.lang.Cloneable and java.lang.Comparable interfaces. 
 * You may use MyStringTest.java  to test your implementation. You may not use String objects or methods outside of the 
 *  constructor that takes a String parameter and the toString() method.
 *  
 * Existing methods and fields. Your MyString class needs to retain the following methods from Programming Assignment 1. It is 
 *  acceptable to remove other methods. All retained methods must work correctly. If there were indicated as working correctly 
 *  in your feedback to Programming Assignment 1, you may use them as-is, otherwise correct them.
 *  	
 *  	The field storing the characters must be an array of char. No String or MyString fields are allowed. (5 pts) 
 * 
 * 		Constructor taking a String parameter. Constructs a new MyString object from a standard String object. (5 pts)
 * 		
 * 		toString() method. Constructs and returns a standard String object matching the contents of the MyString object. (5 pts)
 * 
 * Cloneable interface.
 * 
 * 		Your class must declare that it implements the interface. (5 pts)
 * 		
 * 		Implement the clone() method. The clone() method must create and return new MyString object that is a deep copy of the original. (15 pts)
 * 
 * Comparable interface.
 * 		
 * 		Your class must declare that it implements the interface for comparison to other MyString objects. (10 pts)
 * 		
 * 		Implement the compareTo() method. You may have already done this as part of Programming Assignment 1. Verify that your implementation is correct, 
 * 		 and if not, correct it. This method takes another MyString object as a parameter and performs a lexicographical comparison. You may want to 
 * 		 use Character.compare() for this. Step through each pair of corresponding characters. If the character in this is lexicographically less than 
 * 		 the character from the parameter, return a negative value. If the character from the parameter is lexicographically less than the character 
 * 		 from this, return a positive value. If they are equal, continue until all characters have been compared. If all characters are lexicographically 
 * 		 equal, and the lengths of the two MyString objects are equal, return 0. Otherwise, if this is shorter than the parameter, return a negative value; 
 * 		 if the parameter is longer, return a positive value. (25 pts)
 * 
 * Document and format your code according to course Coding Standards. (30pts)
 * 
 * Submit your updated MyString.java file.
 * 
 */



public class MyString implements Cloneable, Comparable<MyString> {
	
   /*
	* Class Name: MyString
	* Purpose: To implement our own version of a String.
	* Exceptions: IndexOutOfBoundsException for charAt method
	* 
	*/
	
	private char[] charArray;
	
	
	
	
	
	// CONSTRUCTORS
	
	public MyString(String original) {
		
		/*
		 * Method Name: MyString
		 * Purpose: Constructor
		 * Parameters: String original
		 * Preconditions: None
		 * Postconditions: A new instance of MyString with a char[] charArray and MyString myString
		 * Exceptions: None
		 */
		
		this.charArray = original.toCharArray();
		
	}

	public MyString(char[] original) {
		
		/*
		 * Method Name: MyString
		 * Purpose: Constructor
		 * Parameters: char[] original
		 * Preconditions: None
		 * Postconditions: A new instance of MyString with a char[] charArray and MyString myString
		 * Exceptions: None
		 */
		
		this.charArray = original;
		
	}

	public MyString(MyString original) {
		
		/*
		 * Method Name: MyString
		 * Purpose: Copy Constructor
		 * Parameters: MyString original
		 * Preconditions: None
		 * Postconditions: A new instance of MyString that is a copy of original with a char[] charArray and MyString myString
		 * Exceptions: None
		 */
		
		this.charArray = original.charArray;
		
	}
	
	
	
	
	
	// OLD METHODS FROM PROGRAM 1

	public int length() {
		
		/*
		 * Method Name: length
		 * Purpose: This method returns the length, or number of characters in the string
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the length of the MyString which also equals the length of charArray
		 * Exceptions: None
		 */
		
		return this.charArray.length;
		
	}

	public char charAt(int index) {
		
		/*
		 * Method Name: 
		 * Purpose: Given a valid index this method returns the character at that index.
		 * Parameters: int index
		 * Preconditions: index >= 0 && index < charArray.length
		 * Postconditions: returns the character at the given index of the MyString or charArray
		 * Exceptions: If an invalid index is given it will throw an "IndexOutOfBoundsException"
		 */
		
		if (index >= 0 && index < charArray.length) {
			return charArray[index];
		}
		else {
			throw new IndexOutOfBoundsException("Try a new index in the range from 0-" + (charArray.length - 1) );
		}
		
	}

	public MyString concat(MyString otherString) {
		
		/*
		 * Method Name: concat
		 * Purpose: Concatenates the specified string, “otherString”, to the end of this string object producing a new MyString object.
		 * Parameters: MyString otherString
		 * Preconditions: None
		 * Postconditions: returns a new MyString that is this myString + otherString
		 * Exceptions: None
		 */
		
		char[] newCharArray = new char[ ( this.charArray.length + otherString.length() ) ];
		
		for (int i = 0; i < this.charArray.length; i++) {
			newCharArray[i] = this.charArray[i];
		}
		for (int i = 0; i < otherString.charArray.length; i++) {
			newCharArray[this.charArray.length + i] = otherString.charArray[i];
		}
		
		MyString newMyString = new MyString(newCharArray);
		
		return newMyString;
	}

	public int indexOf(char ch) {
		
		/*
		 * Method Name: indexOf
		 * Purpose: Returns the index within this string of the first occurrence of the specified character “ch”, 
		 * 	if  “ch” is not present in the string the method returns -1
		 * Parameters: char ch
		 * Preconditions: None
		 * Postconditions: returns either the index or -1
		 * Exceptions: None
		 */
		
		for (int i = 0; i < this.charArray.length; i++) {
			if (ch == charArray[i]) {
				return i;
			}
		}
		
		return -1;
		
	}

	public int indexOf(char ch, int fromIndex) {
		
		/*
		 * Method Name: indexOf
		 * Purpose: Returns the index within this string of the first occurrence of the specified character, “ch”, starting the 
		 * 	search at the specified index. “ch” is not present in the string the method returns -1
		 * Parameters: char ch and int fromIndex
		 * Preconditions: fromIndex >= 0 && fromIndex < charArray.length
		 * Postconditions: returns either the index or -1
		 * Exceptions: If an invalid index is given it will throw an "IndexOutOfBoundsException"
		 */
		
		if (fromIndex >= 0 && fromIndex < charArray.length) {
			for (int i = fromIndex; i < this.charArray.length; i++) {
				if (ch == charArray[i]) {
					return i;
				}
			}
			
			return -1;
		}
		else {
			throw new IndexOutOfBoundsException("Try a new index in the range from 0-" + (charArray.length - 1));
		}
		
	}

	public MyString replace(char target, char replacement) {

		/*
		 * Method Name: replace
		 * Purpose: Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
		 * Parameters: char target and char replacement
		 * Preconditions: None
		 * Postconditions: Returns a new string with all instances of char target replaced with char replacement
		 * Exceptions: None
		 */
		
		MyString newMyString = new MyString(this.charArray);
		
		for (int i = 0; i < newMyString.charArray.length; i++) {
			if (newMyString.charArray[i] == target) {
				newMyString.charArray[i] = replacement;
			}
		}
		
		return newMyString;
	}

	public MyString substring(int beginIndex) {
		
		/*
		 * Method Name: substring
		 * Purpose: Returns a new string that is a substring of this string. The substring begins with 
		 *  the character at the specified index and extends to the end of this string.
		 * Parameters: int beginIndex
		 * Preconditions: None
		 * Postconditions: returns new substring
		 * Exceptions: None
		 */
		
		char[] newCharArray = new char[ ( this.charArray.length - (beginIndex) ) ];
		
		for (int i = 0; i < newCharArray.length; i++) {
			newCharArray[i] = this.charArray[(beginIndex) + i];
		}
		
		MyString newMyString = new MyString(newCharArray);
		
		return newMyString;
		
	}

	public MyString substring(int beginIndex, int endIndex) {
		
		/*
		 * Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and 
		 * extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
		 */
		
		/*
		 * Method Name: substring
		 * Purpose: Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and 
		 *  extends to the character at index endIndex - 1.
		 * Parameters: int beginIndex and int endIndex
		 * Preconditions: None
		 * Postconditions: returns the new substring
		 * Exceptions: None
		 */
		
		char[] newCharArray = new char[(endIndex - beginIndex)];
		
		for (int i = 0; i < (endIndex - beginIndex); i++) {
			newCharArray[i] = this.charArray[beginIndex + i];
		}
		
		MyString newMyString = new MyString(newCharArray);
		
		return newMyString;
		
	}

	public MyString toUpperCase() {
		
		/*
		 * Method Name: toUpperCase
		 * Purpose: Converts all of the characters in this MyString to upper case
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns a new MyString with all upper case characters
		 * Exceptions: None
		 */
		
		char[] newCharArray = new char[this.charArray.length];
		
		for (int i = 0; i < this.charArray.length; i++) {
			newCharArray[i] = Character.toUpperCase(this.charArray[i]);
		}
		
		MyString newMyString = new MyString(newCharArray);
		
		return newMyString;
	}

	public MyString toLowerCase() {
		
		/*
		 * Method Name: toLowerCase
		 * Purpose: Converts all of the characters in this MyString to lower case
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns a new MyString with all upper case characters
		 * Exceptions: None
		 */
		
		char[] newCharArray = new char[this.charArray.length];
		
		for (int i = 0; i < this.charArray.length; i++) {
			newCharArray[i] = Character.toLowerCase(this.charArray[i]);
		}
		
		MyString newMyString = new MyString(newCharArray);
		
		return newMyString;
		
	}

	public String toString() {
		
		/*
		 * Method Name: toString
		 * Purpose: Returns a Java String containing the contents of the MyString object. This allows the contents of the 
		 * 	MyString object to be output with print or println
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns a String of MyString
		 * Exceptions: None
		 */
		
		String newString = "";
		
		for (int i = 0; i < this.charArray.length; i++) {
			newString += this.charArray[i];
		}
		
		return newString;
		
	}

	public boolean equals(MyString other) {
		
		/*
		 * Method Name: equals
		 * Purpose: Compares this string to the specified parameter. The result is true if and only if the argument is 
		 *  not null and is a String object that represents the same sequence of characters as this object.
		 * Parameters: MyString other
		 * Preconditions: None
		 * Postconditions: returns true if the two MyString's equal each other, and false if not
		 * Exceptions: None
		 */
		
		if (this.charArray.length == other.charArray.length) {
			for (int i = 0; i < this.charArray.length; i++) {
				if (this.charArray[i] != other.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		
		return false;
		
	}

	
	
	
	
	// NEW/EDITED METHODS
	
	public int compareTo(MyString anotherString) {
		
		/*
		 * Method Name: compareTo
		 * Purpose: Compares two strings lexicographically. The comparison is based on the Unicode value of each character 
		 * 	in the strings. The character sequence represented by this MyString object is compared lexicographically to 
		 * 	the character sequence represented by the argument MyString. 
		 * Parameters: MyString anotherString
		 * Preconditions: None
		 * Postconditions: The result is a negative integer if this MyString object lexicographically precedes the argument MyString. 
		 * 	The result is a positive integer if this MyString object lexicographically follows the argument MyString. 
		 * 	The result is zero if the MyStrings are equal
		 * Exceptions: None
		 */
		
		int length;
		
		if (this.charArray.length >= anotherString.charArray.length) {
			length = anotherString.charArray.length;
		}
		else {
			length = this.charArray.length;
		}

		for (int i = 0; i < length; i++) {
			if (this.charArray[i] > anotherString.charArray[i]) {
				return 1;
			}
			else if (this.charArray[i] < anotherString.charArray[i]) {
				return -1;
			}
		} // end for
		
		return 0;	
		
	}
	
	public MyString clone() {
		
		/*
		 * Method Name: clone
		 * Purpose: creates and returns new MyString object that is a deep copy of the original
		 * Parameters: none
		 * Preconditions: None
		 * Postconditions: A new instance of MyString that is a clone of this one
		 * Exceptions: None
		 */
		
		return new MyString(this.charArray);
		
	}
	
}