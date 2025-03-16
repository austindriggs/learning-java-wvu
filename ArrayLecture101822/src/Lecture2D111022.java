// MultiDimensional Arrays Lecture Notes
// These are video lectures, we did not have class this day

// 2D has rows and colums
// a 2x3 array has 2 rows and 3 columns

// x values row 2 0 10 -2 8 7 2
// y values row 1 3 -3 12 1 4 -2

// tic tac toe

// declare it: 
// type [][] identifier = new type[rows][columns];
// int [][] newArray = new int[3][2];
// int[][] newArray = { {row1 values}, {row2 values}, {row N values} };
// see example 1

// Each element in a multidimensional array has an index value.
// [rowIndex][columnIndex]
// See example 2

// newArray.length will return the value of the number of rows, or 3
// to get the number of colums in an array:
// newArray[0].length will return the number of columns
// newArray.length * newArray[0] will return the total number of values (for a perfectly rectangular array)

// Example 3: Array Processing

// Example 4: Asking for user input to fill the array

// Example 5: summing each row of an array

// Example 6-12: Problems from class

import java.util.Arrays;
import java.util.Scanner;

public class Lecture2D111022 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

	// Example 1: Declaration
		int[][] newArray = { {6, 7, -2, 4}, {2, 0, 77, 5}, {2, -8, 9, 1} };
		System.out.println(Arrays.toString(newArray));
		
		System.out.println("\n\n");
		
	// Example 2: Indexes
		System.out.println(newArray[1][2]); // Prints out the number in row 2 and column 3
	
		newArray[1][2] = 99;
		System.out.println(newArray[1][2]);
		
		System.out.println("\n\n");
	
	// Example 3: Array Processing
		// int[][] alpha = new int[4][3];
		
		int[][] alpha = { {00, 01, 02}, {10, 11, 12}, {20, 21, 22}, {30, 31, 32} };
		
		// Row Processing: Outer loop counts rows, inner loop counts columns
		System.out.println("Row Processing");
		for (int i = 0; i < alpha.length; i++) {
			System.out.print("The elements in row " + i + " are: ");
		
			for (int j = 0; j < alpha[0].length; j++) {
				System.out.print(alpha[i][j] + " ");
			}
			
			System.out.println();
		}
		
		// Column Processing: Inner loop counts columns, outer loop counts rows
		System.out.println("\nColumn Processing");
		for (int i = 0; i < alpha[0].length; i++) {
			System.out.print("The elements in column " + i + " are: ");
		
			for (int j = 0; j < alpha.length; j++) {
				System.out.print(alpha[j][i] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\n");
		
	// Example 4: Asking for user input to fill the array
		System.out.println("Enter the # of rows:");
		int rows = scan.nextInt();
		System.out.println("Enter the # of columns:");
		int columns = scan.nextInt();
		
		System.out.println();
		
		int[][] array1 = new int[rows][columns];
		
		// taking user input
		for (int i = 0; i < array1.length; i++) {
		
			for (int j = 0; j < array1[0].length; j++) {
				System.out.println("Enter a value for [" + i + "][" + j + "]:");
				array1[i][j] = scan.nextInt();
			}
			
			System.out.println();
		}
		
		//printing
		System.out.println("Here is the array you have created:");
		for (int i = 0; i < array1.length; i++) {
		
			for (int j = 0; j < array1[0].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
	// Example 5: summing each row of an array
		int[] sums = new int[rows];
		
		for (int i = 0; i < array1.length; i++) {
		
			for (int j = 0; j < array1[0].length; j++) {
				sums[i] = sums[i] + array1[i][j];
			}
			
			System.out.println("The sum of elements in row " + i + " is: " + sums[i]);
		}
		
	// Example 6: Write code to declare a 2D array of integers with 5 rows and 6
	// columns, fill the array such that the 1st and last row and 1st and last
	// column contains the values 1 and the rest of the elements contain the value 0.
	
	
	
	// Example 7: Write code to declare a 2D array of integers with 5 rows and 6 columns.  
	// Store the value 5 in the 1st row and each subsequent row, contains the value of 
	// the previous row times 10.
	
	
	
	// Example 8: Declare an array with 5 rows and 6 columns. 
	// Fill the array such that the 1st row contains 0, and each subsequent row’s value is incremented by 1
	// print out the contents of the array 1 row per line
	
	
	
	// Example 9: Now, Fill the array such that the 1st column contains the value 10 and each subsequent 
	// column contains 5 times the previous column’s content. Print out the contents of the array 1 row per line
	
	
	
	// Example 10: Swapping 2 rows in a 2D array – This can be done both with and without traversing the rows.
	// Swap Rows 1 and 4 without traversing the array (no loops)
	// Print it out. Swap Rows 2 and 0 traversing the array using loops. Print it out
	
	
	
	// Example 11: Swapping 2 columns in a 2D array – The columns must be traversed. You MUST use loops
	// Swap columns 2 and 5. Print it out
	
	
	
	// Example 12: Cropping a 2D array by constructing a new 2D array to retain only elements within a specified range. 
	// Take the array with 5 rows and 6 columns and crop it to a 2 x 3 array (2rows and 3 columns)
	
	
		
	scan.close();
		
	}

}
