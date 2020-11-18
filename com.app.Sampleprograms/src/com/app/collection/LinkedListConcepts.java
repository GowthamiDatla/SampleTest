package com.app.collection;

import java.util.Iterator;
import java.util.*;

public class LinkedListConcepts {

	public static void main(String[] args) {
		// Write your code here
		//Write a Java program to append the specified element to the end of a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("Gowthami");
		list.add("Laxma");
		list.add("Avanthika");
		list.add("Siddharth");

		System.out.println(list);

		// Write a Java program to iterate through all elements in a linked list

		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		System.out.println("-------------------");

		for(String S : list)
		{
			System.out.println(S);
		}
		System.out.println("-------------------");

		// Write a Java program to iterate through all elements in a linked list starting at the specified position.

		Iterator lis = list.listIterator(1);
		while(lis.hasNext())
		{

			System.out.println(lis.next());

		}
		System.out.println("-------------------");

		//Write a Java program to iterate a linked list in reverse order

		Iterator reverseorder = list.descendingIterator();
		while(reverseorder.hasNext())
		{
			System.out.println(reverseorder.next());

		}
		System.out.println("-------------------");

		//Write a Java program to insert the specified element at the specified position in the linked list. 

		list.add(0,"MadhavaReddy");
		list.add(1,"PadmaVathi");
		System.out.println(list);
		System.out.println("-------------------");

		//Write a Java program to insert elements into the linked list at the first and last position

		list.addFirst("StartFamilyNames");
		list.addLast("EndFamilyNames");
		System.out.println(list);
		System.out.println("-------------------");

		//Write a Java program to insert the specified element at the front of a linked list
		//Write a Java program to insert the specified element at the end of a linked list.
		list.offerFirst("Start");
		list.offerLast("End");
		System.out.println(list);
		System.out.println("-------------------");

		//Write a Java program to insert some elements at the specified position into a linked list. Go to the editor

		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("SubbaReddy");
		list1.add("Rajeswari");
		list.addAll(6, list1);
		System.out.println(list);
		System.out.println("-------------------");

		//Write a Java program to get the first and last occurrence of the specified elements in a linked list.

		String i = list.getFirst();
		String j = list.getLast();
		System.out.println("starting element: " +i);
		System.out.println("Ending element: " +j);
		System.out.println("-------------------");

		//Write a Java program to display the elements and their positions in a linked list. Go to the editor

		for(int k=0;k<list.size();k++)
		{
			System.out.println("Element of the index:" +k+ ": " +list.get(k));
		}
		System.out.println("-------------------");

		//Write a Java program of swap two elements in an linked list.

		Collections.swap(list, 0, 1);
		System.out.println(list);
		System.out.println("-------------------");

		//Write a Java program to shuffle the elements in a linked list. 

		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("-------------------");

		//Write a Java program to join two linked lists

		LinkedList <String> c1 = new LinkedList <String> ();

		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("List of first linked list: " + c1);
		LinkedList <String> c2 = new LinkedList <String> ();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");
		System.out.println("List of second linked list: " + c2);

		// Let join above two list
		LinkedList <String> a = new LinkedList <String> ();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New linked list: " + a);
		System.out.println("-------------------");


		//Write a Java program to clone an linked list to another linked list.

		LinkedList<String> clonelist = (LinkedList<String>)list.clone();
		clonelist.contains(list);
		System.out.println(clonelist);
		System.out.println("-------------------");

		//Write a Java program to remove and return the first element of a linked list.
		
		System.out.println("Removed element: " +list.pop());
		System.out.println(list);
		System.out.println("-------------------");
		
		//Write a Java program to retrieve but does not remove, the first element of a linked list
		
		String retrieve = list.peekFirst();
		String retrieve1 = list.peekLast();
		System.out.println("First element in the list: " + retrieve);
		System.out.println("Last element in the list: " + retrieve1);
		
		System.out.println(list);
		System.out.println("-------------------");

		// Write a Java program to check if a particular element exists in a linked list. 
		
		if(list.contains("Gowthami"))
		{
			System.out.println("Gowthami name present in linked list");
		}
		else
		{
			System.out.println("Gowthami name is not present in linked list");
		}
		if(list.contains("Lisa"))
		{
			System.out.println("Lisa name present in linked list");
		}
		else
		{
			System.out.println("Lisa name is not present in linked list");
		}
		
		System.out.println("-------------------");
		
		//Write a Java program to convert a linked list to array list.
	
		List<String> convertArray = new ArrayList<String>(list);
		for(String Str : convertArray)
		{
			System.out.println(Str);
		}
		System.out.println("-------------------");
		
		//Write a Java program to compare two linked lists.
		
		LinkedList<String> c3 = new LinkedList<String>();
		for(String compare : c1)
		
			c3.add(c2.contains(compare) ? "yes" : "No");
			System.out.println(c3);
		
		//Write a Java program to test an linked list is empty or not.
		
			System.out.println("-------------------");
			
		boolean empty = list.isEmpty();
		System.out.println("Checking the list is empty or not: " +empty);
		//Write a Java program to replace an element in a linked list.
		
		System.out.println("-------------------");
		list.set(1, "Starting");
		for(String Replace : list)
		{
		System.out.println("Replace the Element in index 1: " +Replace); 
		}
		
		}
			
	}




