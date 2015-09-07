package com.zenify;

import java.util.Scanner;

public class Maxdifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] array = new int[size];
		for(int i =0;i<size;i++){
			array[i]= in.nextInt();
		}
		
		int diff =maxDifference(array);
		System.out.println(diff);
		
	}

	private static int maxDifference(int[] a) {
		int diff =-1;
		int small = a[0];
		int size =a.length;
		for(int i=1;i<size;i++){
			if(a[i]<small)
				small = a[i];
			else if((a[i]-small)>diff)
				diff =a[i]-small;			
		}
		
		return diff;
	}
	
}
