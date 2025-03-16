import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

class NodeTest {
	final Integer[] VALUES = { 42, -17, 85, 67 };

	@Test
	void testGetData() {
		for (Integer i : VALUES) {
			Node<Integer> node = new Node<Integer>(i, null, null);
			assertSame(i, node.getData());
		}
	}

	@Test
	void testSetData() {
		Node<Integer> node = new Node<Integer>(0, null, null);
		for (Integer i : VALUES) {
			node.setData(i);
			assertSame(i, node.getData());
		}
	}

	@Test
	void testGetNext() {
		Node<Integer> node0 = new Node<Integer>(VALUES[0], null, null);
		Node<Integer> node1 = new Node<Integer>(VALUES[1], node0, null);
		assertSame(null, node0.getNext());
		assertSame(node0, node1.getNext());
	}

	@Test
	void textSetNext() {
		Node<Integer> node0 = new Node<Integer>(VALUES[0], null, null);
		Node<Integer> node1 = new Node<Integer>(VALUES[1], null, null);
		node1.setNext(node0);
		assertSame(node0, node1.getNext());
	}

	@Test
	void testGetPrev() {
		Node<Integer> node0 = new Node<Integer>(VALUES[0], null, null);
		Node<Integer> node1 = new Node<Integer>(VALUES[1], null, node0);
		assertSame(null, node0.getPrev());
		assertSame(node0, node1.getPrev());
	}

	@Test
	void textSetPrev() {
		Node<Integer> node0 = new Node<Integer>(VALUES[0], null, null);
		Node<Integer> node1 = new Node<Integer>(VALUES[1], null, null);
		node1.setPrev(node0);
		assertSame(node0, node1.getPrev());
	}

}