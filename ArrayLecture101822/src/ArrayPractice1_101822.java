// THESE WILL NOT BE ON EXAM 2 UNLESS IT IS A BONUS QUESTION

// Notes:

// Syntax:
	// type[] indentifier;
	// int[] values;

	// or type[] identifier = new type[i];
	// 	  int[] values = new int[4];

// Arrays work the same way as strings:
	// To access individual elements of the array you start at 0
	// Instead of using indexOf(3) you say intArray[3]

// There are 1D, 2D, 3D, ... infinity arrays

// If this array has a number < 0 or greater than int limit or we try to get the index of a number outside of the array we get
// ArrayOutOfBoundsError (something like this?)

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1_101822 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	// for fun
		int[] intArray = new int[4];
		System.out.println(intArray);
		
	// Practice 1
		intArray[2] = 56;
		int x = intArray[2]; 
		System.out.println("\n" + x);
		
		System.out.println();
		
	// Practice 2
		String[] names = {"Cam", "Brett", "Carrie", "John"};
		for (int i = 0; i <4; i++) {
			System.out.println(names[i]);
		}
		
		// Using string methods on an array
		System.out.println(names[2].charAt(0)); 	// Prints 'C'
		System.out.println(names[1].substring(3)); 	// Prints "tt"
		
		System.out.println();
		
	// Practice 3
		int[] values = {34, 55, 66, 190, 342, 1111, 0, -4};
		for (int i = 0; i <8; i++) {
			System.out.println(values[i]);
		}
		
// ArrayPractice2_102022
		
		int[] values2 = new int[10]; 
		// values2 is the variable. it has 10 different integers inside of its address (0, 1, 2 ... 9)
		// values2 has a "base address" of 0, or the first 4 bytes for an int
		// this means that when you want to reference the 5th element(4th index), it adds 4 * 4 bytes and skips to byte number 16.
		// once you create this, its size cannot change.
		
		int[] nums = {3, 5, 10, 12, 99};
		System.out.println("\n" + nums[2]);		// Prints 10
			// this isn't very frequently used because it's harder to manipulate
		
		System.out.println();
		
	// Printing out every number in a 1D array
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
	// Manipulating an array: adding 5 to each element in the array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] + 5;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
	// Entering in values to a declared array
		// int[] values2 = new int[10]; THIS IS FROM ABOVE
		for (int i = 0; i < values2.length; i++) {
			if (i % 2 == 0) {
				values2[i] = 0;
			}
			else {
				values2[i] = 1;
			}
		}
		
		System.out.println("\n" + Arrays.toString(values2));
	
	// How could I find the smallest value in an array?
		int[] stuff = {55, 890, 33, 1029, -11, 0, 345, 17, 9, 99};
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < stuff.length; i++) {
			if (stuff[i] < min) {
				min = stuff[i];
			}
		}
		
		System.out.println("\n" + min); 	// Prints "-11"
		
	// Largest value?
		int max = stuff[0]; 				// compares everything to element 0
		
		for (int i = 1; i < stuff.length; i++) {
			if (stuff[i] > max) {
				max = stuff[i];
			}
		}
		
		System.out.println(max); 			// Prints "1029"
		
	// Trace table problem
		int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
		
		int total = 0;
		
		for (int i = 0; i < 10; i++) {
			total = total + a[i];
		}
		
		System.out.println("\n" + total); 	// Prints "25"
		
	// How can I write a METHOD that recieves an array of type double and calculates and returns the average
		double[] values3 = {342.5, 88, 90.12, 100.9, 898, 3.78965, 11.0007, 32456.88, 46.343};
		System.out.println("\nIn main, values3 contains: " + Arrays.toString(values3));
		
		double average = calcAverage(values3);
		
		System.out.println("The average of this array is: " + average);
		
	// Part 2
		double[] values4 = {34, 67, 23};
		System.out.println("\nIn main, values4 contains: " + Arrays.toString(values4));

		average = calcAverage(values4);

		System.out.println("The average of this array is: " + average);
		
	// Increasing the numbers by 5
//		double[] values5 = {34, 67, 23};
//		System.out.println("\nIn main, values4 contains: " + Arrays.toString(values5));
//
//		increased = increaseBy5(values5);
//
//		System.out.println("The average of this array is: " + increased);
		
	// Initializing the whole array with the same value
		int[] copyArray = new int[5];
		
		
	// Close scanner
		scan.close();
			
	} // end main
	
	public static double calcAverage(double[] theNumbers) {
		
		double sum = 0;
		double average = 0;
		
		for (int i = 0; i < theNumbers.length; i++) {
			sum += theNumbers[i];
			average = sum / theNumbers.length;
		}
		
		return average;
		
	}

}
