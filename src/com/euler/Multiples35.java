package com.euler;

import java.util.Scanner;

public class Multiples35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		while(testcases--!=0){
			int N = in.nextInt();
			long sum =0;
			
			long q = N/15;
			if(N%15==0)
				q--;
			sum = sum-(q*(2*15+(q-1)*15))/2;
			
			q = N/3;
			if(N%3==0)
				q--;
			sum = sum+(q*(2*3+(q-1)*3))/2;
			
			
			q = N/5;
			if(N%5==0)
				q--;
			sum = sum+(q*(2*5+(q-1)*5))/2;
			
		
			
			System.out.println(sum);
		}
	}
}
