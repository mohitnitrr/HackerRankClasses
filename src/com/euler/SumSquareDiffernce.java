package com.euler;

import java.util.Scanner;

public class SumSquareDiffernce {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();

		while(testcases--!=0){
			long N = in.nextLong();
			long result = N * (N+1)*(N-1)*(3*N+2)/12;
			System.out.println(result);
		}
	}
}