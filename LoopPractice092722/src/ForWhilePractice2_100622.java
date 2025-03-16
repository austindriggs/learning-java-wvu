import java.util.Scanner;

public class ForWhilePractice2_100622 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a line of text, we'll tell you how many blanks it contains: ");
		String quote = scan.nextLine();
		
		int blanks = 0;
		char c;
		
		for (int i = 0; i < quote.length(); i++) {
			// How to see if character i is a blank
			c = quote.charAt(i);
			if ( c == ' ') {
				blanks++;
			}
		}
		
		System.out.println("The number of blanks is: " + blanks);
		
	}

}
