package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class ZukerbergParliality {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int K =in.nextInt();
		int[] salary=new int[N];
		for(int i=0;i<N;i++){
			salary[i]=in.nextInt();
		}
		Arrays.sort(salary);
		int min=salary[N-1];
		for(int i=0;i<N-K;i++){
			int temp=salary[i+K-1]-salary[i];
			if(temp<min)
				min=temp;
		}
		System.out.println(min);
	}
}
