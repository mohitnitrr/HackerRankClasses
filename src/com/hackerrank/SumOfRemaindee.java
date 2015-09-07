package com.hackerrank;

import java.util.Scanner;

public class SumOfRemaindee {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
		int nUpto=in.nextInt();
		int divisor=in.nextInt();
		
		int sumOfremainders=sumRemainder(divisor);
		int allRemainderComes=nUpto/divisor;
		int someRemainderComes=nUpto%divisor;
		int totalSum=allRemainderComes*sumOfremainders+someRemainderSum(someRemainderComes);
		System.out.println(totalSum);
		}
	}


	private static int someRemainderSum(int someRemainderComes) {
		int sum=0;
		for(int i=1;i<=someRemainderComes;i++){
			sum+=i;
		}
		return sum;
	}
	

	private static int sumRemainder(int divisor) {
		int sum=0;
		for(int i=1;i<divisor;i++){
			sum+=i;
		}
		return sum;
	}
}
