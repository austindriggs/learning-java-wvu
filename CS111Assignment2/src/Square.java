/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Draw shapes using StdDraw
 */

public class Square extends GraphicObject {
	
	/*
	 * Class Name: Square
	 * Purpose: child class of GraphicObject in order to create instances of a square shape
	 * Exceptions: None
	 */
	
	private double sideLength; // represents half the  length of one side of the square

	public Square(double newX, double newY, int red, int green, int blue, double newSideLength) {
		
		/*
		 * Method Name: Rectangle
		 * Purpose: Constructor that uses parent constructor and initializes this side length
		 * Parameters: double newX, double newY, int red, int green, int blue, double newSideLength
		 * Preconditions: None
		 * Postconditions: Creates a new instance of Rectangle
		 * Exceptions: None
		 */
		
		super(newX, newY, red, green, blue);
		
		this.sideLength = newSideLength;

	}

	@Override
	public void draw() {

		/*
		 * Method Name: draw
		 * Purpose: draws the square to the drawing canvas using class StdDraw
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: sets the pen color and draws the square
		 * Exceptions: None
		 */
		
		StdDraw.setPenColor(this.color);
		StdDraw.filledSquare(this.x, this.y, this.sideLength);
		
	}

	@Override
	public double calculateArea() {

		/*
		 * Method Name: calculateArea
		 * Purpose: calculates and returns the area of this square
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the area of this square
		 * Exceptions: None
		 */
		
		return ( (this.sideLength * 2) * (this.sideLength * 2) );
	}

	@Override
	public double calculatePerimeter() {

		/*
		 * Method Name: calculatePerimeter
		 * Purpose: calculates and returns the perimeter of this square
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the perimeter of this square
		 * Exceptions: None
		 */
		
		return ((this.sideLength * 2) * 4);
	}
	
}
