package com.euler;

import java.util.Scanner;

public class MaximumPathSum2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			int row = in.nextInt();
			int[][] arr = new int[row][row];
			for(int i=0;i<row;i++){
				for(int j=0;j<i+1;j++){
					arr[i][j]=in.nextInt();
				}
			}
			for(int i=1;i<row;i++){
				for(int j=0;j<i+1;j++){
					if(j==0)
						arr[i][j]= arr[i-1][j]+arr[i][j];
					else{ 
						if(arr[i-1][j-1]>arr[i-1][j])
							arr[i][j]= arr[i-1][j-1]+arr[i][j];
						else
							arr[i][j]= arr[i-1][j]+arr[i][j];
					}
				}
			}
			long max = arr[row-1][0];
			for(int i =1;i<row;i++){
				if(max<arr[row-1][i])
					max=arr[row-1][i];
			}
			
			System.out.println(max);
		}
	}
}
