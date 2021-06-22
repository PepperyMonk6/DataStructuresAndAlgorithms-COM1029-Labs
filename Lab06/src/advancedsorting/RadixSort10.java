/**
 * 
 */
package advancedsorting;

import java.util.Random;

/**
 * @author g_chockler
 *
 */
public class RadixSort10 {

	public static final int radix = 10;

	private int[] counts;
	private int[] aux;
	private int width;

	/*
	 * Creates an instance of RadixSort
	 * to sort decimal integers (radix = 10)
	 * consisting of at most width digits.
	 */
	public RadixSort10(int width) {
		// Initialise width and counts
		this.width = width;
		this.counts = new int[radix];
	}

	/*
	 * Computes the d-th digit from right of x
	 * in the given radix.
	 */
	private int getDigit(int x, int d) {
		// TODO: replace 0 after return 
		// with an expression to compute the
		// d-th digit from right of x in the 
		// given radix. Consult the lab handout
		// for guidance.
		
		return (int) ((x / Math.pow(10, d - 1)) % 10);
	}

	/*
	 * Applies Radix Sort to sort the input array
	 * of integers in the radix 10 (decimals)
	 * and of maximum width (number of digits) of this.width.
	 */
	public void sort(int a[]) {
		this.aux = new int[a.length];
		for (int d = 1; d <= width; d++) {
			int digit = 0;
			// Replace with the Counting Sort
			// code to sort the array a on the d-th digit
			// from right.
			// Use getDigit() to extract
			// the digit to sort on from each a[i].

			// Uncomment to debug individual digit sorts
			// printIntArray(a);
			for (int i = 0; i < counts.length; i ++)
				counts[i] = 0;
			
			for (int i = 0; i < a.length; i++) {
				digit = this.getDigit(a[i], d);
				counts[digit]++;
			}
			
			for (int i = 1; i < counts.length; i++)
				counts[i] += counts[i-1];
			
			for (int i = a.length - 1; i >= 0; i--) {
				digit = this.getDigit(a[i], d);
				aux[counts[digit]-1] = a[i];
				counts[digit]--;
			}
				
				for (int i = 0; i < a.length; i++)
					a[i] = aux[i];	
		}
	}

	/*
	 * Prints out an array of integers nicely formatted
	 */
	public static void printIntArray(int a[]) {
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++)
			System.out.print(a[i] + ", ");
		System.out.println(a[a.length - 1] + "]");
	}

	/*
	 * Sample testing/debugging code.
	 */
	public static void main(String[] args) {
		// Numbers of 4 decimal digits long
		/*RadixSort10 rs10 = new RadixSort10(4);
		System.out.println(rs10.getDigit(123412366, 8));*/
		
		int width = 4;

		Random r = new Random();

		int[] a = new int[10];

		for (int i = 0; i< a.length; i++)
			// Random integer between 0 and 10^width (exclusive)
			a[i] = r.nextInt((int)Math.pow(10, width));

		System.out.print("Input array: ");
		printIntArray(a);

		new RadixSort10(width).sort(a);

		System.out.print("Sorted array: ");
		printIntArray(a);	
	}

}
