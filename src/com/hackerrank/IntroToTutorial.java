package com.hackerrank;

import java.util.Scanner;

public class IntroToTutorial {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int value=in.nextInt();
		int length=in.nextInt();
	//	int [] arr= new int[length];
		
		for(int i=0;i<length;i++){
			if(value==in.nextInt())
				System.out.println(i);
		}
	}

}
