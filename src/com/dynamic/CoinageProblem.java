package com.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class CoinageProblem {

	private static int[] value;
	private static int[] coins;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = in.nextInt();
		int nofCoins= in.nextInt();
		coins = new int[nofCoins];
		value = new int[sum+1];
		
		for(int i= 0;i<=sum;i++){
			value[i]= -1;
		}
		for(int i =0;i<nofCoins;i++){
			coins[i] = in.nextInt();
		}
		Arrays.sort(coins);
		
		int count = countWays(sum,coins.length-1);
		System.out.println(count);
	}

	private static int countWays(int sum, int index) {
		int count =0;
		if(sum == 0)
			return 1;
		else if(sum<0 || index<0)
			return 0;
		else if(value[sum]!=-1)
			return value[sum];
		else{
			return countWays(sum, index-1) + countWays(sum-coins[index],index);
		}
		
	}
}
