package com.app.anonymous;

import java.util.Scanner;

public class fibnosisSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=1;
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of times");
	int num =  sc.nextInt();
	 System.out.println("Fibnosis Series of the number is: ");
	 for(int i=0;i<=num;i++) {
		 a=b;
	 b=c;
	 c=a+b;
	 System .out.print(a);
	 } 
	 

		
	}

}
