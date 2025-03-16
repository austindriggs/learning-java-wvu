/**
* @author Austin Driggs
* CS 110 Section 010
* Switch Statements
* 9/27/22
*/

import java.util.Scanner;

public class SwitchProblems {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
		
	// Write a code to prompt the user for a character and then determine if it is a vowel or not.
		
		System.out.print("Please enter in a character: ");
		char c = scan.nextLine().toLowerCase().charAt(0); // charAt(o) is to make sure that we only get 1 character even if they put in a string
		
		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print("\n" + c + " is a vowel.");
				break;
			default:
				System.out.print("\n" + c + " is NOT a vowel.");
		}

	// Write a code to prompt the user for a number 1-12 for the month of the year and then depending on the month display these values
	// Months 1, 2, & 3 are winter. Months 4, 5, & 6 are Spring. Months 7, 8, and 9 are Summer. Months 10, 11, and 12 are Fall
		System.out.print("\n\nPlease input the month as 1-12: ");
		int month = scan.nextInt();
		
		switch (month) {
			case 1:
			case 2:
			case 3:
				System.out.print("\nWinter");
				break;
			case 4:
			case 5:
			case 6:
				System.out.print("\nSpring");
				break;
			case 7:
			case 8:
			case 9:
				System.out.print("\nSummer");
				break;
			case 10:
			case 11:
			case 12:
				System.out.print("\nFall");
				break;
			default:
				System.out.print("\nInvalid Month Entered: " + month);
		}

		scan.close();
	}

}
