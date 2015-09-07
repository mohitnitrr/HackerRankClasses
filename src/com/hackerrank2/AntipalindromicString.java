package com.hackerrank2;

import java.util.Scanner;

public class AntipalindromicString {

	private static final int Mod=1000000007;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
		int N=in.nextInt();
		int R=in.nextInt();
		int antipalindrom=antiPalindrrom(R,N);
		System.out.println(antipalindrom);
		
		System.out.println(Integer.toBinaryString(5));
		}
	}

	private static int antiPalindrrom(int n, int r) {
		int diff=n-r;
		int count=1;
		for(int i=r;i>0;i--){
		count=(count*n)%Mod;
		n--;
		}
		
		return count;
	}
}