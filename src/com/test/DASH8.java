package com.test;

import java.util.Scanner;

public class DASH8 {

	private  static final int mod=100000;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int N=in.nextInt();
			int sum=1;
			int temp=0;
			for(int i=1;i<=N;i++){
				sum=(sum*2)%mod;
			}
			
			System.out.println(sum-1);
		}
	}
}
