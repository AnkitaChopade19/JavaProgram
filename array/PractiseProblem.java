package com.array;

public class PractiseProblem {
	
	public static void main(String[] args) {
		
        // 1. Create an array and find duplicates.
		
//		 int arr[] = {1, 2, 3, 2, 4, 5, 1};   // for 1D
//
//	        int n = arr.length;
//
//	        System.out.println("Duplicate elements:");
//
//	        for (int i = 0; i < n; i++) {
//
//	            for (int j = i + 1; j < n; j++) {
//
//	                if (arr[i] == arr[j]) {
//	                    System.out.println(arr[i]);
//	                    break; 
//	                }
//	            }
//	        }
	        
		 int arr[][] = {
		            {1, 2, 3},
		            {2, 4, 5},
		            {1, 6, 3}
		        };

		        int rows = arr.length;
		        int cols = arr[0].length;

		        System.out.println("Duplicate elements:");

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {

		                boolean isDuplicate = false;
		                for (int x = i; x < rows; x++) {
		                    for (int y = 0; y < cols; y++) {

		                        if (x == i && y <= j)
		                            continue;

		                        if (arr[i][j] == arr[x][y]) {
		                            isDuplicate = true;
		                        }
		                    }
		                }

		                if (isDuplicate) {
		                    System.out.println(arr[i][j]);
		                }
		            }
		        }

		
		
		
		// 2. Print addition of whole array
		
//		 int[][] arr = {
//		            {1, 2, 3},
//		            {4, 5, 6},
//		            {7, 8, 9}
//		        };
//
//		        int sum = 0;
//		        
//		        for(int i=0; i<arr.length; i++) {
//		        	for(int j=0; j<arr[i].length; j++) {
//		        		sum = sum + arr[i][j];
//		        	}
//		        }
//              System.out.println("Sum of all Elements = " + sum);
		
		//3. Print number is even or odd
		
//		    int[] arr = {1, 2, 3, 4, 5, 6};
//
//	        for (int i = 0; i < arr.length; i++) {
//	            if (arr[i] % 2 == 0) {
//	                System.out.println(arr[i] + " is Even");
//	            } else {
//	                System.out.println(arr[i] + " is Odd");
//	            }
//	        }
		
		// 4. Checked prime and print
	        
//		 int arr[][] = {
//		            {2, 4, 5},
//		            {7, 8, 9},
//		            {11, 13, 15}
//		        };
//
//		     System.out.println("Prime numbers in 2D array:");
//
//		     for (int i = 0; i < arr.length; i++) {
//		          for (int j = 0; j < arr[i].length; j++) {
//
//		              int num = arr[i][j];
//		              int count = 0;
//		               
//		               for (int k = 1; k <= num; k++) {
//		                  if (num % k == 0) {
//		                      count++;
//		                    }
//		                }
//
//		                if (count == 2) {
//		                    System.out.println(num + " at position (" + i + "," + j + ")");
//		                }
//		          }
//		     }
		     
		     
		 // 5. Remove duplicate
		     
//		int arr[][] = {
//	            {1, 2, 3},
//	            {2, 4, 5},
//	            {1, 6, 3}
//	        };
//
//	        int rows = arr.length;
//	        int cols = arr[0].length;
//
//	        System.out.println("Unique elements:");
//
//	        for (int i = 0; i < rows; i++) {
//	            for (int j = 0; j < cols; j++) {
//
//	                boolean isDuplicate = false;
//
//	                for (int x = 0; x <= i; x++) {
//	                    for (int y = 0; y < cols; y++) {
//
//	                        if (x == i && y == j)
//	                            break;
//
//	                        if (arr[i][j] == arr[x][y]) {
//	                            isDuplicate = true;
//	                            break;
//	                        }
//	                    }
//	                    if (isDuplicate)
//	                        break;
//	                }
//
//	                if (!isDuplicate) {
//	                    System.out.print(arr[i][j] + " ");
//	                }
//	            }
//	        }
	        
	     // 6. Checked No palindrome  or not.
	        
//	        int arr[][] = {
//	                {121, 123, 44},
//	                {43, 77, 56}
//	            };
//
//	            int rows = arr.length;
//	            int cols = arr[0].length;
//
//	            for (int i = 0; i < rows; i++) {
//	                for (int j = 0; j < cols; j++) {
//
//	                    int num = arr[i][j];
//	                    int original = num;
//	                    int reverse = 0;
//
//	                        while (num > 0) {
//	                        int digit = num % 10;
//	                        reverse = reverse * 10 + digit;
//	                        num = num / 10;
//	                    }
//
//	                    if (original == reverse) {
//	                        System.out.println(original + " is Palindrome");
//	                    } else {
//	                        System.out.println(original + " is Not Palindrome");
//	                    }
//	                }
//	            }
	        
	        
	}

}
