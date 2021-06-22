package org.com1029.lab4;

/**
 * @author steveschneider
 * 
 */
public class Dog implements Comparable<Dog> {
	String name;
	private int age;

	public Dog(String id, int age) {
		this.name = id;
		this.age = age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	public void setName(String id) {
		this.name = id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return " " + this.getName() + " aged " + this.getAge();
	}

	@Override
	public int compareTo(Dog dog) {
		return this.getName().compareTo(dog.getName());  //  lexicographic comparison

		// TODO try out other ways to compare dogs as instructed
		// in the lab handout

	}


	public boolean equals(Dog dog){
		return (this.age == dog.getAge() && this.name == dog.getName());
	}

}