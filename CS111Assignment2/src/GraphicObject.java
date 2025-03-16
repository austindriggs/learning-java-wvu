/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Draw shapes by using parent and child classes, abstract methods, and StdDraw
 */

import java.awt.Color;

public abstract class GraphicObject {
	
	/*
	 * Class Name: GraphicObject
	 * This class represents common features and operations that can be performed of different shapes and is the parent class for every shape.
	 * Exceptions: None
	 */
	
	// x - y coordinate for drawing canvas that represents the center of the shape
	protected double x;
	protected double y;
	
	// color that will be drawn to the screen for the shape that uses java's class Color using the constructor that recieves float values for red, green, and blue.
	Color color;
	
	public GraphicObject(double newX, double newY, int red, int green, int blue) {
		
		/*
		 * Method Name: GraphicObject
		 * Purpose: Constructor that initializes each of the data members and create an instance of class Color
		 * Parameters: double newX, double newY, int red, int green, int blue
		 * Preconditions: None
		 * Postconditions: Creates a new instance of a GraphicObject
		 * Exceptions: None
		 */
		
		this.x = newX;
		this.y = newY;
		this.color = new Color(red, blue, green);
		
	}
	
	public double getX() {
			
		/*
		 * Method Name: getX
		 * Purpose: returns the value of the x coordinate
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this shape's x coordinate
		 * Exceptions: None
		 */
		
		return this.x;
		
	}
	
	public double getY() {
		
		/*
		 * Method Name: getY
		 * Purpose: returns the value of the y coordinate
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this shape's y coordinate
		 * Exceptions: None
		 */
		
		return this.y;
		
	}
	
	public Color getColor() {

		/*
		 * Method Name: getColor
		 * Purpose: returns the value of the color attribute
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns this shape's color
		 * Exceptions: None
		 */
		
		return this.color;
		
	}
	
	public String toString() {
		
		/*
		 * Method Name: toString
		 * Purpose: returns a string containing the values of all data members
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		return "The object at location: " + this.x + " " + this.y + " is an instance of " + this.getClass() 
				+ " Red: " + this.color.getRed() + " Blue: " + this.color.getBlue() + " Green: " + this.color.getGreen() + "."
				+ " It has area " + this.calculateArea() + ", and perimeter: " + this.calculatePerimeter();
		
	}
	
	public abstract void draw();
	
		/*
		 * Method Name: draw
		 * Purpose: draws the shape to the drawing canvas using class StdDraw
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: sets the pen color and draws the shape
		 * Exceptions: None
		 */
	
	public abstract double calculateArea();
	
		/*
		 * Method Name: calculateArea
		 * Purpose: calculates and returns the area of this shape
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the area of this shape
		 * Exceptions: None
		 */
	
	public abstract double calculatePerimeter();
	
		/*
		 * Method Name: calculatePerimeter
		 * Purpose: calculates and returns the perimeter of this shape
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the perimeter of this shape
		 * Exceptions: None
		 */

}
