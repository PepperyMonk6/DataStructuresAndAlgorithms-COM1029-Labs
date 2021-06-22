/**
 * 
 */
package org.com1029.lab2.css1ss;

/**
 * @author css3db
 * 
 */
public class MainClassB {
	public static void main(String[] args) {
		SymbolsCheckerB myChecker = new SymbolsCheckerB();
		String progCode = "if (x==3) {p=x[6]; y=(int)'g'+(p*2*q[4*(3+2)])};";
		//if (x==3) {p=x[6]; y=(int)'g'+(p*2*q[4*(3+2)])};
		if (myChecker.checkSymbolsB(progCode)) {
			System.out.println("Symbols are properly balanced");
		} else {
			System.out.println("Symbols are not properly balanced");
		}
	}
}
