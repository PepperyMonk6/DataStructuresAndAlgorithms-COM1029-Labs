/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */

/**
 * Each object of class CharArrayStack is a stack of values of type char. The
 * internal design of the class is based upon an array of type char.
 * 
 */
public class CharArrayStack {

	char[] stackArray = null; // name of underlying array holding stack contents
	int stackArraySize = 0; // constructor sets this to max size of stack
	int indexOfTopOfStack = -1; // array index of current top of stack

	/**
	 * The constructor CharArrayStack takes one parameter which is to be the
	 * size of the underlying array. No stack may be filled beyond this size.
	 * The constructor merely sets up the array and effectively leaves an empty
	 * stack of type char.
	 * 
	 */
	public CharArrayStack(int stackArraySize) {
		super();
		this.stackArraySize = stackArraySize;
		this.stackArray = new char[stackArraySize];
		this.indexOfTopOfStack = -1 ; // nothing in stack yet
	}
	
	public char[] getStackArray() {
		return this.stackArray;
	}
	
	public int getIndexOfTopOfStack() {
		return this.indexOfTopOfStack;
	}

	/**
	 * In method push, the value of the incoming parameter character is pushed
	 * upon the stack. However, if the stack is already full (i.e. index marking
	 * the top of the stack in the underlying array is already at its upper
	 * bound) an exception is thrown.
	 * 
	 */
	// Method push has been excluded
	public  void  push(char  character) {
		if (++indexOfTopOfStack >= stackArraySize) {
			throw  new  RuntimeException("Stack  full");
			} else {
			//  statement  excluded  -- push  character  on  stack}}
				this.stackArray[this.indexOfTopOfStack] = character;
		}
	}

	/**
	 * In method pop the type char value at the top of the stack is removed from
	 * the stack and then returned. However, if the stack is already empty (i.e.
	 * index marking the top of the stack in the underlying array is less than
	 * zero) an exception is thrown.
	 * 
	 */
	public char pop () {
		 //This is a dummy value
		// The body of method pop has been excluded
		if(this.indexOfTopOfStack < 0) {
			throw new RuntimeException("Stack is empty");
		}	else {
			this.indexOfTopOfStack--;
			int currentElement = indexOfTopOfStack;
			return this.stackArray[currentElement + 1];
		}
	}
	
	public boolean isEmpty() {
		if(this.indexOfTopOfStack == -1) {
			return true;
		}
			return false;
	}

	// The method isEmpty has been excluded
}
