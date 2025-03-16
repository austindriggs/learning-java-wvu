/**
* @author Austin Driggs
* CS 111 Section 002
* 0/0/0000
* Purpose: 
*/

import java.util.Arrays;

public class Day1_041223 {

	public static void main(String[] args) {
		
	// SEE LAB 12 FOR EXAMPLES: fibonacci, greatestCommonDivisor, and towersOfHanoi
		
		

	// Practice 1: power
		
		System.out.println("Practice 1: power");
		
		int x = 0; int n = 0;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 3; n = 3;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 2; n = 4;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 5; n = 2;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 6; n = 3;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 1; n = 1000;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 1000; n = 1;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		x = 1000; n = 0;
		System.out.println(x + "^" + n + " = " + power(x,n));
		
		System.out.println();
		
		
		
	// Practice 2: write a method in order to determine if a String is a palindrome
		
		System.out.println("Practice 2: write a method in order to determine if a String is a palindrome");
		
		String word = "racecar";
		System.out.println(word + " isPalindrome: " + isPalindrome(word));
		System.out.println(word + " = word: to test our string isnt destroyed inside the method");
		
		word = "dad";
		System.out.println(word + " isPalindrome: " + isPalindrome(word));
		
		word = "sknvoespfceqfm";
		System.out.println(word + " isPalindrome: " + isPalindrome(word));
		
		word = "12345678900987654321";
		System.out.println(word + " isPalindrome: " + isPalindrome(word));
		
		word = "1234567890";
		System.out.println(word + " isPalindrome: " + isPalindrome(word));
		
		word = "asdfghjkllkjhgfdsa";
		System.out.println(word + " isPalindrome: " + isPalindrome(word));
		
		System.out.println();
		
		
		
	// DAY 2 041923
		
		
		
	// Practice 3: Write a recursive method to print out the contents of an array from first to last
		
		System.out.println("Practice 3: Write a recursive method to print out the contents of an array from first to last:");
		
		int[] values = {34, 592, 24, 60, 12, 398, 134};
		displayArray(values);
		System.out.println();
		
		System.out.println("In main the array is: " + Arrays.toString(values));
		
		System.out.println();
	
	// Practice 4: BINARY SEARCH
		
		System.out.println("Practice 4: BINARY SEARCH");
		
		int[] bsearch = {4, 23, 45, 66, 90, 104, 105, 204, 608, 690, 735, 758, 789, 810, 830, 999};
		
		System.out.println("23 is at index: " + binarySearch(bsearch, 0, bsearch.length, 23));
		System.out.println("89 is at index: " + binarySearch(bsearch, 0, bsearch.length, 89));
		System.out.println("810 is at index: " + binarySearch(bsearch, 0, bsearch.length, 810));
		System.out.println("90 is at index: " + binarySearch(bsearch, 0, bsearch.length, 90));
		System.out.println("608 is at index: " + binarySearch(bsearch, 0, bsearch.length, 608));
		System.out.println("40 is at index: " + binarySearch(bsearch, 0, bsearch.length, 40));
		
		System.out.println();
		
		
		
	// Practice 5: Given a language: ASD$DSA where the string has to reverse after the dollar sign, write a method that checks this language
		
		System.out.println("Practice 5: Given a language: ASD$DSA where the string has to reverse after the dollar sign, write a method that checks this language");
		
		System.out.println("isLanguage $: " + isLanguage("$"));
		System.out.println("isLanguage ASD$DSA: " + isLanguage("ASD$DSA"));
		System.out.println("isLanguage ASDDSA: " + isLanguage("ASDDSA"));
		System.out.println("isLanguage ASDFGHJKL$LKJHGFDSA: " + isLanguage("ASDFGHJKL$LKJHGFDSA"));
		System.out.println("isLanguage 999999999$999999999: " + isLanguage("999999999$999999999"));
		System.out.println("isLanguage XYZ$ASD: " + isLanguage("XYZ$ASD"));
		System.out.println("isLanguage AUSTIN$NITSUA: " + isLanguage("AUSTIN$NITSUA"));
		System.out.println("isLanguage DRIGGS$SGGIRD: " + isLanguage("DRIGGS$SGGIRD"));
		System.out.println("isLanguage ASD$DSAA: " + isLanguage("ASD$DSAA"));
		System.out.println("isLanguage ASDD$DSAA: " + isLanguage("ASDD$DSAA"));
		
		System.out.println();
		
		
		
	// Practice 6: Write a recursive method that prints a string backwards
		
		System.out.print("cat "); reverse("cat");
		System.out.print("\n "); reverse("");
		System.out.print("\nc "); reverse("c");
		System.out.print("\naustin "); reverse("austin");
		System.out.print("\ndriggs "); reverse("driggs");
		System.out.print("\nwords "); reverse("words");
		System.out.print("\nracecar "); reverse("racecar");
		
		System.out.println();
		
		
		
	} // end main
	
	
	
	public static int power(int x, int n) {
		
		int result = 0;
		
		if (n == 0) {
			result = 1;
		}
		else {
			result = x * power(x, n-1);
		}
		
		return result;
		
	} // end power
	
	
	
	public static boolean isPalindrome(String word) {
		
		if (word.length() == 1 || word.length() == 0) {
			return true;
		}
		else if (word.charAt(0) == word.charAt(word.length() - 1)) {
			isPalindrome(word.substring(1, word.length() - 2));
		}
		else {
			return false;
		}
		
		return true;

	} // end isPalindrome
	
	
	
	public static void displayArray(int[] nums) {
		
		if (nums.length == 1) {
			System.out.print(nums[0] + " ");
		}
		else {
			System.out.print(nums[0] + " ");
			displayArray(Arrays.copyOfRange(nums, 1, nums.length));
		}
		
	} // end displayArray
	
	public static int binarySearch(int[] nums, int low, int high, int searchValue) {
		
		// Recall: binary searches require an already sorted array
		
		int result;
		int mid = (low + high) / 2; // or mid = low + ((high-low)/2)
		
		if (nums[mid] == searchValue) {
			result = mid;
		}
		else if (low >= high) {
			result = -1;
		}
		else if (searchValue < nums[mid]) {
			result = binarySearch(nums, low, mid-1, searchValue);
		}
		else {
			result = binarySearch(nums, mid+1, high, searchValue);
		}
		
		return result;
		
	} // end binarySearch
	
	public static boolean isLanguage(String lang) {
		
		// in class we did the whole thing in here instead of splitting it up inside if isPalindrome
		
		boolean result = false;
		
		if (lang.charAt(lang.length()/2) == '$') {
			result = isPalindrome(lang);
		}
		else {
			result = false;
		}
		
		return result;
		
	} // end isLanguage
	
	public static void reverse(String word) {
		if (word.length() >= 1) {
			System.out.print(word.charAt(word.length()-1));
			reverse(word.substring(0, word.length()-1));
		}
	}
	
	

} // end class day1
