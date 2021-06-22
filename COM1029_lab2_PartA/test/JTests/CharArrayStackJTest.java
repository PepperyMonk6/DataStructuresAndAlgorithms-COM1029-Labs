package JTests;

import static org.junit.Assert.*;

import org.com1029.lab2.css1ss.CharArrayStack;
import org.junit.Test;

public class CharArrayStackJTest {
	
	@Test
	public void push_test() {
		CharArrayStack st = new CharArrayStack(3);
		st.push('a');
		st.push('b');
		assertEquals('a', st.getStackArray()[0]);
	}
	
	@Test
	public void pop_test() {
		CharArrayStack st = new CharArrayStack(3);
		st.push('a');
		st.push('b');
		st.push('c');
		assertEquals('c', st.pop());
	}
	
	@Test
	public void test_isEmpty() {
		CharArrayStack st1 = new CharArrayStack(4);
		st1.push(']');
		assertEquals(false, st1.isEmpty());
	}
}
