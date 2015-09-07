package com.brandies;

import java.util.Scanner;

public class OnlyOnce {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length= in.nextInt();
		
		int output=0;
		for(int i=0;i<length;i++){
			output=output^in.nextInt();
		}
		
		System.out.println(output);
	}
}
