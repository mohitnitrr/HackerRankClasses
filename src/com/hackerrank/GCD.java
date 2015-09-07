package com.hackerrank;

import java.util.Scanner;

public class GCD {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int size=in.nextInt();
			int[] arr=new int[size];
			int [] output=new int[size+1];
			for(int i=0;i<size;i++){
				arr[i]=in.nextInt();
			}
			output[0]=arr[0];
			for(int i=1;i<size;i++){
				output[i]=LCM(arr[i-1],arr[i]);
			}
			output[size]=arr[size-1];
			print(output);
		}
	}

	private static void print(int[] output) {
		for(int i=0;i<output.length;i++)
			System.out.print(output[i]+" ");
		
	}

	private static int LCM(int i, int j) {
		int max=i;
		int min=j;
		int lcm=max;
		if(i<j){
		max=j;
		min=i;
		}
		for(int k=1;k<=min;k++){
			lcm=max*k;
			if(lcm%min==0)
				return lcm;
		}
		return lcm;
	}
		


}
