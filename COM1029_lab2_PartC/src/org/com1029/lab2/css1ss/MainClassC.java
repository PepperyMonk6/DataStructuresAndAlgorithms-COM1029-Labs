/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */
public class MainClassC {
	public static void main(String[] args) {
		CharLinkedQueue myCharacterQueue = new CharLinkedQueue();
		myCharacterQueue.enQueue(new CharNode('i'));
		myCharacterQueue.enQueue(new CharNode('n'));
		System.out.print(myCharacterQueue.deQueue() + " ");
		myCharacterQueue.enQueue(new CharNode('t'));
		myCharacterQueue.enQueue(new CharNode('e'));
		myCharacterQueue.enQueue(new CharNode('g'));
		myCharacterQueue.enQueue(new CharNode('r'));
		myCharacterQueue.enQueue(new CharNode('a'));
		myCharacterQueue.enQueue(new CharNode('t'));
		myCharacterQueue.enQueue(new CharNode('e'));
		for (int i = 1; i <= 8; i++)
			System.out.print(myCharacterQueue.deQueue() + " ");
	}
}

