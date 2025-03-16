/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 9 Problem Example
* 10/19/22
*/

import java.util.Scanner;

public class Lab9Example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a side length of a square: ");
		double sideLength = scan.nextDouble();

		// calculateSquareArea testing
		double squareArea = calculateSquareArea(sideLength);
		System.out.println("The area of a square with side length " + sideLength + " is " + squareArea);
		// Advantage: can do further calculations with the stored squareArea
		// double surfaceArea = 6 * squareArea; // (because surface area is 6 times sideLength squared)

		// printSquareArea testing
		printSquareArea(sideLength);

		scan.close();
		
	}

	/**
	 * Takes in a side length of a square and calculates the area.
	 * 
	 * @param sideLength represents the length of a side of the square
	 * @return the area of the square
	 */
	
	public static double calculateSquareArea(double sideLength) {
		
		double squareArea = Math.pow(sideLength, 2);
		return squareArea;

	}

	/**
	 * Takes in a side length of a square and calculates and prints the area.
	 * 
	 * @param sideLength represents the length of a side of the square
	 */
	
	public static void printSquareArea(double sideLength) {
		
		double squareArea = Math.pow(sideLength, 2);
		System.out.println("The area of a square with side length " + sideLength + " is " + squareArea);
		
	}
	
}