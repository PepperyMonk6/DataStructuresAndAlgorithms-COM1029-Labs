package org.com1029.lab1.css1ss;

/**
 *  ArrayGenerator.java
 *  
 *  A class that generates arrays containing random integers
 *  
 *  @author steveschneider
 */

import java.util.Random;	

public class ArrayGenerator {

	Random generator = new Random();
/**
 * 	
 * @param min
 *      the minimum value that entries in the array can take
 * @param max
 *      the maximum value that entries in the array can take
 * @param size
 *      the size of the array
 * @return
 *      returns an array of length 'size' with entries between min and max.
 */
	public int[] generate(int min, int max, int size){
		int[] arr = new int[size];
		int range = max - min;
		for(int i=0;i<size;i++){
			arr[i] = (generator.nextInt(range) + min);	
//			System.out.print(arr[i]+",");
		}
		return arr;
			
	}
	
/**
 * 	
 * @param min
 *      the minimum value that entries in the array can take
 * @param max
 *      the maximum value that entries in the array can take
 * @param size
 *      the array is 2d, of dimensions size * size
 * @return
 *      returns an array of size * size.
 *      
 *      Prints out the rows of the array as it is generating them
 *      To prevent this, comment out the two lines containing System.out.print
 */
	
  public int[][] generate2d(int min, int max, int size){
    int[][] arr = new int[size][size];
    int range = max - min;
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
      arr[i][j] = (generator.nextInt(range) + min);  
//       System.out.print(arr[i][j]+",");
      }
//      System.out.print("\n");
    }
    return arr;
      
  }
  
}

