package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcepts {
//default class
//dynamic array
	
	public static void main(String[] args)
{	
		
  //these are static array
		
	/*int i[] = new int[4];
	i[0] = 100;
	//i[-1] = 200;
	System.out.println(i[0]);
	System.out.println(i[3]);*/
	
	//dynamic array
	//default generics
	
	ArrayList<Object> array = new ArrayList<Object>();
	array.add(100);
	array.add(200);
	array.add("testing");
	array.add('t');
	array.add(12.333);
	array.add(true);
	
	System.out.println(array);
	
	System.out.println(array.get(4));
	
    System.out.println(array.size());
    System.out.println("LI =" + 0);
    System.out.println("HI =" + (array.size()-1));
    array.add(400);
    array.add(500);
    System.out.println(array.size());
    
    //list with other collection
    
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
    System.out.println(numbers);
    
    
	
}	
}

