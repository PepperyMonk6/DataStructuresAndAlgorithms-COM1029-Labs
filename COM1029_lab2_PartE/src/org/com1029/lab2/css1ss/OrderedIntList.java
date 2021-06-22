/**
 * OrderedIntList.java
 */

package org.com1029.lab2.css1ss;


/**
 * @author steveschneider
 */
public class OrderedIntList {
  
  private IntNode first;
  
  public OrderedIntList(){
    first = null;
  }
  
  /*
   * add(data) puts a new item into the list.  
   * 
   * There are three cases to consider:
   *  1) the list is currently empty
   *  2) the new item is less than the first element, and so should go on the front
   *  3) if the new item is not less than the first element, it should go somewhere after it
   *    3a) if there's no second element then it should go after the first element
   *    3b) if it's smaller than the second element, then it should be inserted 
   *            between the first and second elements
   *    3c) otherwise move along the linked list and repeat
   */
  
  public void add(int data){
    IntNode newnode = new IntNode(data);
    if (first == null){
       // fill in here
    	this.first = newnode;
    }
    else{
      if (data < first.getData()){
        // fill in here
    	  newnode.setNext(this.first);
    	  this.first = newnode;
      }
      else{
        // set the node 'current' to be the first node
        // while the next node is not null, and the next node's data is less than the data to be inserted...
        //  move along the list
        // 
        // when you drop out of the while loop, you are in the right place 
        // to put in a new node with the data to be inserted
    	  
    	  IntNode current = this.first;
    	  while(current.getNext() != null && current.getNext().getData() < data) {
    		  current = current.getNext();
    	  }
    	 // IntNode tmp = newnode.getNext();
    	 // tmp = current.getNext();
    	  newnode.setNext(current.getNext());
    	  current.setNext(newnode);
    	  
      }
    }  
  }
  
  public int getSize(){
    if (first == null){
      return 0;
    }
    else{
      return first.length();
    }
  }
  
  public void removeFirst(){
    first = first.getNext();
  }
  
  public void removeSuccessor(IntNode node){
    node.setNext(node.getNext().getNext());    
  }
  
  public IntNode getFirst(){
    return first;
  }
  
  /*
   *   print out the contents of the linked list
   */
  
  public void output(){
    int size = this.getSize();
    IntNode current = first;
    for (int i=0;i<size;i++){
      System.out.print(current.getData());
      if (i < size - 1){
        System.out.print(", ");
      }
      current = current.getNext();
    }
    System.out.println();
  }
  

}