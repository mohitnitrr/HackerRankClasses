package com.hackerrank2;

import java.util.Scanner;

public class SteppingStoneGame {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			long N=in.nextLong();
			boolean flag=true;
			for(long i =0;i<Math.sqrt(2*N);i++){
				if(i*(i+1)/2==N){
					System.out.println("Go On Bob "+i);
					flag=false;
					continue;
				}
				
			}
			if(flag)
			System.out.println("Better Luck Next Time");
		}
	}

}
