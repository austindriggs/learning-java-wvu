/*
* @author Austin Driggs
* CS 111 Section 002
* Lab Assignment 1
* Jakob Kaivo
* 1/9/23
* This assignment's purpose is to begin learning about unit testing using JUnit
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RectangleTest {

	/*
	* Class Name: RectangleTest
	* Purpose: The class's purpose is to test the methods width, height, perimeter, and area 
	* in the Rectangle class using multiple test values to determine if class Rectangle
	* works appropriately.
	* Exceptions: N/A
	*/
	
	@Test
	void testWidth() {
		
		/*
		 * Method Name: testWidth
		 * Purpose: Test values into the Rectangle class in order to see if the width method inside of it works
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		// Creating multiple test values
		double width[] = {1.0, 3.0, 6.0};
		double height[] = {2.0, 4.0, 9.0};
		
		// Testing each value
		for (int i = 0; i < width.length; i++) {
			Rectangle rectangle = new Rectangle(width[i], height[i]);
			assertEquals(width[i], rectangle.width());
		}
		
	}

	@Test
	void testHeight() {
		
		/*
		 * Method Name: testHeight
		 * Purpose: Test values into the Rectangle class in order to see if the height method inside of it works
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */

		// Creating multiple test values
		double width[] = {1.0, 3.0, 6.0};
		double height[] = {2.0, 4.0, 9.0};
		
		// Testing each value
		for (int i = 0; i < width.length; i++) {
			Rectangle rectangle = new Rectangle(width[i], height[i]);
			assertEquals(height[i], rectangle.height());
		}
		
	}

	@Test
	void testPerimeter() {

		/*
		 * Method Name: testPerimeter
		 * Purpose: Test values into the Rectangle class in order to see if the perimeter method inside of it works
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		// Creating multiple test values
		double width[] = {1.0, 3.0, 6.0};
		double height[] = {2.0, 4.0, 9.0};

		// Testing each value
		for (int i = 0; i < width.length; i++) {
			Rectangle rectangle = new Rectangle(width[i], height[i]);
			assertEquals((2 * width[i]) + (2 * height[i]), rectangle.perimeter());
		}
		
	}

	@Test
	void testArea() {

		/*
		 * Method Name: testArea
		 * Purpose: Test values into the Rectangle class in order to see if the area method inside of it works
		 * Parameters: width and height
		 * Preconditions: N/A
		 * Postconditions: N/A
		 * Exceptions: N/A
		 */
		
		// Creating multiple test values
		double width[] = {1.0, 3.0, 6.0};
		double height[] = {2.0, 4.0, 9.0};

		// Testing each value
		for (int i = 0; i < width.length; i++) {
			Rectangle rectangle = new Rectangle(width[i], height[i]);
			assertEquals((width[i] * height[i]), rectangle.area());
		}
	}

}
