/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 11 Problem 2
* 11/02/22
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

// C:\Users\austi\Downloads\words.txt

public class WordsArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		boolean goodValue = false;
		while (!goodValue) {
			try {
				System.out.println("Please input a valid file path:");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println("\nInvalid file path: " + filePath + "\nPlease try again.\n");
			}
		}
		
		String[] words = new String[100];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = inputFile.nextLine();
		}
		
	// Checking if a word is in the array
		System.out.println("\nPlease enter the word you want to find:");
		String word = scan.nextLine();
		
		boolean match = findWord(words, word);
		if (match) {
			System.out.println("The word " + word + " is on the list!");
		}
		else {
			System.out.println("The word " + word + " is NOT on the list :(");
		}
		
	// Printing out all of the words that start with a certain letter
		System.out.println("\nPlease enter the letter you wish to see the list of words for:");
		String cString = scan.nextLine().toLowerCase();
		char c = cString.charAt(0);
		
		// Error checking
		if (cString.length() > 1) {
			while (cString.length() > 1) {
				System.out.println("\nPlease enter a valid letter."
						+ "\nPlease enter the letter you wish to see the list of words for:");
				cString = scan.nextLine().toLowerCase();
				c = cString.charAt(0);
			}
		}
		
		findLetter(words, c);
		
	// End
		scan.close();
		inputFile.close();

	} // end main
	
	public static boolean findWord(String[] words, String word) {
		
		boolean match = false;
		for (int i = 0; i < words.length; i++) {
			if (word.equals(words[i])) {
				match = true;
			}
		}
		
		return match;
		
	} // end findWord
	
	public static void findLetter(String[] words, char c) {
		
		System.out.println("These are the words beginning with the letter " + c + " in the list:");
		
		boolean noLetter = false;
		
		for (int i = 0; i < words.length; i++) {
			String wString = words[i].substring(0, 1);
			char w = wString.charAt(0);
			if (c == w) {
				System.out.print(words[i] + " ");
				noLetter = true;
			}
		}
		
		if (!noLetter) {
			System.out.println("Sorry, there is no word that begins with the letter " + c + " :(");
		}
		
	} // end findLetter

}
