package com.dynamic;

import java.util.Scanner;

public class SamAndSubString {

	private static int mod =1000000007;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.next();
		char[] arr = num.toCharArray();
		long sum =0;
		
		int length = num.length();
		long multiplier=length;
		long positionExpo =0;
		for(int i=length-1;i>=0;i--){
			positionExpo=(positionExpo*10 + 1)%mod;		
			int nextDigit=arr[i]-'0';
			sum+=(nextDigit*(multiplier*positionExpo)%mod)%mod;
			sum =sum%mod;
			multiplier--;
		}
		
		System.out.println(sum);
	}
}
