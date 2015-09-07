package com.dynamic;

import java.util.Scanner;


public class MaximumSubarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		
		while(testcase--!=0){
			boolean ispositive=false;
			int size=in.nextInt();
			int [] arr=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=in.nextInt();
				if(arr[i]>0)
					ispositive=true;
			}
			if(ispositive){
			printMaxContinuousSubArray(arr);
			printMaxNonContinuousSubArray(arr);
			}
			else{
				int min=maximum(arr);
				System.out.print(min+" ");
				System.out.println(min);
			}
				
		}
	}

	private static int maximum(int[] arr) {
		int max=arr[0];
		for(int x:arr){
			if(x>max)
				max=x;
		}
		return max;
	}

	private static void printMaxNonContinuousSubArray(int[] arr) {
		int sum=0;
		for(int x:arr){
			if(x>0)
				sum+=x;
		}
		System.out.println(sum);
	}

	private static void printMaxContinuousSubArray(int[] arr) {
		int max_ending_here=0;
		int max_so_far=0;
		for(int x:arr){
			max_ending_here+=x;
			if(max_ending_here<0)
				max_ending_here=0;
			else{
				if(max_ending_here>max_so_far)
					max_so_far=max_ending_here;
			}
		}
		System.out.print(max_so_far+" ");
	}
}
