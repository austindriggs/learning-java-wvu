/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 8 Problem 1
* 10/12/22
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
// Can also do: import java.io.*;

// C:\Users\austi\Downloads\decode.txt

public class Decoder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
	// Error Catching: Can put this in a while loop if you wanted to.
		try {
			System.out.println("Please enter a valid file path: ");
			filePath = scan.nextLine();
			inputFile = new Scanner(new FileReader(filePath));
		}
		catch (IOException e) {
			System.out.println(filePath + " is invalid. Please try again.");
		}
		
	// Reads the line from the text document
		String line = inputFile.nextLine();
		
		System.out.println("\nHere is today's quote:");
		
	// Prints each character
		for (int i = 0; i < line.length(); i ++) {
			char c = line.charAt(i);
			
			if (Character.isAlphabetic(c)) {
				System.out.print(c);
			}
			if (Character.isDigit(c)) {
				System.out.print(c);
			}
			if (c == ' ') {
				System.out.print(c);
			}
			
		}
		
		scan.close();
		inputFile.close();

	}

}
