/**
 * 
 */
package advancedsorting;

import java.util.Random;

/**
 * @author g_chockler
 *
 */
public class CountingSort {
	
	private int[] counts;
	
	public CountingSort(int k) {
		this.counts = new int[k+1];		
	}

	
	public void sort(int[] a) {
		// Initialise the bucket counts
		for (int i = 0; i < counts.length; i ++)
			counts[i] = 0;

		// Allocate an auxiliary array
		int[] aux = new int[a.length];
		
		// Traverse the input array to 
		// compute the element frequencies
		// and update the counts
		for (int i = 0; i < a.length; i++)
			counts[a[i]]++;
		
		// Traverse the bucket counts array
		// and compute the cummulate frequencies
		for (int i = 1; i < counts.length; i++)
			counts[i] += counts[i-1];
		
		// Traverse the input array from 
		// right to left and copy each element
		// into a correct sorted position in the
		// auxiliary array. Make sure the relative
		// order of the elements matching the same
		// bucket is preserved so that the sort
		// is stable.
		for (int i = a.length - 1; i >= 0; i--) {
			aux[counts[a[i]]-1] = a[i];
			counts[a[i]]--;
		}
		
		// Copy the content of the auxiliary
		// array into the input array to obtain
		// the final sorted result.
		for (int i = 0; i < a.length; i++)
			a[i] = aux[i];		
	}
	
	// Use this method to print the content
	// of an integer array nicely.
	public static void printIntArray(int a[]) {
		for (int i = 0; i < a.length - 1; i++)
			System.out.print(a[i] + ", ");
		System.out.println(a[a.length - 1]);
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] a = new int[15];
		
		for (int i = 0; i< a.length; i++)
			// This will generate a random integer
			// between 0 and 10 (inclusive)
			a[i] = r.nextInt(11);
		
		printIntArray(a);
		new CountingSort(10).sort(a);
		printIntArray(a);
		
	}
	
}
