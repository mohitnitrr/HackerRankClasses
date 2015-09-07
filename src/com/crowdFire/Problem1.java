package com.crowdFire;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Problem1 {


	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfSpeed = in.nextInt();
		
		long[] speeds = new long[noOfSpeed];
		
		for(int i=0;i<noOfSpeed;i++){
			speeds[i]= in.nextLong();
		}
		
		long[] petrol = new long[noOfSpeed];
		
		for(int i=0;i<noOfSpeed;i++){
			petrol[i] = in.nextLong();
		}
		double maxRatio = Double.MAX_VALUE;
		int index =-1;
		for(int i =0;i<noOfSpeed;i++){
			double temp = (double)petrol[i]/speeds[i];
			if(temp<maxRatio){
				maxRatio= temp;
				index=i;
			}
		}
		long capacity = in.nextLong();
		double result = (double)capacity/maxRatio;
		result= (long)(result * 1e3) / 1e3;
		System.out.println(result);
	}
}
