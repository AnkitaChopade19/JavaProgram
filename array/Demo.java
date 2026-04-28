package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		 
//		int[] arr = {21,32,43,54,65};
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		System.out.println(arr.length - 1);
		
//		for(int i= 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		String[] name = {"Anu" , "Ashu", "Radha", "Krishna"};
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(name[i]);
//		}
		
//		int[] num = new int[4];
//		num[0]= 50;
//		num[1]=3;
//		num[2]=5;
//		num[3]=7;
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter 5 names : ");
//		String[] name = new String[4];
//		
//		for(int i=0; i<name.length; i++) {
//			name[i] = sc.nextLine();
//		}
//		
//		System.out.println("-----------------------------------");
//		for(int i=0; i<name.length; i++) {
//			System.out.println(name[i]);
//		}

		
//		int[] arr = {2,3,4,5,6};
		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//			}
			
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] % 2 == 1) {
//				System.out.println(arr[i]);
//			}
//		}
		
		int[] arr = {70,20,90,55,23};
		
	    Arrays.sort(arr);
	    System.out.println(arr);
	    
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(arr[i]);
	    }
	
		
		
	}

}
