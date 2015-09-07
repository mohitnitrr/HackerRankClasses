package com.hackerrank2;

import java.util.Scanner;

public class HugeDonation {

	private static long  MAX=(long)(Math.pow(2, 64)-1);
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		while(testcases--!=0){
			long N =in.nextLong();
			int count=0;
			for(long i=1;i<=N;i++){
				long  donationSum =(i*(i+1)*(2*i+1))/6;
				if(donationSum<=N&&donationSum>0)
					count++;
				else
					break;
				
			}
			System.out.println(count);
		}
	}
}
