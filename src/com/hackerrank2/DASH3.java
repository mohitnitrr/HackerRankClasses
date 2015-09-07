package com.hackerrank2;

import java.util.Scanner;

public class DASH3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		while(testcase--!=0){
			int n=in.nextInt();
			int a=in.nextInt();
			int b=in.nextInt();
			int min,max;
			if(a<b){
				min=a;max=b;
			}
			else if(a>b){
				min=b;max=a;
			}
			else{
				System.out.println((n-1)*a);
				continue;
			}
			for(int i =0;i<n;i++){
				System.out.print((n-i-1)*min+i*max+" ");
			}
			System.out.println();
		}
		
	}
}
