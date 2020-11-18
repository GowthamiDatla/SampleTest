package com.app.Sampleprograms;

public class MissingNumbers {

	/**
	 * Class to find missing number in an array
	 */
	     static void print(String value) {
	        System.out.print(value);
	    }

	    /**
	     * Function to find the missing number in a array
	     * @param arr : given array
	     * @param max : value of maximum number in the series
	     */
	    static void findMissingNumber(int[] arr, int max){
	          //3
	        int sumOfAllNumbers = 0;
	        int currentSum = 0;
	    
	          //4
	        //find the sum of all numbers
	        sumOfAllNumbers = (max * (max + 1))/2;
	    
	          //5
	        //find sum of all elements of the array by iterating through them
	        for (int i =0;i<arr.length;i++){
	            currentSum += arr[i];
	        }

	        print("Missing number "+ (sumOfAllNumbers - currentSum));

	    }

	    public static void main(String[] args) {
	          //1
	        int maxNumber = 10;
	        int[] givenArr = {1,2,3,5,7,9,6,8,10};
	    
	          //2
	        findMissingNumber(givenArr, maxNumber);

	    }
	}

