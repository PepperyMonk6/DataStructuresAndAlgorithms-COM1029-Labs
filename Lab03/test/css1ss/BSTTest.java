/**
 * BinaryTreeTest.java
 */

package org.com1029.lab3.css1ss;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class BSTTest {
  
  @Test
  public void AddTest() {
    BST bt = new BST();
    bt.addValueToTree(6);
    bt.addValueToTree(3);
    bt.addValueToTree(19);
    bt.addValueToTree(14);
    bt.addValueToTree(99);
    assertEquals(14,bt.getRoot().getRight().getLeft().getData());
  }
    
  @Test
  public void TraverseTest() {
    BST bt = new BST();
    System.out.println("Traverse Test");
    System.out.println("adding 6...");
    bt.addValueToTree(6);
    System.out.println("adding 3...");
    bt.addValueToTree(3);
    System.out.println("adding 19...");
    bt.addValueToTree(19);
    System.out.println("adding 14...");
    bt.addValueToTree(14);
    System.out.println("adding 99...");
    bt.addValueToTree(99);
    System.out.println("traversing in order - here are the elements as I traverse (should see 5 elements):");
    bt.traverseInOrder();
    System.out.println("\ntraversing backward - here are the elements now (should see 5 elements):");
    bt.traverseInOrderBackward();
  }

  @Test
  public void sizeTest() {
    BSTNode node1 = new BSTNode(2);
    BSTNode node2 = new BSTNode(3);
    BSTNode node3 = new BSTNode(6);
    BSTNode node4 = new BSTNode(7);
    BSTNode node5 = new BSTNode(9);
    node3.setLeft(node2);
    node2.setLeft(node1);
    node3.setRight(node5);
    node5.setLeft(node4);
    BST bt = new BST();
    bt.setRoot(node3);
    assertEquals(5,bt.treeSize());
  }

  @Test
  public void heightTest() {
    BSTNode node1 = new BSTNode(2);
    BSTNode node2 = new BSTNode(3);
    BSTNode node3 = new BSTNode(6);
    BSTNode node4 = new BSTNode(7);
    BSTNode node5 = new BSTNode(9);
    node3.setLeft(node2);
    node2.setLeft(node1);
    node3.setRight(node5);
    node5.setLeft(node4);
    BST bt = new BST();
    bt.setRoot(node3);
    assertEquals(2,bt.treeHeight());
  }
  
  @Test
  public void sumTest(){
    BSTNode node1 = new BSTNode(2);
    BSTNode node2 = new BSTNode(3);
    BSTNode node3 = new BSTNode(6);
    BSTNode node4 = new BSTNode(7);
    BSTNode node5 = new BSTNode(9);
    node3.setLeft(node2);
    node2.setLeft(node1);
    node3.setRight(node5);
    node5.setLeft(node4);
    BST bt = new BST();
    bt.setRoot(node3);
    assertEquals(27, bt.treeSum());    
  }

  @Test
  public void balanceTest(){
    BSTNode node1 = new BSTNode(2);
    BSTNode node2 = new BSTNode(3);
    BSTNode node3 = new BSTNode(6);
    BSTNode node4 = new BSTNode(7);
    BSTNode node5 = new BSTNode(9);
    BST bt = new BST();
    bt.setRoot(node3);
    assertTrue(bt.balanced());    
    node3.setLeft(node2);
    assertTrue(bt.balanced());    
    node2.setLeft(node1);
    assertFalse(bt.balanced());    
    node3.setRight(node5);
    assertTrue(bt.balanced());    
    node5.setLeft(node4);
    assertTrue(bt.balanced());    
  }
  
  @Test
  public void smallestTest(){
    BSTNode node1 = new BSTNode(2);
    BSTNode node2 = new BSTNode(3);
    BSTNode node3 = new BSTNode(6);
    BSTNode node4 = new BSTNode(7);
    BSTNode node5 = new BSTNode(9);
    BST bt = new BST();
    bt.setRoot(node3);
    node3.setLeft(node2);
    node3.setRight(node5);
    node5.setLeft(node4);
    assertEquals(3,bt.min());
    node2.setLeft(node1);
    assertEquals(2,bt.min());    
  }
  
  @Test
  public void greatestTest(){
    BSTNode node1 = new BSTNode(2);
    BSTNode node2 = new BSTNode(3);
    BSTNode node3 = new BSTNode(6);
    BSTNode node4 = new BSTNode(7);
    BSTNode node5 = new BSTNode(9);
    BST bt = new BST();
    bt.setRoot(node3);
    node3.setLeft(node2);
    node3.setRight(node5);
    assertEquals(9,bt.max());
    node5.setLeft(node4);
    node2.setLeft(node1);
    assertEquals(9,bt.max());
  }
  @Test
  public void convertTest(){
    int[] testarray = {1,3,4,6,8,9, 10, 13, 17, 22};
    BST bt = BST.arrayToBST(testarray);
    assertTrue(bt.balanced());
  }
  
  @Test
  public void sortedListTest(){
    int[] testarray = {1,3,4,6,8,9, 10, 13, 17, 22, 11, 12, 102, 2, 5, 1132, 51};
    BST bt = BST.arrayToBST(testarray);
    List<Integer> li = new ArrayList<Integer>();
    li = bt.toSortedList();
    int prev = 0;
    int curr = 0;
    for (int i = 0; i<li.size(); i++){
      prev = curr;
      curr = li.get(i);
      assertTrue(prev<curr); // checks that each is less than its successor in the list
    }
  }
  
}
