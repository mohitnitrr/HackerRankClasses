package com.euler;

import java.util.Scanner;

public class CoinSum {

	private static int mod =1000000007;
	private static long[] coinSum = new long[100001];
	private static int[] coinsType ={1,2,5,10,20,50,100,200};
	private static int max=100001;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		fillCoinSum();
		int testCases = in.nextInt();
		while(testCases--!=0){
			int index = in.nextInt();
			System.out.println(coinSum[index]);
		}
	}
	private static void fillCoinSum() {
		coinSum[0]=1;
		for(int coin :coinsType){
			for(int j=coin;j<max;j++){
				coinSum[j]=(coinSum[j]+coinSum[j-coin])%mod;
			}
		}
	}
}
