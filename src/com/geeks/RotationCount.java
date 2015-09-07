package com.geeks;

import java.util.Scanner;

public class RotationCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[count];
		for(int i=0;i<count;i++){
			arr[i]= in.nextInt();
		}
		int smallestIndex =getPivot(arr,0,count-1);
		System.out.println(count-smallestIndex);
	}

	private static int getPivot(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if(mid ==end )
			return end+1;
		else if(mid==start && arr[mid]>arr[end])
			return end;
		else if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
			return mid+1;		
		}else{
			if(arr[mid]>arr[end])
			return getPivot(arr,mid+1,end);
			else
				return getPivot(arr, start, mid);
		}
		
	}
}
