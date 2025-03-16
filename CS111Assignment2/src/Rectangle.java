/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Draw shapes using StdDraw
 */

public class Rectangle extends GraphicObject {
	
	/*
	 * Class Name: Rectangle
	 * Purpose: child class of GraphicObject in order to create instances of a rectangle shape
	 * Exceptions: None
	 */
	
	private double length; // This represents 1/2 of the desired length of the rectangle
	private double width; // This represents 1/2 of the desired width of the rectangle
	
	public Rectangle(double newX, double newY, int red, int green, int blue, double newLength, double newWidth) {
		
		/*
		 * Method Name: Rectangle
		 * Purpose: Constructor that uses parent constructor and initializes this length and width
		 * Parameters: double newX, double newY, int red, int green, int blue, double newLength, doubleNewWidth
		 * Preconditions: None
		 * Postconditions: Creates a new instance of Rectangle
		 * Exceptions: None
		 */
		
		super(newX, newY, red, green, blue);
		
		this.length = newLength;
		this.width = newWidth;
		
	}

	@Override
	public void draw() {

		/*
		 * Method Name: draw
		 * Purpose: draws the rectangle to the drawing canvas using class StdDraw
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: sets the pen color and draws the rectangle
		 * Exceptions: None
		 */
		
		StdDraw.setPenColor(this.color);
		StdDraw.filledRectangle(this.x, this.y, this.length, this.width);
		
	}

	@Override
	public double calculateArea() {

		/*
		 * Method Name: calculateArea
		 * Purpose: calculates and returns the area of this rectangle
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the area of this rectangle
		 * Exceptions: None
		 */
		
		return ( (this.length * 2) * (this.width * 2) );
	}

	@Override
	public double calculatePerimeter() {

		/*
		 * Method Name: calculatePerimeter
		 * Purpose: calculates and returns the perimeter of this rectangle
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the perimeter of this rectangle
		 * Exceptions: None
		 */
		
		return ( (this.length * 4) + (this.length * 4) );
	}
	


}
