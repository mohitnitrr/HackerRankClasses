package com.contest;

import java.util.Scanner;

public class ANDBetweenNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			Long A= in.nextLong();
			long setA=A.highestOneBit(A);
			Long B=in.nextLong();
			long setB=B.highestOneBit(B);
			if(setB>setA)
			System.out.println(0);
			else{
			long output=A&~(B-A);
			System.out.println(output);
			}
		}
	}
}
