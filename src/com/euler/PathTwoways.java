package com.euler;

import java.util.Scanner;

public class PathTwoways {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		long[][] arr = new long[row][row];
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				if(i==0 && j==0)
					continue;
				else if(i==0)
					arr[i][j]=arr[i][j-1]+arr[i][j];
				else if(j==0)
					arr[i][j]=arr[i-1][j]+arr[i][j];
				else{
					if(arr[i][j-1]<arr[i-1][j])
						arr[i][j]=arr[i][j]+arr[i][j-1];
					else
						arr[i][j]=arr[i][j]+arr[i-1][j];
				}
			}
		}

		System.out.println(arr[row-1][row-1]);
	}


}
