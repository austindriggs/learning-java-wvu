/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 10 Problem 1
* 10/26/22
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

// 		C:\Users\austi\Downloads\testScores.txt

public class FinalGradesFormatter {

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
				System.out.println("Invalid File Name: " + filePath);
			}
		}

		System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s \n", 
				"First Name", "Last Name", "Test 1 Score", "Test 2 Score", "Test 3 Score", "Final Percent");
		
		while (inputFile.hasNext()) {
			
			String firstName = inputFile.next();
			String lastName = inputFile.next();
			
			double test1 = inputFile.nextDouble();
			double test2 = inputFile.nextDouble();
			double test3 = inputFile.nextDouble();
			
			double finalPercent = average(test1, test2, test3);
			
			System.out.printf("%-15s %-15s %-15.2f %-15.2f %-15.2f %-15.2f \n", 
					firstName, lastName, test1, test2, test3, finalPercent);
			
		}
		
		scan.close();
		inputFile.close();
		
	}
	
	public static double average(double score1, double score2, double score3) {
		
		double average = ((score1 + score2 + score3) / 3);
		
		return average;
		
	}

}
