package com.array;

public class ArrayPrograms {
	
	public static void main(String[] args) {
		
        //1. Write a program to declare and initialize a 1D array of integers
		
		int[] numbers = {10,11,20,21,30};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Elements at Index "+ i + " = " + numbers[i]);
		}
		
		System.out.println("--------------------------------------------------");
		
		//2. Write a program to print all elements of 1D array
		
//		int [] arr = {5,10,15,20,25};
//		
//		System.out.println("Array elements are : ");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("---------------------------------------------------");
		
		//3. Write a program to find the length of a 1D array
		
		int [] array = {15,25,35,45,55,65,75};
		int length = array.length;
		
		System.out.println("Length of array = " + length);
		System.out.println("----------------------------------------------------");
		
		//4.Write a program to find the sum of all elements in a 1D array
		
//		int [] arrays = {2,3,4,5,6,7};
//		
//		int sum = 0;
//		for(int i = 0; i<arrays.length; i++) {
//			sum += arrays[i];
//		}
//		System.out.println("Sum of arrays : " + sum);
//		System.out.println("------------------------------------------------------");
		
		//5.Write a program to find the average of elements in a 1D array
		
		int [] arrays = {2,3,4,5,6,7};
		int sum = 0;
		for(int i=0; i<arrays.length; i++) {
			sum += arrays[i];
		}
		double avg = (double) sum/arrays.length;
		System.out.println(avg);
		System.out.println("-------------------------------------------------------");
		
		//6. Write a program to find the maximum element in a 1D array
		
		int [] arr = {10,47,60,2,59};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element = " + max);
		System.out.println("---------------------------------------------------------");	
		
		//7. Write a program to find the minimum element in a 1D array
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element = " + min);
		System.out.println("---------------------------------------------------------");
		
		//8. Write a program to search an element in a 1D array 
		
//		int[] arry = {10,20,30,40,50};
//		int key = 30;
//		boolean found = false;
//		
//		for (int i =0; i<arry.length; i++) {
//			if(arry[i]==key) {
//				System.out.println("Element found at index " + i);
//				found = true;
//				break;
//			}
//		}
//		if(!found) {
//			System.out.println("Element not found");
//			System.out.println("--------------------------------------------------------");
//		}
		
		//9. Write a program to count even and odd numbers in a 1D array.
		
		int[] arry = {10,23,31,40,55};
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i<arry.length; i++) {
			if(arry[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even numbers = " + even);
		System.out.println("Odd numbers = " +odd);
		System.out.println("---------------------------------------------------------------");
		
		//10. Write a program to copy elements from one array to another.
		
		int[] arr1 = {10,20,30,40,50};
	    int[] arr2 = new int[arr1.length];
	    
	    for(int i= 0; i<arr1.length; i++) {
	    	arr2[i] = arr1[i];
	    	System.out.println("Copied element : "+arr1[i]);
	    }
	    	for(int i=0; i<arr2.length; i++) {
	    		
	    		System.out.println(arr2[i]);
	    	}
	   
		
	}
}
