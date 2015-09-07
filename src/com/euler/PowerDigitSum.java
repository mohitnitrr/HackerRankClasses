package com.euler;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();

		while(testcases--!=0){
			int pow = in.nextInt();
			BigInteger value = new BigInteger("2").pow(pow);
			int result =0;
			for(char c :value.toString().toCharArray()){
				result=result+c-'0';
			}
			System.out.println(result);
		}
	}
}
