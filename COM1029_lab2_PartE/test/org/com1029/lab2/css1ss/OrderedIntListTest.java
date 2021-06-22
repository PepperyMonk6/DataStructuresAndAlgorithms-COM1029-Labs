/**
 * OrderedIntListTest.java
 */

package org.com1029.lab2.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author steveschneider
 */

public class OrderedIntListTest {

  @Test
  public void test() {
    OrderedIntList testList = new OrderedIntList();
    System.out.println("Now inserting 13...");
    testList.add(13);
    testList.output();
    System.out.println("Now inserting 3...");
    testList.add(3);
    testList.output();
    System.out.println("Now inserting 19...");
    testList.add(19);
    testList.output();
    System.out.println("Now inserting 8...");
    testList.add(8);
    testList.output();
    System.out.println("Now inserting 23...");
    testList.add(23);
    testList.output();
    int ans = testList.getSize();
    assertEquals(5, ans);
    testList.add(16);
    System.out.println("Now inserting 16...");
    testList.output();
  }
 
    
}
