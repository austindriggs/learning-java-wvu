import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.io.*;

public class MyStringTest {
	@Test
	public void testMyStringString() {
		MyString mystr = new MyString("test");
		assertEquals("test", mystr.toString());
	}

	@Test
	public void testToString() {
		MyString mystr = new MyString("test");
		String str = mystr.toString();
		assertEquals("test", str);
	}

	@Test
	public void testClone() {
		MyString mystr = new MyString("test");
		MyString clone = mystr.clone();
		assertEquals(mystr.toString(), clone.toString());
		assertNotSame(mystr.toString(), clone.toString());
	}

	@Test
	public void testCompareTo() {
		MyString[] arr = { new MyString("a"), new MyString("A"), new MyString("b"), new MyString("aa") };
		Arrays.sort(arr);
		assertEquals("A", arr[0].toString());
		assertEquals("a", arr[1].toString());
		assertEquals("aa", arr[2].toString());
		assertEquals("b", arr[3].toString());
	}
}