package com.probability;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BdayGift {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int steps= in.nextInt();
		
		Double sum= new Double(0);
		
		while(steps--!=0){
			int next= in.nextInt();
			sum+=(double)next/2;
		}
		DecimalFormat four = new DecimalFormat("#0.0"); 
		
		System.out.println(four.format(sum));
	}
}
