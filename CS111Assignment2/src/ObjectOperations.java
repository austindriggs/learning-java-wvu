/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Draw shapes using StdDraw
 */

import java.util.Scanner;

public class ObjectOperations {
	
	/*
	 * Class Name: ObjectOperations
	 * Purpose: used to create an array of GraphicObjects or shapes and manipulate it
	 * Exceptions: None
	 */

	public static GraphicObject[] fillArray(Scanner filename) {
				
		/*
		 * Method Name: fillArray
		 * Purpose: reads a data file containing information about shapes to be drawn to the screen
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: returns the perimeter of this shape
		 * Exceptions: None
		 * -
		 * Extra: 
		 * 
		 * The data file is opened in the test program and passed to this method. Each line in the data file represents a single shape. The first line is 
		 * a single integer which is the number of shapes in the file. You must define and instantiate an array of GraphicObjects As each line is read the 
		 * data is used to create an instance of the correct shape subclasss, which  is inserted onto the end of the GraphicObject array.The format of 
		 * each line varies based on the type of shape being read.
		 * 
		 * Each line begins with a single character representing the type of shape being drawn, followed by the X-Y coordinate of 
		 * the center of the shape followed by the Red/Blue/Green values for the color of the shape, the remainder of the line consists of a 
		 * series of values specific to the shape:
		 * Circle:
		 * C	X	Y	Red 	Blue	Green	Radius
		 * Rectangle:
		 * R	X	Y	Red 	Blue	Green 	Length	     Width
		 * Square:
		 * S	X	Y	Red	Blue	Green	sideLength
		 * Ellipse:
		 * E	X	Y	Red	Blue	Green	SemiMinorAxis    SemiMajorAxis
		 */
		
		int numOfShapes = filename.nextInt();
		
		GraphicObject[] shapes = new GraphicObject[numOfShapes];
		
		int index = 0;
		
		while (filename.hasNext() && index < numOfShapes) {
			
			String type = filename.next();
			double x = filename.nextDouble();
			double y = filename.nextDouble();
			int red = filename.nextInt();
			int blue = filename.nextInt();
			int green = filename.nextInt();
						
			if (type.equals("C")) {
				
				double radius = filename.nextDouble();
				
				shapes[index] = new Circle(x, y, red, blue, green, radius);
				
			}
			else if (type.equals("R")) {
				
				double length = filename.nextDouble();
				double width = filename.nextDouble();
				
				shapes[index] = new Rectangle(x, y, red, blue, green, length, width);
				
			}
			else if (type.equals("S")) {
				
				double sideLength = filename.nextDouble();
				
				shapes[index] = new Square(x, y, red, blue, green, sideLength);
				
			}
			else if (type.equals("E")) {
				
				double semiMinorAxis = filename.nextDouble();
				double semiMajorAxis = filename.nextDouble();
				
				shapes[index] = new Ellipse(x, y, red, blue, green, semiMajorAxis, semiMinorAxis);
				
			}
			else {
				throw new RuntimeException("Unknown Shape Type: " + type);
			}
			
			index++;
			
		}
		
		drawList(shapes);
		
		return shapes;
	}
	
	public static void drawList(GraphicObject[] objectList) {
		
		/*
		 * Method Name: drawList
		 * Purpose: iterates through the objectList and calls the draw method to draw each shape to the screen
		 * Parameters: GraphicObject[] objectList
		 * Preconditions: objectList should have at least one shape in it
		 * Postconditions: draws each index of objectList using StdDraw
		 * Exceptions: None
		 */
		
		for (int i = 0; i < objectList.length; i++) {
			objectList[i].draw();
		}
		
	}
	

	public static void printList(GraphicObject[] objectList) {
		
		/*
		 * Method Name: printList
		 * Purpose: iterates through the ObjectList and calls the toString method for each object.
		 * Parameters: GraphicObject[] objectList
		 * Preconditions: objectList should have at least one shape in it
		 * Postconditions: prints each index of objectList
		 * Exceptions: None
		 */
		
		for (int i = 0; i < objectList.length; i++) {
			System.out.println(objectList[i] + "\n");			
		}
		
	}

}
