	package advancedsorting;

	import static org.junit.Assert.assertTrue;

	import java.util.Arrays;
	import java.util.Random;

	/**
	 * @author g_chockler
	 *
	 */
	public class MergeSort {

		private int[] aux;

		/*
		 * Optimised Merge Sort: 
		 * Reuses just one extra array (aux)
		 * across all recursive calls 
		 */
		public void sort(int[] a) {
			aux = new int[a.length];
			mergesort(a, 0, a.length - 1);
		}

		private void mergesort(int[] a, int left, int r) {
			if (r <= left) return;
			int mid = (left + r) / 2;
			mergesort(a, left, mid);
			mergesort(a, mid + 1, r);		
			merge(a, left, mid, r);		
		}

		private void merge(int[] a, int left, int mid, int right) {
			int i = left, j = mid + 1, k = left;
			while (i <= mid && j <= right) {
				// TODO: Test a[i] against a[j] and
				// copy either one into aux based
				// on the outcome of the comparison
			}
			while (i <= mid) {
				// TODO: elements left in the left
				// half; copy them to aux
			}
			while (j <= right) {
				// TODO: elements left in the right
				// half; copy them to aux
			}
			for(k = left; k <= right; k++)
				a[k] = aux[k];
		}
		
		
		/*
		 * Simple, but wasteful (in terms of memory)
		 * merge sort.
		 */
		public static int[] mergeSort(int[] a) {
			
			if (a.length <= 1) return a;		
			int mid = a.length / 2;
			int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
			int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));
			return merge(left, right);		
		}
		
		public static int[] merge(int[] left, int[] right) {
			int[] result = new int[left.length + right.length];
			int l_index = 0, r_index = 0, res_index = 0;
			while (l_index < left.length && r_index < right.length) {
				if (left[l_index] <= right[r_index])
					result[res_index++] = left[l_index++];
				else
					result[res_index++] = right[r_index++];
			}
			while (l_index < left.length) 
				result[res_index++] = left[l_index++];
			while (r_index < right.length)
				result[res_index++] = right[r_index++];
			return result;
		}
		// End of simple merge sort

		public static void printIntArray(int a[]) {
			for (int i = 0; i < a.length - 1; i++)
				System.out.print(a[i] + ", ");
			System.out.println(a[a.length - 1]);
		}

		public static void main(String[] args) {
			Random r = new Random();

			int[] a = new int[100000];
			//		int[] a = {18, 3, 14, 1, 1};

			for (int j = 0; j < 10; j++) {
				for (int i = 0; i< a.length; i++)
					a[i] = r.nextInt(200);



				int[] a_copy = Arrays.copyOf(a, a.length);
				new MergeSort().sort(a);

				Arrays.sort(a_copy);
				boolean equal = Arrays.equals(a, a_copy);
				System.out.println(equal);
				assertTrue(equal);
			}
			
			int[] left = new int[10];
			int[] right = new int[15];
			for (int i = 0; i< left.length; i++) 
				left[i] = r.nextInt(100);
			for (int i = 0; i< right.length; i++) 
				right[i] = r.nextInt(100);
			new MergeSort().sort(left);
			new MergeSort().sort(right);
			printIntArray(merge(left, right));
			
			int[] b = new int[10];
			for (int i = 0; i < b.length; i++) 
				b[i] = r.nextInt(100);
			printIntArray(b);
			printIntArray(mergeSort(b));

		}

	}
