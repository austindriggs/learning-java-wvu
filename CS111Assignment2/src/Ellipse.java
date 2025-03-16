/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Draw shapes using StdDraw
 */

public class Ellipse extends GraphicObject {
	
	/*
	 * Class Name: Ellipse
	 * Purpose: child class of GraphicObject in order to create instances of an ellipse shape
	 * Exceptions: None
	 */
	
	private double semiMajorAxis; // this value is 1/2 the length of the major axis of the ellipse.
	private double semiMinorAxis; // this value is 1/2 the length of the minor axis of the ellipse.


	public Ellipse(double newX, double newY, int red, int green, int blue, double newSemiMajor, double newSemiMinor) {

		/*
		 * Method Name: Ellipse
		 * Purpose: Constructor that uses parent constructor and initializes this semiMajorAxis and semiMinorAxis
		 * Parameters: double newX, double newY, int red, int green, int blue, double newRadius
		 * Preconditions: None
		 * Postconditions: Creates a new instance of Ellipse
		 * Exceptions: None
		 */
		
		super(newX, newY, red, green, blue);
		
		this.semiMajorAxis = newSemiMajor;
		this.semiMinorAxis = newSemiMinor;
		
	}

	@Override
	public void draw() {

		/*
		 * Method Name: draw
		 * Purpose: draws the ellipse to the drawing canvas using class StdDraw
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: sets the pen color and draws the ellipse
		 * Exceptions: None
		 */
		
		StdDraw.setPenColor(this.color);
		StdDraw.filledEllipse(this.x, this.y, this.semiMajorAxis, this.semiMinorAxis);
		
	}

	@Override
	public double calculateArea() {

		/*
		 * Method Name: calculateArea
		 * Purpose: calculates and returns the area of this ellipse
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the area of this ellipse
		 * Exceptions: None
		 */
		
		return (Math.PI * this.semiMajorAxis * this.semiMinorAxis);
	}

	@Override
	public double calculatePerimeter() {
		
		/*
		 * Method Name: calculatePerimeter
		 * Purpose: calculates and returns the perimeter of this ellipse
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the perimeter of this ellipse
		 * Exceptions: None
		 */
		
		return (Math.PI * (this.semiMajorAxis + this.semiMinorAxis));
	}

}
