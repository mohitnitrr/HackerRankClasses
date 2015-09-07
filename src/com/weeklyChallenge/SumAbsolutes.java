package com.weeklyChallenge;

import java.util.Scanner;

public class SumAbsolutes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q  = in.nextInt();
		int[]  arr  = new int[n];
		
		for(int i = 0;i<n;i++){
			int next  = in.nextInt();
			if(next<0)
				arr[i]=-next;
			else
				arr[i]=next;
		}
		
		for(int i =1;i<=q;i++){
			int start = in.nextInt()-1;
			int end = in.nextInt()-1;
			long sum =0;
			for(int j = start;j<=end;j++){
				sum +=arr[j];
			}
			if(sum%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
	}
}
