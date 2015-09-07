package com.hackerrank;

import java.util.Scanner;

public class SetBits {
private static final int intergerBits=32;
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases= in.nextInt();
		
		while(testcases--!=0){
			int N =in.nextInt();
			int count=0;
			for(int i=0;i<intergerBits;i++){
			int check=1<<i;
			if((N&check)>0){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
