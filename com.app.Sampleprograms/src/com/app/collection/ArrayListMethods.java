package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
	
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("java");
		array1.add("python");
		array1.add("ruby");
		array1.add("javascript");
		array1.add("sql");
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Testing");
		array2.add("devops");
		
		array1.addAll(array2);
		System.out.println(array1);
		
		array1.addAll(2,array2);
		System.out.println(array1);
		
		//array1.clear();
		//System.out.println(array1);
		
		//adding the array1 list into clonelist
		ArrayList <String> clonelist = (ArrayList<String>)array1.clone();
		System.out.println(clonelist);
		
		//checking the ruby is present or not 
		System.out.println(array1.contains("ruby"));
		
		//checking the index
		System.out.println(array1.indexOf("ruby")>0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Gowthami","Avanthika","Laxma","Siddharth","Gowthami"));
		System.out.println(list1);
		
		//checking the string last index 
		int i = list1.lastIndexOf("Gowthami");
		System.out.println(i);
		
		//remove the value 
		list1.remove(1);
		System.out.println(list1);
		
		//check the odd/even numbers 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num->num%2==0);
		System.out.println(numbers);
		numbers.removeIf(num->num%2==1);
		System.out.println(numbers);
		
		//check the particular value is present in arraylist  or not 
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Gowthami","Avanthika","Laxma","Siddharth","Gowthami"));
		System.out.println(list2);
		
		list2.retainAll(Collections.singleton("Gowthami"));
		System.out.println(list2);
		
		
		//sublist
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(2, 7));
		System.out.println(sublist);
		
		
		//toArray
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Gowthami","Avanthika","Laxma","Siddharth","Gowthami"));
		Object array[] = list3.toArray();
		System.out.println(Arrays.toString(array));
		
		for(Object o : array)
		{
			//System.out.println(o);
			System.out.println((String)o);
		}		
		
	}
		
}
