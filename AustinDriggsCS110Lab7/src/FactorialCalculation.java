/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 7 Problem 1
* 10/5/22
*/

import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	// Finding the factorial of the number
		System.out.println("Enter an integer: ");
		int number = scan.nextInt();
		
		int i = 1;
		double answer = 1;
		
		while (i <= number) {
			answer = answer * i;
			i++;
		}
		
		System.out.println("The factorial is: " + answer);
		
	// Printing all of the numbers
		int numbers = 0;
		i = 1;
		
		while (i <= number) {
			System.out.print(i + " ");;
			i++;
		}
		
	// Finding the sum of the numbers
		int sum = 0;
		i = 1;
		
		while (i <= number) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("\nThe sum of the numbers 1 to " + number + " is: " + sum);
		
	// Finding the average
		double average = (double)sum / (number);
		System.out.printf("The average of the numbers 1 to " + number + " is: %.2f", average);

	}

}
