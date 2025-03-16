/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 14 Problem 1
* 11/30/22
*/

public class Address {

	// Declaration of instance variabes
		int houseNum;
		String street;
		int aptNum = 0;
		String city;
		String state;
		int zipCode;
			
	// Constructor including aptNum
		public Address(int houseNum, String street, int aptNum, String city, String state, int zipCode) {
			this.houseNum = houseNum;
			this.street = street;
			this.aptNum = aptNum;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}
		
	// Constructor excudling aptNum
		public Address(int houseNum, String street, String city, String state, int zipCode) {
			this.houseNum = houseNum;
			this.street = street;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}
		
		public static void print(Address address) {
			System.out.println("\n" + address.houseNum + " " + address.street);
			if (address.aptNum != 0) {
				System.out.println("Apartment No. " + address.aptNum);
			}
			System.out.println(address.city + ", " + address.state + " " + address.zipCode);
		}
		
		public static boolean checkStreet(Address address1, Address address2) {
			if (address1.street.equals(address2.street)) {
				return true;
			}
			else {
				return false;
			}
		}
		

}
