package com.BitManipulation;

import java.util.Scanner;

public class Complement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no = in.nextInt();
		boolean flip = false ;
		for(int i=31;i>=0;i--){
			if(!flip && (no & (1<<i)) >0){
				flip =true;
			}
			if(flip){
				no= no ^ 1<<i;
			}
			
		}
		
		System.out.println(no);
	}
}
