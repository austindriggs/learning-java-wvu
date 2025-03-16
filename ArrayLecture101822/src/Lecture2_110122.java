import java.util.Arrays;

public class Lecture2_110122 {

	public static void main(String[] args) {

	// My problem
		// int[] aList = new int[10];
		int [] aList = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1};
		
		for (int i = 0; i < aList.length; i++) {
			System.out.print(aList[i] + " ");
		}
		
		System.out.println("\n\n\n");
		
	// Problem 1
		// Declare an integer array names values with 50 elements
		int[] values = new int[50];
		
		// Write a loop that initializes the elements of the array so that fthe first 25 elements contain 10 and the rest contain 20
		for (int i = 0; i < values.length; i++) {
			if (i < 24) {
				values[i] = 10;
			}
			else {
				values[i] = 20;
			}
		}
		
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println("\n" + Arrays.toString(values));
		
		
		System.out.println("\n\n");
		
	// Using FILL, fill array values so that the first 25 elements contain 1 and the rest contain 2
		Arrays.fill(values, 0, 25, 1);
		Arrays.fill(values, 25, 50, 2);
		
		System.out.println(Arrays.toString(values));
		
		System.out.println("\n\n");
		
	// Fill each element in the array with 3 times the index number of the element
		for (int i = 0; i < values.length; i++) {
			values[i] = 3 * i;
		}
		
		System.out.println(Arrays.toString(values));
		
		System.out.println("\n\n");
		
	// Print out the first, last, and middle element in the array
		int[] nums = {43, 77, 12943, -284, 873, 0, 234, 124, 43209, 2920, 294, 284, 28349, 284, 685, 6893, -724};
		
		int middle = nums.length / 2;
		int end = nums.length - 1;
		System.out.println(nums[0] + " " + nums[middle] + " " + nums[end]);
		
		System.out.println("\n\n");
		
	// What is the contents of array a after the follwing loop executes
		int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
		
		for (int i = 1; i < 10; i++) {
			a[i] = a[i] + a[i-1];
		}
		
		// Trace table for this problem
		// i	math		a[i]
		// 1	2 + 1		3
		// 2	3 + 3		6
		// 3	4 + 6		10
		// 4	5 + 10		15
		// 5	4 + 15 		19
		// 6	3 + 19 		22
		// 7	2 + 22		24
		// 8 	1 + 24		25
		// 9	0 + 25		25
		
		// 0 	stays		1
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("\n\n");
		
	// Create a new array containing elemts 5 to 9 of the array nums
		int[] nums2 = Arrays.copyOfRange(nums, 5, 10);
		System.out.println(Arrays.toString(nums2));
		
		System.out.println("\n\n");
		
		int[] nums3 = Arrays.copyOf(nums2, 10);
		System.out.println(Arrays.toString(nums3));
		
//		System.out.println(Arrays.sort(nums));
		
	}

}
