/**
* @author Austin Driggs
* CS 110 Section 010
* Lab 11 Problem 1
* 11/02/22
*/

public class RandomArray {

	public static void main(String[] args) {

		int[] nums = new int[10];
		
	// Set every value of the array to random and then print every index of the array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100);
			System.out.println("index " + i + ": " + nums[i]);
		}
		
	// Print every element at an even index
		System.out.println("\nEvery element at an even index:");
		for (int i = 0; i < nums.length; i = i + 2) {
				System.out.print(nums[i] + " ");
		}
		
		
	// Create a loop to print every even element
		System.out.println("\n\nEvery even element:");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
		
	// Print out the elements of the array in reverse order
		System.out.println("\n\nAll elements in reverse order:");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		
	// Print the first and last elements
		System.out.print("\n\nOnly the first and last elements:\n" + nums[0] + " " + nums[nums.length - 1]);
		

	}

}
