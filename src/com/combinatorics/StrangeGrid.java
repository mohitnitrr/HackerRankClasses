package com.combinatorics;

import java.util.Scanner;

public class StrangeGrid {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long row= in.nextLong();
		long col = in.nextLong();
		long result=0;
		if(row % 2 !=0){
			result= ((row-1)* 5) +(col *2)-2;
		}
		else{
			result= ((row-2)* 5) +(col *2)-1;
		}
		System.out.println(result);
	}

}
