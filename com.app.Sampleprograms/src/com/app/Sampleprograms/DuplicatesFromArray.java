package com.app.Sampleprograms;

import java.util.Arrays; 
import java.util.HashSet; 
import java.util.Set; 
import static java.lang.System.*;
/** * Java Program to find duplicate elements in an array. In this program, you * will learn two solution to find duplicate elements in integer array e.g. 
 * brute force, by using HashSet data structure. 
 * * @author java67 */

public class DuplicatesFromArray
{ 
	public static void main(String args[]) 
{ 
	int[] withDuplicates = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 }; 
	Set<Integer> duplicates = findDuplicates(withDuplicates); 
	out.println("input array is : " + Arrays.toString(withDuplicates)); 
	out.println("Duplicate elements found in array are : " + duplicates); 
	
	// now calling our generic method to find duplicates
	String[] myArray = { "ab", "cd", "ab", "de", "cd" }; 
	out.println("input string array is : " + Arrays.toString(myArray)); 
	getDuplicates(myArray); 
} 
/** * Complexity of this solution is O(n^2) 
 * * @param input * @return */
public static Set<Integer> findDuplicates(int[] input)
{ 
	Set<Integer> duplicates = new HashSet<Integer>(); 
	for (int i = 0; i < input.length; i++) 
	{ 
		for (int j = 1; j < input.length; j++)
	{ 
			if (input[i] == input[j] && i != j) 
	{ 
		//duplicate element found 
		duplicates.add(input[i]); 
		break; 
		} } }
	return duplicates;
	} 
/** * Generic method to find duplicates in array. Complexity of this method is 
 * O(n) because we are using HashSet data structure. 
 * * @param array 
 * @return */ 
public static <T extends Comparable<T>> void getDuplicates(T[] array)
{
	Set<T> dupes = new HashSet<T>(); 
	for (T i : array) 
	{ 
		if (!dupes.add(i)) 
		{ 
			System.out.println("Duplicate element in array is : " + i); 
} } } }
