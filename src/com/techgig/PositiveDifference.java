package com.techgig;

import java.util.Scanner;

public class PositiveDifference {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int size = in.nextInt();
		String delims = "[,]";
		int[] arr = new int[size];
		int i=0;
		for(String next : str.split(delims)){
			arr[i]=Integer.parseInt(next);
			i++;
		}
		
		int maxPositiveDiff = maxPositiveDiff(arr,size);
		System.out.println(maxPositiveDiff);
	}

	private static int maxPositiveDiff(int[] input1, int input2) {
		int i =0;
		int localMin;
		int localMax;
		int firstMax=-1;
		int secondMax=-1;
		while(i<input2-1){
			
			while(i<input2-1 && input1[i+1]<input1[i])
				i++;
			
			localMin=i;
			
			while(i<input2-1 && input1[i+1]>input1[i])
				i++;
			
			localMax = i;
			
			if (localMax>localMin) {
				
				int diff =input1[localMax]-input1[localMin];
				
				if (diff > secondMax) {
					if (diff > firstMax) {
						secondMax = firstMax;
						firstMax = diff;

					} else
						secondMax = diff;
				}
			}
			
			
		}
		if(firstMax>-1){
			if(secondMax>-1)
				return firstMax +secondMax;
			else
				return firstMax;
			
		}
		else
			return 0;
					
	}

}
