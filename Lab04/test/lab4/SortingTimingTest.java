/**
 * SortingTimingTest.java
 */

package org.com1029.lab4;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class SortingTimingTest {

  AnimalArrayGenerator cag = new AnimalArrayGenerator();
  Sorting<Cat> srt = new Sorting<Cat>();

  //These can be used to study running times on random inputs of various size
  // (average case running times)
  Cat[] randomCatsAL10000 = cag.generateRandomCatArrayList(1, 10000, 10000).toArray(new Cat[10000]);    
  Cat[] randomCatsAL20000 = cag.generateRandomCatArrayList(1, 10000, 20000).toArray(new Cat[20000]);    
  Cat[] randomCatsAL40000 = cag.generateRandomCatArrayList(1, 10000, 40000).toArray(new Cat[40000]);    
  Cat[] randomCatsAL80000 = cag.generateRandomCatArrayList(1, 10000, 80000).toArray(new Cat[80000]);    
   
  
  @Test
  public void testBubblesort10000(){
    srt.bubbleSort(randomCatsAL10000);
  }
  
  @Test
  public void testBubblesort20000(){
    srt.bubbleSort(randomCatsAL20000);
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
  public void testSelectionsort10000(){
    srt.selectionSort(randomCatsAL10000);
  }
  
  @Test
  public void testSelectionsort20000(){
    srt.selectionSort(randomCatsAL20000);
  }

}
