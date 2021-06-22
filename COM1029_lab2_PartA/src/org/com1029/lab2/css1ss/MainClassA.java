package org.com1029.lab2.css1ss;

public class MainClassA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String progCode = "())(()";
		//if (x==3) {p=x[6]; y=(int)'g'+(p*2*q[4*(3+2)])};
		SymbolsCheckerA myChecker = new SymbolsCheckerA( );		
		if (myChecker.checkSymbolsA(progCode)) {
			System.out.println("Symbols are properly balanced");
		} else {
			System.out.println("Symbols are not properly balanced");
		}
	}
}
