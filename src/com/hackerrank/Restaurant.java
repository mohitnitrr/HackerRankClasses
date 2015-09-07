package com.hackerrank;

import java.util.Scanner;

public class Restaurant {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int length=in.nextInt();
			int breadth=in.nextInt();
			
			int area=length*breadth;
			int squarRoot=(int)Math.sqrt(area);
			
			for(int i=squarRoot;i>=1;i--){
				int squareValue=i*i;
				if(area%squareValue==0&&length%i==0&&breadth%i==0){
					System.out.println(area/squareValue);
					break;
				}
			}
		}
	}
}
