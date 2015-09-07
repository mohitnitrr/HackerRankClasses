package com.alzebra;

import java.util.Scanner;

public class wetShark {

	private static final int mod=1000000009;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int testcases= in.nextInt();
		while(testcases--!=0){
			long stepCount =0;
			long remaingStep=0;
			long iterationStep=0;
			long energyLevel = in.nextLong();
			while(energyLevel>0){
				iterationStep=(energyLevel%mod)*2;
				stepCount+=iterationStep;
				stepCount=stepCount%mod;
				energyLevel=(iterationStep+remaingStep)/42;	
				remaingStep=stepCount%42;
			}
			
			System.out.println(stepCount);
		}
	}
}
