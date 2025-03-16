/**
* @author Austin Driggs
* CS 110 Section 010
* Programming Assignment 4
* 12/5/22
*/

// In this project you will implement a word search puzzle game.  Your program will be responsible for 
// processing a two dimensional character array that is a word search puzzle.  The array will be declared 
// (but not instantiated) in your main method,  which will then call a method to fill the array from a data file, 
// and then invoke another method to print out the puzzle to the screen.  Next, your program will prompt the 
// user for the name of a data file containing works which may or may not be in the puzzle.  It will read one 
// word at a time from the file.  As each word is read from the file you will pass the word and your puzzle array 
// into a “play” method that will search the puzzle for the word.

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

// C:\Users\austi\Downloads\program4\puzzle1.txt
// C:\Users\austi\Downloads\program4\wordspuzzle1.txt

// C:\Users\austi\Downloads\program4\puzzle2.txt
// C:\Users\austi\Downloads\program4\wordspuzzle2.txt

// C:\Users\austi\Downloads\program4\puzzle3.txt
// C:\Users\austi\Downloads\program4\wordspuzzle3.txt

public class Program4 {

	public static void main(String[] args) {
		
		char[][] puzzle = fill();
		
		printPuzzle(puzzle);
		
		play(puzzle);

	} // END main
	
	public static char[][] fill() {
		
		// This method will create and return a two dimensional character array.  This method will prompt the user 
		// for the name of a data file which will be opened and read into the array the file is formatted as a series 
		// of single characters separated by spaces. The first line of the data file will contain two integers representing
		// the number of rows and columns that will be in the puzzle
		
		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		boolean goodValue = false;
		while (!goodValue) {
			try {
				System.out.println("Please input the file path containing the puzzle:");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println("\nInvalid file path: " + filePath + "\nPlease try again.\n");
			}
		}
		
		int rows = inputFile.nextInt();
		int columns = inputFile.nextInt();
		// System.out.println("rows: " + rows + " columns: " + columns);
		
		char[][] puzzle = new char[rows][columns];
		
		for (int i = 0; i < puzzle.length; i++) {		
			for (int j = 0; j < puzzle[0].length; j++) {
				puzzle[i][j] = inputFile.next().charAt(0);
			}
		}
				
		// scan.close(); 
		// was throwing an error when trying to use scanner in play() method
		
		return puzzle;
		
	} // END fill
	
	public static void printPuzzle(char[][] puzzle) {
		
		System.out.println();
		
		for (int i = 0; i < puzzle.length; i++) {		
			for (int j = 0; j < puzzle[0].length; j++) {
				System.out.print(puzzle[i][j] + " ");
			}
			System.out.println();
		}		
		
		System.out.println();
		
	} // END printPuzzle
	
	public static void play(char[][] puzzle) {
	
	// You will read the “words” file one line at a time, each line contains a single word.
	// For each word you will compare the first character of the string to each character in the puzzle until you find a match.  
	// Then your program will continue to compare characters in the four directions  “up”, “down”, “left” and “right”
		
		Scanner scan = new Scanner(System.in);
		Scanner inputFile = null;
		String filePath = null;
		
		boolean goodValue = false;
		while (!goodValue) {
			try {
				System.out.println("Please input the file path containing the words:");
				filePath = scan.nextLine();
				inputFile = new Scanner(new FileReader(filePath));
				goodValue = true;
			} catch (IOException e) {
				System.out.println("\nInvalid file path: " + filePath + "\nPlease try again.\n");
			}
		}
		
		String word = null;
		
		while (inputFile.hasNext()) {
			boolean wordFound = false;
			word = inputFile.next();
			System.out.println("\nCurrent word: " + word);
			
			for (int i = 0; i < puzzle.length; i++) {		
				for (int j = 0; j < puzzle[0].length; j++) {

					if (word.charAt(0) == puzzle[i][j]) {
						
						if (checkUp(puzzle, word, i, j)) {
							System.out.println("The word " + word + " was found starting at [" + i + "][" + j + "] going up.");
							wordFound = true;
						}
						if (checkDown(puzzle, word, i, j)) {
							System.out.println("The word " + word + " was found starting at [" + i + "][" + j + "] going down.");
							wordFound = true;
						}
						if (checkLeft(puzzle, word, i, j)) {
							System.out.println("The word " + word + " was found starting at [" + i + "][" + j + "] going left.");
							wordFound = true;
						}
						if (checkRight(puzzle, word, i, j)) {
							System.out.println("The word " + word + " was found starting at [" + i + "][" + j + "] going right.");
							wordFound = true;
						}
						
					}
					
				} // end inner for
			} // end outer for
			
			if (!wordFound) {
				System.out.println("The word " + word + " was NOT found in the puzzle.");
			}
			
		}
		
		scan.close();
		inputFile.close();
		
	} // END play
	
// CHECK DIRECTIONS
	public static boolean checkUp(char [][] puzzle, String word, int row, int col) {
		
		boolean wordFound = false;
		
		try {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) == puzzle[row - i][col]) {
					wordFound = true;
				}
				else {
					wordFound = false;
					break; // used to stop fnx from equalling fox because the last letters are the same
				}
			}
        }
        catch (Exception e) {
        	wordFound = false; // if out of bounds, return false
        }
		
		return wordFound;
	}
	
	public static boolean checkDown(char [][] puzzle, String word, int row, int col) {
		
		boolean wordFound = false;
		
		try {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) == puzzle[row + i][col]) {
					wordFound = true;
				}
				else {
					wordFound = false;
					break;
				}
			}
        }
        catch (Exception e) {
        	wordFound = false;
        }
		
		return wordFound;
	}
	
	public static boolean checkLeft(char [][] puzzle, String word, int row, int col) {
		
		boolean wordFound = false;
		
		try {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) == puzzle[row][col - i]) {
					wordFound = true;
				}
				else {
					wordFound = false;
					break;
				}
			}
		}
		catch (Exception e) {
			wordFound = false;
		}
		
		return wordFound;
	}
	
	public static boolean checkRight(char [][] puzzle, String word, int row, int col) {
		
		boolean wordFound = false;
		
		try {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) == puzzle[row][col + i]) {
					wordFound = true;
				}
				else {
					wordFound = false;
					break;
				}
			}
		}
		catch (Exception e) {
			wordFound = false;
        }
		
		return wordFound;
	} // END CHECK DIRECTIONS
	
}
