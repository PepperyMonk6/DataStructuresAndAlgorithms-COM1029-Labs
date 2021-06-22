/**
 * IntNode.java
 */

package org.com1029.lab2.css1ss;


/**
 * @author steveschneider
 */
public class IntNode {
  
  /**
   * Objects of the class IntNode are intended to be nodes within a list of
   * integers. Each object contains two fields: one named data of type int and
   * one named next of type IntNode. The next field thus enables a IntNode
   * object to point to another IntNode object. The class contains the usual
   * getters and setters.
   * 
   */

    private int data; 
    private IntNode next;

    /**
     * The constructor IntNode merely sets the data and next fields.
     * 
     */
    public IntNode(int value) {
      data = value;
      next = null;
    }

    public int getData() {
      return data;
    }

    public void setData(int value) {
      data = value;
    }

    public IntNode getNext() {
      return next;
    }

    public void setNext(IntNode node) {
      next = node;
    }

    public int length(){
      if (next == null){
        return 1;
      }
      else{
        int temp = 1 + next.length();
        return temp;
      }
        
    }
    
}
