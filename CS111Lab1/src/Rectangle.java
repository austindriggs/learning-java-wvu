/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 1
* Jakob Kaivo
* 1/9/23
* This assignment's purpose is to begin learning about unit testing using JUnit
*/

public class Rectangle {
	
	/*
	* Class Name: Rectangle
	* Purpose: The class's purpose is to use the methods width, height, perimeter, and area in order to use them appropriately.
	* Exceptions: N/A
	*/
	
	private double width;
	private double height;
	
	// Constructs a Rectangle object with the given width and height
	public Rectangle(double width, double height) {
		
		/*
		 * Method Name: Rectangle
		 * Purpose: declare width and height
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		this.width = width;
		this.height = height;
	}
	
	// Returns the width of the Rectangle object as provided to the constructor
	public double width() {
		
		/*
		 * Method Name: width
		 * Purpose: return width
		 * Parameters: width
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		return this.width;
	}
	
	// Returns the height of the Rectangle object as provided to the constructor 
	public double height() {
		
		/*
		 * Method Name: height
		 * Purpose: return height
		 * Parameters: height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		return this.height;
	}
	
	// Returns the perimeter of the Rectangle object
	public double perimeter() {
		
		/*
		 * Method Name: perimeter
		 * Purpose: calculate and return the perimeter of the rectangle given width and height
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		return ( (2 * this.width) + (2 * this.height) );
		
	}
	
	// Returns the area of the Rectangle object
	public double area() {
		
		/*
		 * Method Name: area
		 * Purpose: calculate and return the perimeter of the rectangle given width and height 
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		return ( this.width * this.height );
	}
	
}