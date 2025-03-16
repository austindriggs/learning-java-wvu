// Write a program that reads in an integer and calls a method which beaks into a sequence of individual digits, 
// and then prints the difits one per line in reverse order.
// You may assume that the input has 5 digits and is positive.

import java.util.Scanner;

public class PrintReverseDigits101822 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 5 digit positive number: ");
		int num = scan.nextInt();
		
		PrintDigits(num);
		
		scan.close();

	}
	
	public static void PrintDigits(int num) {
		
		if (num > 0 && num >= 10000 && num <= 99999) {
			
			while (num >= 1) {
				System.out.println(num%10);
				num = num / 10;
			}
		}
		else {
			System.out.println("The number " + num + " is invalid");
		}
		
		
		
	}

}
