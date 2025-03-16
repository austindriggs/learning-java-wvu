import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

class DequeTest {
	final Integer[] VALUES = { 42, -17, 85, 67 };
	
	@Test
	void testAddFirst() {
		Deque<Integer> deque = new Deque<Integer>();
		for (Integer i : VALUES) {
			deque.addFirst(i);
			assertEquals(i, deque.getFirst());
		}
	}

	@Test
	void testRemoveFirstEmpty() {
		Deque<Object> deque = new Deque<Object>();
		try {
			Object obj = deque.removeFirst();
			fail("did not throw an exception");
		} catch (NoSuchElementException e){
			/* test passes silently */
		} catch (Exception e) {
			fail("threw " + e.getClass() + "instead of NoSuchElementException");
		}
	}
	
	@Test
	void testRemoveFirst() {
		Deque<Integer> deque = new Deque<Integer>();
		for (Integer i : VALUES) {
			deque.addFirst(i);
			assertEquals(i, deque.removeFirst());
		}
		for (Integer i : VALUES) {
			deque.addLast(i);
		}
		for (Integer i : VALUES) {
			assertEquals(i, deque.removeFirst());
		}
	}

	@Test
	void testGetFirstEmpty() {
		Deque<Object> deque = new Deque<Object>();
		try {
			Object obj = deque.getFirst();
			fail("did not throw an exception");
		} catch (NoSuchElementException e){
			/* test passes silently */
		} catch (Exception e) {
			fail("threw " + e.getClass() + "instead of NoSuchElementException");
		}
	}
	
	@Test
	void testGetFirst() {
		Deque<Integer> deque = new Deque<Integer>();
		for (Integer i : VALUES) {
			deque.addFirst(i);
			assertEquals(i, deque.getFirst());
		}
	}

	@Test
	void testAddLast() {
		Deque<Integer> deque = new Deque<Integer>();
		for (Integer i : VALUES) {
			deque.addLast(i);
			assertEquals(i, deque.getLast());
		}
	}

	@Test
	void testRemoveLastEmpty() {
		Deque<Object> deque = new Deque<Object>();
		try {
			Object obj = deque.removeLast();
			fail("did not throw an exception");
		} catch (NoSuchElementException e){
			/* test passes silently */
		} catch (Exception e) {
			fail("threw " + e.getClass() + "instead of NoSuchElementException");
		}
	}
	
	@Test
	void testRemoveLast() {
		Deque<Integer> deque = new Deque<Integer>();
		for (Integer i : VALUES) {
			deque.addLast(i);
			assertEquals(i, deque.removeLast());
		}
		for (Integer i : VALUES) {
			deque.addFirst(i);
		}
		for (Integer i : VALUES) {
			assertEquals(i, deque.removeLast());
		}
	}

	@Test
	void testGetLastEmpty() {
		Deque<Object> deque = new Deque<Object>();
		try {
			Object obj = deque.getLast();
			fail("did not throw an exception");
		} catch (NoSuchElementException e){
			/* test passes silently */
		} catch (Exception e) {
			fail("threw " + e.getClass() + "instead of NoSuchElementException");
		}
	}
	
	@Test
	void testGetLast() {
		Deque<Integer> deque = new Deque<Integer>();
		for (Integer i : VALUES) {
			deque.addLast(i);
			assertEquals(i, deque.getLast());
		}
	}

	@Test
	void testSize() {
		Deque<Integer> deque = new Deque<Integer>();
		assertEquals(0, deque.size());
		for (int i = 0; i < VALUES.length; i++) {
			deque.addLast(VALUES[i]);
			assertEquals(i + 1, deque.size());
		}
		for (int i = VALUES.length; i > 0; i--) {
			deque.removeLast();
			assertEquals(i - 1, deque.size());
		}
	}

}