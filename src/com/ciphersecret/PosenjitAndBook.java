package com.ciphersecret;

import java.util.Scanner;

public class PosenjitAndBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int testCase = in.nextInt();
		while(testCase--!=0){
			int size = in.nextInt();
			int expexted =1;
			int count  =0;
			for(int i =1;i<=size;i++){
				int temp = in.nextInt();
				if(temp == expexted){
					expexted++;
				}else{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
