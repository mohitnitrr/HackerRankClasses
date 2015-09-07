package com.brandies;

import java.util.Scanner;

public class Utopian {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			
			int cycles=in.nextInt();
			long output=1;
			for(int i=1;i<=cycles;i++){
				if(i%2!=0){
					output*=2;
				}
				else
					output++;
			}
			
			System.out.println(output);
		}
	}
}
