// Be sure to pay attension to the scope of the variables when using different methods
// The scope of a variable is the block in which it is declared


public class Largest101322 {

	// main method
	public static void main(String[] args) {

		int max = 0;
		
		max = todd(33, 66, 77);
		System.out.println("The largest number is: " + max);
		
		max = todd(45, 98, 243);
		System.out.println("The largest number is: " + max);
		
		System.out.println("The largest number is: " + todd(2, 92, 104));
		
		int x = -4, y = 23, z = 72;
		System.out.println("The largest number is: " + todd(x, y, z));
		
		System.out.println("The largest number is: " + todd( x, y, todd(-33, 47, todd(43, 64, 212) ) ) );
		// This is called RECURSION - don't need to know this on test 2

	} // End main class
	
	// todd method
	public static int todd(int a, int b, int c) {
		
		int largest;
		
		if (a > b) {
			largest = a;
		}
		else {
			largest = b;
		}
		if (c > largest) {
			largest = c;
		}
		
		return largest;
		
	} // End todd class

}
