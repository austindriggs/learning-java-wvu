import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecursionTest {
	@Test
	public void testFibonacciInvalid() {
		try {
			Recursion.fibonacci(-1);
		} catch (IllegalArgumentException e) {
			/* pass */
		} catch (Exception e) {
			fail("threw " + e + "instead of IllegalArgumentException");
		}
	}

	@Test
	public void testFibonacci() {
		int[] seq = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 };
		for (int i = 0; i < seq.length; i++) {
			assertEquals(seq[i], Recursion.fibonacci(i));
		}
	}

	@Test
	public void testGreatestCommonDivisor() {
		assertEquals(6, Recursion.greatestCommonDivisor(54, 24));
		assertEquals(6, Recursion.greatestCommonDivisor(54, -24));
		assertEquals(6, Recursion.greatestCommonDivisor(-54, 24));
		assertEquals(6, Recursion.greatestCommonDivisor(-54, -24));
		assertEquals(14, Recursion.greatestCommonDivisor(42, 56));
		assertEquals(21, Recursion.greatestCommonDivisor(1071, 462));
	}

	@Test
	public void testTowersOfHanoiInvalid() {
		try {
			Recursion.towersOfHanoi(0);
		} catch (IllegalArgumentException e) {
			/* pass */
		} catch (Exception e) {
			fail("threw " + e + "instead of IllegalArgumentException");
		}
	}

	@Test
	public void testTowersOfHanoi() {
		int[] moves = { 1, 3, 7, 15, 31, 63, 127 };
		for (int i = 0; i < moves.length; i++) {
			assertEquals(moves[i], Recursion.towersOfHanoi(i + 1));
		}
	}
}