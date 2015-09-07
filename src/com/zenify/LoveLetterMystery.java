package com.zenify;

import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			char[] nextWord = in.next().toCharArray();
			int start=0;
			int end =nextWord.length-1;
			int operationCount=0;
			while(start<end){
				if(nextWord[start]>nextWord[end])
					operationCount+=nextWord[start]-nextWord[end];
				else 
					operationCount+=nextWord[end]-nextWord[start];
				
				start++;
				end--;
			}
			
			System.out.println(operationCount);
		}
	}
}
