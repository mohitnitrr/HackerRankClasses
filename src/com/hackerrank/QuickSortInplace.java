package com.hackerrank;

import java.util.Scanner;

public class QuickSortInplace {
	private static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int length= in.nextInt();
		arr=new int[length];
		for(int i=0;i<length;i++){
			arr[i]=in.nextInt();
		}
		int start=0;
		int end=length-1;
		quickSort(start,end);
	}
	private static void quickSort(int start, int end) {
		if(start>=end)
			return;
		else{
			int pivot=quickpivot(start,end);
			
			quickSort(start, pivot-1);
			quickSort(pivot+1, end);
		}
		
	}
	private static int quickpivot(int start, int end) {
			int pivot=end;
			while(start<end){
				
					while(arr[start]<arr[pivot]&&start<end)
					start++;
					while(arr[end]>=arr[pivot]&&start<end)
					end--;
					if(end>start)
					swap(start,end);
				
					
			}
			
			swap(start,pivot);
			
			printArr();
			
		return end;
	}
	
	private static void printArr() {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	private static void swap(int end, int pivot) {
		int temp=arr[pivot];
		arr[pivot]=arr[end];
		arr[end]=temp;
		
	}

}
