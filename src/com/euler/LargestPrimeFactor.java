package com.euler;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			long N = in.nextLong();
			long maxPrime=1;
			for(long i=2;i<=Math.sqrt(N);i++){
				if(N%i==0){
					maxPrime=i;
					while(N%i==0){
						N =N/i;
					}
				}
			}
			if(N>1)
				maxPrime=N;
			System.out.println(maxPrime);
		}
	}
}
