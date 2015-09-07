package com.euler;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		BigInteger finalSum = new BigInteger("0");
		for(int i=0;i<N;i++){
			finalSum =finalSum.add(new BigInteger(in.next()));
		}
		System.out.println(finalSum.toString().substring(0,10));
	}
}
