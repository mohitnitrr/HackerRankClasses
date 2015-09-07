package com.hack101;

import java.util.Scanner;

public class MarbleCut {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			int length=in.nextInt();
			int breadth= in.nextInt();
			
			if(length<breadth){
				int temp =length;
				length=breadth;
				breadth=length;
			}
			if(length%3==0||breadth%3==0)
				System.out.println("YES");
			else{
				long area= length*breadth;
				long remaining=area-(area/3)*3;
				//int remaining= (length%3)*(breadth%3);
				
				System.out.println("NO "+remaining);
			}
		}
	}
}
