package com.euler;

import java.util.Scanner;

public class PrimeNumber10001 {

	private static long[] primeNumber = new long[10001];
	private static  int currentIndex =0;
	public static void main(String[] args) {
		primeNumber[0]=2;
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		while(testcases--!=0){
			int index = in.nextInt();
			if(index<=currentIndex+1){
				System.out.println(primeNumber[index-1]);
			}else{
				fillPrimeNumbers(index);
				System.out.println(primeNumber[index-1]);
			}
		}
	}
	private static void fillPrimeNumbers(int index) {
		long currentPrimeNumber =primeNumber[currentIndex];
		for(int i =currentIndex+1;i<index;i++){
			currentPrimeNumber = nextPrimeNumber(currentPrimeNumber);
			primeNumber[i]=currentPrimeNumber;
			currentIndex=i;
		}
		
	}
	private static long nextPrimeNumber(long currentPrimeNumber) {
		long next = currentPrimeNumber+1;
		while(true){
			if(isPrimeNumber(next))
			  return next;
			else
				next++;	
		}
	}
	private static boolean isPrimeNumber(long next) {
		for(int i=0;i<=currentIndex;i++){
			if(next%primeNumber[i]==0)
				return false;
		}
		return true;
	}
}