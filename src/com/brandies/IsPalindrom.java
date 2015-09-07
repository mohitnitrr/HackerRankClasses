package com.brandies;

import java.util.Scanner;

public class IsPalindrom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.next();
		int[] count = new int[26];
		
		char[] inputArray= input.toCharArray();
		for(char c: inputArray){
			count[c-97]++;
		}
		int odd =0;
		for(int next:count){
			if(next%2!=0)
				odd++;
		}
		
		if(odd>1)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
