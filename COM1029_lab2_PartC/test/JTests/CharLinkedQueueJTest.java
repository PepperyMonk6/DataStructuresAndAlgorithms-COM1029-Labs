package JTests;

import static org.junit.Assert.assertEquals;

import org.com1029.lab2.css1ss.CharLinkedQueue;
import org.com1029.lab2.css1ss.CharNode;
import org.junit.Test;

public class CharLinkedQueueJTest {
	
	@Test
	public void test_enqueue() {
		CharLinkedQueue clq = new CharLinkedQueue();
		CharNode node = new CharNode('a');
		CharNode node1 = new CharNode('b');
		CharNode node2 = new CharNode('c');
		clq.enQueue(node);
		clq.enQueue(node1);
		clq.enQueue(node2);
	}
	
	@Test
	public void test_dequeue() {
		CharLinkedQueue clq = new CharLinkedQueue();
		CharNode node = new CharNode('a');
		CharNode node1 = new CharNode('b');
		CharNode node2 = new CharNode('c');
		clq.enQueue(node);
		clq.enQueue(node1);
		clq.enQueue(node2);
		assertEquals('a', clq.deQueue().getData());
	}
	
	@Test
	public void test_isEmpty() {
		CharLinkedQueue clq = new CharLinkedQueue();
		CharNode node = new CharNode('a');
		clq.enQueue(node);
		assertEquals(false, clq.isEmpty());
	}
}
