package com.hackerrank;

import java.util.Scanner;

public class FlipBit {

	private final static long max=4294967295l;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			long x=in.nextLong();
			System.out.println(x^max);
		}
	}
}
