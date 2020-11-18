package com.app.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetConcepts {
	public static void main(String[] args) {

		//Write a Java program to append the specified element to the end of a hash set.

		HashSet<String> setnames = new HashSet<String>();

		setnames.add("Gowthami");
		setnames.add("Laxma");
		setnames.add("Avanthika");
		setnames.add("Siddharth");
		setnames.add("test");
		setnames.add("Gowthami");
		System.out.println("Set the names : " +setnames);

		//Write a Java program to iterate through all elements in a hash list.

		Iterator<String> it = setnames.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		//Write a Java program to get the number of elements in a hash set. 

		System.out.println("Size of the Hash Set : " +setnames.size());

		//Write a Java program to empty an hash set.

		setnames.remove("test");
		System.out.println("Remove the test element: " +setnames);

		//Write a Java program to test a hash set is empty or not.


		System.out.println("Checking the HashSet is empty or not: " +setnames.isEmpty());

		//Write a Java program to clone a hash set to another hash set.

		HashSet<String> clonelist =  (HashSet<String>)setnames.clone();
		clonelist.containsAll(setnames);
		System.out.println("Clone the HashSet: " +clonelist);

		//Write a Java program to convert a hash set to an array. 

		String[] Array = new String[setnames.size()];
		String[] receivedArray = setnames.toArray(Array);
		for(String A : receivedArray)
		{
			System.out.println("Convert the hashset into array: " +A);
		}

		//Write a Java program to convert a hash set to a List/ArrayList. 

		List<String> list1 = new ArrayList<String>(setnames);
		System.out.println("Convert a hash set to a List/ArrayList: " +list1);

         //Write a Java program to compare two hash set.
            
		HashSet<String> setnames2 = new HashSet<String>();

		setnames2.add("HariMdhavaReddy");
		setnames2.add("Padmavathi");
		setnames2.add("Rajeswari");
		setnames2.add("Subbha Reddy");
		setnames2.add("Siddharth");
		
		System.out.println("Set the names : " +setnames2);
		
		HashSet<String> Results = new HashSet<String>();
		
		for(String Element : setnames)
		{
			System.out.println(setnames2.contains(Element) ? "Yes" : "No");
		}

		//Write a Java program to compare two sets and retain elements which are same on both sets
		
		setnames.retainAll(setnames2);
		
		System.out.println(setnames);
		
		



	}


}
