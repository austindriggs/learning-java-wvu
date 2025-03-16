/**
 * @author Austin Driggs
 * CS 111 Section 002
 * Lab Assignment 6
 * Jakob Kaivo
 * 2/20/23
 * Purpose: Using the Java library implementation of a Stack, implement a simple Reverse Polish Notation calculator. 
 * Create a class called Calculator with a public static void main(String[] args) method (you may implement other methods at your discretion)
 * and the following behavior:
 * 
 * 
 * 
 * Read input continuously from System.in. (5 pts)
 * If the input is the string "exit", exit the program. (5 pts)
 * If the input is the string "print", print the top value of the Stack, without removing it from the Stack, as a floating point number with 
 *  no prefix and no suffix except for a new-line to System.out (e.g. System.out.printf("%f\n", value)). If the Stack is empty, print an
 *  error message to System.err instead. (5 pts)
 * If the input is numeric (integer or floating point), push it onto a Stack of Double values. (5 pts)
 * 
 * If the input is one of the four basic arithmetic operators (+, -, /, or *), perform a calculation:
 * Pop the top two numbers from the Stack. If there are fewer than two numbers on the Stack, print an error message to System.err and 
 *  return to step 1 with an empty Stack. (5 pts)
 * Apply the operation to the two numbers:
 * 		+ performs addition (5 pts)
 * 		- subtracts the top-most number from the second (e.g. "5 3 -" subtracts 3 from 5, resulting in 2) (5 pts)
 * 		* performs multiplication (5 pts)
 * 		/ divides the second from the top by the top-most number (e.g. "15 5 /" would divide 15 by 5, resulting in 3) (5 pts)
 * Push the result of the calculation onto the Stack. (5 pts)
 * Print the result of the calculation to System.out as a floating point number with no prefix and no suffix except for a 
 *  new-line (e.g. System.out.printf("%f\n", result)). (5 pts)
 * If the input is anything else (i.e. not the string "exit", a number, or one of the four operators), print an error message 
 *  to System.err without modifying the Stack. (5 pts)
 * 
 * Document and format your code according to course Coding Standards. Yes, main() is a method and yes it needs to be documented. (15 pts)
 * 
 * Submit your completed Calculator.java file. Note that you will probably want to wrap input in a java.util.Scanner object. Note 
 *  also that the order of presentation in the problem does not necessarily need to be reflected in your code.
 * 
 */

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	
	/*
	 * Class Name: Calculator
	 * Purpose: create a Reverse Polish Notation calculator
	 * Exceptions: 	Invalid user input: anything other than a number, "exit", "print", or calculation("+", "-", "*", or "/"). An error message will be shown to the user.
	 * 				If input is "print" and the stack is empty, an error message will be shown to the user.
	 * 				If a calculation is input but the stack doesn't have two numbers to use in the calculation, an error message will be shown to the user.
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Method Name: main
		 * Purpose: serve for the user input and use of the calculator
		 * Parameters: None
		 * Preconditions: None
		 * Postconditions: None
		 * Exceptions: 	Invalid user input: anything other than a number, "exit", "print", or calculation("+", "-", "*", or "/"). An error message will be shown to the user.
		 * 				If input is "print" and the stack is empty, an error message will be shown to the user.
		 * 				If a calculation is input but the stack doesn't have two numbers to use in the calculation, an error message will be shown to the user.
		 */

		Scanner scan = new Scanner(System.in);
		
		Stack<Double> myStack = new Stack<Double>();
		
		Boolean exit = false;
			
		// Continues to look for user input until the user inputs "exit"
		while (!exit) {
			
			if (scan.hasNextDouble()) {
				myStack.push(scan.nextDouble());
			}
			
			else if (scan.hasNext()) {
				
				String myString = scan.next();
				
				if(myString.equals("exit")) {
					exit = true;
				}
				
				else if (myString.equals("print")) {
					if (myStack.size() != 0) {
						System.out.println(myStack.peek());
					}
					else {
						System.err.println("Error: Stack is empty.");
					}
				}
				
				else if (myString.equals("+") || myString.equals("-") || myString.equals("*") || myString.equals("/")) {
					
					if (myStack.size() >= 2) {
						
						double result = 0;
						
						double top1 = myStack.pop();
						double top2 = myStack.pop();
						
						if (myString.equals("+")) {
							result = top2 + top1;
						}
						
						if (myString.equals("-")) {
							result = top2 - top1;
						}
						
						if (myString.equals("*")) {
							result = top2 * top1;
						}
						
						if (myString.equals("/")) {
							result = top2 / top1;
						}
						
						myStack.push(result);
						System.out.printf("%f\n", result);
				
					}
					else {
						myStack.clear(); // clear the stack if an operation is invalid
						System.err.println("Error: Stack is less than 2.");
					}
					
				} // end if string = +-*/
				
				else {
					System.err.println("Error: Input is not a valid input.");
					
				} // end if its not a double, "exit", "print", or calculation
				
			} // end else if(scan.hasNext()
						
		} // end while
		
		scan.close();

	} // end main
	
} // end Calculator
