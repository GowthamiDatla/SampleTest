package com.app.Sampleprograms;

public class Arrays {

	public static void main (String args[])
	{
		//String[] cars = null;
		String[] carnames = {"Honda", "Honda Oddesey", "Ford" , "BMW" , "Volva"};
		int[] mynumbers = {10,20,30,40,50};
		int[] [] mynumbers2 = {{1,2,3,4,5} , {6,7,8,9,0}};
		int x = mynumbers2[1][2];
		System.out.println(x);
		
		int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7, 2} };
	    for (int k = 0; k < myNumbers3.length; ++k) {
	      for(int l = 0; l < myNumbers3[k].length; ++l) {
	        System.out.println(myNumbers3[k][l]);
	      }
	    }
		//System.out.println(cars[0]);
		System.out.println(carnames[4]);
		System.out.print(mynumbers[4]);
		System.out.println(carnames.length);
		
		for(int i = 0; i<carnames.length; i++)
		{
			System.out.println(carnames[i]);
		}
		
		for(String i : carnames)
		{
			System.out.println(i);}
	}
	
}
