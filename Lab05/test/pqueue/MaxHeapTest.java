package pqueue;
/**
 * @author g_chockler
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MaxHeapTest {
	
	
	
	@Test
	public void testSink() {
		int[] heap = {-1, 20, 18, 17, 16, 15, 13, 14, 10, 9, 1, 4, 2, -1, -1, -1, -1, -1, -1, -1};
		int N = 12;
		System.out.println("Sink test");
		MaxHeap maxHeap = new MaxHeap(heap, N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
		
		heap[4] = 8;
		maxHeap = new MaxHeap(heap, N);
		maxHeap.sink(4, N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
	
		
		heap[1] = heap[N--];
		maxHeap = new MaxHeap(heap, N);
		maxHeap.sink(1, N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
		
		heap[1] = heap[N--];
		maxHeap = new MaxHeap(heap, N);
		maxHeap.sink(1, N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
	}

	@Test
	public void testSwim() {
		int[] heap = {-1, 20, 18, 17, 16, 15, 13, 14, 10, 9, 1, 4, 2, -1, -1, -1, -1, -1, -1, -1};
		int N = 12;
		System.out.println("Swim test");
		MaxHeap maxHeap = new MaxHeap(heap, N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
		
		heap[3] = 100;
		maxHeap = new MaxHeap(heap, N);
		maxHeap.swim(3);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
		
		heap[++N] = 28;
		maxHeap = new MaxHeap(heap, N);
		maxHeap.swim(N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
		
		heap[++N] = 27;
		maxHeap = new MaxHeap(heap, N);
		maxHeap.swim(N);
		System.out.println(maxHeap);
		assertTrue(maxHeap.checkHeapProperty());
	}

}
