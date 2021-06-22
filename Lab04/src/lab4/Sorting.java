/**
 * Sorting.java
 */

package org.com1029.lab4;

import java.util.*;

/**
 * @author Gregory Chockler
 */

public class Sorting<T extends Comparable<T>> {

	
	
	public void bubbleSort(T[] arr){
		// Basic Bubble Sort
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr.length - 1; j > i; j--) {
				T tmp = arr[j];
				T tmp1 = arr[j - 1];
				if(tmp.compareTo(tmp1) < 0) {
					arr[j] = tmp1;
					arr[j - 1] = tmp;
				}
			}
		}
	}
	
	public void insertionSort(T[] arr){
		// Basic Insertion Sort
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				T tmp = arr[j];
				T tmp1 = arr[j - 1];
				if(tmp.compareTo(tmp1) < 0) {
					arr[j] = tmp1;
					arr[j - 1] = tmp;
				}
			}
		}
	}
	
	
	public void selectionSort(T[] arr) {
		// Selection sort code
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				T tmp = arr[i];
				T tmp1 = arr[j];
				if(tmp1.compareTo(tmp) < 0) {
					arr[i] = tmp1;
					arr[j] = tmp;
				}
			}
		}
	}

	public void adaptiveBubbleSort(T[] arr){
		// Adaptive Bubble Sort
		int tmp2 = 0;
		for(int i = 0; i < arr.length; i = tmp2) {
			if(tmp2 == arr.length - 2) {
				break;
			}
			for(int j = arr.length - 1; j > i; j--) {
				T tmp = arr[j];
				T tmp1 = arr[j - 1];
				
				if(tmp.compareTo(tmp1) < 0) {
					arr[j] = tmp1;
					arr[j - 1] = tmp;
					tmp2 = j;
				}
			}
		}
	}
	
	public void addaptiveInsertionSort(T[] arr){
		// Adaptive Insertion Sort
	}


	public static void main(String[] args) {
		Sorting<Integer> sort = new Sorting<Integer>();
		
		// Some input integer data. Add/remove some numbers,
		// but keep it sorted!
		Integer[] arr = {1, 2, 4, 5, 7, 19, 20, 21}; 
		
		
		// Generate a random shuffle of arr
		Collections.shuffle(Arrays.asList(arr));
		
		// Comment out the above to test on a sorted input (best case)

		// Replace with Collections.reverse to test on a reverse sorted input (worst case)
		
		// Print out input array
		System.out.print("Before sort: ");
		for (Integer n : arr) 
			System.out.print(n + ", ");
		System.out.println();
		
		System.out.print("After bubble sort: ");
		sort.bubbleSort(arr);
		for (Integer n : arr) 
			System.out.print(n + ", ");
		System.out.println();
		
		System.out.print("After insertion sort: ");
		sort.insertionSort(arr);
		for (Integer n : arr) 
			System.out.print(n + ", ");
		System.out.println();
		
		System.out.print("After selection sort: ");
		sort.selectionSort(arr);
		for (Integer n : arr) 
			System.out.print(n + ", ");
		System.out.println();
		
		// Do the same for the adaptive version
	}

}
