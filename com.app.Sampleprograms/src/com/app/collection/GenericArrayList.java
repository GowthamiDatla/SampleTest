package com.app.collection;

import java.util.ArrayList;

public class GenericArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>markList = new ArrayList<Integer>();
		markList.add(100);
		System.out.println(markList);
		ArrayList<Double> doublearray = new ArrayList<Double>();
		doublearray.add(12.33);
		System.out.println(doublearray);
		ArrayList<String> Stringarray = new ArrayList<String>();
		Stringarray.add("Gowthami");
		System.out.println(Stringarray);
	}

}
