/**
 * SortingTimingTest.java
 */

package org.com1029.lab4;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class SortingTimingFullTest {

	AnimalArrayGenerator cag = new AnimalArrayGenerator();
	Sorting<Cat> srt = new Sorting<Cat>();

	// These can be used to study running times on random inputs of various size
	// (average case running times)
	Cat[] randomCatsAL10000 = cag.generateRandomCatArrayList(1, 10000, 10000).toArray(new Cat[10000]);    
	Cat[] randomCatsAL20000 = cag.generateRandomCatArrayList(1, 10000, 20000).toArray(new Cat[20000]); 
	Cat[] randomCatsAL40000 = cag.generateRandomCatArrayList(1, 10000, 40000).toArray(new Cat[40000]); 
	Cat[] randomCatsAL80000 = cag.generateRandomCatArrayList(1, 10000, 80000).toArray(new Cat[80000]); 
	Cat[] randomCatsAL160000 = cag.generateRandomCatArrayList(1, 10000, 160000).toArray(new Cat[160000]);
	Cat[] randomCatsAL320000 = cag.generateRandomCatArrayList(1, 10000, 320000).toArray(new Cat[320000]);


	// These can be used to study running times on ordered inputs of various size
	// (best case running times)
	Cat[] orderedCatsAL10000 = cag.generateOrderedCatArrayList(1, 10000).toArray(new Cat[10000]); 
	Cat[] orderedCatsAL20000 = cag.generateOrderedCatArrayList(1, 20000).toArray(new Cat[20000]); 
	Cat[] orderedCatsAL40000 = cag.generateOrderedCatArrayList(1, 40000).toArray(new Cat[40000]); 
	Cat[] orderedCatsAL80000 = cag.generateOrderedCatArrayList(1, 80000).toArray(new Cat[80000]); 
	Cat[] orderedCatsAL160000 = cag.generateOrderedCatArrayList(1, 160000).toArray(new Cat[160000]);
	Cat[] orderedCatsAL320000 = cag.generateOrderedCatArrayList(1, 320000).toArray(new Cat[320000]);
	

	// These can be used to study running times on reverse ordered inputs of various size
	// (worst case running times)
	Cat[] reverseOrderedCatsAL10000 = cag.generateReverseOrderedCatArrayList(1, 10000).toArray(new Cat[10000]);
	Cat[] reverseOrderedCatsAL20000 = cag.generateReverseOrderedCatArrayList(1, 20000).toArray(new Cat[20000]); 
	Cat[] reverseOrderedCatsAL40000 = cag.generateReverseOrderedCatArrayList(1, 40000).toArray(new Cat[40000]); 
	Cat[] reverseOrderedCatsAL80000 = cag.generateReverseOrderedCatArrayList(1, 80000).toArray(new Cat[80000]); 
	Cat[] reverseOrderedCatsAL160000 = cag.generateReverseOrderedCatArrayList(1, 160000).toArray(new Cat[160000]);
	Cat[] reverseOrderedCatsAL320000 = cag.generateReverseOrderedCatArrayList(1, 320000).toArray(new Cat[320000]);
	
	@Test
	public void testBubblesort10000(){
		// this is an example of running a sorting algorithm on a randomly
		// chosen input (to test average running times); replace with either ordered or reverse ordered
		// arrays above to test best/worst running times.
		srt.bubbleSort(randomCatsAL10000);
	}

	@Test
	public void testBubblesort20000(){
		srt.bubbleSort(randomCatsAL20000);
	}

	@Test
	public void testBubblesort40000(){
		srt.bubbleSort(randomCatsAL40000);
	}

	@Test
	public void testBubblesort80000(){
		srt.bubbleSort(randomCatsAL80000);
	}

	@Test
	public void testInsertionsort10000(){
		srt.bubbleSort(randomCatsAL10000);
	}

	@Test
	public void testInsertionsort20000(){
		srt.bubbleSort(randomCatsAL20000);
	}

	@Test
	public void testInsertionsort40000(){
		srt.insertionSort(randomCatsAL40000);
	}

	@Test
	public void testInsertionsort80000(){
		srt.insertionSort(randomCatsAL80000);
	}


	@Test
	public void testSelectionsort10000(){
		srt.selectionSort(randomCatsAL10000);
	}

	@Test
	public void testSelectionsort20000(){
		srt.selectionSort(randomCatsAL20000);
	}

	@Test
	public void testSelectionsort40000(){
		srt.selectionSort(randomCatsAL40000);
	}

	@Test
	public void testSelectionsort80000(){
		srt.selectionSort(randomCatsAL80000);
	}
	
	
}
