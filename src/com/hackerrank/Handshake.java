package com.hackerrank;

import java.util.Scanner;

public class Handshake {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	int testcase= in.nextInt();
	
	while(testcase--!=0){
		int person=in.nextInt();
		int sum =0;
		for(int i=0;i<person;i++){
			sum+=i;
		}
		System.out.println(sum);
		}
	
	}
}
