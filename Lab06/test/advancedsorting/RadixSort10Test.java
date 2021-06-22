package advancedsorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * 
 */

/**
 * @author g_chockler
 *
 */
public class RadixSort10Test {

	/**
	 * Test method for {@link advancedsorting.RadixSort10#sort(int[])}.
	 */
	@Test
	public void testSort() {
		int width = 4;
		System.out.println("Radix Sort radix=10 test");
		RadixSort10 rs10 = new RadixSort10(width);

		Random r = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] = r.nextInt((int)Math.pow(10, width));
		}
		RadixSort10.printIntArray(a);
		
		int[] a_copy = Arrays.copyOf(a, a.length);
		
		rs10.sort(a);
		
		RadixSort10.printIntArray(a);

		Arrays.sort(a_copy);
		assertTrue(Arrays.equals(a, a_copy));		
	}

}
