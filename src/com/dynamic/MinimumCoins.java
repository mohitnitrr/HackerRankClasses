package com.dynamic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinimumCoins {

	private static int[] value;
	private static Integer[] coins;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = in.nextInt();
		int nofCoins= in.nextInt();
		coins = new Integer[nofCoins];
		value = new int[sum+1];
		
		for(int i= 0;i<=sum;i++){
			value[i]= -1;
		}
		for(int i =0;i<nofCoins;i++){
			coins[i] = in.nextInt();
		}
		Arrays.sort(coins,Collections.reverseOrder());
		
		long count = countWays(sum);
		System.out.println(count);
	}

	private static long countWays(int sum) {
		int coinLength= coins.length;
		long [][] table = new long[sum+1][coinLength];
		
		for(int j=0;j<coinLength;j++){
			table[0][j] =1;
		}
		for(int i =1; i<=sum ;i++){
			for(int j=0;j<coinLength;j++){
				
				long x=((i-coins[j])>=0)?table[i-coins[j]][j]: 0;
				
				long y = (j>=1)?table[i][j-1] :0;
				
				table[i][j]= x+y;
			}
		}
		
		return table[sum][coinLength-1];
	}
}
