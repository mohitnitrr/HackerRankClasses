package com.cisco;

import java.util.Scanner;

public class SecurePassword {

	private static final long REQUIRED = 1000000;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		
	outer:	while(testCases--!=0){
			int min = in.nextInt();
			int max = in.nextInt();
			
			long start = (long)Math.pow(10, min); 
				
			if(start>REQUIRED){
					System.out.println("YES");
					continue outer;
			}
			
			for(int next = min+1 ;next<=max;next++){
				start += (long)Math.pow(10, next);
				if(start>REQUIRED){
					System.out.println("YES");
					continue outer;
				}
				
			}
			System.out.println("NO");
		}
		
	}
}
