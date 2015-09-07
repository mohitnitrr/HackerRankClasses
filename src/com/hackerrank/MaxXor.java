package com.hackerrank;

import java.util.Scanner;

public class MaxXor {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int first= in.nextInt();
		int second=in.nextInt();
		int diff=second-first;
		int maxXor=0;
		int check;
		for(int i=0;i<10;i++){
		check=1<<i;
		if(((check&first)==0)&&((check&second)>0)||((check&first)>0)&&((check&second)==0)||diff>=check){
			maxXor+=check;
			}
		else if(first<check&&second>check)
			maxXor+=check;
		}
		System.out.println(maxXor);
	}

}
