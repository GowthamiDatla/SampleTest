package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,4,6,3,8,9,4,6,8));
	    
		//linkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDuplicates);
		
		//JDK - Stream
	
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,4,6,3,8,9,4,6,8));
       List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
       System.out.println(marksListUnique);
		
	}

}
