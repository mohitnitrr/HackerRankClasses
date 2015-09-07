package com.euler;

import java.util.Scanner;

public class LargestPalindromProuct {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();

		while(testcases--!=0){
			long N = in.nextLong();
			long result = 0;
			for(int i =999;i>=100;i--){
				for(int j=i;j>=100;j--){
					long product =i*j;
					if(product<N && product >result){
						if(isPalindrom(product)){
							result = product;
						}
					}
				}
			}
			
			System.out.println(result);
		}

	}

	private static boolean isPalindrom(long product) {
		long palindromProduct=0;
		long temp =product;
		while(temp>0){
			palindromProduct = palindromProduct*10 +temp%10;
			temp = temp/10;
		}
		if(product==palindromProduct)
			return true;
		else
			return false;
	}


}
