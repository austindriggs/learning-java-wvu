import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class TreeTest {
	private final String[] STRINGS = { "Dwalin", "Balin", "Kili", "Fili", "Dori", "Nori", "Ori", "Oin", "Gloin", "Bifur", "Bofure", "Bombur", "Thorin" };

	@Test
	public void testEmptyConstructorAndAddAndContains() {
		Tree<String> t = new Tree<String>();
		for (String s : STRINGS) {
			t.add(s);
		}
		for (String s : STRINGS) {
			assertTrue(t.contains(s));
		}
	}

	@Test
	public void testArrayConstructorAndToString() {
		Tree<String> t = new Tree<String>(STRINGS);
		String[] sorted = STRINGS.clone();
		Arrays.sort(sorted);
		assertEquals(Arrays.toString(sorted), t.toString());
	}

	@Test
	public void testEmptyConstructorAndEmptyToString() {
		Tree<String> t = new Tree<String>();
		assertEquals("[]", t.toString());
	}

	@Test
	public void testOneElementConstructorAndToString() {
		Tree<String> t = new Tree<String>(STRINGS[0]);
		assertEquals("[" + STRINGS[0] + "]", t.toString());
	}
}