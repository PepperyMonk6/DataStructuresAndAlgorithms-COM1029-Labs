/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 *
 */

/**
 * An object of this class will contain a character stack which will be used
 * (via method checkSymbolsB)to check that symbols ( [ { < within program code
 * each have a corresponding closing symbol and that these are nested correctly.
 * To keep the code simple, other balancing symbols within a Java program are
 * not checked.
 */
public class SymbolsCheckerB {
	String programCode = null;
	CharLinkedStack symbolStack;

	/**
	 * Constructor for symbolCheckerB merely sets up a character stack based
	 * upon a linked list of Objects of type CharNode.
	 */
	public SymbolsCheckerB() {
		super();
		symbolStack = new CharLinkedStack(); // parameter = max size
	}

	/**
	 * Private (helper) method reverseOf takes an incoming char symbol. If the
	 * symbol is [ ( { or < the closing symbol ] ) } or > is returned. Else
	 * (char) 0 is returned. Note that (unusually) break statements are not
	 * required after each case statement inside the switch.
	 * 
	 */
	private char reverseOf(char symbol) {
		switch (symbol) {
		case '[':
			return ']';
		case '(':
			return ')';
		case '{':
			return '}';
		case '<':
			return '>';
		default:
			return '\u0000'; // escape sequence for unicode zero.
		}
	}

	/**
	 * Method checkSymbolsB expects an incoming line of Java code within the
	 * string testString. The method checks that symbols ( [ { < within the code
	 * each has a corresponding closing symbol and that these are nested
	 * correctly. The method returns true if all symbols are correctly balanced
	 * with closing symbols else it returns false. A linked list based character
	 * stack is used.
	 * 
	 */
	public boolean checkSymbolsB(String testString) {
		boolean symbolsBalanced = true; // no symbol mismatches detected yet
		int nextIndex = 0; // index of next character within test string
		while (nextIndex < testString.length()) {// stop at end of test string
			char nextCh = testString.charAt(nextIndex); // extract character
			if (nextCh == '[' || nextCh == '(' || nextCh == '{'
					|| nextCh == '<') {// opening symbol so push it on stack
				CharNode node = new CharNode(nextCh);// create a node
				symbolStack.push(node); // put it on stack
			} else if (nextCh == ']' || nextCh == ')' || nextCh == '}'
					|| nextCh == '>') {// closing symbol so test it
				if (symbolStack.isEmpty())
					symbolsBalanced = false;// nothing to test it against
				else {
					CharNode node = symbolStack.pop(); // get top node from
														// stack
					if (nextCh != reverseOf(node.getCharacter())) {
						symbolsBalanced = false; // symbol does not match
					}
				}
			}
			nextIndex++; // update index ready for next cycle
		}
		return symbolStack.isEmpty() && symbolsBalanced;
	}
}

