// SEE ARRAY REVIEW WORD DOC IN CS111 FOLDER IN FILES

// GET FAMILIAR WITH ARRAYS JDOCS

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview011322 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = {8, 14, 200, 5, 35};
		System.out.println("The starting array is: " + Arrays.toString(nums));
		
		System.out.println("\n\n");

	// Write code to swap the first and last elements
		System.out.println("Write code to swap the first and last elements:");
		
		int numBegin = nums[0];
		int numEnd = nums[nums.length - 1];
		
		nums[nums.length - 1] = numBegin;
		nums[0] = numEnd;
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println("\n\n");
		
	// Print the contents of the array line by line
		System.out.println("Print the contents of the array line by line:");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("\n\n");
		
	// Now backwards
		System.out.println("Now backwards:");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
		System.out.println("\n\n");
		
	// Search the array to see if it contains a specific value and return the index of the value
		System.out.println("Search the array to see if it contains a specific value and return the index of the value:");
		int search = 5;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == search) {
				System.out.println("Index of search: " + i);
			}
		}
		
		System.out.println("\n\n");
		
	// Double the size of the array
		System.out.println("Double the size of the array:");
		
		nums = Arrays.copyOf( nums, nums.length * 2);
		System.out.println("The new array is: " + Arrays.toString(nums));
		
		System.out.println("\n\n");
		
	// Half the size of the array 
		System.out.println("Half the size of the array:");
		
		nums = Arrays.copyOf( nums, nums.length / 4); // nums.length / 4 because i want the original array
		System.out.println("The new array is: " + Arrays.toString(nums));
		
		System.out.println("\n\n");
		
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
	// NEW INFO: MANIPULATING ARRAYS
		
		// Hayhurt's code 
		
		String[] groceryList = new String[10];
		int currentSize=0;
		char quit;
		 
		System.out.println("Would you like to enter a value into your grocery list, Yes to continue, No to exit");
		quit = scan.nextLine().charAt(0); // read a single character

		while( quit != 'n' && quit != 'N' && currentSize < groceryList.length){
		    System.out.println("Please enter an item for the list. This will be item #" + (currentSize+1));
		 
		    groceryList[ currentSize ] = scan.nextLine();
		    currentSize++;
		 
		    System.out.println("Would you like to enter a value into your grocery list, Yes to continue, No to exit");
		    
		    quit = scan.nextLine().charAt(0); // read a single character
		    
		}// end while
		
		System.out.println("\nYour grocery list contans:");
		for (int i = 0; i < groceryList.length && groceryList[i] != null; i++) {
			System.out.println(groceryList[i]);
		}
		
		System.out.println("\n\n");
		
	// What if we wanted to put something at the beginning of the list and not at the end
	// You have to copy and shift the array: You now need the value you want to add and the index you want to add it at
	// More of Hayhurst's code
		
		int[]  values = {7, 99,  0,  0,  0}; // creates a partially filled integer array

		int pos = 1; //  the index at which the new value will be placed
		int newValue = 81;  // new value to be inserted
		currentSize = 2;  // there are two values currently in the array

		// print out the array
		for (int i : values)
		    System.out.print(i + " ");
		System.out.println();

		// MAKE SURE THE ARRAY ISN'T FULL!!!
		// when full currentSize == values.length   (that is the maxsize of the array)
		if ( currentSize < values.length){
		 
		// we have to copy values over one element to make room
		    for (int i=currentSize; i > pos; i--)
		        values[ i ] = values [ i-1 ];
		 
		// now add the new value into the desired index, and increment current size
		    values[ pos ] = newValue;
		     currentSize++;
		}// end if
		 
		for (int i : values)
		    System.out.print(i + " ");

		System.out.println("\n\n");
		
		
		
	// Now do this where we can use user input
		
		int[] values2 = new int[10];
		
		System.out.println("This is the current, unfilled array: " + Arrays.toString(values2));
		
		pos = 0;
		currentSize = values2.length;
		newValue = 0;
		
		// MAKE SURE THE ARRAY ISN'T FULL!!!
		// when full currentSize == values.length   (that is the maxsize of the array)
		if ( currentSize < values.length){
		 
		// we have to copy values over one element to make room
		    for (int i = currentSize; i > pos; i--)
		        values[ i ] = values [ i-1 ];
		 
		// now add the new value into the desired index, and increment current size
		    values[ pos ] = newValue;
		     currentSize++;
		}// end if
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
