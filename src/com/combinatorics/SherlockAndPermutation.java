package com.combinatorics;

import java.util.Scanner;

public class SherlockAndPermutation {

	private static int mod =1000000009;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		while(testcases--!=0){
			int N = in.nextInt();
			int M = in.nextInt()-1;
			long result=0;
			int min = N>M?M:N;
			if(M==0)
				result =1;
			else
			{ 
				if(N==1 || M==1){
					result =N>M?N+1:M+1;
					
				}
				else{
					int diff=Math.abs(M-N)+2;
					long pow = nthPower2((min-1)*2);
					result = pow +diff;
				}
			}
			System.out.println(result);
		}

	}

	private static long nthPower2(int count) {
		int pow =1;
		for(int i=1;i<=count;i++){
			pow =(pow*2)%mod;
		}

		return pow;
	}

}
