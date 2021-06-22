/**
 * 
 */
package advancedsorting;

import java.util.Random;

/**
 * @author g_chockler
 *
 */
public class RadixSort16 {

	public static final int radix = 16;

	private int[] counts;
	private int[] aux;
	private int width;

	/*
	 * Creates an instance of RadixSort
	 * to sort decimal integers (radix = 16)
	 * consisting of at most width digits.
	 */
	public RadixSort16(int width) {
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
		return (int) ((x / Math.pow(16, d - 1)) % 16);
	}

	private int getDigitBin(int x, int d) {
		// TODO: 
		// Use bitwise operators to compute
		// the d-th digit from right of x
		// in the given radix.
		// Consult the lab handout
		// for guidance.
		return 0;
	}

	/*
	 * Applies Radix Sort to sort the input array
	 * of integers in the radix 16 (decimals)
	 * and of maximum width (number of digits) of this.width.
	 */
	public void sort(int a[]) {
		this.aux = new int[a.length];
		for (int d = 1; d <= width; d++) {
			// Replace with the Counting Sort
			// code to sort the array a on the d-th digit
			// from right.
			// Use getDigit() or getDigitBin to extract
			// the digit to sort on from each a[i].

			// Uncomment to debug individual digit sorts
			// printIntArray(a);
			int digit = 0;
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
		// A 32-bit integer will have
		// 8 digits in radix 16
		
		/*RadixSort16 rs = new RadixSort16(4);
		System.out.println(rs.getDigit(0x12345, 4));*/
		int width = 32 / 4;

		Random r = new Random();

		int[] a = new int[10];

		for (int i = 0; i< a.length; i++)
			// Random integer between 0 and 2^32-1 (inclusive)
			a[i] = r.nextInt((int)Math.pow(2, Integer.MAX_VALUE));

		System.out.print("Input array: ");
		printIntArray(a);

		new RadixSort16(width).sort(a);

		System.out.print("Sorted array: ");
		printIntArray(a);
	}

}
