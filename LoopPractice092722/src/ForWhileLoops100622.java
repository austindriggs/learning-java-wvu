
public class ForWhileLoops100622 {

	public static void main(String[] args) {

	// Given the for loop, create a while loop that outputs the same thing
		int i = 5;
		
		for (i=5; i>=0; i--) {
			System.out.println("i is " + i);
		}
		
		System.out.println("\n");
		
		i = 5;
		
		while (i>=0) {
			System.out.println("i is " + i);
			i--;
		}
		
		System.out.println("\n");
		
	// Given the while loop, create a for loop that outputs the same thing
		int x = 5, y = 35;
		
		while (x < y) {
			x = x + 10;
		}
		System.out.println(x + " " + y);
		
		System.out.println("\n");
		
		for ( ; x < y;) {
			x = x + 10;
		}
		System.out.println(x + " " + y);
		
	}

}
