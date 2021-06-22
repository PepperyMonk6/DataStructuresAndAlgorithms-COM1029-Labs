/**
 * MSS1Test2.java
 */

package org.com1029.lab1.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class MSS1Test2 {

  @Test
  public void test() {
    ArrayGenerator ag = new ArrayGenerator();
    int [] arr = ag.generate(-20,21,10);
    System.out.println("\n Random array of length 10: {"+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4]+", "+arr[5]+", "+arr[6]+", "+arr[7]+", "+arr[8]+", "+arr[9]+"} \n");
    int [] ans = MSS.mss1(arr);
    System.out.println(" Maximum sum subsequence starts at position "+ans[0]+", ends at position "+ans[1]+", and has sum "+ans[2]+".");
    arr = ag.generate(-20,21,1000);
    System.out.println("\n\n Random array of length 1000 (not printed)");
    ans = MSS.mss1(arr);
    System.out.println(" Maximum sum subsequence starts at position "+ans[0]+", ends at position "+ans[1]+", and has sum "+ans[2]+".");
  }

}
