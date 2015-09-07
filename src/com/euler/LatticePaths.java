package com.euler;

import java.util.Scanner;

public class LatticePaths {

	private static int mod =1000000007;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		while(testcases--!=0){
			int row = in.nextInt();
			int col = in.nextInt();
			long[][] latticepaths = new long[row+1][col+1];
			
			for(int i=0;i<=row;i++){
				for(int j=0;j<=col;j++){
					if(i==0||j==0)
						latticepaths[i][j]=1;
					else{
						latticepaths[i][j]=(latticepaths[i-1][j]+latticepaths[i][j-1])%mod;
					}
				}
			}
			
			System.out.println(latticepaths[row][col]);
		}
	}
}
