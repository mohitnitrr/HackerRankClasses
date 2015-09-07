package com.dynamic;

import java.util.Scanner;

public class LongestCommonSequenceNLOGN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0;i<size;i++){
			arr[i] = in.nextInt();
		}
		
		System.out.println(maxlength(arr,size));
	}

	private static int maxlength(int[] arr, int size) {
		int[] maxAtIndex = new int[size];
		int len =1;
		maxAtIndex[0]= arr[0];
		for(int i =0 ;i<size;i++){
			if(arr[i]<maxAtIndex[0])
				maxAtIndex[0]=arr[i];
			else if(arr[i]>maxAtIndex[len-1])
				maxAtIndex[len++]=arr[i];
			else{
				maxAtIndex[getIndex(maxAtIndex,0,len-1,arr[i])]=arr[i];
			}
		}
		
		return len;
	}

	private static int getIndex(int[] maxAtIndex, int start, int end, int value) {
		if(start ==end )
			return start;
		
		while(start!=end){
			int mid = start + (end-start)/2;
			if(value >maxAtIndex[mid])
				start=mid+1;
			else
				end=mid;
		}
		
		return start;
	}
	
}
