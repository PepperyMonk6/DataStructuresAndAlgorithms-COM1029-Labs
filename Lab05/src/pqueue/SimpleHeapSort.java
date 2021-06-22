package pqueue;
/**
 * @author g_chockler
 *
 */
import java.util.Arrays;
import java.util.Collections;

public class SimpleHeapSort<T extends Comparable<T>> {
	
	/*
	 * TODO: Complete the implementation
	 */
	public void sort(T[] a) {
		MaxPriorityQueue<T> mpq = new MaxPriorityQueue<T>(a.length);
		// TODO: 
		// insert the items in the input array
		// into mpq one by one.
		// Then delete the max element from mpq
		// in a loop filling out the original array 
		// starting from the last element down.
		for(int i = 0; i < a.length; i++) {
			mpq.insert(a[i]);
		}

		for(int i = a.length - 1; i >= 0; i--) {
			a[i] = mpq.deleteMax();
			
		}
	}
		
	public static void main(String[] args) {
		SimpleHeapSort<Integer> h = new SimpleHeapSort<Integer>();
		
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
