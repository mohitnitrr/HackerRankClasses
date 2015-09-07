package com.hackerearth;

import java.util.Scanner;

public class LeftRightSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
	outer:	while(testcases--!=0){
			int size = in.nextInt();
			int[] arr= new int[size];
			
			long sum = 0;
			for(int i=0; i<size;i++){
				arr[i]=in.nextInt();
				sum+=arr[i];
			}
			long leftSum= arr[0];
			long rightSum= sum-arr[0]-arr[1];
			for(int i=1;i<size-1;i++){
				
				if(leftSum==rightSum){
					System.out.println("YES");
					continue outer; 
					
				}
				leftSum +=arr[i];
				rightSum=rightSum-arr[i+1];
						
			}
			
			System.out.println("NO");
		}
	}
}
