package com.hackerrank;

import java.util.Scanner;

public class RedJohnIsBack {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int testcases=in.nextInt();
		
		while(testcases--!=0){
			int N =in.nextInt();
			int totalCase=0;
			int noOfPrime=0;
			
			for(int i=0;i<=N;i++){
				int no4block=4*i;
				int no1block=N-no4block;
				if(no4block>N)
					break;
				else if(no1block==N)
					totalCase++;
				else{
					no4block=i;
					totalCase=totalCase+count(no4block,no1block);
				}
					
			}
			noOfPrime=countPrime(totalCase);
			System.out.println(noOfPrime);
		}
	}

	private static int countPrime(int totalCase) {
		int count=0;
		for(int i=2;i<=totalCase;i++){
			if(i==2)
				count++;
			else if(isPrime(i))
				count++;
				
			
		}
		return count;
	}

	private static boolean isPrime(int i) {
		boolean flag =true;
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				flag=false;
				break;
			}
			
		}	
		return flag;
	}

	private static int count(int no4block, int no1block) {
		int patterns=0;
		int numerator=1;
		if(no1block>no4block){
			for(int k=no1block+1;k<=no1block+no4block;k++){
				numerator=numerator*k;
			}
				patterns=numerator/factorial(no4block);
			
		}
		else{
			for(int k=no4block+1;k<=no1block+no4block;k++){
				numerator=numerator*k;
				}
				patterns=numerator/factorial(no1block);
				
		}
			
		
		return patterns;
	}

	private static int factorial(int i) {
		int fact=1;
		for(int j=2;j<=i;j++)
			fact=fact*j;
		return fact;
		
	}
}
