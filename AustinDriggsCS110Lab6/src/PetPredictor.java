/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 6 Problem 1
* 9/28/22
*/

import java.util.Scanner;

public class PetPredictor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What kind of pet is right for you? Please enter 'yes' or 'no'.");
		
		System.out.println("\nDo you want a pet to love and care for?");
		String decision = scan.nextLine();
		
		if (decision.equals("yes")) {
			System.out.println("\nDo you want a pet yoy can do activities with?");
			decision = scan.nextLine();
			
			if (decision.equals("yes")) {
				System.out.println("\nDo you want a pet that will return your affection?");
				decision = scan.nextLine();
				
				if (decision.equals("yes")) {
					System.out.println("\nYou should invest into your new best friend: a dog.");
				}
				else {
					System.out.println("\nYou should invest in a cat.");
				}
			}
			else {
				System.out.println("\nA goldfish would be perfect for you.");
			}
		}
		else if (decision.equals("no")){
			System.out.println("\nYou should invest in a pet rock.");
		}
		else {
			System.out.println("\nPlease enter in a valid answer: 'yes' or 'no'.");
		}
		
		System.out.println("\nThank you for taking the pet predictor quiz.");
		
		scan.close();
		
	}

}
