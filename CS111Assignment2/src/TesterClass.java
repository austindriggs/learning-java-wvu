/** @author Austin Driggs
 * CS 111 Section 002
 * Programming Assignment 2
 * Jakob Kaivo
 * Due: 3/6/2023
 * Purpose: Create an array of GraphicObjects and then draw shapes in the array using StdDraw
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class TesterClass {
	
	/*
	 * Class Name: TesterClass
	 * Purpose: To test the implemenetation of GraphicObject and its child classes, along with ObjectOperations.
	 * Exceptions: IOException e, RuntimeException if unknown shape type given in file
	 */

	public static void main(String[] args) {
		
		/*
		 * Method Name: main
		 * Purpose: test the implemenetation of GraphicObject and its child classes, along with ObjectOperations by prompting the user for a name of a data 
		 * 	file, open it within a try/catch block to validate the file name, call the fillArray method to read the data file line by line and creating of 
		 * 	each child class, inserting them into the array, and drawing them. Then call the method printList.
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: None
		 */
		
		// set the scale for the x/y axis
		StdDraw.setCanvasSize(1000,1000);
		StdDraw.setXscale(0, 1000);
		StdDraw.setYscale(0, 1000);
		
		StdDraw.setPenRadius(0.02);
		
		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		// will loop until a valid file path is given
		boolean goodValue = false;
		while (!goodValue) {
			try {
				System.out.println("Please input a valid file path:");
					// my file's location: C:\Users\austi\eclipse-workspace\CS111Assignment2\src\shapesData.txt
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println("\nInvalid file path: " + filePath + "\nPlease try again.\n");
			}
		}
		
		// just for looks of the console
		System.out.println();
		
		//  fills and draws the array of graphic objects called shapes using the file
		GraphicObject[] shapes = ObjectOperations.fillArray(inputFile);
		
		// prints out each index of shapes
		ObjectOperations.printList(shapes);

		scan.close();

	}
	
}
