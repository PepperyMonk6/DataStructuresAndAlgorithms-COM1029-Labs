/**
 * 
 */
package org.com1029.lab4;

/**
 * @author css3ss
 * 
 */
public class Cat implements Comparable<Cat> {
	private int age;

	Cat(int age) {
		this.age = age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	public String toString() {
		return "  cat aged " + this.getAge() + " days \n";
	}

	@Override
	public int compareTo(Cat cat) {
		// TODO Auto-generated method stub
		return this.getAge() - cat.getAge();
	}

}
