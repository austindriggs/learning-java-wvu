/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 10 Problem 0
* 10/26/22
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

//		C:\Users\austi\OneDrive\Documents\CS110\lab10Examples.txt

public class Lab10Examples {	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		boolean goodValue = false;
		
//		while (!goodValue) {
			try {
				System.out.println("Please enter a file path: ");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println(filePath + " is not valid. Please try again.");
			}
//		}
		
		System.out.printf("%-15, %-15, %-15, %-15 \n", "First Name", "Last Name", "Number", "Years");
		
		while (inputFile.hasNext()) {
			String firstName = scan.next();
			String lastName = scan.next();
			int num = scan.nextInt();
			String years = scan.nextLine();
			
			System.out.printf("%-15, %-15, %-15, %-15 \n", firstName, lastName, num, years);
		}

		
		
		
		
	}
}
