/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 10 Problem 2
* 10/26/22
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

//	C:\Users\austi\Downloads\integers.txt

public class ArrayCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		boolean goodValue = false;
		while (!goodValue) {
			try {
				System.out.println("Please input a file path: ");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println("Invalid File Path: " + filePath);
			}
		}
		
		System.out.println("\nThe array is:");
		
		int[] integers = new int[50];
		
		for (int i = 0; i < 50; i++) {
			integers[i] = inputFile.nextInt();
			System.out.print(integers[i] + " ");			
		}
		
		int min = getSmallestInteger(integers);
		System.out.println("\n\nThe smallest integer is: " + min);
		
		int sum = getSumOfIntegers(integers);
		System.out.println("\nThe sum of the integers are: " + sum);
		
		double average = getAverageOfIntegers(integers);
		System.out.println("\nThe average of all of the integers is: " + average);
		
		scan.close();
		inputFile.close();
		
	}

	public static int getSmallestInteger(int[] integers) {
		
		Arrays.sort(integers);
		int smallestInt = integers[0];
		
		return smallestInt;
	
	}
	
	public static int getSumOfIntegers(int[] integers) {
		
		int sum = 0;
		
		for (int i = 0; i < 50; i++) {
			sum = sum + integers[i];
		}
		
		return sum;
	}
	
	public static double getAverageOfIntegers(int [] integers) {
		
		double average = 0;
		int sum = 0;
		
		for (int i = 0; i < 50; i++) {
			sum = sum + integers[i];
		}
		
		average = sum / 50.0;
		
		return average;
		
	}

}
