/**
* @author Austin Driggs
* CS 110 Section 010
* Loop Statements
* 9/27/22
*/

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
	//	Write a program using a loop that lets the user enter a series of positive integers.  
	//	The user should enter -99 to signal the end of the series.  
	//	After all the numbers have been entered, the program should display the largest and smallest numbers entered.
		
		int current = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	
		System.out.print("If you input -99 the program will end.\n");
		System.out.print("Input a positive integer: ");
		
		current = scan.nextInt();
		
		while (current != -99) {
			if ( current >=0) {
                if (min > current) 
						min = current;
                if (max < current) 
					max = current;
            }// if current is positive
			System.out.print("\nIf you input -99 the program will end.\n");
			System.out.print("Input a positive integer: ");
            current = scan.nextInt(); 
		}
		
		System.out.print("\nThe largest number is: " + max);
		System.out.print("\nThe smallest number is: " + min);
		
		scan.close();
		
	}

}
