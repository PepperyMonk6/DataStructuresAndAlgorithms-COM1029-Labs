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
public class RadixSortStringTest {

	/**
	 * Test method for {@link advancedsorting.RadixSortString#sort(java.lang.String[])}.
	 */
	@Test
	public void testSort() {
		final int a_code = 97, z_code = 122;
		int width = 3;
		System.out.println("Radix Sort String test");
		RadixSortString rss = new RadixSortString(width);

		Random r = new Random();
		String[] a = new String[20];
		for (int i = 0; i < a.length; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < width; j++) {
				sb.append(Character.toString(a_code + r.nextInt(z_code - a_code + 1))); 
			}
			a[i] = sb.toString();
		}		
		RadixSortString.printStringArray(a);
		
		String[] a_copy = Arrays.copyOf(a, a.length);
		
		rss.sort(a);
		
		RadixSortString.printStringArray(a);

		Arrays.sort(a_copy);
		assertTrue(Arrays.equals(a, a_copy));
	}

}
