package com.combinatorics;

import java.util.Scanner;

public class PickingCards {

	private static final int MOD =1000000007;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			int size = in.nextInt();
			int [] count = new int[size];
			long result=1;

			for(int i=0;i<size;i++){
				int ci=in.nextInt();
				if(ci<size)
				count[ci]++;
			}
			int carry = 0;
			for(int i=0;i<size;i++){
				int totalOption = count[i] + carry;
				result =result * (totalOption);
				if(totalOption>=1)
					carry= totalOption-1;
				
				result = result % MOD; 
			}

			System.out.println(result);
		}
	}
}
