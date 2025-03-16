/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 8 Problem 2
* 10/12/22
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
// Can also do: import java.io.*;

// C:\Users\austi\Downloads\states.txt

public class StateCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
	// Error Catching: Can put this in a while loop if you wanted to.
		boolean valid = false;
		while (!valid) {
			try {
				System.out.println("Please enter a valid file path: ");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				valid = true;
			}
			catch (IOException e) {
				System.out.println("\n" + filePath + " is invalid. Please try again.");
			}
		}
		
		System.out.println("\nPlease input a capital letter A-Z:");
		String c = scan.next().toUpperCase();
		
		int counter = 0;
		String state = null;
		String s;
		
		while (inputFile.hasNext()) {
		
		// Reads each line from the file and saves it as state. Saves first letter as s
			state = inputFile.nextLine().trim();
			s = state.substring(0, 1);
			
		// If the state starts with c it will print and count
			if (s.equals(c)) {
				System.out.println(state);
				counter = counter + 1;
			}
		}
		
		System.out.println("There are " + counter + " states that begin with the letter " + c + ".");
		
		scan.close();
		inputFile.close();

	}

}
