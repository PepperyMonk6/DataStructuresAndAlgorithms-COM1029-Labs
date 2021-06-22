package org.com1029.lab4;

/**
 *  ArrayGenerator.java
 *  
 *  A class that generates arrays containing random integers
 *  
 *  @author steveschneider
 */

import java.util.*;
import java.util.Random;	

public class AnimalArrayGenerator {

	Random generator = new Random();

	String[] dogNames = {"fido", "rex", "boxer", "spot", "lassie", "patch", "lucky", "binky", "duke", "hachico"};

	/**
	 * 	
	 * @param min
	 *      the minimum value that entries in the array can take
	 * @param max
	 *      the maximum value that entries in the array can take
	 * @param size
	 *      the size of the array
	 * @return
	 *      returns an arraylist of length 'size' with Cat entries of ages between min and max.
	 */

	public ArrayList<Dog> generateTenDogsArrayList(){
		ArrayList<Dog> arr = new ArrayList<Dog>();
		for (int i=0; i<10; i++){
			arr.add(new Dog(dogNames[i],generator.nextInt(20)));
		}
		return arr;
	}

	public LinkedList<Dog> generateTenDogsLinkedList(){
		LinkedList<Dog> arr = new LinkedList<Dog>();
		for (int i=0; i<10; i++){
			arr.add(new Dog(dogNames[i],generator.nextInt(20)));
		}
		return arr;
	}


	public ArrayList<Cat> generateRandomCatArrayList(int min, int max, int size){
		ArrayList<Cat> arr = new ArrayList<Cat>();
		int range = max - min;
		for(int i=0;i<size;i++){
			arr.add(new Cat(generator.nextInt(range) + min));	
		}
		return arr;

	}

	public ArrayList<Cat> generateOrderedCatArrayList(int min, int max){
		ArrayList<Cat> arr = new ArrayList<Cat>();
		for(int i=min;i<=max;i++){
			arr.add(new Cat(i)); 
		}
		return arr;

	}

	public ArrayList<Cat> generateReverseOrderedCatArrayList(int min, int max){
		ArrayList<Cat> arr = new ArrayList<Cat>();
		for(int i=min;i<=max;i++){
			arr.add(new Cat(i)); 
		}
		Collections.reverse(arr);
		return arr;
	}

	public LinkedList<Cat> generateRandomCatLinkedList(int min, int max, int size){
		LinkedList<Cat> arr = new LinkedList<Cat>();
		int range = max - min;
		for(int i=0;i<size;i++){
			arr.add(new Cat(generator.nextInt(range) + min)); 
		}
		return arr;

	}

	public LinkedList<Cat> generateOrderedCatLinkedList(int min, int max){
		LinkedList<Cat> arr = new LinkedList<Cat>();
		for(int i=min;i<max;i++){
			arr.add(new Cat(i)); 
		}
		return arr;

	}

}

