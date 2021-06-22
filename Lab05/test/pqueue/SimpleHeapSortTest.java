package pqueue;
/**
 * @author g_chockler
 *
 */
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class SimpleHeapSortTest {

	@Test
	public void testSort() {
		System.out.println("Sort test");
		SimpleHeapSort<Integer> hs = new SimpleHeapSort<Integer>();

		Random r = new Random();
		Integer[] a = new Integer[20];
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + ", ");
		}
		System.out.println("]");
		
		Integer[] a_copy = Arrays.copyOf(a, a.length);

//		Collections.shuffle(Arrays.asList(a));
		
		hs.sort(a);
		
		System.out.print("[");
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + ", ");
		System.out.println("]");

		Arrays.sort(a_copy);
		assertTrue(Arrays.equals(a, a_copy));
		
	}

}
