package com.hackerrank2;

import java.util.Scanner;

public class CircleCity {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases=in.nextInt();
		while(testcases--!=0){
			int rsquare=in.nextInt();
			int totalStation =in.nextInt();
			int r=(int)Math.sqrt(rsquare);
			int stationRequired=0;
			int start=0;
			int end=r;
			while(start<=end){
				
			int temp=(start*start)+(end*end);
			
				if(temp==rsquare){
					if(start==end||start==0)
						stationRequired+=4;
					else
						stationRequired+=8;
				}
					
				else if(temp>rsquare)
					end--;
				
				start++;
			}
			if(stationRequired<=totalStation)
				System.out.println("possible");
			else
				System.out.println("impossible");
		}
	}

}
