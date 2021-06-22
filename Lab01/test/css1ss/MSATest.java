/**
 * MSATest.java
 */

package org.com1029.lab1.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class MSATest {
  
  int[][] arr1 =  {{1,2,-3,-4,5},{2,-3,-4,5,6},{-3,-4,5,6,-7},{4,-5,6,-7,8},{-5,6,-7,8,-9}};
  int[][] arr2 =  {{1,2,3,-4,5},{2,-3,4,5,6},{-3,-4,5,6,-7},{4,-5,6,-7,-8},{-5,6,-7,8,-9}};
  int[][] arr3 =  {{1,2,3,4,5},{2,-3,-4,-5,6},{3,-4,5,6,-7},{4,5,6,7,8},{-5,6,-7,8,9}};
  int[][] arr4 =  {{1,2,-3,4,-5},{2,-3,-4,-5,6},{-3,-4,-5,6,-7},{4,5,6,7,8},{-5,6,-7,-8,9}};
  int[][] arr5 =  {{1,2,-3,4,-5},{-2,3,-4,-5,6},{-3,-4,-5,6,-7},{4,5,-6,-7,-8},{-5,6,-7,-8,9}};
  int[][] arr6 =  {{1,2,-3,4,-5},{2,-3,-4,-5,6},{-3,-4,-5,106,-7},{4,5,6,-7,8},{-5,6,-7,-8,9}};

  @Test
  public void areaSumTest() {
    int ans = MSA.areaSum(1,2,3,4,arr1);
    assertEquals(18,ans);
    ans = MSA.areaSum(3,2,3,4,arr2);
    assertEquals(-9,ans);
    ans = MSA.areaSum(0,2,4,2,arr3);
    assertEquals(3,ans);
  }
  
  
  @Test
  public void maxSumAreaTest() {
    int[] ans = MSA.maxSumArea(arr1);
    System.out.println("answer = ("+ans[0]+","+ans[1]+"), ("+ans[2]+","+ans[3]+"), with sum "+ans[4]);
    assertEquals(18,ans[4]);
    ans = MSA.maxSumArea(arr2);
    System.out.println("answer = ("+ans[0]+","+ans[1]+"), ("+ans[2]+","+ans[3]+"), with sum "+ans[4]);
    assertEquals(23,ans[4]);
    ans = MSA.maxSumArea(arr3);
    System.out.println("answer = ("+ans[0]+","+ans[1]+"), ("+ans[2]+","+ans[3]+"), with sum "+ans[4]);
    assertEquals(55,ans[4]);
    ans = MSA.maxSumArea(arr4);
    System.out.println("answer = ("+ans[0]+","+ans[1]+"), ("+ans[2]+","+ans[3]+"), with sum "+ans[4]);
    assertEquals(30,ans[4]);
    ans = MSA.maxSumArea(arr5);
    System.out.println("answer = ("+ans[0]+","+ans[1]+"), ("+ans[2]+","+ans[3]+"), with sum "+ans[4]);
    assertEquals(12,ans[4]);
    ans = MSA.maxSumArea(arr6);
    System.out.println("answer = ("+ans[0]+","+ans[1]+"), ("+ans[2]+","+ans[3]+"), with sum "+ans[4]);
    assertEquals(106,ans[4]);
    
  }

}
