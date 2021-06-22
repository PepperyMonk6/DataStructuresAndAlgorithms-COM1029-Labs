package pqueue;
/**
 * @author g_chockler
 *
 */
public class MaxHeap {
	
	private int[] heap;
	private int size;
		
	// Copy constructor
	// heap must be a valid Max Heap
	MaxHeap(int[] heap, int size) {
//		this.heap = heap.clone(); 
		
//		Once tested, replace this line with the one above
//		to make the array immutable
		this.heap = heap;
		this.size = size;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{").append(this.size).append(", ");
		sb.append("[");
		int i = 1;
		for (i = 1; i < this.size; i++)
			sb.append(heap[i]).append(", ");
		sb.append(heap[i]).append("]}");
		return sb.toString();
	}
	
	/*
	 * Test if the heap array satisfies Heap Property.
	 * Useful for debugging.
	 */
	boolean checkHeapProperty() {
		boolean res = true;
		for (int i = 1; i <= this.size/2; i++) {
			res = heap[i] >= heap[2*i] && (2*i >= this.size || heap[i] >= heap[2*i + 1]);
			if (!res) break;
		}
		return res;
	}
	
	
	/*
	 * TODO: Complete the implementation
	 */
	public void sink(int k, int N) {
		while (2*k <= N) {
			int i = 2*k; // index of the left child of heap[k]
			
			// If the right child of heap[k] is greater than the left,
			// set i to be the index of the right child of heap[k].
			if (i < N && heap[i + 1] > heap[i]) i++; 
			
			// Now i is the index of the max child of heap[k].
			
			// TODO:			
			// Determine if heap[k] needs to be swapped with the
			// max child stored in heap[i].
			// If so, swap heap[k] and heap[i].
			
			// TODO: 
			// If swap occurred, update k to 
			// be the index of the child with which
			// heap[k] was swapped, and proceed
			// to the next iteration.
			// Otherwise, break from the loop.	
			if(heap[i] < heap[k]) break;
			int tmp = heap[k];
			heap[k] = heap[i];
			heap[i] = tmp;
			k = i;
		}
	}
	
	/*
	 * TODO: Complete the implementation
	 */
	public void swim(int k) {
		while (k > 1 && heap[k] > heap[k/2]) {
			// TODO:
			// Swap heap[k] with its parent heap[k/2].
			// Then, set k to point to the index of
			// heap[k]'s parent (and proceed to the
			// next iteration).
			int tmp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = tmp;
			k /= 2;
		}
	}
	
	
	public static void main(String[] args) {
		int[] heap = {0, 10, 9, 8, 7, 6, 5, 4, 0, 0, 0, 0, 0, 0};
		MaxHeap maxHeap = new MaxHeap(heap, 7);
		System.out.println(maxHeap);
		System.out.println("This is " + (maxHeap.checkHeapProperty() ? "a valid" : "an invalid") + " heap");
		System.out.println();
		
		heap[1] = 2;
		System.out.println(maxHeap);
		System.out.println("This is " + (maxHeap.checkHeapProperty() ? "a valid" : "an invalid") + " heap");
		System.out.println();
		
		maxHeap.sink(1, 7);
		System.out.println(maxHeap);
		System.out.println("This is " + (maxHeap.checkHeapProperty() ? "a valid" : "an invalid") + " heap");
		System.out.println();
		
		heap[8] = 100;
		maxHeap = new MaxHeap(heap, 8);
		System.out.println(maxHeap);
		System.out.println("This is " + (maxHeap.checkHeapProperty() ? "a valid" : "an invalid") + " heap");
		System.out.println();
		
		maxHeap.swim(8);
		System.out.println(maxHeap);
		System.out.println("This is " + (maxHeap.checkHeapProperty() ? "a valid" : "an invalid") + " heap");
		System.out.println();
	}
}
