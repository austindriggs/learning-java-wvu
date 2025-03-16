/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 9 Problem 1
* 10/19/22
*/

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter in an integer: ");
		int num = scan.nextInt();
		
		if (isPalindrome(num) == true) {
			System.out.println("Number is palindrome.");
		}
		else {
			System.out.println("Number is not palindrome.");
		}
		
		scan.close();

	}
	
	public static boolean isPalindrome(int num) {
		
		int temp = num;
		int reverse = 0;
		
		while (temp > 0) {
			
			int remainder = temp % 10;
			temp = temp / 10;
			reverse = reverse * 10 + remainder;
			
		}
		
		return num == reverse;
	}

}
