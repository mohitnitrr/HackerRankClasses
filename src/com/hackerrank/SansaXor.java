package com.hackerrank;

import java.util.Scanner;

public class SansaXor {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			
			int length= in.nextInt();
			int [] numberArray= new int[length];
			long resultXor=0;
			for(int i=0;i<length;i++){
				numberArray[i]=in.nextInt();
			}
			for(int i=0;i<length;i++){
				
				if((i+1)%2!=0&&(numberArray.length-i)%2!=0){
					resultXor=resultXor^numberArray[i];
				}
					
			}
			System.out.println(resultXor);	
		}
	
	}
}
