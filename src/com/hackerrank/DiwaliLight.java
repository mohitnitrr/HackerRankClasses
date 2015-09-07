package com.hackerrank;

import java.util.Scanner;

public class DiwaliLight {
	private static final int mod=100000;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcase= in.nextInt();
		
		while(testcase--!=0){
			int bulbs=in.nextInt();
			long pattern=1;
			//long pattern=(long)(Math.pow(2, bulbs)-1)%mod;
			for(int i=0;i<bulbs;i++){
				pattern=(pattern*2)%mod;
			}
			pattern--;
			System.out.println(pattern);
			}
		
		}


	
}
