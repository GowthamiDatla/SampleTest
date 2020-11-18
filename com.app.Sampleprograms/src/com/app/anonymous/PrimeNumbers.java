package com.app.anonymous;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the number: " +num);
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
		{
				isPrime = false;
				break;	
		}
		if(isPrime==true)
		{
          System.out.println(num + " is a prime number ");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}
	}
}
