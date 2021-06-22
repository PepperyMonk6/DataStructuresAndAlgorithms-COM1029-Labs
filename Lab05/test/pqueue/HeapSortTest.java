package pqueue;
/**
 * @author g_chockler
 *
 */
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class HeapSortTest {
	
	@Test
	public void testSink() {
		HeapSort<Integer> hs = new HeapSort<Integer>();
		
		Integer[] heap = {20, 18, 17, 16, 15, 13, 14, 10, 9, 1, 4, 2};
		int N = 12;
		System.out.println("Sink test");
		
		heap[4] = 8;
		hs.sink(heap, 4, N);
		
		for (int x : heap)
			System.out.print(x + ", ");
		System.out.println();
		assertTrue(hs.checkHeapProperty(heap));
		
		heap = new Integer[] {7, 18, 17, 16, 15, 13, 14, 10, 9, 1, 4, 2};
		hs.sink(heap, 0, N);
		for (int x : heap)
			System.out.print(x + ", ");
		System.out.println();
		assertTrue(hs.checkHeapProperty(heap));
	}


	@Test
	public void testSort() {
		System.out.println("Sort test");
		HeapSort<Integer> hs = new HeapSort<Integer>();

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
