
import java.util.Scanner;

public class ForLoopPractice100422 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	// Print out the sum of the numbers 1 - 10		
		int x;
		int sum = 0;
		
		for (x = 1 ; x <= 10 ; x++) { // for (initialization; exit statement/condition; update) {
			sum = sum + x;
		}
		// What is the scope and lifetime of x?
		// It only exists while the loop is running. If we didn't initialize it outside of the for loop, we wouldn't be able to print out the value of x.
		
		System.out.println("The sum of the numbers 1 - 10 equals: " + sum);
		System.out.println("The value of x equals: " + x); 
		
		
		
	// Write a program that prompts the user for a number between 0 and 100 and then prints all of the sqares of all of the numbers from the number to 100
		System.out.println("Input an integer between 1 - 100: ");
		int num = scan.nextInt();
		
		if (num >= 0 && num <= 100) {
			for (int i = num; i <= 100; i++) {
				System.out.println(i*i);
			}
		}
		else {
			System.out.println("\nYou input an invalid number.");
		}
		
		scan.close();
		
	}

}
