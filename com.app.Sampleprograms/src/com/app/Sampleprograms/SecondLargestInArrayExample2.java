

/*package com.app.Sampleprograms;

import java.util.Arrays;  
public class SecondLargestInArrayExample1{  
public static int getSecondLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+getSecondLargest(a,6));  
System.out.println("Second Largest: "+getSecondLargest(b,7));  
}}*/  

package com.app.Sampleprograms;
public class SecondLargestInArrayExample2 {
 
	public static void main(String[] args) {
 
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}

/*package com.app.Sampleprograms;
import java.util.Scanner;

public class SecondLargestInArrayExample1 {
    public static void main(String a[]) {
        int max = 0, second_max = 0, temp, numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        numbers = scanner.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers; i++) {
            if (i == 0) {
                max = scanner.nextInt();
            } else {
                temp = scanner.nextInt();
                if (temp > max) {
                    second_max = max;
                    max = temp;
                }
                else if    (temp>second_max)
                {
                 second_max=temp;
                }
            }
        }
        scanner.close();
        System.out.println("Second max number is :" + second_max);
    }
}*/