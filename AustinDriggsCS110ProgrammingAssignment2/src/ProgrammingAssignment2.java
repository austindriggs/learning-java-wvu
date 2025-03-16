/**
* @author Austin Driggs
* CS 110 Section 010
* Programming Assignment 2
* 10/12/22
*/

// C:\Users\austi\Downloads\bostonBallad.txt
// C:\Users\austi\Downloads\mary.txt

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

//C:\Users\austi\Downloads\bostonBallad.txt
//C:\Users\austi\Downloads\mary.txt

public class ProgrammingAssignment2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
	// Error Catching
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
		
		int lineCounter = 0, punctuationCounter = 0, spaceCounter = 0, letterCounter = 0, digitCounter = 0, otherCounter = 0;
		String line = null;
		
	// Counter for lines
		while (inputFile.hasNext()) {
			line = inputFile.nextLine().trim();

			lineCounter++;
			
		// Counter for words, punctuation, spaces, letters digits, and other
			int i = 0;
			while (i < line.length()) {
				char c = line.charAt(i);
	
				if (c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':') {
					punctuationCounter++;
				}
				else if (c == ' ') {
					spaceCounter++;
				}
				else if (Character.isAlphabetic(c)) {
					letterCounter++;
				}
				else if (Character.isDigit(c)) {
					digitCounter++;
				}
				else {
					otherCounter++;
				}
				
				i++;
				
			} // End of inner while
			
		} // End of outer while
		
		int wordCount = spaceCounter + lineCounter;
		// each line has one less space than the amount of words so adding the number of lines makes up for this difference
		
	// Final Output
		System.out.println("\nNumber of lines: " + lineCounter);
		System.out.println("Number of words: " + wordCount); 
		System.out.println("Number of punctuation: " + punctuationCounter);
		System.out.println("Number of spaces: " + spaceCounter);
		System.out.println("Number of letters: " + letterCounter);
		System.out.println("Number of digits: " + digitCounter);
		System.out.print("Number of other: " + otherCounter);
		
		scan.close();
		inputFile.close();

	} // End

}
