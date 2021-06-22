/**
 * SortingCorrectnessTest.java
 */

package org.com1029.lab4;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class SortingCorrectnessTest {

	AnimalArrayGenerator cag = new AnimalArrayGenerator();
	Sorting<Dog> srt = new Sorting<Dog>();

	@Test
	public void testBubblesort10(){
		ArrayList<Dog> dogLst = cag.generateTenDogsArrayList();
		Dog[] dogArr = new Dog[dogLst.size()];
		dogArr = dogLst.toArray(dogArr);
		srt.bubbleSort(dogArr);
		ArrayList<Dog> sortedRandomDogs =  new ArrayList<Dog>(Arrays.asList(dogArr));

		System.out.print("\nBubblesort on 10 dogs: \n\n");
		Dog tmp1;
		Dog tmp2;
		tmp1 = sortedRandomDogs.remove(0);
		System.out.println(tmp1.toString());
		for (int i=0; i < 9; i++){
			tmp2 = sortedRandomDogs.remove(0);
			System.out.println(tmp2.toString());
			assertTrue(tmp1.compareTo(tmp2)<=0);
			tmp1 = tmp2;
		}
	}

	@Test
	public void testInsertion10(){
		ArrayList<Dog> dogLst = cag.generateTenDogsArrayList();
		Dog[] dogArr = new Dog[dogLst.size()];
		dogArr = dogLst.toArray(dogArr);
		srt.insertionSort(dogArr);
		ArrayList<Dog> sortedRandomDogs =  new ArrayList<Dog>(Arrays.asList(dogArr));

		System.out.print("\nInsertionsort on 10 dogs: \n\n");
		Dog tmp1;
		Dog tmp2;
		tmp1 = sortedRandomDogs.remove(0);
		System.out.println(tmp1.toString());
		for (int i=0; i < 9; i++){
			tmp2 = sortedRandomDogs.remove(0);
			System.out.println(tmp2.toString());
			assertTrue(tmp1.compareTo(tmp2)<=0);
			tmp1 = tmp2;
		}
	}
	
	@Test
	public void testSelection10(){
		ArrayList<Dog> dogLst = cag.generateTenDogsArrayList();
		Dog[] dogArr = new Dog[dogLst.size()];
		dogArr = dogLst.toArray(dogArr);
		srt.selectionSort(dogArr);
		ArrayList<Dog> sortedRandomDogs =  new ArrayList<Dog>(Arrays.asList(dogArr));

		System.out.print("\nSelectionsort on 10 dogs: \n\n");
		Dog tmp1;
		Dog tmp2;
		tmp1 = sortedRandomDogs.remove(0);
		System.out.println(tmp1.toString());
		for (int i=0; i < 9; i++){
			tmp2 = sortedRandomDogs.remove(0);
			System.out.println(tmp2.toString());
			assertTrue(tmp1.compareTo(tmp2)<=0);
			tmp1 = tmp2;
		}
	}
}
