package com.app.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizearrayList {
	
	//How to synchronize ArrayList in Java
	//Collections.synchronizedList() - method - returns synchronized list
	//copyOnwritearrayList - class - Thred Safe variant of ArrayList
	public static void main(String[] args) {

//1: Collections.synchronizedList
		
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		nameslist.add("java");
		nameslist.add("python");
		nameslist.add("Ruby");
		
		//add, remove - we don't need explicit synchronization
		
		//to fetch/traverse the values from this list -- we have to use explicit synchronization
		
		//what is Iterator?
		//Java Iterator interface used to iterate over the elements in a collection (list, set or map). It helps to retrieve the specified collection elements one by one and perform operations over each element. 1. Java Iterator interface
		
		synchronized(nameslist) {
			Iterator<String>it = nameslist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		//2 . copyOnWriteArrayList -- its a class: Thread-safe/synchronization already
		
		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
		emplist.add("Gowthami");
		emplist.add("Laxma");
		emplist.add("Avanthika");
		emplist.add("Siddharth");
		
		Iterator<String> it = emplist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}		
}
