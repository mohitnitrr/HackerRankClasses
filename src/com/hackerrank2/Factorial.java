package com.hackerrank2;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int N=in.nextInt();
			BigInteger fact= new BigInteger("1");
			BigInteger inc= new BigInteger("1");
			for(int c=1;c<=N;c++){
				fact=fact.multiply(inc);
				inc =inc.add(BigInteger.ONE);
				
			}
			System.out.println(fact);
		}
		
	}
}
