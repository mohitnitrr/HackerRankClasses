package com.alzebra;

import java.util.Scanner;

public class Square {

	private static final int mod=1000000009;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		
		while(testcases--!=0){
			int num= in.nextInt();
			long value=4;
			long power=1;
			for(int i=1;i<=num+1;i++){
				power*=2;
				power=power%mod;
			}
			if(num>0)
			value=value+power-2;	
			System.out.println(value);
		}
	}
}
