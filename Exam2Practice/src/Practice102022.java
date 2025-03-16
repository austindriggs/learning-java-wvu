import java.util.Scanner;

public class Practice102022 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// 1. Write a fragment of code that will compute the sum of the first n positive
// odd integers, for example if n is 5, you should compute 1 + 3 + 5 + 7 + 9 = 25
		
		System.out.println("Please enter the number of odd integers to add together: ");
		int n = scan.nextInt();
		
		int sum1 = 0;
		int a = 1;
		
		while (n > 0) {
			sum1 = sum1 + a;
			a = a + 2;
			n--;
		}
		System.out.println("The sum is: " + sum1);
		
		System.out.println("\n\n");
		
		

// 2. Convert the following code so that it uses nested while statements instead
// of for statements.
		
		int s = 10;
		int t = 10;

	// Old
		for (int i = 0; i < 2; i++) {
			s = s + i;
			for (int j = i; j > 0; j--) {
				t = t * 2;
			}
	
			s = s * t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);
		
		s = 10; // Reset
		t = 10; // Reset
		
	// New
		int i = 0;
		while (i < 2) {
			s = s + i;
			
			int j = i;
			while (j > 0) {
				t = t * 2;
				j--;
			}

			s = s * t;
			System.out.println("T is " + t);
			
			i++;
		}
		System.out.println("S is " + s);
		
		System.out.println("\n\n");
		
		

// 3. What does the code below display? Make the corrections necessary to fix
// the code.
		
		int sum = 0;
		int product = 1;
		int max = 4;

		for (i = 1; i <= max; i++) {
			sum = sum + i;
			product = product + i;
		}

		System.out.println("The sum is " + sum + " and the product is " + product);
		
	// It displays:
	// sum = 10
	// product = 11
	// i = 5
		
// Not sure what corrections to make on this one
		
		System.out.println("\n\n");
		
		

// 4. Write a fragment of code that takes a string and prints out the
// string in reverse order. For example, "happy" will output "yppah".
		
		System.out.println("Please enter a string: ");
		String dummy = scan.nextLine();
		String string = scan.nextLine();
		
		for (i = 1; i <= string.length(); i++) {
			int position = string.length() - i;
			System.out.print( string.substring(position, position + 1) );
		}
		
		System.out.println("\n\n");
		
		

// 5. Write a fragment of code that prompts the user for a single character,
// read it in and store it in a variable, then print a message indicating if the
// character is or is not a vowel.
		
		System.out.println("Please enter in a single character: ");
		String c = scan.nextLine().toLowerCase();
		
		if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
			System.out.println("The character IS a vowel.");
		}
		else {
			System.out.println("The character IS NOT a vowel.");
		}
		
		System.out.println("\n\n");
		
		

// 6. Write a fragment of code that prints the following pattern:
// *
// **
// ***
// *****
// ******
// idk if that's right. I think my output is right:
// *
// **
// ***
// ****
// *****

		
		for (int lines = 0; lines <= 5; lines++) {
			for (int stars = 0; stars < lines; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		

// 7. Write a fragment of code that reads in 3 integers, sorts them in ascending
// order and prints them to the screen. So if the user inputs 78 3 12 your
// program will display 3 12 78.
		
		System.out.println("Please input 3 integers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int minNum, midNum, maxNum;
		
		if (num1 > num2) {
			if (num1 > num3) {
				maxNum = num1;
				
				if (num2 > num3) {
					midNum = num2;
					minNum = num3;
				} 
				else {
					midNum = num3;
					minNum = num2;
				}
				
			}
			else {
				midNum = num1;
				
				if (num2 > num3) {
					maxNum = num2;
					minNum = num3;
				} 
				else {
					maxNum = num3;
					minNum = num2;
				}
				
			}
			
		} 
		else if (num1 > num3){
			maxNum = num2;
			midNum = num1;
			minNum = num3;
		} 
		else {
			minNum = num1;
			
			if (num2 > num3) {
				maxNum = num2;
				midNum = num3;
			} 
			else {
				maxNum = num3;
				midNum = num2;
			}
			
		}
		
		System.out.println(minNum + " " + midNum + " " + maxNum);
		
		System.out.println("\n\n");
		
		
		
	// Extra: Count how many numbers are in this string:
		
		String test = "ouhf398u5gf9j4h53of839";
		int count = 0;
		
		for (i = 0; i < test.length(); i++) {
			char ch = test.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
	
		System.out.println("There are " + count + " digits in this string.");
		
		System.out.println("\n\n");
		
		

// 8. What is the output of the following code?
		
		int num = 5;

		while (num > 5)
			num = num + 2;

		System.out.println("num = " + num);
		
		// The output is:
		// num = 5 
		// 5 is not greater than 5 so it never runs
		
		System.out.println("\n\n");
		
	

// 9. How many times does the following loop run?
		
		int x = 5, y = 30;
		int counter = 0;  // I added this

		while (x <= y) {
			x = x * 2;
			counter++;
		}
		
		// 1, 2, 3
		System.out.println(counter);
		
		System.out.println("\n\n");
		
		

// 10. What will this code output?
		
		int example = 5;
		if (example > 10)
			System.out.println("Hello ");
		else
			System.out.println("There. ");
		System.out.println("How are you?");
		
		// This will output:
		// There.
		// How are you?
		
		System.out.println("\n\n");
		
		
		
	// Missed Question on Exam 2
		x = 5;
		y = 25;
		
		do {
			x++;
			y = y - 5;
		} while (x > y);
		
		// It runs thourgh the "do": x = 6. y = 20
		// AFTER it checks the while. while = false and it ends
		
		System.out.println("x = " + x + ". y = " + y + ".");
		
		System.out.println("\n\n");
		
		
		
	// end of problems
		System.out.print("All done :)");

		scan.close();
	}
}