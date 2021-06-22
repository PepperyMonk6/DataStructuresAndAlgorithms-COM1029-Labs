/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */
public class MainClassD {
	public static void main(String[] args) {
		CharLinkedList myCharacterLinkedList = new CharLinkedList();
		myCharacterLinkedList.add(0,new CharNode('i'));
		myCharacterLinkedList.add(1,new CharNode('n'));
		myCharacterLinkedList.add(2,new CharNode('t'));
		myCharacterLinkedList.add(3,new CharNode('e'));
		myCharacterLinkedList.add(4,new CharNode('g'));
		myCharacterLinkedList.add(5,new CharNode('r'));
		myCharacterLinkedList.add(6,new CharNode('a'));
		myCharacterLinkedList.add(7,new CharNode('t'));
		myCharacterLinkedList.add(8,new CharNode('e'));
	
		for (int i = 0; i <= 3; i++)
		myCharacterLinkedList.remove(4);
		myCharacterLinkedList.add(4,new CharNode('r'));
		myCharacterLinkedList.add(5,new CharNode('f'));
		myCharacterLinkedList.add(6,new CharNode('a'));
		myCharacterLinkedList.add(7,new CharNode('c'));

		for (int i = 0; i <= 8; i++)		
			System.out.print(myCharacterLinkedList.remove(0) + " ");
	}
}

