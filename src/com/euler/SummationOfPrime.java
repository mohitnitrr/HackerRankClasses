package com.euler;

import java.util.Scanner;

public class SummationOfPrime {

	private static long[] primeNumber = new long[100001];
	private static  int currentIndex =0;
	public static void main(String[] args) {
		primeNumber[0]=2;
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		while (testcases--!=0) {
			int limit = in.nextInt();
			fillPrimeNumbers(limit);
			int index = binarySearch(0, currentIndex, limit);
			System.out.println(sum(index));
		}
	}
	private static long sum(int index) {
		long sum =0;
		for(int i=0;i<=index;i++){
			sum+=primeNumber[i];
		}
		return sum ;
	}
	private static int binarySearch(int left, int right, int limit) {

		int mid =(left + right)/2;
		if (left==right && primeNumber[left]!=limit)
			return -1;
		if(primeNumber[mid]==limit)
			return mid;
		else if(primeNumber[mid]<limit && primeNumber[mid+1]>limit)
			return mid;
		else{
			if(primeNumber[mid]<limit)
				return binarySearch(mid+1, right, limit);
			else
				return binarySearch(left, mid-1, limit);
		}


	}
	private static void fillPrimeNumbers(int limit) {	
		while (true) {
			if (primeNumber[currentIndex] > limit){
				return;
			}
			else {
				primeNumber[currentIndex + 1] = nextPrimeNumber();
				currentIndex++;
			}
		}
	}
	private static long nextPrimeNumber() {
		long next = primeNumber[currentIndex]+1;
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
