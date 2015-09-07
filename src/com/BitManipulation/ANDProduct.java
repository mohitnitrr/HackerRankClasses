package com.BitManipulation;

import java.util.Scanner;

public class ANDProduct {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		
		while(testCase--!=0){
			long min = in.nextLong();
			long max = in.nextLong();

			long result = min & max;

			for(long i=0;i<32;i++){
				long diff = (long
						)1<<i;
				if(diff>result)
					break;
				if((result & diff)>0){
					if((max-min +1) >diff){
						result = result & ~diff;
					}
				}
			}

			System.out.println(result);
		}
	}
}
