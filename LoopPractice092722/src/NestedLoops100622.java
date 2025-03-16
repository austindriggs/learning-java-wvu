import java.util.Scanner;

public class NestedLoops100622 {

	public static void main(String[] args) {

//	Write a program which prompts the user for strings repeatedly until they enter the string quit. 
//	As each string is input print out the characters of the string one character per line.
//	Example
//	If we think about a character string,  say “hello”.  
//	Each character has an index #, that signifies it‘s position in the string.  
//	We can find the length of a string by using the length() method , and each character in the string has an index # ranging from 0 to length()-1

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a string. Input 'quit' to be done: ");
		String line = scan.nextLine();
		
		
		
		while (! line.equalsIgnoreCase("quit") ) {
			for ( int i = 0; i < line.length(); i++) {
				System.out.println( line.charAt(i));
			}
			System.out.println("Input a string. Input 'quit' to be done: ");
			line = scan.nextLine();
		}

	}

}
