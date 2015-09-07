package com.hackerrank2;

import java.util.Random;
import java.util.Scanner;


public class PRNG {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		
		while(testcase--!=0){
			long start=in.nextLong();
			long end=in.nextLong();
			int[] sampleInput=new int[10];
			for(int i=0;i<10;i++){
				sampleInput[i]=in.nextInt();
			}
			for(long i=start;i<=end;i++){
				Random generator = new Random(i);
				
				for(int j=0;j<10;j++){
					int temp=generator.nextInt(1000);
					if(sampleInput[j]!=temp)
						break;
					if(j==9){
						System.out.print(i+" ");
						for(int k=0;k<10;k++)
							System.out.print(generator.nextInt(1000)+" ");
					}
				}
			}
			
			System.out.println();
		}
		
		
	}
}
