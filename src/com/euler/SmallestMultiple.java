package com.euler;

import java.util.Scanner;

public class SmallestMultiple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();

		while(testcases--!=0){
			int N = in.nextInt();
			boolean[] primeFactor = new boolean[N+1];
			long multiple =1;
			
			for(int i=2;i<=N;i++){
				if(!primeFactor[i]){
					for(int j =i;j<=N;j=j*i){
						primeFactor[j]=true;
						multiple=multiple*i;
					}
				}
				for(int j =i;j<=N;j=j+i){
					primeFactor[j]=true;
				}
			}
			System.out.println(multiple);
		}
	}
}
