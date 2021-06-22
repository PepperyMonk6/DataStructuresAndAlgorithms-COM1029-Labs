/**
 * IntNodeTest.java
 */

package org.com1029.lab2.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class IntNodeTest {

  @Test
  public void lengthTest() {
    IntNode nodea = new IntNode(4);
    IntNode nodeb = new IntNode(2);
    IntNode nodec = new IntNode(7);
    IntNode noded = new IntNode(9);
    IntNode nodee = new IntNode(1);
    nodee.setNext(nodeb);
    nodeb.setNext(nodea);
    nodea.setNext(nodec);
    nodec.setNext(noded);
    int ans = nodee.length();
    assertEquals(5, ans);
    int ans2 = noded.length();
    assertEquals(1, ans2);
  }

}
