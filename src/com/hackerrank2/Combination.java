package com.hackerrank2;

import java.math.BigInteger;
import java.util.Scanner;

public class Combination {
	
	private static final long Mod=1000000000;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		while(testcase--!=0){
			int N=in.nextInt();
			long [] nCr=new long[N+1];
			int i,j;
			for( i=0;i<=N/2;i++){
				nCr[i]=combination(N,i);
			}
			if(N%2==0)
				j=i-1;
			else
				j=i;
			for( ;j<=N;j++,i--){
				nCr[j]=nCr[i-1];
			}
			for(i=0;i<=N;i++){
				System.out.print(nCr[i]+" ");
			}
			System.out.println();
		}
	}

	private static long combination(int n, int i) {
		int loop;
		BigInteger numerator=new BigInteger("1");
		BigInteger inc =new BigInteger("1");
		BigInteger denominator=new BigInteger("1");
		
		if(i<(n-i))
			loop=i;
		else
			loop=n-i;
		
		for(int j=1;j<=loop;j++){
			denominator=denominator.multiply(BigInteger.valueOf(j));
			
			}
		for(int j=1;j<=loop;j++){
			numerator=	numerator.multiply(BigInteger.valueOf(n));
			n--;
			}
		return numerator.divide(denominator).mod(BigInteger.valueOf(Mod)).longValue();
		}
}

