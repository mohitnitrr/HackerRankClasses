package com.brandies;

import java.util.Scanner;

public class FlipBit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase= in.nextInt();
		
		while(testcase--!=0){
			int next =in.nextInt();
			int output=~next;
			if(output<0){
				output=-output;
				System.out.println(-output);
			}		
			else
				System.out.println(output);
			
		}
	}
}
