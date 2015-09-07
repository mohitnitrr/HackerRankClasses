package com.hackerrank;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			int N=  in.nextInt();
			int sum=0;
			while(N>0){
			int rem=N%10;
			sum+=rem;
			N=N/10;
			}
			System.out.println(sum);
		}
	}

}
