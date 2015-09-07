package com.combinatorics;

import java.util.Scanner;

public class NCandyStore {

	private static int MAXSIZE=2002;
	private static final int MOD =1000000000;
	private static int[][] values = new int[MAXSIZE][MAXSIZE];
	
	public static void main(String[] args) {
		fillPascaltriangle();
		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			int N =in.nextInt();
			int K =in.nextInt();
			
			int row = K + N -1;
			int col = N-1;
			
			System.out.println(values[row][col]);
		}
	}
	private static void fillPascaltriangle() {
		values[0][0]=1;
		
		for(int i=1;i<MAXSIZE-1;i++){
			
			for(int j=0;j<=i;j++){
				
				if(j==0){
					values[i][j]=1;
				}
				else{
					values[i][j]=(values[i-1][j-1] % MOD +values[i-1][j] % MOD) % MOD;
				}
				
			}
		}
	}
}
