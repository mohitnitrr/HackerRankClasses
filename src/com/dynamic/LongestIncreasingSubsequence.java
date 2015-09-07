package com.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Size=in.nextInt();
		int [] arr =new int[Size];
		for(int i=0;i<Size;i++){
			arr[i]=in.nextInt();
		}
		printLongestIncreasingSubsequence(arr);
		
	}

	private static void printLongestIncreasingSubsequence(int[] arr) {
		int[] LIS=new int[arr.length];
		Arrays.fill(LIS, 1);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]&&LIS[i]<LIS[j]+1){
					LIS[i]=LIS[j]+1;
				}
			}
		}
		int max=LIS[0];
		for(int x:LIS){
			if(x>max)
				max=x;
		}
		
		System.out.println(max);
	}
}
