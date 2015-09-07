package com.djsc;

import java.util.Scanner;

public class PlayAudition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		
		int men=4;
		int women=c-men;
		if(women>b){
			women=b;
			men=c-b;
		}
		
		long sum =0;
		while(women>0){
			sum+= combination(a,men)*combination(b,women);
			men++;
			women--;
		}
		
		System.out.println(sum);
	}

	private static long combination(int a, int men) {
		long numerator=1;
		for(int i=0;i<men;i++){
			numerator*=(a-i);
		}
		long denominator=1;
		for(int i=0;i<men;i++){
			denominator*=(men-i);
		}
		
		return numerator/denominator;
	}
}
