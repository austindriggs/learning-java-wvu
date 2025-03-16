import java.util.Arrays;

/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 13 Problem 2
* 11/16/22
*/



public class SumofRowColumn {

	public static void main(String[] args) {

		int[][] a = { 	{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					};
		
		// Sum of row
		for (int row = 0; row < a.length; row++) {
			int sum = 0;
			for (int column = 0; column < a[row].length; column++) {
				sum = sum + a[row][column];
			}
			System.out.println("The sum of row " + (row + 1) + " = " + sum);
		}
		
		System.out.println();
		
		// Sum of column
		for (int row = 0; row < a.length; row++) {
			int sum = 0;
			for (int column = 0; column < a[row].length; column++) {
				sum = sum + a[column][row];
			}
			System.out.println("The sum of column " + (row + 1) + " = " + sum);
		}
		
		System.out.println();
		
		// Print the length of each row
// CHECK THIS????????????????? a[0].length or a.length		
		for (int row = 0; row < a[0].length; row++) {
			System.out.println("The length of row " + (row + 1) + " = " + a[0].length);
		}
		
		System.out.println();
		
		// Print the value of each element
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				System.out.println(a[row][column]);
			}
		}

		System.out.println();
		
		// Reverse each row of the array
		reverseArray(a);
		
	}
	
	public static void reverseArray(int[][] matrix) {
		
		for (int row = 0; row < matrix.length; row++) {
			int start = 0;
			int end = matrix[row].length - 1;
			for (int column = 0; column < matrix[row].length; column++) {
				int temp = matrix[row][end];
				matrix[row][end] = matrix[row][start];
				matrix[row][start] = temp;
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column]);
			}
			System.out.println();
		}
		
	}

}
