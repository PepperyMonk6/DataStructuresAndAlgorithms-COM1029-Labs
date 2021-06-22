package pqueue;

/**
 * @author g_chockler
 *
 */

import java.util.Arrays;
import java.util.Collections;

public class HeapSort<T extends Comparable<T>> {
	

	/*
	 * TODO:
	 * Copy/paste the code from the sink() method
	 * of MaxPriorityQueue. 
	 * Then, adjust it so it works correctly
	 * when the max element in the heap is in position 0
	 * (and not 1). 
	 * You will only need to adjust the index computation so that 
	 * the index of the left child of k is 2k+1,
	 * and the index of right child of k is 2k+2.
	 */
	public void sink(T[] heap, int k, int N) {
		while (2 * k + 1 < N) {
			// TODO:
			// Your code goes here
			int i = 2*k + 1;
			if (i < N - 1 && heap[i + 1].compareTo(heap[i]) > 0) i++; 
			if(heap[i].compareTo(heap[k]) < 0) break;
			T tmp = heap[i];
			T tmp1 = heap[k];
			heap[i] = tmp1;
			heap[k] = tmp;
			k = i;
		}
	}
	
	/*
	 * TODO: Complete the code
	 */
	public void sort(T[] a) {
		// This loop transforms the array
		// into a valid max heap with the
		// max element at position 0,
		for (int k = a.length / 2 - 1; k >= 0; k--)
			sink(a, k, a.length);
		
		// TODO: Complete the body of the loop. 
		for (int k = a.length - 1; k > 0; k--) {
			// TODO:
			// Swap the max element (it is now
			// at position 0!) with the last.
			T tmp = a[k];
			a[k] = a[0];
			a[0] = tmp;
			
			// TODO:
			// Then use the modified sink method above to
			// bubble down the element in position 0
			// (assuming the heap of size k) 
			// to restore the heap property.
			this.sink(a, 0, k);
		}		
	}
	
	/*
	 * Test if the heap array with the max 
	 * element at position 0 satisfies Heap Property.
	 * Useful for debugging.
	 */
	boolean checkHeapProperty(T[] heap) {
		boolean res = true;
		for (int i = 0; i < heap.length/2; i++) {
			res = heap[i].compareTo(heap[2*i + 1]) >= 0 && (2*i + 2 >= heap.length || heap[i].compareTo(heap[2*i + 2]) >= 0);
			if (!res) break;
		}
		return res;
	}
	
	public static void main(String[] args) {
		HeapSort<Integer> h = new HeapSort<Integer>();
		
		Integer[] heap = {20, 18, 17, 16, 15, 13, 14, 10, 9, 1, 4, 2};
//		Integer[] heap = {20, 19, 40};
		
		System.out.println("This is a valid heap: " + h.checkHeapProperty(heap));
		
		Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Collections.shuffle(Arrays.asList(a));
		
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + ", ");
		
		System.out.println();
		h.sort(a);
		for (long x : a)
			System.out.print(x + ", ");
		System.out.println();
	}
}
