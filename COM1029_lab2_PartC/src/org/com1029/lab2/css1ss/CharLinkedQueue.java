/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 *
 */

/**
 * Each object of class CharLinkedStack is a stack of values of type CharNode.
 * The internal design of the class is based upon a linked list of CharNode
 * objects.
 * 
 */
public class CharLinkedQueue {
	private CharNode first;
	private CharNode last;

	/**
	 * CharLinkedStack has just one constructor. This default constructor merely
	 * sets the field first (whose purpose it to point to the top node in the
	 * stack) to null. Thus the constructor effectively creates an empty stack.
	 * 
	 */
	public CharLinkedQueue() {
		super();
		first = null;
		last = null;
	}

	/**
	 * In method push, the value of the incoming parameter node of type CharNode
	 * is pushed upon the stack. Since the stack is based upon a linked list,
	 * there is no possibility of the stack being already full. Note that if the
	 * stack is empty before push is called (detected by the field first
	 * pointing to null), it is necessary to obey different code from the
	 * general case of the stack containing at least one node.
	 * 
	 */
	public void enQueue(CharNode node) {
		/*node.setNext(first);
		first = node;*/
		if(this.isEmpty()) {
			this.first = node;
			this.last = node;
		}	else {
			this.last.next = node;
			this.last = node;
		}
	}

	/**
	 * In method pop the node of type CharNode at the top of the stack is
	 * removed from the stack and returned. However, if the stack is already
	 * empty (i.e. the field head already points to null) an exception is
	 * thrown.
	 * 
	 */
	public CharNode deQueue() {
		/*if (first == null) {
			throw new RuntimeException("Stack empty");
		} else {
			CharNode topOfStack = first;
			first = topOfStack.getNext();
			topOfStack.setNext(null);
			return topOfStack;
		}*/
		
		CharNode tmp = this.first;
		this.first = this.first.next;
		tmp.next = null;
		return tmp;
	}

	public boolean isEmpty() {
		return (first == null);
	}
}

