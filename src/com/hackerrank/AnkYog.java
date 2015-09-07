package com.hackerrank;

import java.util.Scanner;

public class AnkYog {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			Integer N= in.nextInt();
			int sum=0;
			if(N==0)
				System.out.println(9);
			else{
			while (N.toString().length()>1) {
				sum=0;
				while (N > 0) {
					
					int rem = N % 10;
					sum += rem;
					N = N / 10;
				}
				N = sum;
			}
			System.out.println(sum);
		}
			
		}
	}


}
