package Jtest;

import static org.junit.Assert.assertEquals;

import org.com1029.lab2.css1ss.CharLinkedStack;
import org.com1029.lab2.css1ss.CharNode;
import org.junit.Test;

public class CharLinkedStackJTest {
	
	@Test
	public void push_test() {
		CharLinkedStack ls = new CharLinkedStack();
		CharNode node = new CharNode('a');
		CharNode node1 = new CharNode('b');
		CharNode node2 = new CharNode('c');
		CharNode node3 = new CharNode('d');
		ls.push(node);
		ls.push(node1);
		ls.push(node2);
		ls.push(node3);
	}
	
	@Test
	public void pop_test() {
		CharLinkedStack ls = new CharLinkedStack();
		CharNode node = new CharNode('a');
		CharNode node1 = new CharNode('b');
		CharNode node2 = new CharNode('c');
		CharNode node3 = new CharNode('d');
		ls.push(node);
		ls.push(node1);
		ls.push(node2);
		ls.push(node3);
		assertEquals('d', ls.pop().getCharacter());
	}
	
	@Test
	public void test_isEmpty() {
		CharLinkedStack ls = new CharLinkedStack();
		CharNode node = new CharNode('a');
		ls.push(node);
		assertEquals(false, ls.isEmpty());
	}
	
	@Test(expected = NullPointerException.class)
		public void empty_Stack_Exception() {
		CharLinkedStack ls = new CharLinkedStack();
		ls.pop();
	}
}
