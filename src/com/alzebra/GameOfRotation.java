package com.alzebra;

import java.util.Scanner;

public class GameOfRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		long sum  =0 ;
		long maxMean =0;
		long result=0;
		for(int i =0 ;i <size;i++){
			array[i] = in.nextInt();
			sum+= array[i];
			maxMean += (i+1)*array[i];
		}
		result = maxMean;
		for(int i=size-1;i>=0;i--){
			long temp =sum - (size)*array[i];
			maxMean= maxMean+ temp;
			if(maxMean > result){
				result =maxMean;
			}
			
		}
		
		System.out.println(result);
	}
}
