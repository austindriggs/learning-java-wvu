// This is an example of how scope effects a string.

// Every time you create a new string, such as word, it is stored in a completely different spot in memeory. 
// The original string, line, is still stored in the same spot in memeory and remains unchanged.

import java.util.Scanner;

public class Strings101322 {
	
	static Scanner scan = new Scanner(System.in); // global to the whole class;

	public static void main(String[] args) {

		String line = "catdog";
		reverseHalves( line );
		
		System.out.println("line is " + line);
	}
	
	public static String reverseHalves( String word ) {
		int middle = word.length() / 2;
		word = word.substring(middle) + word.substring(0, middle);
		
		System.out.println("word is " + word);
		
		return word;
	}

}
