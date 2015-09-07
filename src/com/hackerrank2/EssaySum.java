package com.hackerrank2;

import java.util.Scanner;

public class EssaySum {
	
		private static final int Mod=1000000007;
			
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int testcases=in.nextInt();
				while(testcases--!=0){
					long N =in.nextLong();
					long M=in.nextLong();
					long sumOfRemainder=sumOfRemainder(M);
					long quotient=N/M;
					long remainder=N%M;
					long totalSum=quotient*sumOfRemainder+sumOfRemainder(remainder+1);
					System.out.println(totalSum);
					
					}
				}

			private static long sumOfRemainder(long m) {
				m=m-1;
				long sum=0;
				sum=m*(m+1)/2;
				return sum;
			}
		}
