package JTests;

import static org.junit.Assert.assertEquals;

import org.com1029.lab2.css1ss.CharLinkedList;
import org.com1029.lab2.css1ss.CharNode;
import org.junit.Test;

public class CharLinkedListJTest {
	
	@Test
	public void test_add() {
		CharLinkedList cll = new CharLinkedList();
		CharNode node = new CharNode('a');
		CharNode node1 = new CharNode('b');
		CharNode node2 = new CharNode('c');
		CharNode node3 = new CharNode('d');
		CharNode node4 = new CharNode('q');
		cll.add(0, node);
		cll.add(1, node1);
		cll.add(2, node2);
		cll.add(1, node3);
		cll.add(2, node4);
		assertEquals('q', cll.getNodeAt(2).getData());
	}
	
	@Test
	public void test_remove() {
		CharLinkedList cll = new CharLinkedList();
		CharNode node = new CharNode('a');
		CharNode node1 = new CharNode('b');
		CharNode node2 = new CharNode('c');
		CharNode node3 = new CharNode('d');
		CharNode node4 = new CharNode('q');
		cll.add(0, node);
		cll.add(1, node1);
		cll.add(2, node2);
		cll.add(1, node3);
		cll.add(2, node4);
		cll.remove(0);
		cll.remove(1);
		assertEquals('b', cll.getNodeAt(1).getData());
		//assertEquals('a', cll.remove(0).getData());
	}
	
	@Test(expected = RuntimeException.class)
	public void index_out_of_bounds_add() {
		CharLinkedList cll = new CharLinkedList();
		CharNode node = new CharNode('a');
		cll.add(1, node);
	}
	
	@Test(expected = RuntimeException.class)
	public void index_out_of_bounds_remove() {
		CharLinkedList cll = new CharLinkedList();
		CharNode node = new CharNode('a');
		cll.add(0, node);
		cll.remove(1);
	}
}
