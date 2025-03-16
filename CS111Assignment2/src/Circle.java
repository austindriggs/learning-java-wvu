/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Draw shapes using StdDraw
 */

public class Circle extends GraphicObject {
	
	/*
	 * Class Name: Circle
	 * Purpose: child class of GraphicObject in order to create instances of a circle shape
	 * Exceptions: None
	 */
	
	private double radius;

	public Circle(double newX, double newY, int red, int green, int blue, double newRadius) {
		
		/*
		 * Method Name: Circle
		 * Purpose: Constructor that uses parent constructor and initializes this radius
		 * Parameters: double newX, double newY, int red, int green, int blue, double newRadius
		 * Preconditions: None
		 * Postconditions: Creates a new instance of Circle
		 * Exceptions: None
		 */
		
		super(newX, newY, red, green, blue);

		this.radius = newRadius;
		
	}

	@Override
	public void draw() {

		/*
		 * Method Name: draw
		 * Purpose: draws the cirlce to the drawing canvas using class StdDraw
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: sets the pen color and draws the circle
		 * Exceptions: None
		 */
		
		StdDraw.setPenColor(this.color);
		StdDraw.filledCircle(this.x, this.y, this.radius);
		
	}

	@Override
	public double calculateArea() {

		/*
		 * Method Name: calculateArea
		 * Purpose: calculates and returns the area of this circle
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the area of this circle
		 * Exceptions: None
		 */
		
		return (Math.PI * this.radius * this.radius);
		
	}

	@Override
	public double calculatePerimeter() {

		/*
		 * Method Name: calculatePerimeter
		 * Purpose: calculates and returns the perimeter of this circle
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the perimeter of this circle
		 * Exceptions: None
		 */
		
		return (Math.PI * (this.radius * 2));
		
	}

}
