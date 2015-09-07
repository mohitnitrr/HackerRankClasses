package com.geeks;

import java.util.Scanner;

public class CountOnes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		int count = countOnes(arr, 0, size - 1);
		System.out.println(count);
	}

	private static int countOnes(int[] arr, int low, int high) {
	/*	int mid = (start + end) / 2;
		if(mid == end)
			return end+1;
		else if (arr[mid] == 1 && arr[mid + 1] == 0)
			return mid + 1;
		else if (arr[mid] == 1)
			return countOne(arr, mid + 1, end);
		else {
			return countOne(arr, start, mid - 1);
		}*/
		
		 if (high >= low)
		  {
		    // get the middle index
		    int mid = low + (high - low)/2;
		 
		    // check if the element at middle index is last 1
		    if ( (mid == high || arr[mid+1] == 0) && (arr[mid] == 1))
		      return mid+1;
		 
		    // If element is not last 1, recur for right side
		    if (arr[mid] == 1)
		      return countOnes(arr, (mid + 1), high);
		 
		    // else recur for left side
		    return countOnes(arr, low, (mid -1));
		  }
		  return 0;
	}
}
