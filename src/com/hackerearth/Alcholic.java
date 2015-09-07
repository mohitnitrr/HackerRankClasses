package com.hackerearth;

import java.util.Scanner;

public class Alcholic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int size2 = in.nextInt();
		
		long sum1=0;
		long sum2=0;
		
		for(int i = 0 ;i < size1 ;i++){
			sum1+=in.nextLong();
		}
		
		for(int i = 0 ;i < size2 ;i++){
			sum2+=in.nextLong();
		}
		
		System.out.println(sum1*sum2);
	}
}

