package com.dynamic;

import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int testCase = in.nextInt();
		while(testCase--!=0){
			int size = in.nextInt();
			int sum = in.nextInt();
			int[] arr= new int[size];
			for(int i=0;i<size;i++){
				arr[i] = in.nextInt();
			}
			
			boolean[] sumArr = new boolean[sum+1];
			sumArr[0] = true;
			int maxSum =0;
			for(int j=1;j<=sum;j++ ){
				for(int k :arr){
					if(j-k >= 0){
						sumArr[j]=sumArr[j-k];
						if(sumArr[j]){
							maxSum=j;
							break;
						}
							
					}
					
				}
			}
			
			System.out.println(maxSum);
		}
	}
}
