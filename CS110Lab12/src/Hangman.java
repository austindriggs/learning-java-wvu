/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 12 Problem 1
* 11/9/22
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

// C:\Users\austi\Downloads\word.txt

public class Hangman {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		boolean goodValue = false;
		
		while (!goodValue) {
			try {
				System.out.println("Please input a valid file path to play:");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println("Invalid File Path: " + filePath);
			}
		}
		
		System.out.println("\nHow many letters does the word have?");
		int wordLength = scan.nextInt();
		
		char[] word = new char[wordLength];
		
		for (int i = 0; i < wordLength; i++) {
			word[i] = inputFile.next().charAt(0);
		}

		int correct = 0;
		
		while (correct < wordLength) {
			System.out.println("\nPlease guess a letter in the word:");
			char c = scan.next().charAt(0);
			boolean goodChar = false;
			
			for (int i = 0; i < wordLength; i++) {
				if (c == word[i]) {
					correct++;
					goodChar = true;
				}
			}
			
			if (goodChar) {
				System.out.println("Correct! The letter " + c + " is in the word."
					+ " You have guessed " + correct + " out of " + wordLength + " letters.");
			}
			else {
				System.out.println("Incorrect. The letter " + c + " is not in the word.");
			}
		}
		
		System.out.print("\nCongrats! Thank you for playing!");
		
		scan.close();
		inputFile.close();
		
	}

}
