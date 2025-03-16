/**
* @author Austin Driggs
* CS 110 Section 010
* While Loops
* 9/29/22
*/

import java.util.Scanner;

public class WhilePractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	// Suppose user input is 38 45 71 4 -1
	
		System.out.println("Input: 38 45 71 4 -1");

		int sum = 0;
		int num = scan.nextInt();
		
		while (num != -1) {
			sum = sum + num;
			num = scan.nextInt();
		}
		
		System.out.println("sum = " + sum);
		
		scan.close();

	}

}
