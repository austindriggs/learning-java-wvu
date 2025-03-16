// Write a method that reeives a string as a paramerter and counts and returns the number of vowels in the string

import java.util.Scanner;

public class VowelCounter101822 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter in a line of words to count the vowels: ");
		String line = scan.nextLine();
		
		int output = vowelCounter(line);
		
		System.out.println("\nThe number of vowels in the string is: " + output);
		
		scan.close();

	}
	
	public static int vowelCounter ( String line ) {
		
		char c = 0;
		int count = 0;
		line = line.toLowerCase();
		
		for (int i = 0; i < line.length(); i++) {
			c = line.charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
			
		}
		
		return count;
			
	}

}
