/**
* @author Austin Driggs
* CS 110 Section 010
* If Statements
* 9/28/22
*/

import java.util.Scanner;

public class RetailPriceComparison {

	public static void main(String[] args) {
		
// ZyBooks Problem 3.8.1
//	Write a program that compares a list price and an actual price. Your program should print a single message. 
//	If the actual price is less than 50% of the list price, print "Great deal". Otherwise, 
//	if the actual price is less than 80% of the list price, print "Good deal". 
//	If that is not the case but the actual price is no more than the list price, print "Ok deal". 
//	If none of these apply, print "Bad deal".
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("List price: ");
		double listPrice = in.nextDouble();
	  
		System.out.print("Actual price: ");
		double actualPrice = in.nextDouble();
	  
		if (listPrice * 0.5 > actualPrice) {
			System.out.println("Great deal");
		}
		else if (listPrice * 0.8 > actualPrice) {
			System.out.println("Good deal");
		}
		else if (listPrice >= actualPrice) {
			System.out.println("Ok deal");
		}
		else {
			System.out.println("Bad deal");
	    }
		
		in.close();
	
	}
   
}
