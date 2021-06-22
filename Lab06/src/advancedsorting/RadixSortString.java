/**
 * 
 */
package advancedsorting;

import java.util.Random;

/**
 * @author g_chockler
 *
 */
public class RadixSortString {

	public static final int radix = 256;
	
	private int[] counts;
	private String[] aux;
	private int width;
	
	/*
	 * Creates an instance of RadixSort
	 * to sort strings 
	 * consisting of at most width characters.
	 */
	public RadixSortString(int width) {
		this.width = width;
		this.counts = new int[radix];
	}
	
	/*
	 * Returns the d-th character of x from right.
	 */
	private int getChar(String x, int d) {
		// TODO: replace 0 after return with 
		// a correct expression to extract
		// the d-th character of x from right.
		// Use charAt method of String with 
		// a properly computed argument.
		
		return x.charAt(x.length() - d);
	}
	
	/*
	 * Applies Radix Sort to sort the input array
	 * of strings with each character being a number in 
	 * the radix = 256 (unicode)  
	 * and of maximum length equal to this.width.
	 */
	public void sort(String a[]) {
		this.aux = new String[a.length];
		for (int d = 1; d <= width; d++) {
			// Replace with the Counting Sort
			// code to sort the array a on the d-th character
			// from right.
			// Use getChar() to extract
			// the character at the d-th position from right  
			// from each a[i].

			
			// Uncomment to debug individual digit sorts
			// printStringArray(a);
			int char0 = 0;
			for (int i = 0; i < counts.length; i ++)
				counts[i] = 0;
			
			for (int i = 0; i < a.length; i++) {
				char0 = this.getChar(a[i], d);
				counts[char0]++;
			}
			
			for (int i = 1; i < counts.length; i++)
				counts[i] += counts[i-1];
			
			for (int i = a.length - 1; i >= 0; i--) {
				char0 = this.getChar(a[i], d);
				aux[counts[char0]-1] = a[i];
				counts[char0]--;
			}
				
				for (int i = 0; i < a.length; i++)
					a[i] = aux[i];	
		}
	}
	
	/*
	 * Prints out an array of Strings nicely formatted
	 */
	public static void printStringArray(String a[]) {
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++)
			System.out.print("\"" + a[i] + "\", ");
		System.out.println("\"" + a[a.length - 1] + "\"]");
	}
	
	/*
	 * Sample testing/debugging code.
	 */
	public static void main(String[] args) {
		/*RadixSortString rss = new RadixSortString(5);
		System.out.println(rss.getChar("abcd", 2));*/
		
		final int a_code = 97, z_code = 122;
		
		int width = 3;
		Random r = new Random();
		
		String[] a = new String[10];
		
		for (int i = 0; i < a.length; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < width; j++) {
				sb.append(Character.toString(a_code + r.nextInt(z_code - a_code + 1))); 
			}
			a[i] = sb.toString();
		}
		
		System.out.print("Input array: ");
		printStringArray(a);
		
		new RadixSortString(width).sort(a);
		
		System.out.print("Sorted array: ");
		printStringArray(a);		
	}
	
}
