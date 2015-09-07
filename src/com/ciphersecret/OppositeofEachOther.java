package com.ciphersecret;

import java.util.Scanner;

public class OppositeofEachOther {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int testCase = in.nextInt();
		
		while(testCase--!=0){
			int size = in.nextInt();
			int number  = in.nextInt();
			
			String str = in.next();
			int count =0;
			for(char c : str.toCharArray()){
				if(c=='B')
					count ++;
			}
			
			if(count%2==0)
				System.out.println(number);
			else
				System.out.println(-number);
		}
	}
}
