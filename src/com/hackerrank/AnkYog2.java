package com.hackerrank;

import java.util.Scanner;

public class AnkYog2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			String N= in.next();
			char[] nArr=N.toCharArray();
			int length =nArr.length;
			Integer sum=0;
			while (length>1) {
			sum=0;
			for(int i=0;i<length;i++){
				sum+=Character.getNumericValue(nArr[i]);
			}
			length=sum.toString().length();
			nArr=sum.toString().toCharArray();
				
			}
			if(sum==0)
				System.out.println(9);
			else
			System.out.println(sum);
		}
			
		}
}



