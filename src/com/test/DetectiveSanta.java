package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class DetectiveSanta {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int P =in.nextInt();
			char [] password=new char[P];
			int i;
			for(i=P;i>=0;i--){
				if(i%3==0&&(P-i)%5==0){
					Arrays.fill(password, 0, i, '5');
					Arrays.fill(password, i, P, '3');
					System.out.println(password);
					break;
				}
			}
			if(i==-1)
				System.out.println(-1);
		}	
	}

}
