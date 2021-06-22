package pqueue;
/**
 * @author g_chockler
 *
 */
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import org.junit.Test;

public class MaxPriorityQueueTest {

	@Test
	public void testInsert() {
		Random r = new Random();
		System.out.println("Insert test");
		MaxPriorityQueue<Integer> mpq = new MaxPriorityQueue<Integer>(100);

		for (int i = 0; i < 16; i++) {		
			int item = r.nextInt(100);
			mpq.insert(item);
			System.out.println(mpq);
			assertTrue(mpq.contains(item));
			assertTrue(mpq.checkHeapProperty());
		}		
	}

	@Test
	public void testDeleteMax() {
		System.out.println("Delete max test");
		Integer[] array = {null, 95, 57, 93, 55, 27, 88, 35, 18, 20, 3, 8, 30, 52, 16, 25, 1};
		Integer[] sorted = Arrays.copyOfRange(array, 1, array.length);
		Arrays.sort(sorted, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1.compareTo(o2) != 0)
					return -o1.compareTo(o2);
				return 0;
			}
			
		});
		MaxPriorityQueue<Integer> mpq = new MaxPriorityQueue<Integer>(array, 16);

		for (int i = 0; i < 8; i++) {		
			int max = mpq.deleteMax();
			System.out.println(mpq);
			assertTrue(max == sorted[i]);
			assertFalse(mpq.contains(sorted[i]));
			assertTrue(mpq.checkHeapProperty());
		}		
	}

	@Test
	public void testGetMax() {
		System.out.println("Get max test");
		Integer[] array = {null, 95, 57, 93, 55, 27, 88, 35, 18, 20, 3, 8, 30, 52, 16, 25, 1};
		MaxPriorityQueue<Integer> mpq = new MaxPriorityQueue<Integer>(array, 16);
		System.out.println(mpq);
		assertTrue(95 == mpq.getMax());
		
		array = new Integer[] {null, 30, 27, 25, 20, 8, 1, 3, 18, 16};
		mpq = new MaxPriorityQueue<Integer>(array, 9);
		System.out.println(mpq);
		assertTrue(30 == mpq.getMax());
		
		array = new Integer[] {null, 30};
		mpq = new MaxPriorityQueue<Integer>(array, 1);
		System.out.println(mpq);
		assertTrue(30 == mpq.getMax());
	}

	@Test
	public void testIsEmpty() {
		System.out.println("Is empty test");
		MaxPriorityQueue<Integer> mpq = new MaxPriorityQueue<Integer>(100);
		System.out.println(mpq);
		assertTrue(mpq.isEmpty());
		
		Integer[] array = {null, 95, 57, 93, 55, 27, 88, 35, 18, 20, 3, 8, 30, 52, 16, 25, 1};
		mpq = new MaxPriorityQueue<Integer>(array, 16);
		System.out.println(mpq);
		assertFalse(mpq.isEmpty());
	}

	@Test
	public void testSize() {
		System.out.println("Size test");
		MaxPriorityQueue<Integer> mpq = new MaxPriorityQueue<Integer>(100);
		System.out.println(mpq);
		assertTrue(mpq.size() == 0);
		
		Integer[] array = {null, 95, 57, 93, 55, 27, 88, 35, 18, 20, 3, 8, 30, 52, 16, 25, 1};
		mpq = new MaxPriorityQueue<Integer>(array, 16);
		System.out.println(mpq);
		assertTrue(mpq.size() == 16);
	}

	@Test
	public void testClear() {
		System.out.println("Clear test");
		Integer[] array = {null, 95, 57, 93, 55, 27, 88, 35, 18, 20, 3, 8, 30, 52, 16, 25, 1};
		MaxPriorityQueue<Integer> mpq = new MaxPriorityQueue<Integer>(array, 16);
		mpq.clear();
		System.out.println(mpq);
		assertTrue(mpq.size() == 0);
	}

}
