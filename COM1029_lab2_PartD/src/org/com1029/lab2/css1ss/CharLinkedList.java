/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 *
 */

/**
 * Each object of class CharLinkedList is a linked list of values of type
 * CharNode. The internal design of the class is based upon a linked list of
 * CharNode objects.
 * 
 */
public class CharLinkedList {
	private CharNode first = null;// will point to first node of linked list.
	private int size = 0; // no of nodes in linked list

	/**
	 * Class CharLinkedList has just one constructor. This default constructor merely
	 * sets the field first (whose purposes is to point to the first node in the
	 * linked list) to null and the field size (the size of the linked list) to
	 * zero. Since we shall regard the first node of the linked list as being at
	 * position (or index)zero, the last node of the linked list will always
	 * have a position (or index) index of size -1. The constructor effectively
	 * creates an empty linked list.
	 * 
	 */
	public CharLinkedList() {
		super();
		first = null;
		size = 0;
	}

	/**
	 * In method add, the value of the incoming parameter node of type CharNode
	 * is placed at the specified position within the linked list. However, if
	 * the index is out of bounds (e.g. the linked list is empty or index is
	 * beyond the end of the linked list) an exception is thrown.
	 */

	// METHOD add HAS BEEN EXCLUDED
	public  void  add(int index , CharNode  newNode) {
		if (index  > size ||  index  < 0)//  index  must be  valid
			throw  new  RuntimeException("index  out of  range");
		if (index  == 0) {
			//  special  case - insert  at  index  zero
			newNode.setNext(first);
			first = newNode;
		}	else {
			newNode.next = this.getNodeAt(index - 1).next;
			this.getNodeAt(index - 1).next = newNode;
		}
		size++;
	}

	/**
	 * In method remove the node of type CharNode at the specified index is
	 * removed from the linked list and returned. However, if the index is out
	 * of bounds (e.g. the linked list is empty or index is beyond the end of
	 * the linked list) an exception is thrown.
	 * 
	 */

// METHOD remove HAS BEEN EXCLUDED
	
	public  CharNode  remove(int  index) {
		if (index  > size - 1 ||  index  < 0) {
			throw new RuntimeException("index out of range");
		}
		if(index == 0) {
			CharNode tmp = this.getNodeAt(0);
			this.first = this.getNodeAt(index).next;
			size--;
			return tmp;
		}	else {
			//CharNode tmp = this.getNodeAt(index);
			//tmp = tmp.next;
			this.getNodeAt(index - 1).next = this.getNodeAt(index).next;
			size--;
			return this.getNodeAt(index);
		}
	}

	/**
	 * Method getNodeAt scans the linked list to locate the node at the
	 * specified position and returns a reference to that node. This is a helper
	 * method and as such is private.
	 */
	public CharNode getNodeAt(int index) {
		CharNode node = first; // starting position for the scan
		// for loop repeatedly overwrite node variable with reference of next
		// node.
		for (int i = 0; i < index; i++)
			node = node.getNext();
		return node;
	}

}
