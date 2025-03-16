// Create a method that calculates the discount of an item

// It doesn't say to return a value so we just don't I guess

import java.util.Scanner;

public class Exam2Practice102522 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the price of an item: ");
		double num = scan.nextDouble();
		
		System.out.println("The original price is: " + num);
		
		calcTotal(num);
		
// Instead of printing inside calcTotal we could do this:
		// double newNum = calcTotal
		// System.out.println("The new total is: " + newNum);

	}
	
	public static void calcTotal(double total) {
		
		double discount = 0;
		
		if (total < 50) {
			discount = 0;
		}
		else if (total <= 100) {
			discount = 0.1;
		}
		else if (total <= 500) {
			discount = 0.2;
		}
		else {
			discount = 0.25;
		}
		
		total = total - (total * discount);
		
		System.out.println("The discount is: " + (100*discount) + "%");
		
		System.out.println("The new total is: " + total);
		
// Instead of printing inside calcTotal we could do this:
		// return total;
		
	}

}
