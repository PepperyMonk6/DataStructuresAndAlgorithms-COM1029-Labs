package pqueue;
/**
 * @author g_chockler
 *
 */
public class MaxPriorityQueue<T extends Comparable<T>> {

	private T[] heap;
	private int size;


	@SuppressWarnings("unchecked")
	public MaxPriorityQueue(int capacity) {
		heap = (T[]) new Comparable[capacity + 1]; 
		this.size = 0;
	}

	/*
	 * Copy constructor: must only be used for 
	 * testing, hence, not public
	 */
	MaxPriorityQueue(T[] array, int size) {
		this.heap = array;
		this.size = size;
	}

	/*
	 * TODO:
	 * Copy/paste the relevant sink() code
	 * from MaxHeap, and adjust it to 
	 * work with arbitrary Comparable
	 * types by replacing comparison
	 * operators with compareTo as appropriate.
	 */
	private void sink(int k, int N) {
		while (2*k <= N) {
			//	TODO: Add your code here
			int i = 2*k;
			if (i < N && this.heap[i + 1].compareTo(this.heap[i]) > 0) i++; 
			if(this.heap[i].compareTo(this.heap[k]) < 0) break;
			T tmp = this.heap[i];
			T tmp1 = this.heap[k];
			this.heap[i] = tmp1;
			this.heap[k] = tmp;
			k = i;
		}
	}

	/*
	 * TODO:
	 * Copy/paste the relevant swim() code
	 * from MaxHeap, and adjust it to 
	 * work with arbitrary Comparable
	 * types by replacing comparison
	 * operators with compareTo as appropriate.
	 */
	private void swim(int k) {
		while (k > 1 && heap[k].compareTo(heap[k/2]) > 0) {
			// TODO: Add your code here
			T tmp = this.heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = tmp;
			k /= 2;
		}
	}

	/*
	 * TODO: Complete the implementation
	 */
	public void insert(T item) {
		if (this.size + 1 == heap.length) 
			throw new InsufficientCapacityException();

		// TODO: 
		// Add a new item to the end
		// of the heap, and call 
		// swim to bubble it up to a correct
		// position.
		// Do not forget to update the size
		// as appropriate!
		this.heap[this.size + 1] = item;
		this.swim(this.size + 1);
		this.size = this.size + 1;
	}

	/*
	 * TODO: Complete the implementation
	 */
	public T deleteMax() {
		// TODO:
		// Swap heap[1] with heap[size].
		// Use sink to bubble heap[1]
		// down to a correct position assuming
		// the heap is already one element 
		// smaller (i.e., use sink(1, size - 1)).
		// Then return the element at heap[size],
		// and decrement the heap size.
		T tmp = heap[1];
		this.heap[1] = this.heap[size];
		this.heap[size] = tmp;
		this.sink(1, this.size - 1);
		T tmp1 = this.heap[size];
		this.size -= 1;
		return tmp1; // placeholder to be replaced with your code

	}

	/*
	 * TODO: Complete the implementation
	 */
	public T getMax() {
		if (this.size == 0) throw new EmptyHeapException();
		// TODO: return the max element.
		return heap[1]; // placeholder to be replaced with your code
	}

	/*
	 * TODO: Complete the implementation
	 */
	public boolean isEmpty() {
		if(this.size == 0) {
			return true;
		}
		return false;  // placeholder to be replaced with your code
	}

	/*
	 * This is provided to enable testing
	 */
	public int size() {
		return this.size;
	}

	/*
	 * TODO: Complete the implementation
	 */
	public void clear() {
		// TODO: set the size to 0
		this.size = 0;
	}

	/*
	 * Use the following two methods for
	 * testing/debugging
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{").append(this.size).append(", ");
		sb.append("[");
		int i = 1;
		for (i = 1; i < this.size; i++)
			sb.append(heap[i]).append(", ");
		sb.append(this.size > 0 ? heap[i] : "").append("]}");
		return sb.toString();
	}


	boolean checkHeapProperty() {
		boolean res = true;
		for (int i = 1; i <= this.size/2; i++) {
			res = heap[i].compareTo(heap[2*i]) >= 0 && (2*i >= this.size || heap[i].compareTo(heap[2*i+1]) >= 0);
			if (!res) break;
		}
		return res;
	}

	/*
	 * This method should only be used for testing
	 */
	boolean contains(T item) {
		for (int i = 1; i <= size; i++)
			if (heap[i].equals(item)) return true;
		return false;
	}
}
