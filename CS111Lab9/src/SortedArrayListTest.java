import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedArrayListTest {
	private static final String[] WORDS = { "f", "a", "c", "e", "b", "d" };
	private static final String[] SORTED = { "a", "b", "c", "d", "e", "f" };

	private static SortedArrayList<String> setup() {
		SortedArrayList<String> list = new SortedArrayList<String>();
		for (int i = 0; i < WORDS.length; i++) {
			list.add(WORDS[i]);
		}
		return list;
	}

	@Test
	void testSortedArrayList() {
		try {
			SortedArrayList<String> list = new SortedArrayList<String>(-1);
		} catch (ListException e) {
			/* pass the test */
			return;
		} catch (Exception e) {
			fail("wrong exception type for negative max size");
		}
		fail("negative max size did not throw exception");
	}

	@Test
	void testIsEmpty() {
		SortedArrayList<String> list = new SortedArrayList<String>();
		assertTrue(list.isEmpty());
		list.add("foo");
		assertFalse(list.isEmpty());
	}

	@Test
	void testIsFull() {
		SortedArrayList<String> list = new SortedArrayList<String>(5);
		for (int i = 0; i < 4; i++) {
			list.add(WORDS[i]);
			assertFalse(list.isFull());
		}
		list.add(WORDS[4]);
		assertTrue(list.isFull());
	}

	@Test
	void testGetMaxSize() {
		SortedArrayList<String> defaultList = new SortedArrayList<String>();
		assertEquals(25, defaultList.getMaxSize());
		SortedArrayList<String> specifiedList = new SortedArrayList<String>(42);
		assertEquals(42, specifiedList.getMaxSize());
	}

	@Test
	void testSize() {
		SortedArrayList<String> list = new SortedArrayList<String>();
		assertEquals(0, list.size());
		for (int i = 0; i < SORTED.length; i++) {
			list.add(SORTED[i]);
			assertEquals(i + 1, list.size());
		}
		for (int i = SORTED.length - 1; i >= 0; i--) {
			list.remove(i);
			assertEquals(i, list.size());
		}
		assertEquals(0, list.size());
	}

	@Test
	void testIndexOfS() {
		SortedArrayList<String> list = setup();
		for (int i = 0; i < SORTED.length; i++) {
			assertEquals(i, list.indexOf(SORTED[i]));
		}
	}

	@Test
	void testIndexOfSInt() {
		SortedArrayList<String> list = setup();
		for (int i = 0; i < SORTED.length; i++) {
			assertEquals(i, list.indexOf(SORTED[i], 0));
			assertEquals(-1, list.indexOf(SORTED[i], i + 1));
		}
	}

	@Test
	void testGet() {
		SortedArrayList<String> list = setup();
		for (int i = 0; i < SORTED.length; i++) {
			assertEquals(SORTED[i], list.get(i));
		}
	}

	@Test
	void testContains() {
		SortedArrayList<String> list = setup();
		for (int i = 0; i < WORDS.length; i++) {
			assertTrue(list.contains(WORDS[i]));
		}
		for (int i = 0; i < WORDS.length; i++) {
			assertFalse(list.contains(WORDS[i].toUpperCase()));
		}
	}

	@Test
	void testAdd() {
		/*
		 * all other tests depend on add() working properly, so the only specific test
		 * is for adding to a full list
		 */
		try {
			SortedArrayList<String> list = new SortedArrayList<String>(1);
			for (int i = 0; i < WORDS.length; i++) {
				list.add(WORDS[i]);
			}
		} catch (ListException e) {
			/* pass the test */
			return;
		} catch (Exception e) {
			fail("wrong exception type for adding to a full list");
		}
		fail("adding to full list did not generate an exception");
	}

	@Test
	void testRemoveAll() {
		SortedArrayList<String> list = setup();
		SortedArrayList<String> list2 = setup();
		assertTrue(list.removeAll(list2));
		assertFalse(list.removeAll(list2));
	}

	@Test
	void testRemoveInt() {
		SortedArrayList<String> list = setup();
		String s = list.remove(0);
		assertFalse(list.contains(SORTED[0]));
		assertEquals(SORTED[0], s);
		
		boolean invalidIndex = false;
		try {
			list.remove(list.size() + 1);
		} catch (ListException e) {
			invalidIndex = true;
		}
		if (invalidIndex == false) {
			fail("passing invalid index did not throw exception");
		}
		
		boolean negativeIndex = false;
		try {
			list.remove(-1);
		} catch (ListException e) {
			negativeIndex = true;
		}
		if (negativeIndex == false) {
			fail("passing negative index did not throw exception");
		}
			
	}

	@Test
	void testRemoveS() {
		SortedArrayList<String> list = setup();
		assertTrue(list.contains(WORDS[0]));
		assertTrue(list.remove(WORDS[0]));
		assertFalse(list.contains(WORDS[0]));
		assertFalse(list.remove(WORDS[0]));
	}

	@Test
	void testClear() {
		SortedArrayList<String> list = setup();
		list.clear();
		assertTrue(list.isEmpty());
	}

	@Test
	void testToString() {
		SortedArrayList<String> list = setup();
		assertEquals("[a, b, c, d, e, f]", list.toString());
	}
}