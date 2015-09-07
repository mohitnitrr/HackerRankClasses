package com.hackerrank;

import java.util.Scanner;

public class SymmetricPoint {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcase= in.nextInt();
		
		while(testcase--!=0){
		int px=in.nextInt();
		int py=in.nextInt();
		int qx=in.nextInt();
		int qy=in.nextInt();
		
		int x=2*qx-px;
		int y=2*qy-py;
		System.out.println(x+" "+y);
			}
		
	
	}
}
