package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */

/**
 * An object of this class will contain a character stack which will be used
 * (via method checkSymbolsA) to check that the opening symbols ( [ { < within
 * the string program code each have a corresponding closing symbol and that
 * these are nested correctly. To keep the code simple, other symbols such as '
 * are not checked.
 */
public class SymbolsCheckerA {
	String programCode = null;
	CharArrayStack symbolStack;

	/**
	 * Constructor for symbolCheckerA merely sets up a character stack based
	 * upon a character array of a specified size.
	 */
	public SymbolsCheckerA() {
		super();
		symbolStack = new CharArrayStack(5); // parameter = max stack size
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
	 * Method checkSymbolsA expects an incoming line of Java code within the
	 * string testString. The method checks that symbols ( [ { < within the code
	 * each has a corresponding closing symbol and that these are nested
	 * correctly. The method returns true if all the specified symbols are
	 * correctly balanced with closing symbols else it returns false. An array
	 * based character stack is used.
	 * 
	 */
	public boolean checkSymbolsA(String testString) {
		boolean symbolsBalanced = true; // no symbol mismatches detected yet
		int nextIndex = 0; // index of next character within test string
		while (nextIndex < testString.length()) {// stop at end of test string
			char nextCh = testString.charAt(nextIndex); // extract character
			if (nextCh == '[' || nextCh == '(' || nextCh == '{'
					|| nextCh == '<') {// opening symbol so push it on stack
				// THE CALL OF PUSH METHOD HAS BEEN EXCLUDED
				this.symbolStack.push(nextCh);
			} else if (nextCh == ']' || nextCh == ')' || nextCh == '}'
					|| nextCh == '>') {// closing symbol so test it
				if (nextCh != reverseOf(/* CALL OF POP METHOD HAS BEEN EXCLUDED */ this.symbolStack.pop())) {
					symbolsBalanced = false; // symbol does not match
				}
			}
			nextIndex++; // update index ready for next cycle
		}
		return symbolStack.isEmpty() && symbolsBalanced;
		//return symbolsBalanced; //YOU NEED TO ADD SOMETHING HERE
	}
}
