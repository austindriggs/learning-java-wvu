import java.util.Arrays;

public class Lecture3_110322 {

	public static void main(String[] args) {

	// Copy an array into another
		int[]values = {4, 65, 7, 12, 234, 99, 123, 9, -34, 0};
		int[] copyOfValues = Arrays.copyOf(values, values.length);
		
		System.out.println("The orgiinal contains: " + Arrays.toString(values));
		System.out.println("The copy contains: " + Arrays.toString(copyOfValues));
		System.out.println("\n\n");
		
	// Write a method that swaps the first and last elements of the array using the copy of the original array
		swapFirstLast(copyOfValues);
		System.out.println("\n\n");
		
	// Write a method that sets all even numbers to 0
		setToZero(copyOfValues);
		System.out.println("\n\n");
	
	// Write a method that takes the copy of the array and calculates the sum of the elements and returns it to main
		
		int result = sumOfArray(copyOfValues);
		
		System.out.println("The sum of the array elements is: " + result);
		System.out.println("\n\n");
		
	// Add the even elements and subtract the odd elements
		result = alternatingSums(copyOfValues);
		System.out.println("The result of alternating sums is: " + result);
		System.out.println("\n\n");
		
	// Write a method that reverses the elements of the method
		System.out.println("Before reverse: " + Arrays.toString(copyOfValues));
		reverseArray(copyOfValues);
		System.out.println("\n\n");
		
	} // end main
	
	public static void swapFirstLast(int[] nums) {
		
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		
		System.out.println("After swapping first and last: " + Arrays.toString(nums));
		
	}
	
	public static void setToZero(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = 0;
			}
		}
		
		System.out.println("After setting to zero: " + Arrays.toString(nums));
		
	}
	
	public static int sumOfArray(int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		
		return sum;
		
	}
	
	public static int alternatingSums(int[] nums) {
		
		int total = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				total = total + nums[i];
			}
			else {
				total = total - nums[i];
			}
		}
		
		return total;
		
	}
	
	public static void reverseArray(int[] nums) {
		
		int temp;
		int j = 0;
		for (int i = nums.length - 1; i > 0; i--, j++) {
			temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
		}
		
		System.out.println("After reverse: " + Arrays.toString(nums));
		
	}

}
