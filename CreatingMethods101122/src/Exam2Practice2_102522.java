// Count and return the number of spaces in a string
// Use these lines for the scanner

import java.util.Scanner;

public class Exam2Practice2_102522 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter in a string: ");
		String text = scan.nextLine();
		
		int count = countSpaces(text);
		
		System.out.println("The number of spaces is: " + count);
		
		scan.close();

	}
	
	public static int countSpaces(String text) {
		
		int count = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				count++;
			}
		}
		
		return count;
		
	}

}
