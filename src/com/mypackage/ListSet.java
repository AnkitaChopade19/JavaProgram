package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class ListSet {
	public static void main(String[] args) {
		
		// 1. Write a Java program to store 5 integer elements in an ArrayList and print all elements.

//		ArrayList<Integer> lists = new ArrayList<Integer>();
//
//		lists.add(18);
//		lists.add(5);
//		lists.add(31);
//		lists.add(17);
//		lists.add(17);
//		lists.add(12);
//		lists.add(18);
//
//		System.out.println(lists);
		
		// 2. Write a Java program to add, update, and remove elements from a List.
		
//		System.out.println(lists.remove(2)); // remove 31 from list
//		System.out.println("After remove.. " + lists);
//		System.out.println(lists.set(3, 74));
//		System.out.println("After Update list.." + lists);
		
		// 3 .Write a Java program to find the size of a List and print the first and last element.
//
//		System.out.println("Size of List.. " + lists.size());
//		System.out.println("Fist element in list.. " + lists.get(0) + "\n");
//		System.out.println("Last Element in List.. " + lists.get(lists.size() - 1) + "\n");
		
		// 4. Write a Java program to check whether a given element exists in a List or not.
		
//		System.out.println("Element 18 Exist." + lists.contains(18) + "\n");   
		
		// 5. Write a Java program to iterate a List using: for-each loop
		
//		System.out.println("Iterate Elements using foreach loop..");
//		for (Integer list : lists) {
//			System.out.println(list);
//		}
		
		// 6. Write a Java program to sort a List of integers in ascending order.
		
//		Collections.sort(lists); // sort list
//		System.out.println("Sorted List : " + lists);
//
        // 7. Write a Java program to remove duplicate elements from a List.
		
//		System.out.println("Original List : " + lists);
//		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
//		for (Integer list : lists) {
//			if (!uniqueList.contains(list)) {
//				uniqueList.add(list);
//			}
//		}
//		System.out.println("After remove Duplicates: " + uniqueList);
//
        // 8. Write a Java program to copy all elements from one List to another List. 
		
//		ArrayList<Integer> copiedList = new ArrayList<Integer>(uniqueList);
//
//		System.out.println("Copied  List: " + copiedList);
//
		// 10. Write a Java program to convert a List into an array and print the array elements.
		
//		Integer[] arr = lists.toArray(new Integer[0]);
//		System.out.println("Array Elements:");
//		for (int num : arr) {
//			System.out.println(num);
//		}
        
		// 11. Store 5 names using ArrayList and print them.
		
//		ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("Tanseem");
//		list1.add("Asma");
//		list1.add("Atik");
//		list1.add("Ashfaq");
//		list1.add("Tanseem");
//		list1.add("Tanseem");
//		list1.add("Atik");
//		System.out.println(list1);
		
		// 12. Remove one element from ArrayList.
		
//		System.out.println(list1.remove(2));
//		System.out.println("After remove.. " + list1);

		// 13. Store numbers in HashSet and print them. &
		// 14. Demonstrate duplicate values in HashSet.

		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40); // Duplicates, will not be stored
		numbers.add(40); // duplicate
		numbers.add(50);

		System.out.println("numbers in Hashset:");
		for (Integer num : numbers) {
			System.out.println(num);
		}

		// 15. Store student id and name using HashMap.
		
		HashMap<Integer, String> Student = new HashMap<Integer, String>();
		System.out.println("\nStudent Details: ");
		Student.put(101, "Asma");
		Student.put(102, "Tanu");
		for (Integer id : Student.keySet()) {
			System.out.println("ID: " + id + " Name: " + Student.get(id));
		}

		// 16. Sort numbers using TreeSet.
		TreeSet<Integer> number = new TreeSet<Integer>();
		number.add(50);
		number.add(99);
		number.add(100);
		number.add(23);
		System.out.println("\nSorted numbers using TreeSet: ");
		for (Integer num : number) {
			System.out.println(num);
		}
		
		// Find size of collection.
		
		System.out.println("\nSize of list:" + number.size());
		
		//Check element using contains().
		
		System.out.println("contains 100 :" + number.contains(100)); 

		// Remove all elements using clear().
		
		number.clear(); 
		System.out.println("List: " + number);
		System.out.println("Size: " + number.size());

	}
	

}
