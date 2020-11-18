package com.app.collection;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//virtual capacity - by default it will divide into 9 equal parts (0-9) 
//but this is not physically capacity
//initally it is 10 but in the movement we add the value in that movement capacity will increase 
//in this code physicall capacity is 4 and virtual capacity is 6

		ArrayList<Object> array = new ArrayList<Object>();
		System.out.println(array.size());
		array.add(100);
		System.out.println(array.size());
		array.add(200);
		array.add(300);
		array.add(400);
		
		System.out.println(array.size());
		
		
	}

}

