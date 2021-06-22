package org.com1029.lab1.css1ss;

/**
 * MSS.java
 * 
 * Three methods which compute the maximal sum segment of an array of integers
 * with various degrees of efficiency.
 * 
 * @author steve schneider, for COM1029 lab
 *
 */

public class MSS {

/**
 * Method to compute the maximal sub subsequence of an array of integers
 *  	
 * @param arr
 *      The array on which to perform the computation
 * @return
 *      Three values (returned as an array): the start and finish of the 
 *      maximal subsequence, and the sum of the values of that subsequence.
 */
	
  static public int sequenceSum(int [] arr, int i, int j){
    // returns the sum of the elements of arr from i to j inclusive
    // Insert your code here
    return 0;
  }

  
  static public int[] mss1(int [] arr){
    int i = 0;
    int j = 0;
    int sum = 0;
		// Implement the first attempt at computing maximal sum subsequence of an array
		// uses two nested loops and a call to sequenceSum defined above.
    // as described in Lecture 3, slides 9-10
    // i should be the start of the maximum sum subsequence
    // j should be the end of the maximum sum subsequence
    // maxSoFar should be the sum of that subsequence
    int [] ans = {i,j,sum};   
    return ans;
	}	

/**
 * Another method to compute the maximal sub subsequence of an array of integers
 * 	
 * @param arr
 *      The array on which to perform the computation
 * @return
 *      Three values (returned as an array): the start and finish of the 
 *      maximal subsequence, and the sum of the values of that subsequence.
 */
	
	static public int[] mss2(int [] arr){
		// provide the second version of maxSubsequence here 
		// (with only two nested loops)
	  // As described in Lecture 3, slides 12-13
    int [] ans = {0,0,0};  // these are dummy values
    return ans;
	}

/**
 * A third method to compute the maximal sub subsequence of an array of integers
 * 	
 * @param arr
 *      The array on which to perform the computation
 * @return
 *      Three values (returned as an array): the start and finish of the 
 *      maximal subsequence, and the sum of the values of that subsequence.
 */
		
	static public int[] mss3(int [] arr){
		// provide the third version of maxSubsequence here 
		// (which has a single loop, with no nesting)
	  // as described in Lecture 3 slide 19
    int [] ans = {0,0,0};   // these are dummy values
    return ans;
	}
	
}

