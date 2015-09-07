package com.hackerrank;

import java.util.Scanner;

public class QuickSort2 {
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
//	private static int quickpivot(int start, int end) {
//		int pivot=end;
//		int chota=start;
//		int bada=start;
//		while(chota<pivot){
//			
//			int	nextchota =nextChota(chota,end);
//			int nextbda=nextBda(bada,end);
//			
//			if(nextchota>nextbda)
//			swap(nextbda,nextchota);
//			
////			chota=nextchota+1;
////			bada=nextbda+1;
//				
//		}
//		
//		swap(bada,pivot);
//		
//		printArr();
//		
//	return end;
//}

	private static int quickpivot(int start, int end) {
		int pivot=end;
		int less=start;
		int big=start;
		boolean flag=true;
		while(less<end&&big<end){
			
				while(arr[big]<arr[pivot]&&big<end)
				big++;
				while(arr[less]>=arr[pivot]&&less<end)
				less++;
				if(less>big){
				swap(less,big);
				if(less==end)
					flag=false;
				}
				else
				less++;
				
		}
		if(flag)
		swap(big,pivot);
		
		printArr();
		
	return big;
}
	
private static int nextBda(int bada, int end) {
	int i=bada;
	for(;i<end;i++){
		if(arr[i]>arr[end])
			return i;
	}
	return i;
	}

private static int nextChota(int chota,int end) {
	int i=chota;
		for(;i<end;i++){
			if(arr[i]<arr[end])
				return i;
		}
		return i;
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