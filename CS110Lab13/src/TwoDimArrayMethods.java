/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 13 Problem 1
* 11/16/22
*/

public class TwoDimArrayMethods {

	public static void main(String[] args) {

		int[][] board = { 	{20, 15, 6, 19, 18}, 
							{4, 46, 24, 17, 18}, 
							{12, 50, 23, 16, 31} };
		
		printMatrix(board);
		System.out.println();
		
		sumRows(board);
		System.out.println();
		
		largestInRows(board);

	}
	
	public static void printMatrix(int[][] matrix) {
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%7d", matrix[row][column]);
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void sumRows(int[][] matrix) {	
		
		for (int row = 0; row < matrix.length; row++) {
			
			int sum = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				sum = sum + matrix[row][column];
			}
			
			System.out.println("The sum of row " + (row + 1) + " = " + sum);
			
		}
		
	}

	public static void largestInRows(int[][] matrix) {
	
		for (int row = 0; row < matrix.length; row++) {
			
			int max = matrix[0][0];
			
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] > max) {
					max = matrix[row][column];
				}
			}
			
			System.out.println("The largest element of row " + (row + 1) + " = " + max);
			
		}
		
	}

}
