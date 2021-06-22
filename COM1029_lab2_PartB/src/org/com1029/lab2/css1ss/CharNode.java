/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */

/**
 * Objects of the class CharNode will be used as nodes within a stack of
 * characters. Each object contains two fields: one named character of type char
 * and the other named next of type CharNode. The next field enables a CharNode
 * object to point to another CharNode object. The class contains the usual
 * getters and setters and also has a toString method returning the value of the
 * character as a string.
 * 
 */
public class CharNode {
	char character = '\u0000'; // escape sequence for unicode zero
	CharNode next;

	/**
	 * The constructor CharNode merely sets the character and next fields.
	 * 
	 */
	public CharNode(char character) {
		super();
		this.character = character;
		this.next = null;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public CharNode getNext() {
		return next;
	}

	public void setNext(CharNode next) {
		this.next = next;
	}

	/**
	 * The method toString merely returns the value of field character as a
	 * string.
	 */
	public String toString() {
		//We use the static toString method in the wrapper class Character
		return Character.toString(this.character);
	}
}
