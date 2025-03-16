/** @author Austin Driggs
 * CS 111 Section 002
 * Lab 12
 * Jakob Kaivo
 * 4/10/23
 * Purpose: Learn about recursion
 */

public class Recursion {
	
	/*
	 * Class Name: Recursion
	 * Purpose: Learn about different ways recursion can be implemented by calling a method inside of itself
	 * Exceptions: IllegalArgumentException if illegal int n is given for the method
	 */
	
	public static int fibonacci(int n) {
		
		/*
		 * Method Name: fibonacci
		 * Purpose: Returns the nth Fibonacci number
		 * Parameters: int n
		 * Preconditions: n >= 0
		 * Postconditions: if n = 0, return 0. if n = 1, return 1. otherwise return the sum of the two previous numbers in the Fibonacci sequence
		 * Exceptions: IllegalArgumentException if n < 0
		 */
		
		if (n < 0) {
			throw new IllegalArgumentException("Not defined for negative numbers.");
		}
		
		int sum = 0;
		
		if (n == 0) {
			sum += 0; // first term
		}
		else if (n == 1) {
			sum += 1; // second term
		}
		else {
			for (int i = n - 2; i < n; i++) {
				sum += fibonacci(i); // third through nth term
			}
		}
		
		return sum;
		
	}

	public static int greatestCommonDivisor(int a, int b) {
		
		/*
		 * Method Name: greatestCommonDivisor
		 * Purpose: Returns the Greatest Common Divisor of two integers
		 * Parameters: int a and int b
		 * Preconditions: None
		 * Postconditions: If the second number is 0, the GCD is the absolute value of the first number. Otherwise, the GCD is the GCD of the 
		 * 	second number and the remainder of the first divided by the second.
		 * Exceptions: None
		 */
		
		if (b == 0) {
			return Math.abs(a);
		}
		
		return greatestCommonDivisor(b, a%b);
		
	}

	public static int towersOfHanoi(int n) {
		
		/*
		 * Method Name: towersOfHanoi
		 * Purpose: Returns the minimum number of moves required to solve the Towers of Hanoi puzzle with n disks.
		 * 		In the Towers of Hanoi, a number of differing sized disks are placed, from largest at the bottom to smallest at the top, on the first of 
		 * 		three pegs. The goal is to move the disks, one at a time, until they are all on the third peg. Disks may only be placed on an empty peg 
		 * 		or on top of a larger disk. This method does not attempt to solve the puzzle, only show how many steps are required for the optimal solution.
		 * Parameters: int n
		 * Preconditions: n >= 1
		 * Postconditions: returns the minimum number of moves
		 * Exceptions: IllegalArgumentException if n < 1
		 */
		
		if (n < 1) {
			throw new IllegalArgumentException("There must be at least one disk.");
		}
		else if (n == 1) {
			return 1; // A game with only one disk can be finished in one move.
		}
		else {
			return ( (2 * towersOfHanoi(n - 1)) + 1); //  All other games require twice the number of moves as a game with one less disk, plus one additional move.
		}
		
	}
	
}