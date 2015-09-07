package com.alzebra;

import java.util.Scanner;

public class SteppingStone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
		long num =in.nextLong();
		num=2*num;
		long sqrt=(long)Math.sqrt(num);
		
		if(sqrt*(sqrt+1)==num)
			System.out.println("Go On Bob "+sqrt);
		else
			System.out.println("Better Luck Next Time");
		}
	}
}
