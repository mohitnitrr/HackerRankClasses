package com.hackerrank2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mArrSize=in.nextInt();
		int[] mArr = new int [mArrSize]; 
		for(int i=0;i<mArrSize;i++){
			mArr[i]=in.nextInt();
		}
		
		int arrSize=in.nextInt();
		int[] arr = new int [arrSize]; 
		for(int i=0;i<arrSize;i++){
			arr[i]=in.nextInt();
		}
		
		Arrays.sort(mArr);
		Arrays.sort(arr);
		int j=0;
		
		for(int i=0;i<arrSize;i++){
			
			if(j<mArrSize&&arr[i]==mArr[j]){
				j++;
			}
			else{
				int value=arr[i];
				System.out.print(arr[i]+" ");
				while(i<arrSize&&arr[i]==value)
					i++;
				i--;
			}
			
		}
		
	}
}
