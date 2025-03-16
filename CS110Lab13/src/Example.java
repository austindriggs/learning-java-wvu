import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// looks like this:
		// 1 2 3 (row 0)
		// 4 5 6 (row 1)
		// 7 8 9 (row 2)

		System.out.println("There are " + array1.length + " rows in array 1.");
		System.out.println("There are " + array1[0].length + " columns in array 1.");
		System.out.println();

		for (int i = 0; i < array1.length; i++) { // iterate through number of rows
			for (int j = 0; j < array1[0].length; j++) { // iterate through number of columns
				System.out.print("Element at index [" + i + ", " + j + "]: " + array1[i][j] + "      ");
			}
			System.out.println();
		}

		System.out.println();
		int[][] array2 = new int[4][5]; // 4 rows, 5 columns
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				array2[i][j] = i + 1;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		int[][] array3 = new int[4][5];
		int value = 1000; // can change to whatever value we want
		initialize(array3, value);
		print(array3);

		System.out.println();
		int[][] array4 = new int[4][5];
		initializeWithUserInput(array4);
		print(array4);

		System.out.println();
		int[][] array5 = new int[4][5];
		initializeWithTextFile(array5);
		print(array5);

		System.out.println();
		int[][] array6 = new int[4][5];
		initializeWithTextFile(array6);
		print(array6);
		int[] sumOfRows = new int[4]; // regular array; sumOfRows[0] = sum of elements in first row; sumOfRows[1] =
										// sum of elements in second row, etc.
		sumRows(sumOfRows, array6);

		for (int i = 0; i < array6.length; i++) {
			System.out.print("The elements in row " + i + " are ");
			for (int j = 0; j < array6[0].length; j++)
				System.out.print(array6[i][j] + " ");
			System.out.println(" The sum of the elements is: " + sumOfRows[i]);
		}
	}

	public static void sumRows(int[] sums, int[][] array) {
		Arrays.fill(sums, 0);
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[0].length; j++)
				sums[i] = sums[i] + array[i][j];
	}

	public static void initializeWithTextFile(int[][] array) {
		try {
			File infile = new File("ex4.txt");
			Scanner in = new Scanner(infile);

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = in.nextInt();
				}
			}
			in.close();
		} catch (IOException exception) {
			System.out.println("Error processing File: " + exception);
		}
	}

	public static void initializeWithUserInput(int[][] array) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println("Please enter a value for element[" + i + "][" + j + "]");
				array[i][j] = in.nextInt();
			}
		}
		in.close();
	}

	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}

	public static void initialize(int[][] array, int value) {
		for (int i = 0; i < array.length; i++) { // rows
			for (int j = 0; j < array[0].length; j++) // columns
				array[i][j] = value;
		}
	}
}