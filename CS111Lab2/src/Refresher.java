/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 2
* Jakob Kaivo
* 1/16/23
* Purpose: To practice manipulating data and refresh knowledge from CS110
*/

public class Refresher {
	
	/*
	* Class Name: Refresher
	* Purpose: The class's purpose is to use the methods in order to manipulate certain data provided in RefresherTest
	* Exceptions: N/A
	*/
	
	public static String swapHalves(String line) {
		
		/*
		 * Method Name: swapHalves
		 * Purpose: Split that String in half and return a new String consisting 
		 * of the two halves swapped.
		 * Parameters: If there are an odd number of characters, include the extra 
		 * character in the first half. 
		 * Preconditions: String line
		 * Postconditions: returning secondHalf + firstHalf
		 * Exceptions: N/A
		 */
		
		String firstHalf, secondHalf;
		
		// If there are an odd number of characters, the extra character is included in the first half
		if (line.length() % 2 == 0) {
			firstHalf = line.substring(0, line.length() / 2);
			secondHalf = line.substring(line.length() / 2);
		}
		else {
			firstHalf = line.substring(0, (line.length() / 2) + 1);
			secondHalf = line.substring( (line.length() / 2) + 1);
		}
		
		return secondHalf + firstHalf;
	}

	public static int countVowels(String line) {
		
		/*
		 * Method Name: countVowels
		 * Purpose: This method takes a String as a parameter and returns the number of 
		 * vowels (A, E, I, O, U, both upper- and lower-case) it contains.
		 * Parameters: N/A
		 * Preconditions: String line
		 * Postconditions: returning the vowelCounter integer
		 * Exceptions: N/A
		 */
		
		int vowelCounter = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'A' || line.charAt(i) == 'a' || 
				line.charAt(i) == 'E' || line.charAt(i) == 'e' || 
				line.charAt(i) == 'I' || line.charAt(i) == 'i' || 
				line.charAt(i) == 'O' || line.charAt(i) == 'o' || 
				line.charAt(i) == 'U' || line.charAt(i) == 'u') {
				
				vowelCounter++;
			}
		}
		
		return vowelCounter;
	}

	public static int getMax(int[] array) {
		
		/*
		 * Method Name: getMax
		 * Purpose: This method takes an array of integers as a parameter, and returns 
		 * the integer with the greatest value.
		 * Parameters: N/A
		 * Preconditions: int[] array
		 * Postconditions: returning max
		 * Exceptions: N/A
		 */
		
		// Setting the maximum to the lowest possible integer value
		int max = Integer.MIN_VALUE;
		
		// If the element at index i is greater than the current max, set it to the new max
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}

	public static boolean isPalindrome(String line) {
		
		/*
		 * Method Name: isPalindrome
		 * Purpose: This method takes a String as a parameter and determines whether it is 
		 * a palindrome (i.e. it is the same forward and backward).
		 * Parameters: N/A
		 * Preconditions: String line
		 * Postconditions: returning true (it is a palindrome) or false (it is NOT a palindrome)
		 * Exceptions: N/A
		 */
		
		for (int i = 0; i < line.length(); i++) {
			// If at any point they don't match, return false
			if (line.charAt(i) != line.charAt(line.length() - (i + 1) )) {
				return false;
			}
		}
		
		// If never returned false, it will automatically return true
		return true;
	}

	public static int factorial(int n) {
		
		/*
		 * Method Name: factorial
		 * Purpose: This method takes an integer as a paramter and returns that 
		 * number's factorial function.
		 * Parameters: n is positive
		 * Preconditions: int n
		 * Postconditions: returning the answer
		 * Exceptions: N/A
		 */
		
		// Start at 1 because 0 * anything = 0
		int answer = 1;
		
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		
		return answer;
	}

	public static int[] getFibonacci(int n) {
		
		/*
		 * Method Name: getFibonacci
		 * Purpose: This method takes an integer as a parameter and returns an array of 
		 * integers. That array has a number of elements equal to the provided integer, 
		 * and consists of the Fibonacci sequence. 
		 * Parameters: Each number in the Fibonacci sequence is the sum of the previous two. For
		 * this assingment, the first number as 0 and the second as 1.
		 * Preconditions: int n
		 * Postconditions: returning the array
		 * Exceptions: N/A
		 */
		
		// Creating a new integer array and setting the first two indexes to 0 and 1
		int[] nums = new int[n];
		nums[0] = 0;
		nums[1] = 1;
		
		for (int i = 2; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i-2];
		}
		
		return nums;
	}

	public static double getC(int a, int b) {
		
		/*
		 * Method Name: getC
		 * Purpose: This method calculates "c" from the Pythogorean Theorem
		 * Parameters: a squared plus b squared equals c squared. 
		 * Preconditions: int (side) a and int (side) b
		 * Postconditions: returning c
		 * Exceptions: N/A
		 */
		
		double c = Math.sqrt( (double)((a * a) + (b * b)) );
		
		return c;
	}

	public static String getWeather(boolean rain, int temperature) {
		
		/*
		 * Method Name: getWeather
		 * Purpose: This method takes a boolean parameter indicating whether it is raining, 
		 * and an integer parameter representing the approximate temperature in degrees Fahrenheit. 
		 * It returns a String describing the weather in a single word.
		 * Parameters: boolean rain and int temperature
		 * Preconditions: Return "Snowy" if it is raining and less than 30 degrees.
		 * Return "Rainy" if it is raining and 30 degrees or more.
		 * Return "Chilly" if it is not raining and less than 30 degrees.
		 * Return "Sunny" if it is not raining and 30 degrees or more.
		 * Postconditions: returning the weather
		 * Exceptions: N/A
		 */
		
		String weather = null;
		
		if (rain) {
			if (temperature < 30) {
				weather = "Snowy";
			}
			else {
				weather = "Rainy";
			}
		}
		if (!rain) {
			if (temperature < 30) {
				weather = "Chilly";
			}
			else {
				weather = "Sunny";
			}
		}
		
		return weather;
	}

	public static boolean containsChar(String line, char x) {
		
		/*
		 * Method Name: containsChar
		 * Purpose: This method takes a String and a char as parameters, and determines 
		 * whether or not the String contains the char. 
		 * Parameters: String line and char x
		 * Preconditions: N/A
		 * Postconditions: returning true (it contains the character) or false (it 
		 * does NOT contains the character).
		 * Exceptions: N/A
		 */
		
		for (int i = 0; i < line.length(); i++) {
			if (x == line.charAt(i)) {
				return true;
			}
		}
		
		return false;
	}

	public static int[][] fillArray(int[][] array) {
		
		/*
		 * Method Name: fillArray
		 * Purpose: This method takes a 2D array of integers as a parameter. It sets all members
		 * of odd rows to 0, and all members of even rows to 1, then returns the filled array.
		 * Parameters: int[][] array
		 * Preconditions: N/A
		 * Postconditions: returning the correctly filled array
		 * Exceptions: N/A
		 */
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// Checking if the row is even or odd
				if (i % 2 == 0) {
					array[i][j] = 1;
				}
				else {
					array[i][j] = 0;
				}
			}
		}
		
		return array;
	}

	public static void printOdd(int[] array) {
		
		/*
		 * Method Name: printOdd
		 * Purpose: This method takes an array of integers as a parameter, and prints (using 
		 * System.out.print(), not System.out.prinln()) all odd integers contained in the array.
		 * Parameters: int[] array
		 * Preconditions: N/A
		 * Postconditions: correctly printing the values expected.
		 * Exceptions: N/A
		 */
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i]);
			}
		}
		
	}

	public static String reverseString(String line) {
		
		/*
		 * Method Name: reverseString
		 * Purpose: This method takes a String as a parameter and returns a new String
		 * made of the same characters in the reverse order. 
		 * Parameters: String line
		 * Preconditions: N/A
		 * Postconditions: returning the reversed string
		 * Exceptions: N/A
		 */
		
		String reversed = "";
		
		for (int i = 0; i < line.length(); i++) {
			char a = line.charAt(line.length() - (i + 1));
			reversed += a;
		}
		
		return reversed;
	}

	public static int[] swap(int[] array, int index1, int index2) {
		
		/*
		 * Method Name: swap
		 * Purpose: This method takes an array of integers and two integers representing 
		 * indices into the array as parameters. The method swaps the values at 
		 * the specified indices and returns the modified array.
		 * Parameters: int[] array, int index1, and int index2
		 * Preconditions: indexes need to be within the bounds
		 * Postconditions: returning the array
		 * Exceptions: N/A (for my code) 
		 */
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		return array;
	}

	public static int reverseInt(int number) {
		
		/*
		 * Method Name: reverseInt
		 * Purpose: This method takes an integer as a parameter. Assuming the number is in
		 * decimal (i.e. base 10), it reverses the order of the digits and returns that number. 
		 * This method must be implemented without converting the integer to a String.
		 * Parameters: int number
		 * Preconditions: N/A
		 * Postconditions: returning reversed number
		 * Exceptions: N/A
		 */
		
		int reversed = 0;
		
		while (number > 0) {
			int remainder = number % 10;
			reversed = reversed * 10 + remainder;
			number /= 10;
		}
		
		return reversed;
	}

	public static int[] rotateArray(int[] array) {
		
		/*
		 * Method Name: rotateArray
		 * Purpose: This method takes an array of integers as a parameter, and shifts each 
		 * integer in the array to one position higher. The final integer in the array 
		 * wraps around to the first position. It returns the rotated array.
		 * Parameters: int[] array
		 * Preconditions: N/A
		 * Postconditions: returning the array
		 * Exceptions: N/A
		 */
		
		// Creating a temporary variable for the last element of the array
		int temp = array[array.length - 1];
		
		// Rotating the elements one index forward
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		// Setting the first element equal to the old last element
		array[0] = temp;
		
		return array;
	}
}