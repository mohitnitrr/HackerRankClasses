package com.string;

import java.util.Scanner;

public class AnipalindromicString {

	private static final int MOD =1000000009; 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			int palindromLength= in.nextInt();
			int characterSet= in.nextInt();
			long result1=1;
			
			int palindromChars;
			if(palindromLength==1){
				System.out.println(characterSet);
				continue;
			}
			else if(palindromLength%2==0)
				palindromChars=palindromLength/2;
			else
				palindromChars=palindromLength/2 + 1;
			
			for(int i=0;i<palindromChars;i++){
				result1=result1 * characterSet;
				result1=result1 % MOD;
			}
			int iterator=palindromLength-palindromChars;
			long result2=1;
			for(int i=0;i<iterator;i++){
				result2=result2 * characterSet;
				result2=result2 % MOD;
			}
			result2=result2-1;
			long result=(result1*result2)%MOD;
			System.out.println(result);
		}
			
			
			
		}
	
}
