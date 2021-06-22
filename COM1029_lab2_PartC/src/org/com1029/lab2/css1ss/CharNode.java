/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */

/**
 * Objects of the class CharNode are intended to be nodes within a stack of
 * characters. Each object contains two fields: one named data of type char and
 * one named next of type CharNode. The next field thus enables a CharNode
 * object to point to another CharNode object. The class contains the usual
 * getters and setters and also a toString method returning the value of the
 * character as a string.
 * 
 */
public class CharNode {
	char data = '\u0000'; // escape sequence for unicode zero
	CharNode next;

	/**
	 * The constructor CharNode merely sets the data and next fields.
	 * 
	 */
	public CharNode(char data) {
		super();
		this.data = data;
		this.next = null;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public CharNode getNext() {
		return next;
	}

	public void setNext(CharNode next) {
		this.next = next;
	}

	/**
	 * The method toString merely returns the value of field data as a string.
	 */
	public String toString() {
		//We use the static toString method in the wrapper class Character
		return Character.toString(data);
	}
}
