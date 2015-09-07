package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaToys {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int length= in.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<length;){
			count++;
			int value=arr[i];
			int j=i+1;
			
			while(j<length&&((arr[j]-value)<=4)){
				j++;
			}
			i=j;
		}
		System.out.println(count);
	}
	
}
