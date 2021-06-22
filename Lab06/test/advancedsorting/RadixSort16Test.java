/**
 * 
 */
package advancedsorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * @author g_chockler
 *
 */
public class RadixSort16Test {

	/**
	 * Test method for {@link advancedsorting.RadixSort16#sort(int[])}.
	 */
	@Test
	public void testSort() {
		int width = 32 / 4;
		System.out.println("Radix Sort radix=16 test");
		RadixSort16 rs16 = new RadixSort16(width);

		Random r = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] = r.nextInt(Integer.MAX_VALUE);
		}
		RadixSort16.printIntArray(a);
		
		int[] a_copy = Arrays.copyOf(a, a.length);
		
		rs16.sort(a);
		
		RadixSort16.printIntArray(a);

		Arrays.sort(a_copy);
		assertTrue(Arrays.equals(a, a_copy));		
	}
}
