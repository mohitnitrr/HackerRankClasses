package com.hackerrank2;

import java.util.Scanner;

public class SummingNSeries {
private static final int Mod=1000000007;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			long n=in.nextLong();
			long result=summingNseries(n);
			System.out.println(result);
			}
		}

	private static long summingNseries(long n) {
		long square=n;
		if(square>=Mod)
		square=square%Mod;
		
		square*=square;
		
		return square%Mod;
	}

}
