/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 14 Problem 2
* 11/30/22
*/

import java.util.Scanner;

public class AddressTester {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	// address1
		System.out.println("Enter an address that INCLUDES an apartment number(pressing enter after each entry): "
				+ "\nHouseNumber StreetName AptNumber City State ZipCode");
		// Test: 123 WestRun 45 Morgantown WestVirginia 56789

		int houseNum = scan.nextInt();
		String dummy1 = scan.nextLine();
		String street = scan.nextLine();
		int aptNum = scan.nextInt();
		dummy1 = scan.nextLine();
		String city = scan.nextLine();
		String state = scan.nextLine();
		int zipCode = scan.nextInt();
		dummy1 = scan.nextLine();
		
		Address address1 = new Address(houseNum, street, aptNum, city, state, zipCode);
		Address.print(address1);

	// address2
		System.out.println("\nEnter an address that EXCLUDES an apartment number(pressing enter after each entry): "
				+ "\nHouseNumber StreetName City State ZipCode");
		// Test: 123 WestRun Morgantown WestVirginia 56789

		houseNum = scan.nextInt();
		dummy1 = scan.nextLine();
		street = scan.nextLine();
		aptNum = 0;
		city = scan.nextLine();
		state = scan.nextLine();
		zipCode = scan.nextInt();
		dummy1 = scan.nextLine();
		
		Address address2 = new Address(houseNum, street, city, state, zipCode);
		Address.print(address2);
	
	// same street?
		if (Address.checkStreet(address1, address2)) {
			System.out.print("\nThe two addresses are on the same street.");
		}
		else {
			System.out.print("\nThe two addresses are NOT on the same street.");
		}
		
		scan.close();
		
	}

}
