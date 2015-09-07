package com.wipro;

import java.util.Scanner;

public class TreeCity1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases =  in.nextInt();
		while(testcases--!=0){
			long p1= in.nextLong();
			long p2 =in.nextLong();
			long sum=0;
			while(p1!=p2){
				if(p1<p2){
					p2=p2/2;
					sum++;
				}
				else{
					p1=p1/2;
					sum++;
				}
			}
			System.out.println(2*sum);
		}
	}
}
