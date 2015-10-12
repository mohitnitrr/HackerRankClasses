package com.search;

import java.util.Scanner;

public class MaximiseSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		while (testcase-- != 0) {
			long N = in.nextLong();
			long M = in.nextLong();
			long result = 0;
			long currResult = 0;
			for (long i = 0; i < N; i++) {
				long next = in.nextLong();
				next = next % M;
				currResult += next;
				currResult = currResult % M;
				if (result < currResult)
					result = currResult;
			}
			
			System.out.println(result);
		}
	}
}
