/**
 * MSS1Test.java
 */

package org.com1029.lab1.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class MSS2Test {

  int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
  int [] arr2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
  int [] arr3 = {1,2,3,4,-10,5,-6,7,-8,7};
  int [] arr4 = {1,-2,3,-4,5,-6,7,8,9,10};
  int [] arr5 = {-3,4,5,-2,6,7,-4,5,-8,1};
  
  @Test
  public void mss2Test1(){
    assertEquals(0,MSS.mss2(arr1)[0]);
    assertEquals(9,MSS.mss2(arr1)[1]);
    assertEquals(55,MSS.mss2(arr1)[2]);
  }
  
  @Test
  public void mss2Test2(){
    assertEquals(0,MSS.mss2(arr2)[2]);
  }
  
  @Test
  public void mss2Test3(){
    assertEquals(0,MSS.mss2(arr3)[0]);
    assertEquals(3,MSS.mss2(arr3)[1]);
    assertEquals(10,MSS.mss2(arr3)[2]);
  }
  
  @Test
  public void mss2Test4(){
    assertEquals(6,MSS.mss2(arr4)[0]);
    assertEquals(9,MSS.mss2(arr4)[1]);
    assertEquals(34,MSS.mss2(arr4)[2]);
  }
  
  @Test
  public void mss2Test5(){
    assertEquals(1,MSS.mss2(arr5)[0]);
    assertEquals(7,MSS.mss2(arr5)[1]);
    assertEquals(21,MSS.mss2(arr5)[2]);
  }
  
}
