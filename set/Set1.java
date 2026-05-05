package com.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set1 {
	
	public static void main(String[] args) {
		
	// 1. program to store 5 integer elements in an Set and print all elements.

			Set<Integer> set = new HashSet<Integer>();
			set.add(123);
			set.add(123); // remove Duplicate
			set.add(345);
			set.add(8756);
			set.add(988);
			set.add(null);
			set.add(null); // only one null Accepted

			Iterator itr = set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

			// 2. program to add, update, and remove elements from a Set
			System.out.println(set);
			System.out.println(set.remove(345)); // remove 345 from Set
			System.out.println("After remove.. " + set);
			System.out.println(set.add(18));
			System.out.println("After add: " + set);

			// 3. program to find the size of a Set and print the first and last element.

			System.out.println("Size of Set.. " + set.size());
			// System.out.println("Fist element in Set.. " + set.get(0) + "\n"); // in set Random Access not Possiblle
			//	System.out.println("Last Element in Set.. " + set.get(set.size() - 1) + "\n");

			// 4. program to check whether a given element exists in set or not.
			System.out.println("Element 18 Exist: " + set.contains(18) + "\n"); // Check Element using Contains

			// 5. program to iterate a HashSet using: for-each loop
			System.out.println("Iterate Elements using foreach loop..");
			for (Integer sets : set) {
				System.out.println(sets);
			}

			// 5. program to sort a HashSet of integers in ascending order.
			// Collections.sort(set); // sort is not possible in HashSet

			// 6. program to remove duplicate elements from a HashSet.

			Set<Integer> set1 = new HashSet<Integer>();
			set1.add(13);
			set1.add(12); // remove Duplicate
			set1.add(13);
			set1.add(8756);
			set1.add(12);
			set1.add(null);
			set1.add(null); // only one null Accepted

			Iterator itr1 = set1.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			System.out.println(" remove Duplicates: " + set1);

				// 7. program to copy all elements from one HashSet to another  HashSet.
			HashSet<Integer> copiedSet = new HashSet<Integer>(set1);
			System.out.println("Copied  set: " + copiedSet);
			
				// 8. program to convert a HashSet into an array and print the array elements.
			Integer[] arr = set1.toArray(new Integer[0]);
			System.out.println(Arrays.toString(arr));

			// 9. Store 5 names using HashSet and print them.
			HashSet<String> set2 = new HashSet<String>();
			set2.add("Ankita");
			set2.add("Shivani");
			set2.add("Shital");
			set2.add("Mona");
			set2.add("Ankita");
			set2.add("Ankita");
			set2.add("Shital");
			System.out.println(set2);

			// 10. Remove one element from ArrayList.
			System.out.println(set2.remove("Shivani"));
			System.out.println("After remove.. " + set2);

			// HashSet
			// 11.Store numbers in HashSet and print them.
			HashSet<Integer> numbers = new HashSet<Integer>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40); // Duplicates, will not be stored
			numbers.add(40); // duplicate
			numbers.add(50);
		      
				// 12. Demonstrate duplicate values in HashSet.
			System.out.println("numbers in Hashset:");
			for (Integer num : numbers) {
				System.out.println(num);
			}

	    		 // 14.Sort numbers using TreeSet.
				// TreeSet  ---> Provide set in sorted order
			TreeSet<Integer> number = new TreeSet<Integer>();
			number.add(50);
			number.add(99);
			number.add(100);
			number.add(23);
			System.out.println("\nSorted numbers using TreeSet: ");
			Iterator it = number.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("\nSize of TreeSet:" + number.size());
			System.out.println("contains 100 :" + number.contains(100)); // Check Element using Contains

			number.clear(); // remove all elements
			System.out.println("set: " + number);
			System.out.println("Size: " + number.size());
			
			
			// LinkedHashSet  -->  insertion order followed
			LinkedHashSet<Integer> set3 = new LinkedHashSet<Integer>();
			set3.add(123);
			set3.add(123); // remove Duplicate
			set3.add(345);
			set3.add(8756);
			set3.add(988);
			set3.add(null);
			set3.add(null); // only one null Accepted

			Iterator itra = set3.iterator();
			while (itra.hasNext()) {
				System.out.println(itra.next());
			}
			
			
		}

}
